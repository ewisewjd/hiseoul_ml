package com.hiseoul_ml.model;

import java.security.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tb_cctv_info")
@Getter
@Setter
@ToString

public class Cctvinfo{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String cctv_name;
	private String cctv_type;
	private String cctv_model;
	private String cctv_product_company;
	private String cctv_resolution;
	private String cctv_marker;
	
	@Column(name="cctv_write_date")
	 Timestamp cctvWriteDate;
	
	private Timestamp cctv_update_date;
	private String cctv_use_yn;
	private String cctv_active_status;
	
	@Column(name= "cctv_uuid")
	 UUID cctvUuid;
		
	public UUID getcctv_uuid() {
		return cctvUuid;
	}
	
	public void setcctv_uuid(UUID uuid){
		this.cctvUuid = uuid;
		}
	
	public String getCctv_name() {
		return cctv_name;
	}
	
	public void setCctv_name(String name){
		this.cctv_name = name;
		}
	
	public String getCctv_type() {
		return cctv_type;
	}
	
	public void setCctv_type(String type){
		this.cctv_name = type;
		}
	
	public String getCctv_model() {
		return cctv_model;
	}
	
	public void setCctv_model(String model){
		this.cctv_name = model;
		}
	
	public String getCctv_product_company() {
		return cctv_product_company;
	}
	
	public void setCctv_product_company(String product_company){
		this.cctv_product_company = product_company;
		}
	
	public String getCctv_resuolution() {
		return cctv_resolution;
	}
	
	public void setCctv_resolution(String resolution){
		this.cctv_resolution = resolution;
		}
	
	public String getCctv_marker() {
		return cctv_marker;
	}
	
	public void setCctv_marker(String marker){
		this.cctv_marker = marker;	
		}
	
	public Timestamp getCctv_write_date() {
		return cctvWriteDate;
	}
	
	public void setCctv_write_date(Timestamp write_date){
		this.cctvWriteDate = write_date;
		}

	
	public Timestamp getCctv_update_date() {
		return cctv_update_date;
	}
	
	public void setCctv_update_date(Timestamp update_date){
		this.cctv_update_date = update_date;
		}
	
	public void setCctv_use_yn(String use_yn){
		this.cctv_use_yn = use_yn;	
		}
	
	public String getCctv_use_yn() {
		return cctv_use_yn;
	}
	
	
	public void setCctv_active_status(String active_status){
		this.cctv_active_status = active_status;	
		}
	
	public String getCctv_active_status() {
		return cctv_active_status;
	}

	
	
	

	
 }