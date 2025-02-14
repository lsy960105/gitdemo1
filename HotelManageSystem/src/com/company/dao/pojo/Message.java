package com.company.dao.pojo;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable{
	private static final long serialVersionUID = 1L;
	private int messageId;
	private Client client;
	private String messageInfo;
	private Date createTime;
	private Date updateTime;
	public Message() {
		// TODO Auto-generated constructor stub
	}
	public Message(int messageId, Client client, String messageInfo, Date createTime, Date updateTime) {
		super();
		this.messageId = messageId;
		this.client = client;
		this.messageInfo = messageInfo;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public Message(Client client, String messageInfo, Date createTime, Date updateTime) {
		super();
		this.client = client;
		this.messageInfo = messageInfo;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getMessageInfo() {
		return messageInfo;
	}
	public void setMessageInfo(String messageInfo) {
		this.messageInfo = messageInfo;
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
		return "Message [messageId=" + messageId + ", client=" + client.getCname() + ", messageInfo=" + messageInfo
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
}
