package com.hiseoul.ml.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tb_member")
@Getter
@Setter
@ToString
public class Member{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer no;
	private String id;
	private String pass;
	private String name;
	private String email;
	private String instance_yn;
	private Timestamp write_date;
	private Timestamp up_date;
	private String active_yn;
	private Integer permission;
	private Integer auth;
	
	public Integer getNo() {
		return no;
	}	
	public void setNo(Integer no) {
		this.no = no;
	}	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass){
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getInstanceyn() {
		return instance_yn;
	}
	public void setInstanceyn(String instance_yn) {
		this.instance_yn = instance_yn;
	}	
	public Timestamp getWritedate() {
		return write_date;
	}
	public void setWritedate(Timestamp write_date) {
		this.write_date = write_date;
	}	
	public Timestamp getUpdate() {
		return up_date;
	}
	public void setUpdate(Timestamp up_date) {
		this.up_date = up_date;
	}
	public String getActiveyn() {
		return active_yn;
	}
	public void setActiveyn(String active_yn) {
		this.active_yn = active_yn;
	}
	public Integer getPermission() {
		return permission;
	}	
	public void setPermission(Integer permission) {
		this.permission = permission;
	}
	public Integer getAuth() {
		return auth;
	}	
	public void setAuth(Integer auth) {
		this.auth = auth;
	}	
}
