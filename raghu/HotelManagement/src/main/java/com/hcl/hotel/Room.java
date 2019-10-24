package com.hcl.hotel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Room")
public class Room {
	@Id
	private String RoomID;
	private String Type;
	private String Status;
	private int CostPerDay;
	
	
	public String getRoomID() {
		return RoomID;
	}
	public void setRoomID(String roomID) {
		RoomID = roomID;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getCostPerDay() {
		return CostPerDay;
	}
	public void setCostPerDay(int costPerDay) {
		CostPerDay = costPerDay;
	}
	
	

}
