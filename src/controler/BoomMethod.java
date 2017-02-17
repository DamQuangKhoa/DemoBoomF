package controler;

import java.awt.Graphics;
import java.awt.Image;

public interface BoomMethod {
	public void datBom(int x, int y,Graphics g,boolean[][] chan);
	public void noBom(int x, int y,Graphics g,boolean[][] chan);
	public void sauKhiNo(int x, int y,Graphics g,boolean[][] chan);
}
