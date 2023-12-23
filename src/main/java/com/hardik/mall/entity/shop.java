package com.hardik.mall.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name="shopping")


public class shop {
    @Id

    int id;
    String shopname;
    String shopdet;
    String shopowner;
	public shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public shop(int id, String catagory, int empId, String shopname, String shopdet, String shopowner) {
		super();
		this.id = id;
		shopname = shopname;
		shopdet = shopdet;
		shopowner = shopowner;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCatagory(String catagory) {
		catagory = catagory;
	}
	public String getshopname() {
		return shopname;
	}
	public void setshopname(String shopname) {
		shopname = shopname;
	}
	public String getshopdet() {
		return shopdet;
	}
	public void setshopdet(String shopdet) {
		shopdet = shopdet;
	}
	public String getshopowner() {
		return shopowner;
	}
	public void setshopowner(String shopowner) {
		shopowner = shopowner;
	}
    
    
}
