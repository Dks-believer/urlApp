package com.masai.models;

import java.util.Date;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class URLs {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String actualUrl;
	private String shortUrl;
	private Date expiry;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getActualUrl() {
		return actualUrl;
	}
	public void setActualUrl(String actualUrl) {
		this.actualUrl = actualUrl;
	}
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	
	public URLs(String actualUrl, String shortUrl, Date expiry) {
		super();
		this.actualUrl = actualUrl;
		this.shortUrl = shortUrl;
		this.expiry = expiry;
	}
	
	public URLs() {}
	@Override
	public String toString() {
		return "URLs [id=" + id + ", actualUrl=" + actualUrl + ", shortUrl=" + shortUrl + ", expiry=" + expiry + "]";
	}
	
	
}
