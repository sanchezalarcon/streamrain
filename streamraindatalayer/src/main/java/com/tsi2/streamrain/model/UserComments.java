package com.tsi2.streamrain.model;
// Generated 26/09/2017 05:05:12 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * UserComments generated by hbm2java
 */
public class UserComments  implements java.io.Serializable {


     private Integer id;
     private AlwaysAvailableContents alwaysAvailableContents;
     private Users users;
     private Date date;
     private String text;
     private Boolean isDeleted;
     private Set spoilerMarkses = new HashSet(0);

    public UserComments() {
    }

	
    public UserComments(AlwaysAvailableContents alwaysAvailableContents, Users users, Date date, String text) {
        this.alwaysAvailableContents = alwaysAvailableContents;
        this.users = users;
        this.date = date;
        this.text = text;
    }
    public UserComments(AlwaysAvailableContents alwaysAvailableContents, Users users, Date date, String text, Boolean isDeleted, Set spoilerMarkses) {
       this.alwaysAvailableContents = alwaysAvailableContents;
       this.users = users;
       this.date = date;
       this.text = text;
       this.isDeleted = isDeleted;
       this.spoilerMarkses = spoilerMarkses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public AlwaysAvailableContents getAlwaysAvailableContents() {
        return this.alwaysAvailableContents;
    }
    
    public void setAlwaysAvailableContents(AlwaysAvailableContents alwaysAvailableContents) {
        this.alwaysAvailableContents = alwaysAvailableContents;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    public Set getSpoilerMarkses() {
        return this.spoilerMarkses;
    }
    
    public void setSpoilerMarkses(Set spoilerMarkses) {
        this.spoilerMarkses = spoilerMarkses;
    }




}

