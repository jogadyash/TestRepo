package com.phoenix.demos;
/**
 * 
 * @author yash
 * **/
public class Covid {
	private int fruits;
	private int grocery;
	private int vegetables;
	private String cityName;
	private int cityId;
    
    
    public Covid() {
    	//System.out.println("Default Constructor");
    }
    
    public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
    
	public int getFruits() {
		return fruits;
	}
	public void setFruits(int fruits) {
		this.fruits = fruits;
	}
	
	public int getGrocery() {
		return grocery;
	}

	public void setGrocery(int grocery) {
		this.grocery = grocery;
	}

	public int getVegetables() {
		return vegetables;
	}
	public void setVegetables(int vegetables) {
		this.vegetables = vegetables;
	}
	
	
	

}
