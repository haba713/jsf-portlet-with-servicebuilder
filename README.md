# JSF portlet working in Liferay Portal 7.4 GA37 but not in GA125

## Update 2024-12-08

The issue was resolved by converting the service builder layer to an OSGI
module and copying the following JARs into `$LIFERAY_HOME/osgi/modules/`:
```
$ cd $LIFERAY_HOME/osgi/modules/ && du -h *.jar
 20K	com.example.inventory.api.jar
 40K	com.example.inventory.service.jar
604K	com.liferay.faces.alloy-4.1.2-SNAPSHOT.jar
 72K	com.liferay.faces.bridge.api-5.0.0.jar
128K	com.liferay.faces.bridge.ext-7.0.2-SNAPSHOT.jar
564K	com.liferay.faces.bridge.impl-5.0.1-SNAPSHOT.jar
388K	com.liferay.faces.util-3.4.2-SNAPSHOT.jar
3.1M	javax.faces-2.2.20.jar
480K	log4j-1.2.17.jar
```

See the branch [sb-osgi][1] and [compare changes][2].

Thanks a lot to @neilgriffin95 & co @ Liferay Slack channel! 🙂

## Steps for verifying the functionality in 7.4 GA37

1. Create workspace. Clone and deploy the app.
    ```
    mkdir liferay-workspace
    cd liferay-workspace/
    blade init -v portal-7.4-ga37
    blade server init
    blade server start
    cd modules/
    git clone git@github.com:haba713/jsf-portlet-with-servicebuilder.git inventory
    cd inventory/
    blade deploy
    ```
2. Create a new widget page and add "Inventory Portlet" from the sample
   category into it. Reload the page.
3. Add something to the fields "Code" and "Name". Click the button "Add".
4. The product is added into the product list above.

## Steps for reproducing the issue in 7.4 GA125

1. Repeat the procedure above but when initializing workspace use the quarterly
   release `blade init -v portal-7.4-ga125`.
2. See the exception below in `catalina.out` when reloading the page.

```
com.liferay.portal.kernel.exception.SystemException: com.liferay.portal.kernel.dao.orm.ORMException: java.lang.IllegalArgumentException: org.hibernate.QueryException: in expected: product [SELECT product FROM Product product ORDER BY product.id ASC]
at com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl.processException(BasePersistenceImpl.java:635)
at com.example.inventory.service.persistence.impl.ProductPersistenceImpl.findAll(ProductPersistenceImpl.java:1019)
at com.example.inventory.service.persistence.impl.ProductPersistenceImpl.findAll(ProductPersistenceImpl.java:937)
at com.example.inventory.service.persistence.impl.ProductPersistenceImpl.findAll(ProductPersistenceImpl.java:918)
at com.example.inventory.service.base.ProductLocalServiceBaseImpl.getProducts(ProductLocalServiceBaseImpl.java:341)
...
```

## LiferayPropertyAccessor

If you build service again (`blade gw buildService`), replace
`MetadataPropertyAccessor` with `LiferayPropertyAccessor` in
[portlet-hbm.xml][3]. Otherwise the app won't work in 7.4 GA37.

[1]: https://github.com/haba713/jsf-portlet-with-servicebuilder/tree/sb-osgi
[2]: https://github.com/haba713/jsf-portlet-with-servicebuilder/compare/master..sb-osgi
[3]: src/main/resources/META-INF/portlet-hbm.xml
