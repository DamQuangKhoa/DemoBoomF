package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.print.Book;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.Timer;

import controler.ControllerBoom;
import controler.ControllerHero;
import model.Boom;
import model.Hero;
import model.ThoiGianBom;

public class Hinh  extends JPanel implements KeyListener {
	HinhAnh image;
	ControllerHero controller;
	ControllerBoom controllerBoom;
	Hero hero;
	Boom boom;
	Timer timeBoom;
//	public static boolean isNoChua = false;
public static final int RONG= 600,CAO=600,KICHTHUOCVUONG =30,
KICHTHUOCKHUNG=30,DODAI=20,MORONG=2;
public   boolean diXuong= false,diLen=false,sangTrai = true,sangPhai = false, datBoom = false;
static boolean[][] vatCan ;
int tmp;
public Hinh() throws IOException {
	boom = new Boom();
	hero = new Hero();
	tmp =0;
	controller = new ControllerHero();
	controllerBoom = new ControllerBoom();
	image = new HinhAnh();
	vatCan = new boolean[DODAI][DODAI];
	timeBoom = new Timer(3000, new ThoiGianBom());
	timeBoom.stop();
	
}
@Override
	protected void paintComponent(Graphics g) {
		g =(Graphics2D) g; 
		for (int i = 0; i < DODAI; i++) {
			for (int j = 0; j < DODAI; j++) {
				if(  i%2 != 0 && j%2 != 0 && i != DODAI-1){
					controller.veHinh(image.cay, i, j, g,true,vatCan);
				}
				else {
					controller.veHinh(image.co, i, j, g,false,vatCan);
				}
			}
		}
		controller.veHinh(image.da1, 0, 0, g, true, vatCan);
//		controllerBoom.datBom(image.boomDen,6, 6, g, vatCan);
		if(datBoom){
			for (int i = 0; i < boom.getCountX(); i++) {
				controllerBoom.datBom(boom.getListX()[i], boom.getListY()[i], g, vatCan);
				if(ThoiGianBom.isNoChua){
				controllerBoom.noBom(boom.getListX()[i], boom.getListY()[i], g, vatCan);
				controllerBoom.sauKhiNo(boom.getListX()[i], boom.getListY()[i], g, vatCan);
			}
			}
			repaint();
		}
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
			repaint();
		}
		
	}
public void inMang(){
	for (int i = 0; i < vatCan.length; i++) {
		for (int j = 0; j < vatCan.length; j++) {
			System.out.print(vatCan[i][j]+"\t");
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
		if(controller.kiemTraDiChuyenDuoc(hero.getxHero(),tmp ,vatCan)){
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
		if(controller.kiemTraDiChuyenDuoc(hero.getxHero(),tmp ,vatCan)){
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
		if(controller.kiemTraDiChuyenDuoc(tmp,hero.getyHero(),vatCan )){
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
		if(controller.kiemTraDiChuyenDuoc(tmp,hero.getyHero(),vatCan )){
			hero.setxHero(tmp);
			}
	}
	break;
case KeyEvent.VK_SPACE:
	datBoom = true;
	timeBoom.start();
	System.out.println(ThoiGianBom.isNoChua);
	if(ThoiGianBom.isNoChua){
		timeBoom.stop();
	}
	boom.setxBom(hero.getxHero());
	boom.setyBom(hero.getyHero());
//	break;
default:
	break;
}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

}
