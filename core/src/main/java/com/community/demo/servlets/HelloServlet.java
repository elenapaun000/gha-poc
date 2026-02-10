package com.community.demo.servlets;

import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.servlets.ServletResolverConstants;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;

import javax.servlet.Servlet;
import java.io.IOException;

import org.osgi.service.component.annotations.Component;

@Component(service = Servlet.class,
           property = {
               ServletResolverConstants.SLING_SERVLET_PATHS + "=/bin/hello",
               ServletResolverConstants.SLING_SERVLET_METHODS + "=" + HttpConstants.METHOD_GET
           })
public class HelloServlet extends SlingAllMethodsServlet {
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException {
        response.getWriter().write("Hello from PoC servlet!");
    }
}
