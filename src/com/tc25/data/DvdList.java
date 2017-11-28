/**
 * 
 */
package com.tc25.data;

import java.sql.Date;
import java.util.ArrayList;

import com.tc25.bean.DVD;
import com.tc25.bean.User;

/**
 * @ClassName  : DvdList.java
 * @Package    : com.tc25.data
 * @Description: TODO
 *
 * @author Administrator
 * @date 2017年11月20日下午8:05:28
 * @version 1.0
 */

public class DvdList {
	//初始化DVD和DVDid的集合
	private ArrayList<DVD> dvdList = new ArrayList<>();
	private ArrayList<Integer> idList = new ArrayList<>();
	//创建DVDid的方法
	public int idCreate() {
		idList.add(idList.size()+1);
		return idList.size();
	}
	DVD d1  = new DVD("飞狐外传",date(2017,11,20),1,0);
	DVD d2  = new DVD("雪山飞狐",date(2017,11,20),1,0);
	DVD d3  = new DVD("连城诀",date(2017,11,20),1,0);
	DVD d4  = new DVD("射雕英雄传",date(2017,11,20),1,0);
	DVD d5  = new DVD("白马啸西风",date(2017,11,20),1,0);
	DVD d6  = new DVD("鹿鼎记",date(2017,11,20),1,0);
	DVD d7  = new DVD("笑傲江湖",date(2017,11,20),1,0);
	DVD d8  = new DVD("书剑恩仇录",date(2017,11,20),1,0);
	DVD d9  = new DVD("神雕侠侣",date(2017,11,20),1,0);
	DVD d10 = new DVD("倚天屠龙记",date(2017,11,20),1,0);
	//Date的方法
	private Date date(int i, int j, int k) {
		return null;
	}

	//DVD集合初始化并赋值，对集合进行遍历
	public void sort(DVD d){
		dvdList.add(d1);
		dvdList.add(d2);
		dvdList.add(d3);
		dvdList.add(d4);
		dvdList.add(d5);
		dvdList.add(d6);
		dvdList.add(d7);
		dvdList.add(d8);
		dvdList.add(d9);
		dvdList.add(d10);
		for(int i =0;i<dvdList.size();i++){
			dvdList.get(i).setDvdId(i+1);
		}
	}
	
}
