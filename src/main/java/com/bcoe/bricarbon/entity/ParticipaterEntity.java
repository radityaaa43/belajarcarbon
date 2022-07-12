package com.bcoe.bricarbon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author he_jiebing@jiuyv.com
 * @date 2021-04-20 15:58:29
 */
@TableName("participater")
public class ParticipaterEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private String id;
	/**
	 * 组织名称
	 */
	private String idCard;
	private String phoneNumb;
	private String orgName;
	/**
	 * 组织描述
	 */
	private String orgDescription;
	/**
	 * 插入时间
	 */
	private Date insertedAt;
	/**
	 * 更新时间
	 */
	private Date updatedAt;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 用户余额
	 */
	private Long balance;
	/**
	 * 用户在链上名称
	 */
	private String nameOnWebase;
	/**
	 * 用户在链上地址
	 */
	private String userAddress;
	
	/**
	 * 链上signUserId
	 */
	private String signUserId;
	
	public String getSignUserId() {
		return signUserId;
	}
	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
	}
	
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPhoneNumb() {
		return phoneNumb;
	}
	public void setPhoneNumb(String phoneNumb) {
		this.phoneNumb = phoneNumb;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgDescription() {
		return orgDescription;
	}
	public void setOrgDescription(String orgDescription) {
		this.orgDescription = orgDescription;
	}
	public Date getInsertedAt() {
		return insertedAt;
	}
	public void setInsertedAt(Date insertedAt) {
		this.insertedAt = insertedAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	public String getNameOnWebase() {
		return nameOnWebase;
	}
	public void setNameOnWebase(String nameOnWebase) {
		this.nameOnWebase = nameOnWebase;
	}
	
	

}
