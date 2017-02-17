package view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class HinhAnh {
	public Image nhanVatXoayTrai, nhanVatXoayPhai, nhanVatXoayLen, nhanVatXoayXuong, nhanVatVaXe;
	public Image boom, boomNo, boomDen;
	public Image buiCo, da1, cay, da2, thung1, da3, da4, da5, co, nuoc;
	private Image tongHop;
	/*
	 * Nhan vat la 1 nha la 2 cay la 3 odat la 0
	 */
	public HinhAnh() throws IOException {

		// tong hop
		BufferedImage tongHop = ImageIO.read(new File("img/map.PNG"));
		BufferedImage nhanVat=ImageIO.read(new File("img/nv.PNG"));
		// Image nhan vat 1,2,3,nhan vat va xe
		nhanVatXoayTrai=nhanVat.getSubimage(20, 90, 20, 30);
		nhanVatXoayPhai=nhanVat.getSubimage(20, 30, 20, 30);
		nhanVatXoayLen=nhanVat.getSubimage(20, 0, 20, 30);
		nhanVatXoayXuong=nhanVat.getSubimage(20, 60, 20, 30);
		// hinh boom
		 BufferedImage boomTong=ImageIO.read(new File("img/boom.PNG"));

		 boom = boomTong.getSubimage(0, 0, 23, 23);
		 boomDen = boomTong.getSubimage(0, 23, 23, 23);
		 boomNo = boomTong.getSubimage(0, 40, 20, 20);
//		 boomNo = ImageIO.read(new File("img/boomNo.PNG"));
//		 boomDen = ImageIO.read(new File("img/boomDen.PNG"));

		// Model Map
		buiCo = tongHop.getSubimage(0, 0, 20, 20);
		da1 = tongHop.getSubimage(0, 20, 20, 20);
		cay = tongHop.getSubimage(0, 40, 20, 20);
		da2 = tongHop.getSubimage(0, 60, 20, 20);
		thung1 = tongHop.getSubimage(0, 80, 20, 20);
		da3 = tongHop.getSubimage(0, 120, 20, 20);
		da4 = tongHop.getSubimage(0, 180, 20, 20);
		da5 = tongHop.getSubimage(0, 200, 20, 20);
		co = tongHop.getSubimage(0, 220, 20, 20);
		nuoc = tongHop.getSubimage(0, 260, 20, 20);

	}
}
