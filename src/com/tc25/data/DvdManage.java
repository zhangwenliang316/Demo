package com.tc25.data;

import java.util.ArrayList;

import com.tc25.bean.DVD;

public class DvdManage {
	private ArrayList<DVD> dvdList = new ArrayList<>();
	//添加DVD的方法
	public boolean addDvd(DVD dvd) {
		if(dvd == null) {
			return false;
		}
		dvdList.add(dvd);		
		return true;
	}
	//根据DVDid删除DVD
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
	//根据DVDName删除DVD
	public boolean subDvdByName(String name) {
		int count = 0;
		for (DVD dvd : dvdList) {
			if(dvd.getDvdName().equals(name)) {
				dvdList.remove(dvd);
				System.out.println("已删除第"+ ++count +"个名称匹配的DVD.");
			}
		}
		if(count!=0) {
			return true;
		}
		return false;
	}
	//修改的DVD名称的方法
	public void modifyDvdNameByid(int id) {
		for(DVD dvd :dvdList) {
			if(dvd.getDvdId()==id) {
				System.out.println("已找到!/n"+dvd.toString());
				dvdList.set(id, dvd);
				break;
			}else {
				;
			}
		}
	}
	//普通的查找DVD的方法
	public void checkAllDvd() {
		for (DVD dvd : dvdList) {
			System.out.println(dvd.toString());
		}
	}
	//查找所有可借的DVD的方法
	public void checkAllLendableDvd() {
		for (DVD dvd : dvdList) {
			if(dvd.isDvdStatus()) {
				System.out.println(dvd.toString());
			}
		}
	}
	//根据DVDid的查找DVD的方法
	public boolean checkDvdByid(int id) {
		for (DVD dvd : dvdList) {
			if(dvd.getDvdId()==id) {
				System.out.println("已找到!/n"+dvd.toString());
				return true;
			}else {
				continue;
			}
		}
		return false;	
	}
	//根据DVDName的查找DVD的方法
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

