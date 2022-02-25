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
@Table(name="tb_member")
@Getter
@Setter
@ToString

public class Member{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;
	private String id;
	private String pass;
	private String name;
	private String email;
	private String instance_yn;
	private Timestamp write_date;
	private Timestamp update_date;
	private String active_yn;
	private int permission;
	
	public int getno() {
		return no;
	}
	
	public void setno(int no){
		this.no = no;
		}
	
	public String getid() {
		return id;
	}
	
	public void setid(String id){
		this.id = id;
		}
	
	public String getpass() {
		return pass;
	}
	
	public void setpass(String pass){
		this.pass = pass;
		}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name){
		this.name = name;
		}
	
	public String getemail() {
		return email;
	}
	
	public void setemail(String email){
		this.email = email;
		}
	
	public String getinstance_yn() {
		return instance_yn;
	}
	
	public void setinstance_yn(String instance_yn){
		this.instance_yn = instance_yn;
		}
	
	public Timestamp getwrite_date() {
		return write_date;
	}
	
	public void setwrite_date(Timestamp write_date){
		this.write_date = write_date;
		}

	
	public Timestamp getupdate_date() {
		return update_date;
	}
	
	public void setupdate_date(Timestamp update_date){
		this.update_date = update_date;
		}
	
	public void setactive_yn(String active_yn){
		this.active_yn = active_yn;	
		}
	
	public String getactive_yn() {
		return active_yn;
	}
	
	
	public void setpermission(int permission){
		this.permission = permission;	
		}
	
	public int getpermission() {
		return permission;
	}
}