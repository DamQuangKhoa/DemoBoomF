package controler;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import model.XuLyBoom;

public class ControllerBoom  implements BoomMethod{
XuLyBoom xuLyBoom;
public ControllerBoom() throws IOException {
xuLyBoom = new XuLyBoom();
}
	@Override
	public void datBom(int x, int y,Graphics g,boolean[][] chan) {
		xuLyBoom.datBom(x, y, g, chan);
	}

	@Override
	public void noBom(int x, int y,Graphics g,boolean[][] chan) {
		xuLyBoom.noBom(x, y, g, chan);
	}
	public void sauKhiNo(int x, int y,Graphics g,boolean[][] chan){
		xuLyBoom.sauKhiNo(x, y, g, chan);
	}
}
