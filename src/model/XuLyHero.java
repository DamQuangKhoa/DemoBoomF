package model;

import java.awt.Graphics;
import java.awt.Image;

import controler.ControllerHero;
import controler.HeroMethod;

public class XuLyHero implements HeroMethod {
	
	@Override
	public boolean kiemTraDiChuyenDuoc(int x, int y, boolean[][] chan) {
		return false;
	}
	public static final int RONG= 600,CAO=600,KICHTHUOCVUONG =30,
			KICHTHUOCKHUNG=30,DODAI=20,MORONG=2;
	public static boolean huong = false; // false la di xuong
	@Override
	public void chet() {
		
	}

	@Override
	public void quaMan() {
		
	}

	@Override
	
	
public int chay(int data,boolean huong) {
		if(huong == false){
			return data-= 3;
		}
		return data+=3;
	}

	@Override
	public void veHero(Image img, int x, int y, Graphics g) {
		g.drawImage(img,x*KICHTHUOCVUONG+MORONG, y*KICHTHUOCVUONG+MORONG, KICHTHUOCKHUNG, KICHTHUOCKHUNG,null);		
	}

	@Override
	public void veHinh(Image img, int x, int y, Graphics g, boolean test, boolean[][] chan) {
		// TODO Auto-generated method stub
		g.drawImage(img,x*KICHTHUOCVUONG+MORONG, y*KICHTHUOCVUONG+MORONG, KICHTHUOCKHUNG, KICHTHUOCKHUNG,null);
		chan[x][y] = test;
	}


	@Override
	public int di(int data,boolean huong) {
		if(huong == false){
			--data;
			System.out.println(data);
			return data;
		}
		++data;
		return data;
	}
}
