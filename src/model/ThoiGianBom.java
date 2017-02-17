package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import view.Hinh;

public class ThoiGianBom implements ActionListener {
public static boolean isNoChua = false;
public ThoiGianBom() throws IOException {
}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(!isNoChua){
		System.out.println("Den Gio No Boom");
		isNoChua = true;
		}
		System.out.println("Chay Tiep");
	}

}
