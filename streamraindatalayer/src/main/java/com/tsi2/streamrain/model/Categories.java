package com.tsi2.streamrain.model;
// Generated 26/09/2017 05:05:12 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categories generated by hbm2java
 */
public class Categories  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String description;
     private String coverPictureUrl;
     private Set contentses = new HashSet(0);

    public Categories() {
    }

	
    public Categories(String name) {
        this.name = name;
    }
    public Categories(String name, String description, String coverPictureUrl, Set contentses) {
       this.name = name;
       this.description = description;
       this.coverPictureUrl = coverPictureUrl;
       this.contentses = contentses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCoverPictureUrl() {
        return this.coverPictureUrl;
    }
    
    public void setCoverPictureUrl(String coverPictureUrl) {
        this.coverPictureUrl = coverPictureUrl;
    }
    public Set getContentses() {
        return this.contentses;
    }
    
    public void setContentses(Set contentses) {
        this.contentses = contentses;
    }




}


