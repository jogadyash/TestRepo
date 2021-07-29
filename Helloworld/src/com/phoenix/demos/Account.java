package com.phoenix.demos;
/**
 * 
 * @author yash
 * **/
public class Account {
	private int actId;
	private String actName;
	private float actBalance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Account(int actId, String actName, float actBalance) {
		
		this.actId = actId;
		this.actName = actName;
		this.actBalance = actBalance;
	}



	public int getActId() {
		return actId;
	}



	public void setActId(int actId) {
		this.actId = actId;
	}



	public String getActName() {
		return actName;
	}



	public void setActName(String actName) {
		this.actName = actName;
	}



	public float getActBalance() {
		return actBalance;
	}



	public void setActBalance(float actBalance) {
		this.actBalance = actBalance;
	}
	
	



}
