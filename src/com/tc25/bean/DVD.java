/**
 * 
 */
package com.tc25.bean;

import java.sql.Date;

/**
 * @ClassName  : DVD.java
 * @Package    : com.tc25.bean
 * @Description: DVD类
 *
 * @author Administrator
 * @date 2017年11月20日下午7:36:17
 * @version 1.0
 */

public class DVD {
	private String dvdName;//dvd名称
	private int dvdId;//dvd的id
	private Date dvdDate;//dvd的入库时间
	private int dvdStatus;//dvd的状态,1为在库 2为借出 3为已删除
	private int dvdLendCount;//DVD借出次数
	public String getDvdName() {
		return dvdName;
	}
	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}
	public int getDvdId() {
		return dvdId;
	}
	public void setDvdId(int dvdId) {
		this.dvdId = dvdId;
	}
	public Date getDvdDate() {
		return dvdDate;
	}
	public void setDvdDate(Date dvdDate) {
		this.dvdDate = dvdDate;
	}
	public int getDvdStatus() {
		return dvdStatus;
	}
	public void setDvdStatus(int dvdStatus) {
		this.dvdStatus = dvdStatus;
	}
	public int getDvdLendCount() {
		return dvdLendCount;
	}
	public void setDvdLendCount(int dvdLendCount) {
		this.dvdLendCount = dvdLendCount;
	}
	//全参构造
	public DVD(String dvdName, int dvdId, Date dvdDate, int dvdStatus, int dvdLendCount) {
		super();
		this.dvdName = dvdName;
		this.dvdId = dvdId;
		this.dvdDate = dvdDate;
		this.dvdStatus = dvdStatus;
		this.dvdLendCount = dvdLendCount;
	}
	//没有dvdId的有参构造
	public DVD(String dvdName, Date dvdDate, int dvdStatus, int dvdLendCount) {
		super();
		this.dvdName = dvdName;
		this.dvdDate = dvdDate;
		this.dvdStatus = dvdStatus;
		this.dvdLendCount = dvdLendCount;
	}
	//无参构造
	public DVD() {
		super();
	}
	@Override
	public String toString() {
		return "DVD [dvdName=" + dvdName + ", dvdId=" + dvdId + ", dvdDate=" + dvdDate + ", dvdStatus=" + dvdStatus
				+ ", dvdLendCount=" + dvdLendCount + "]";
	}
	public boolean isDvdStatus() {
		return false;
	}
	
	
	
	
}
