package com.imooc.sell.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import com.imooc.sell.utils.serializer.Data2LongSerializer;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
	@Id
	private String orderId;

	private String buyerName;

	private String buyerPhone;

	private String buyerAddress;

	private String buyerOpenid;

	private BigDecimal orderAmount;

	private Integer orderStatus;

	private Integer paySataus;

	@JsonSerialize(using = Data2LongSerializer.class)
	private Date createTime;

	@JsonSerialize(using = Data2LongSerializer.class)
	private Data updateTime;

	List<OrderDetail> orderDetailList = new ArrayList<>();

	public OrderStatusEnum getOrderStatusEnum() {
		return null;

	}

	public PayStatusEnum getPayStatusEnum() {
		return null;

	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerPhone() {
		return buyerPhone;
	}

	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}

	public String getBuyerAddress() {
		return buyerAddress;
	}

	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}

	public String getBuyerOpenid() {
		return buyerOpenid;
	}

	public void setBuyerOpenid(String buyerOpenid) {
		this.buyerOpenid = buyerOpenid;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getPaySataus() {
		return paySataus;
	}

	public void setPaySataus(Integer paySataus) {
		this.paySataus = paySataus;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Data getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Data updateTime) {
		this.updateTime = updateTime;
	}

	public List<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<OrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

}
