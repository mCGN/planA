package com.neusoft.bigdata.domain;

import org.bson.types.ObjectId;

public class RentingHouse  extends House{

	public RentingHouse(){
		super();
	}
	
	
	public RentingHouse(String name, String tag, Double unitPrice, String type, String address, String floor){
//		this();
		super(name, tag,  unitPrice,  type,  address);
		this.floor = floor;
//		this.url=url;
	}


	public String floor;//楼层

	


	public String getFloor() {
		return floor;
	}


	public void setFloor(String floor) {
		this.floor = floor;
	}
	
	
	
}
