package com.hcl.hotel;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Booking")
public class Booking {
	
	@Id
	private String BookId;
	private String RoomID;
	private String CustName;
	private String City;
	private Date BookDate;
	private Date ChkDate;
	
	
	public String getBookId() {
		return BookId;
	}
	public void setBookId(String bookId) {
		BookId = bookId;
	}
	public String getRoomID() {
		return RoomID;
	}
	public void setRoomID(String roomID) {
		RoomID = roomID;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Date getBookDate() {
		return BookDate;
	}
	public void setBookDate(Date bookDate) {
		BookDate = bookDate;
	}
	public Date getChkDate() {
		return ChkDate;
	}
	public void setChkDate(Date chkDate) {
		ChkDate = chkDate;
	}
	
	

}
