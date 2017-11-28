/**
 * 
 */
package com.tc25.bean;

import java.sql.Date;

/**
 * @ClassName  : DVD.java
 * @Package    : com.tc25.bean
 * @Description: DVD��
 *
 * @author Administrator
 * @date 2017��11��20������7:36:17
 * @version 1.0
 */

public class DVD {
	private String dvdName;//dvd����
	private int dvdId;//dvd��id
	private Date dvdDate;//dvd�����ʱ��
	private int dvdStatus;//dvd��״̬,1Ϊ�ڿ� 2Ϊ��� 3Ϊ��ɾ��
	private int dvdLendCount;//DVD�������
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
	//ȫ�ι���
	public DVD(String dvdName, int dvdId, Date dvdDate, int dvdStatus, int dvdLendCount) {
		super();
		this.dvdName = dvdName;
		this.dvdId = dvdId;
		this.dvdDate = dvdDate;
		this.dvdStatus = dvdStatus;
		this.dvdLendCount = dvdLendCount;
	}
	//û��dvdId���вι���
	public DVD(String dvdName, Date dvdDate, int dvdStatus, int dvdLendCount) {
		super();
		this.dvdName = dvdName;
		this.dvdDate = dvdDate;
		this.dvdStatus = dvdStatus;
		this.dvdLendCount = dvdLendCount;
	}
	//�޲ι���
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
