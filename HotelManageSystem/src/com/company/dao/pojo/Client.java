package com.company.dao.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class Client implements Serializable{
	private static final long serialVersionUID = 1L;
	private int clientId;
	private String cname;
	private String phone;
	private Date birthday;
	private String gender;
	private ClientType clientType;
	private Set<Message> messages;
	private Date createTime;
	private Date updateTime;
	public Client() {
		// TODO Auto-generated constructor stub
	}
	public Client(int clientId, String cname, String phone, Date birthday, String gender, ClientType clientType,
			Set<Message> messages, Date createTime, Date updateTime) {
		super();
		this.clientId = clientId;
		this.cname = cname;
		this.phone = phone;
		this.birthday = birthday;
		this.gender = gender;
		this.clientType = clientType;
		this.messages = messages;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public Client(String cname, String phone, Date birthday, String gender, ClientType clientType,
			Set<Message> messages, Date createTime, Date updateTime) {
		super();
		this.cname = cname;
		this.phone = phone;
		this.birthday = birthday;
		this.gender = gender;
		this.clientType = clientType;
		this.messages = messages;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	
	
	
	
	
	
	
	public Client(String cname, String phone, Date birthday, String gender, ClientType clientType, Date createTime,
			Date updateTime) {
		super();
		this.cname = cname;
		this.phone = phone;
		this.birthday = birthday;
		this.gender = gender;
		this.clientType = clientType;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public ClientType getClientType() {
		return clientType;
	}
	public void setClientType(ClientType clientType) {
		this.clientType = clientType;
	}
	public Set<Message> getMessages() {
		return messages;
	}
	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", cname=" + cname + ", phone=" + phone + ", birthday=" + birthday
				+ ", gender=" + gender + ", clientType=" + clientType.getClientTypeName() + ", messages=" + messages.size() + ", createTime="
				+ createTime + ", updateTime=" + updateTime + "]";
	}
	
	
}
