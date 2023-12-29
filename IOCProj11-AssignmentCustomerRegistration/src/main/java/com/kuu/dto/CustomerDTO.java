package com.kuu.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	
	private String cname;
	private String cmobile;
	private String caddr;
	private Integer product1;
	private Integer product2;
	private Integer product3;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCmobile() {
		return cmobile;
	}
	public void setCmobile(String cmobile) {
		this.cmobile = cmobile;
	}
	public String getCaddr() {
		return caddr;
	}
	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}
	public Integer getProduct1() {
		return product1;
	}
	public void setProduct1(Integer product1) {
		this.product1 = product1;
	}
	public Integer getProduct2() {
		return product2;
	}
	public void setProduct2(Integer product2) {
		this.product2 = product2;
	}
	public Integer getProduct3() {
		return product3;
	}
	public void setProduct3(Integer product3) {
		this.product3 = product3;
	}
	
	

}
