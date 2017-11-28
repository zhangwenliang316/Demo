/**
 * 
 */
package com.tc25.bean;

import java.sql.Date;

/**
 * @ClassName  : LendRecord.java
 * @Package    : com.tc25.bean
 * @Description: 借出记录统计
 *
 * @author Administrator
 * @date 2017年11月20日下午7:36:45
 * @version 1.0
 */

public class LendRecord implements Comparable<LendRecord>{
	private int irId;//借出记录Id
	private String lrNumber;//借出记录单号AA+4个随机数+dvdId(不足三位左补零)
	private int dvdId;//借出DVD的Id
	private String dvdName;//借出DVD的名称
	private Date lendDate;//借出dvd时间(默认以此项做自然排序)
	private Date retuDate;//归还dvd时间
	private int userId;//借dvd用户Id
	private boolean lrStatus;//借出记录的状态,当前这张单据的状态
	public int getIrId() {
		return irId;
	}
	public void setIrId(int irId) {
		this.irId = irId;
	}
	public String getLrNumber() {
		return lrNumber;
	}
	public void setLrNumber(String lrNumber) {
		this.lrNumber = lrNumber;
	}
	public int getDvdId() {
		return dvdId;
	}
	public void setDvdId(int dvdId) {
		this.dvdId = dvdId;
	}
	public String getDvdName() {
		return dvdName;
	}
	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}
	public Date getLendDate() {
		return lendDate;
	}
	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}
	public Date getRetuDate() {
		return retuDate;
	}
	public void setRetuDate(Date retuDate) {
		this.retuDate = retuDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public boolean isLrStatus() {
		return lrStatus;
	}
	public void setLrStatus(boolean lrStatus) {
		this.lrStatus = lrStatus;
	}
	//全参构造
	public LendRecord(int irId, String lrNumber, int dvdId, String dvdName, Date lendDate, Date retuDate, int userId,
			boolean lrStatus) {
		super();
		this.irId = irId;
		this.lrNumber = lrNumber;
		this.dvdId = dvdId;
		this.dvdName = dvdName;
		this.lendDate = lendDate;
		this.retuDate = retuDate;
		this.userId = userId;
		this.lrStatus = lrStatus;
	}
	//缺少dvdId的有参构造
	public LendRecord(int irId, String lrNumber, String dvdName, Date lendDate, Date retuDate, int userId,
			boolean lrStatus) {
		super();
		this.irId = irId;
		this.lrNumber = lrNumber;
		this.dvdName = dvdName;
		this.lendDate = lendDate;
		this.retuDate = retuDate;
		this.userId = userId;
		this.lrStatus = lrStatus;
	}
	//无参构造
	public LendRecord() {
		super();
	}
	@Override
	public String toString() {
		return "LendRecord [irId=" + irId + ", lrNumber=" + lrNumber + ", dvdId=" + dvdId + ", dvdName=" + dvdName
				+ ", lendDate=" + lendDate + ", retuDate=" + retuDate + ", userId=" + userId + ", lrStatus=" + lrStatus
				+ "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(LendRecord o) {	
		return this.getLendDate().compareTo(o.getLendDate());
	}
	
	
	
}
