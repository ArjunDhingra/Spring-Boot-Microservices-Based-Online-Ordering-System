package com.imooc.sell.dataobject;

import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.Transient;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Data
@DynamicUpdate
public class OrderMaster {
	@Id
	private String orderId;

	private String buyerName;

	private String buyerPhone;

	private String buyerAddress;

	private String buyerOpenid;

	private BigDecimal orderAmount;

	private Integer orderStatus = OrderStatusEnum.NEW.getCode();

	private Integer paySataus = PayStatusEnum.WAIT.getCode();

	private Date createTime;

	private Data updateTime;

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

}
