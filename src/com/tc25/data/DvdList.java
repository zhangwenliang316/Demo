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
 * @date 2017��11��20������8:05:28
 * @version 1.0
 */

public class DvdList {
	//��ʼ��DVD��DVDid�ļ���
	private ArrayList<DVD> dvdList = new ArrayList<>();
	private ArrayList<Integer> idList = new ArrayList<>();
	//����DVDid�ķ���
	public int idCreate() {
		idList.add(idList.size()+1);
		return idList.size();
	}
	DVD d1  = new DVD("�ɺ��⴫",date(2017,11,20),1,0);
	DVD d2  = new DVD("ѩɽ�ɺ�",date(2017,11,20),1,0);
	DVD d3  = new DVD("���Ǿ�",date(2017,11,20),1,0);
	DVD d4  = new DVD("���Ӣ�۴�",date(2017,11,20),1,0);
	DVD d5  = new DVD("����Х����",date(2017,11,20),1,0);
	DVD d6  = new DVD("¹����",date(2017,11,20),1,0);
	DVD d7  = new DVD("Ц������",date(2017,11,20),1,0);
	DVD d8  = new DVD("�齣����¼",date(2017,11,20),1,0);
	DVD d9  = new DVD("�������",date(2017,11,20),1,0);
	DVD d10 = new DVD("����������",date(2017,11,20),1,0);
	//Date�ķ���
	private Date date(int i, int j, int k) {
		return null;
	}

	//DVD���ϳ�ʼ������ֵ���Լ��Ͻ��б���
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
