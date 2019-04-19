/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dlrproject.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author alex
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.dlrproject.service.AdminFacadeREST.class);
        resources.add(com.dlrproject.service.BranchAddressFacadeREST.class);
        resources.add(com.dlrproject.service.BranchFacadeREST.class);
        resources.add(com.dlrproject.service.CustomerAddressFacadeREST.class);
        resources.add(com.dlrproject.service.CustomerFacadeREST.class);
        resources.add(com.dlrproject.service.InventoryFacadeREST.class);
        resources.add(com.dlrproject.service.Order1FacadeREST.class);
        resources.add(com.dlrproject.service.PasswordFacadeREST.class);
        resources.add(com.dlrproject.service.ProductFacadeREST.class);
        resources.add(com.dlrproject.service.ProductOrderFacadeREST.class);
        resources.add(com.dlrproject.service.UserFacadeREST.class);
    }
    
}
