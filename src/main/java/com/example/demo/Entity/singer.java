
package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Singer_Details")
public class singer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sid;
	private String  sname;
	private String  stype;
	private Double  sprice;
	public singer( String sname, String stype, Double sprice) {
		super();
		this.sname = sname;
		this.stype = stype;
		this.sprice = sprice;
	}
	public singer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getStype() {
		return stype;
	}
	public void setStype(String stype) {
		this.stype = stype;
	}
	public Double getSprice() {
		return sprice;
	}
	public void setSprice(Double sprice) {
		this.sprice = sprice;
	}
	@Override
	public String toString() {
		return "singer [sid=" + sid + ", sname=" + sname + ", stype=" + stype + ", sprice=" + sprice + "]";
	}
//	public static int size() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
	
	
	
	
	

}
