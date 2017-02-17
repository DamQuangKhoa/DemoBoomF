package controler;

import java.awt.Graphics;
import java.awt.Image;

public interface HeroMethod {
public int chay(int toaDo,boolean huong);
public int di(int toaDo,boolean huong);
public void veHero(Image img,int x,int y, Graphics g);
public void veHinh(Image img,int x,int y, Graphics g,boolean test,boolean[][] chan);
public boolean kiemTraDiChuyenDuoc(int x,int y,boolean[][] chan);
public void chet();
public void quaMan();
}
