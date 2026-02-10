package com.community.demo.models;

import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;

@Model(adaptables = Resource.class,
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HelloWorldModel {

    @Inject
    private String message;

    public String getMessage() {
        return message != null ? message : "Hello World!";
    }
}
