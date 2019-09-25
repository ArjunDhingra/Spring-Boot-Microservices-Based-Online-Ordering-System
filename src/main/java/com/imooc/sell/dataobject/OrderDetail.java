package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@DynamicUpdate
public class OrderDetail {

	@Id
	private String detailId;

	private String orderId;

	private String productId;

	private String productName;

	private BigDecimal productPrice;

	private Integer productQuality;

	private String productIcon;

	public String getDetailId() {
		return detailId;
	}

	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductQuality() {
		return productQuality;
	}

	public void setProductQuality(Integer productQuality) {
		this.productQuality = productQuality;
	}

	public String getProductIcon() {
		return productIcon;
	}

	public void setProductIcon(String productIcon) {
		this.productIcon = productIcon;
	}

}
