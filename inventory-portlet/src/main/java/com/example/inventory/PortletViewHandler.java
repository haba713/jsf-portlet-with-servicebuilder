package com.example.inventory;

import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.Locale;

import javax.faces.application.ViewHandler;
import javax.faces.application.ViewHandlerWrapper;
import javax.faces.context.FacesContext;
import javax.portlet.PortletRequest;


public class PortletViewHandler extends ViewHandlerWrapper {

    //private static Logger LOGGER = Logger.getLogger(PortletViewHandler.class);

    private ViewHandler viewHandler;

    public PortletViewHandler(ViewHandler viewHandler) {
        this.viewHandler = viewHandler;
    }

    @Override
	public ViewHandler getWrapped() {
        return viewHandler;
    }

    @Override
    public Locale calculateLocale(FacesContext context) {
        PortletRequest request = (PortletRequest)
                context.getExternalContext().getRequest();
        ThemeDisplay themeDisplay =
                (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
        return themeDisplay.getLocale();
    }

}
