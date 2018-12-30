package com.ea.sbrxweb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseController
{
    @Autowired
    HttpServletRequest request;

    /**
     * Getting specified session attribute with defined attribute name and type of object.
     *
     * @param object						Fetching data as specified object type from session.
     * @param sessionAttributeName		    Attribute name that will store at session.
     */
    @SuppressWarnings( "unchecked" )
    public <T> T getSessionAttribute(Class<T> object, String sessionAttributeName) {
        return (T) request.getSession().getAttribute(sessionAttributeName);
    }

    /**
     * Method get current session and sets an attribute by attribute name and object that is meant to store at session.
     *
     * @param sessionAttributeName		    attribute name for store and fetch by it.
     * @param object						object which is stored with given attribute name.
     */
    public void setSessionAttribute(Object object, String sessionAttributeName) {
        request.getSession().setAttribute(sessionAttributeName, object);
    }

}
