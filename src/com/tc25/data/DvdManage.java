package com.tc25.data;

import java.util.ArrayList;

import com.tc25.bean.DVD;

public class DvdManage {
	private ArrayList<DVD> dvdList = new ArrayList<>();
	//���DVD�ķ���
	public boolean addDvd(DVD dvd) {
		if(dvd == null) {
			return false;
		}
		dvdList.add(dvd);		
		return true;
	}
	//����DVDidɾ��DVD
	public boolean subDvdById(int id) {
		for (DVD dvd : dvdList) {
			if(dvd.getDvdId()==id) {
				dvdList.remove(dvd);
				return true;
			}else {
				continue;
			}
		}	
		return false;
	}
	//����DVDNameɾ��DVD
	public boolean subDvdByName(String name) {
		int count = 0;
		for (DVD dvd : dvdList) {
			if(dvd.getDvdName().equals(name)) {
				dvdList.remove(dvd);
				System.out.println("��ɾ����"+ ++count +"������ƥ���DVD.");
			}
		}
		if(count!=0) {
			return true;
		}
		return false;
	}
	//�޸ĵ�DVD���Ƶķ���
	public void modifyDvdNameByid(int id) {
		for(DVD dvd :dvdList) {
			if(dvd.getDvdId()==id) {
				System.out.println("���ҵ�!/n"+dvd.toString());
				dvdList.set(id, dvd);
				break;
			}else {
				;
			}
		}
	}
	//��ͨ�Ĳ���DVD�ķ���
	public void checkAllDvd() {
		for (DVD dvd : dvdList) {
			System.out.println(dvd.toString());
		}
	}
	//�������пɽ��DVD�ķ���
	public void checkAllLendableDvd() {
		for (DVD dvd : dvdList) {
			if(dvd.isDvdStatus()) {
				System.out.println(dvd.toString());
			}
		}
	}
	//����DVDid�Ĳ���DVD�ķ���
	public boolean checkDvdByid(int id) {
		for (DVD dvd : dvdList) {
			if(dvd.getDvdId()==id) {
				System.out.println("���ҵ�!/n"+dvd.toString());
				return true;
			}else {
				continue;
			}
		}
		return false;	
	}
	//����DVDName�Ĳ���DVD�ķ���
	public boolean CheckDvdByName(String name) {
		int count = 0;
		for (DVD dvd : dvdList) {
			if(dvd.getDvdName().equals(name)) {
				System.out.println(dvd.toString());
				count++;
			}
		}
		if(count!=0) {
			return true;
		}
		return false;
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

