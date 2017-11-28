/**
 * 
 */
package com.tc25.bean;

import java.sql.Date;

/**
 * @ClassName  : LendRecord.java
 * @Package    : com.tc25.bean
 * @Description: �����¼ͳ��
 *
 * @author Administrator
 * @date 2017��11��20������7:36:45
 * @version 1.0
 */

public class LendRecord implements Comparable<LendRecord>{
	private int irId;//�����¼Id
	private String lrNumber;//�����¼����AA+4�������+dvdId(������λ����)
	private int dvdId;//���DVD��Id
	private String dvdName;//���DVD������
	private Date lendDate;//���dvdʱ��(Ĭ���Դ�������Ȼ����)
	private Date retuDate;//�黹dvdʱ��
	private int userId;//��dvd�û�Id
	private boolean lrStatus;//�����¼��״̬,��ǰ���ŵ��ݵ�״̬
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
	//ȫ�ι���
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
	//ȱ��dvdId���вι���
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
	//�޲ι���
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
