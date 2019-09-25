package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
//商品包含类目
public class ProductVO {

	@JsonProperty("name")
	private String categoryName;

	@JsonProperty("type")
	private Integer categoryType;

	@JsonProperty("food")
	private List<ProductInfoVO> productInfoVOList;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(Integer categoryType) {
		this.categoryType = categoryType;
	}

	public List<ProductInfoVO> getProductInfoVOList() {
		return productInfoVOList;
	}

	public void setProductInfoVOList(List<ProductInfoVO> productInfoVOList) {
		this.productInfoVOList = productInfoVOList;
	}

}
