package controler;

import java.awt.Graphics;
import java.awt.Image;

import model.XuLyHero;

public class ControllerHero implements HeroMethod {
XuLyHero model ;
public ControllerHero() {
model = new XuLyHero();
}
	@Override
public void chet() {
	// TODO Auto-generated method stub
	
}

@Override
public void quaMan() {
	// TODO Auto-generated method stub
}

	@Override
	public int chay(int toaDo, boolean huong) {
		return model.chay(toaDo, huong) ;
	}

	@Override
	public int di(int toaDo, boolean huong) {
		return model.di(toaDo, huong);
	}
	@Override
	public void veHero(Image img, int x, int y, Graphics g) {
		model.veHero(img, x, y, g);
	}
	@Override
	public void veHinh(Image img, int x, int y, Graphics g, boolean test,boolean[][] chan) {
		model.veHinh(img, x, y, g, test, chan);
	}
	@Override
	public boolean kiemTraDiChuyenDuoc(int x, int y, boolean[][] chan) {
		return model.kiemTraDiChuyenDuoc(x, y, chan);
//			try {
//				if (chan[x][y] != true)
//					return true;
//			} catch (Exception e) {
//			}
//			return false;
//		}
	}
}