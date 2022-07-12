package com.bcoe.bricarbon.vo;

import java.io.Serializable;

/**
 * <p>Title: RegisterVO</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2021年4月23日 下午2:30:04
 */

public class RegisterVO implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1297341721910577374L;

	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;

	private String idCard;
	private String phoneNumb;
	/**
	 * 组织名称
	 */
	private String orgName;
	/**
	 * 组织描述
	 */
	private String orgDescription;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdCard() { return idCard; }
	public void setIdCard(String idCard) { this.idCard = idCard; }

	public String getPhoneNumb() { return phoneNumb; }
	public void setPhoneNumb(String phoneNumb) { this.phoneNumb = phoneNumb; }

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
	
	

}
