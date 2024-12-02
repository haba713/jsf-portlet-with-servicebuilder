# JSF portlet working in Liferay Portal 7.4 GA37 but not in GA125

## Steps for verifying functionality in 7.4 GA37

1. Create workspace. Clone and deploy the app.
    ```
    mkdir liferay-workspace
    cd liferay-workspace/
    blade init -v portal-7.4-ga37
    blade server init
    blade server start
    cd modules/
    git clone git@github.com:haba713/jsf-portlet-with-servicebuilder.git
    cd jsf-portlet-with-servicebuilder/
    blade deploy
    ```
2. Create a new widget page and add "Inventory Portlet" from the sample
   category into it. Reload the page.
3. Add something to the fields "Code" and "Name". Click the button "Add".
4. The product is added into the product list above.

## Steps for reproducing the issue in 7.4 GA125

1. Repeat the procedure above but when initializing workspace use the quarterly
release `blade init -v portal-7.4-ga125`.
2. See the exception in `catalina.out` when reloading the page.

## LiferayPropertyAccessor

If you build service again (`blade gw buildService`), replace
`MetadataPropertyAccessor` with `LiferayPropertyAccessor` in
[portlet-hbm.xml][1]. Otherwise the app won't work in 7.4 GA37.

[1]: src/main/resources/META-INF/portlet-hbm.xml