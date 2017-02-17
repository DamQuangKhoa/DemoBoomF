package model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.Timer;

import controler.BoomMethod;
import controler.ControllerBoom;
import controler.ControllerHero;
import view.HinhAnh;

public class XuLyBoom  implements BoomMethod,ActionListener{
ControllerHero heroControl;
HinhAnh hinhAnh;


@Override
public void actionPerformed(ActionEvent e) {
	
}
public XuLyBoom() throws IOException {
	heroControl = new ControllerHero();
	hinhAnh = new HinhAnh();
}
	@Override
	public void datBom(int x, int y,Graphics g,boolean[][] chan) {
		heroControl.veHinh(hinhAnh.boom, x, y, g, true, chan);
	}
	@Override
	public void noBom(int x, int y,Graphics g,boolean[][] chan) {
		for (int i = 1; i < 2; i++) {
				heroControl.veHinh(hinhAnh.boomNo, x-i, y, g, true, chan);
				heroControl.veHinh(hinhAnh.boomNo, x+i, y, g, true, chan);
				heroControl.veHinh(hinhAnh.boomNo, x, y+i, g, true, chan);
				heroControl.veHinh(hinhAnh.boomNo, x, y-i, g, true, chan);
			}
		}
	public void sauKhiNo(int x, int y,Graphics g,boolean[][] chan){
		for (int i = 1; i < 2; i++) {
			if(chan[x+i][y] == true ){
				heroControl.veHinh(hinhAnh.co, x+i, y, g, false, chan);
			}
			if(chan[x][y+i] == true ){
				heroControl.veHinh(hinhAnh.co, x, y+i, g, false, chan);
			}
			if(chan[x][y-i] == true ){
				heroControl.veHinh(hinhAnh.co, x, y-i, g, false, chan);
			}
			if(chan[x-i][y] == true ){
				heroControl.veHinh(hinhAnh.co, x-i, y, g, false, chan);
			}
			
		}
	}
	}
