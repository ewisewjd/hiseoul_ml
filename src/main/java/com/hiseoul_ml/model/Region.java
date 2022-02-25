package com.hiseoul_ml.model;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tb_region")
@Getter
@Setter
@ToString

public class Region{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String region_uuid;
	private String region_name;
	private String region_type;
	private String region_address;
	private String region_post_code;
	private String region_latitude;
	private String region_longitude;
	private String region_nation;
	private String region_nation_code;
	private Timestamp region_write_date;
	private Timestamp region_update_date;
	private String region_use_yn;

	
	public String getregion_uuid() {
		return region_uuid;
	}
	
	public void setregion_uuid(String region_uuid){
		this.region_uuid = region_uuid;
		}
	
	public String getregion_name() {
		return region_name;
	}
	
	public void setregion_name(String region_name){
		this.region_name = region_name;
		}
	
	public String getregion_type() {
		return region_type;
	}
	
	public void setregion_type(String region_type){
		this.region_type = region_type;
		}
	
	public String getregion_address() {
		return region_address;
	}
	
	public void setregion_address(String region_address){
		this.region_address = region_address;
		}
	
	public String getregion_post_code() {
		return region_post_code;
	}
	
	public void setregion_post_code(String region_post_code){
		this.region_post_code = region_post_code;
		}
	
	public String getregion_latitude() {
		return region_latitude;
	}
	
	public void setregion_latitude(String region_latitude){
		this.region_latitude = region_latitude;
		}
	
	public String getregion_longitude() {
		return region_longitude;
	}
	
	public void setregion_longitude(String region_longitude){
		this.region_longitude= region_longitude;	
		}
	
	public String getregion_nation() {
		return region_nation;
	}
	
	public void setregion_nation(String region_nation){
		this.region_nation= region_nation;	
		}
	
	public String getregion_nation_code() {
		return region_nation_code;
	}
	
	public void setregion_nation_code(String region_nation_code){
		this.region_nation_code= region_nation_code;	
		}
	
	public Timestamp getregion_write_date() {
		return region_write_date;
	}
	
	public void setregion_write_date(Timestamp region_write_date){
		this.region_write_date = region_write_date;
		}

	
	public Timestamp getregion_update_date() {
		return region_update_date;
	}
	
	public void setregion_update_date(Timestamp region_update_date){
		this.region_update_date = region_update_date;
		}
	
	public void setregion_use_yn(String region_use_yn){
		this.region_use_yn = region_use_yn;	
		}
	
	public String getregion_use_yn() {
		return region_use_yn;
	}
	
	


	
 }