package com.tsi2.streamrain.model;
// Generated 26/09/2017 05:05:12 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * UserViews generated by hbm2java
 */
public class UserViews  implements java.io.Serializable {


     private Integer id;
     private Contents contents;
     private Users users;
     private Date dateStart;
     private Date dateFinish;
     private int second;

    public UserViews() {
    }

    public UserViews(Contents contents, Users users, Date dateStart, Date dateFinish, int second) {
       this.contents = contents;
       this.users = users;
       this.dateStart = dateStart;
       this.dateFinish = dateFinish;
       this.second = second;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Contents getContents() {
        return this.contents;
    }
    
    public void setContents(Contents contents) {
        this.contents = contents;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public Date getDateStart() {
        return this.dateStart;
    }
    
    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }
    public Date getDateFinish() {
        return this.dateFinish;
    }
    
    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }
    public int getSecond() {
        return this.second;
    }
    
    public void setSecond(int second) {
        this.second = second;
    }




}


