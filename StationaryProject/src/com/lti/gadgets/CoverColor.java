package com.lti.gadgets;

public enum CoverColor
{
	BLACK(2000,"India"),SILVER(900,"USA"),WHITE(1000,"UK"),RED(1,"Tunisia");

	int numsManufactured;
	String nation;
	CoverColor (int n, String nation)
	{
		this.numsManufactured=n;
		this.nation=nation;
	}
	public int getNumsManufactured() {
		return numsManufactured;
	}
	public void setNumsManufactured(int numsManufactured) {
		this.numsManufactured = numsManufactured;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
}
