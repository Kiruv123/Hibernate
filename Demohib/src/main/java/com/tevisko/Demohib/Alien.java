package com.tevisko.Demohib;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="alien_table")
public class Alien
{
	@Id
	private int aid;
//	private AlienName aname;
	private String Aname;
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	//	public AlienName getAname() {
//		return aname;
//	}
//	public void setAname(AlienName aname) {
//		this.aname = aname;
//	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", Aname=" + Aname + ", color=" + color + "]";
	}
	
	

}
