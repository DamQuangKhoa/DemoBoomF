package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JPanel;

import controler.ControllerHero;
import model.Hero;

public class Hinh  extends JPanel implements KeyListener {
	HinhAnh image;
	ControllerHero controller;
	Hero hero;
public static final int RONG= 600,CAO=600,KICHTHUOCVUONG =30,
KICHTHUOCKHUNG=30,DODAI=20,MORONG=2;
public   boolean diXuong= false,diLen=false,sangTrai = true,sangPhai = false;
static boolean[][] chan ;
int tmp;
public Hinh() throws IOException {
	hero = new Hero();
	tmp =0;
	controller = new ControllerHero();
	image = new HinhAnh();
	chan = new boolean[DODAI][DODAI];
}
@Override
	protected void paintComponent(Graphics g) {
		g =(Graphics2D) g; // dat graphic thanh bien de dung toan class
		for (int i = 0; i < DODAI; i++) {
			for (int j = 0; j < DODAI; j++) {
				if(  i%2 != 0 && j%2 != 0 && i != DODAI-1){
					controller.veHinh(image.cay, i, j, g,true,chan);
				}
				else {
					controller.veHinh(image.co, i, j, g,false,chan);
				}
			}
		}
		controller.veHinh(image.da1, 0, 0, g, true, chan);;
		if(diLen){
			controller.veHero(image.nhanVatXoayLen, hero.getxHero(), hero.getyHero(),g);
			repaint();
		}
		if(diXuong){
			controller.veHero(image.nhanVatXoayXuong, hero.getxHero(), hero.getyHero(),g);
			repaint();
		}
		if(sangTrai){
			controller.veHero(image.nhanVatXoayTrai, hero.getxHero(), hero.getyHero(),g);
			repaint();
		}
		if(sangPhai){
			controller.veHero(image.nhanVatXoayPhai, hero.getxHero(), hero.getyHero(), g);
//			inMang();
			repaint();
		}
		
	}
public void inMang(){
	for (int i = 0; i < chan.length; i++) {
		for (int j = 0; j < chan.length; j++) {
			System.out.print(chan[i][j]+"\t");
		}
		System.out.println();
	}
}
@Override
public void keyTyped(KeyEvent e) {
}
@Override
public void keyPressed(KeyEvent e) {
int tmp = e.getKeyCode();
switch (tmp) {
case KeyEvent.VK_UP:
	if(!diLen){
		// neu chua di len thi doi huong
		// neu di len roi thi thay doi toa do
	diLen = true;
	diXuong = false;
	sangTrai = false;
	sangPhai = false;
	}
	else{
		tmp=controller.di(hero.getyHero(), false);
		if(controller.kiemTraDiChuyenDuoc(hero.getxHero(),tmp ,chan)){
		hero.setyHero(tmp);
		}
	}
	break;
case KeyEvent.VK_DOWN:
	if(!diXuong){
	diLen = false;
	diXuong = true;
	sangTrai = false;
	sangPhai = false;
	}
	else {
		tmp=controller.di(hero.getyHero(), true);
		if(controller.kiemTraDiChuyenDuoc(hero.getxHero(),tmp ,chan)){
			hero.setyHero(tmp);
			}
	}
	break;
case KeyEvent.VK_LEFT:
	if(!sangTrai){
	diLen = false;
	diXuong = false;
	sangTrai = true;
	sangPhai = false;
}
	else {
		tmp=controller.di(hero.getxHero(), false);
		if(controller.kiemTraDiChuyenDuoc(tmp,hero.getyHero(),chan )){
			hero.setxHero(tmp);
			}
	}
	break;
case KeyEvent.VK_RIGHT:
	if(!sangPhai){
	diLen = false;
	diXuong = false;
	sangTrai = false;
	sangPhai = true;
	}
	else {
		tmp=controller.di(hero.getxHero(), true);
		if(controller.kiemTraDiChuyenDuoc(tmp,hero.getyHero(),chan )){
			hero.setxHero(tmp);
			}
	}
	break;

default:
	break;
}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
