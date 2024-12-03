package com.example.inventory;

import java.io.IOException;

import javax.faces.application.Resource;
import javax.faces.application.ResourceHandler;
import javax.faces.application.ResourceHandlerWrapper;
import javax.faces.application.ViewResource;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;

public class PortletResourceHandler extends ResourceHandlerWrapper {

	private static final Logger LOGGER = Logger.getLogger(PortletResourceHandler.class);
	
	private ResourceHandler resourceHandler;
	
	public PortletResourceHandler(ResourceHandler resourceHandler) {
		this.resourceHandler = resourceHandler;
	}

	@Override
	public Resource createResource(String resourceName) {
		LOGGER.debug("1");
		return super.createResource(resourceName);
	}

	@Override
	public Resource createResourceFromId(String resourceId) {
		LOGGER.debug("2");
		return super.createResourceFromId(resourceId);
	}

	@Override
	public Resource createResource(String resourceName, String libraryName) {
		LOGGER.debug("3(" + resourceName + ", " + libraryName + ")");
		return super.createResource(resourceName, libraryName);
	}

	@Override
	public Resource createResource(String resourceName, String libraryName, String contentType) {
		LOGGER.debug("4");
		return super.createResource(resourceName, libraryName, contentType);
	}

	@Override
	public ViewResource createViewResource(FacesContext context, String resourceName) {
		LOGGER.debug("5");
		return super.createViewResource(context, resourceName);
	}

	@Override
	public void handleResourceRequest(FacesContext context) throws IOException {
		LOGGER.debug("6");
		super.handleResourceRequest(context);
	}

	@Override
	public boolean isResourceRequest(FacesContext context) {
		LOGGER.debug("7");
		return super.isResourceRequest(context);
	}

	@Override
	public boolean isResourceURL(String url) {
		LOGGER.debug("8");
		return super.isResourceURL(url);
	}

	@Override
	public boolean libraryExists(String libraryName) {
		LOGGER.debug("9");
		return super.libraryExists(libraryName);
	}

	@Override
	public String getRendererTypeForResourceName(String resourceName) {
		LOGGER.debug("A");
		return super.getRendererTypeForResourceName(resourceName);
	}

	@Override
	public ResourceHandler getWrapped() {
		LOGGER.debug("B");
		return resourceHandler;
	}

}
