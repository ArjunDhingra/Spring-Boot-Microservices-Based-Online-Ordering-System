package com.imooc.sell.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class OrderForm {

	@NotEmpty(message = "buyer name")
	private String name;

	@NotEmpty(message = "phone number")
	private String phone;

	@NotEmpty(message = "address")
	private String address;

	@NotEmpty(message = "openid")
	private String openid;

	@NotEmpty(message = "shopping cart")
	private String items;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

}
