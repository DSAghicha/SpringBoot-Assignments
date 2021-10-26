package com.dsaghicha.model;

public class Address {
	private String adressNum;
	private String adressStreet;
	private String adressCity;
	private String adressLandmark;
	private String adressProvince;
	private int adressZipCode;
	
	public Address() {}
	
	public Address(String adressNum, String adressStreet, String adressCity, String adressLandmark,
			String adressProvince, int adressZipCode) {
		super();
		this.adressNum = adressNum;
		this.adressStreet = adressStreet;
		this.adressCity = adressCity;
		this.adressLandmark = adressLandmark;
		this.adressProvince = adressProvince;
		this.adressZipCode = adressZipCode;
	}

	public String getAdressNum() {
		return adressNum;
	}

	public void setAdressNum(String adressNum) {
		this.adressNum = adressNum;
	}

	public String getAdressStreet() {
		return adressStreet;
	}

	public void setAdressStreet(String adressStreet) {
		this.adressStreet = adressStreet;
	}

	public String getAdressCity() {
		return adressCity;
	}

	public void setAdressCity(String adressCity) {
		this.adressCity = adressCity;
	}

	public String getAdressLandmark() {
		return adressLandmark;
	}

	public void setAdressLandmark(String adressLandmark) {
		this.adressLandmark = adressLandmark;
	}

	public String getAdressProvince() {
		return adressProvince;
	}

	public void setAdressProvince(String adressProvince) {
		this.adressProvince = adressProvince;
	}

	public int getAdressZipCode() {
		return adressZipCode;
	}

	public void setAdressZipCode(int adressZipCode) {
		this.adressZipCode = adressZipCode;
	}
}
