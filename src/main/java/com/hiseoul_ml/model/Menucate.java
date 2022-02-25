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
@Table(name="tb_menu_cate")
@Getter
@Setter
@ToString

public class Menucate{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cate_no;
	private String cctv_name;
	private String menu_name;
	private int menu_perm;
	private int parant_no;
	private String uri;
	private String menu_use_yn;
	private Timestamp write_date;
	private Timestamp update_date;
	
	
	public int getcate_no() {
		return cate_no;
	}
	
	public void setcate_no(int cate_no){
		this.cate_no = cate_no;
		}
	
	public String getcctv_name() {
		return cctv_name;
	}
	
	public void setcctv_name(String cctv_name){
		this.cctv_name = cctv_name;
		}
	
	public String getmenu_name() {
		return menu_name;
	}
	
	public void setmenu_name(String menu_name){
		this.menu_name= menu_name;
		}
	
	public int getmenu_perm() {
		return menu_perm;
	}
	
	public void setmenu_perm(int menu_perm){
		this.menu_perm = menu_perm;
		}
	
	public int getparant_no() {
		return parant_no;
	}
	
	public void setparant_no(int parant_no){
		this.parant_no = parant_no;
		}
	
	public String geturi() {
		return uri;
	}
	
	public void seturi(String uri){
		this.uri = uri;
		}
	
	public String getmenu_use_yn() {
		return menu_use_yn;
	}
	
	public void setmenu_use_yn(String menu_use_yn){
		this.menu_use_yn = menu_use_yn;	
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
	
	

	
 }