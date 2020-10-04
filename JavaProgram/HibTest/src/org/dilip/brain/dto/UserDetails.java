package org.dilip.brain.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity(name = "USER_DETAILS")
@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class UserDetails {
 
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;
    @Column(name = "User_Name")
    private String userName;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    //oneTOone
    @OneToMany
    //to change the column name
    @JoinColumn(name = "VH_ID")
    
    Collection<Vehicle> vehicle = new ArrayList<Vehicle>();
    
    public Collection<Vehicle> getVehicle() {
        return vehicle;
    }
    public void setVehicle(Collection<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
    public int getUserID() {
	return userID;
    }
    public void setUserID(int userID) {
	this.userID = userID;
    }
    public String getUserName() {
	return userName;
    }
    public void setUserName(String userName) {
	this.userName = userName;
    }
    @Override
    public String toString() {
	return "UserDetails [userID=" + userID + ", userName=" + userName + ", date=" + date + ", vehicle=" + vehicle
		+ "]";
    }
    
}
