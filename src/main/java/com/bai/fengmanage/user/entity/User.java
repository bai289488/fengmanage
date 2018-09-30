/**   
* @Title: User.java 
* @Package com.huayu.entity 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bs   
* @date 2018年7月10日 下午3:55:57 
* @version V1.0   
*/
package com.bai.fengmanage.user.entity;

import java.io.Serializable;



/** 
* @ClassName: User 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author bs 
* @date 2018年7月10日 下午3:55:57 
*  
*/
public class User implements Serializable{

	private Long id;

	private String name;

	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}