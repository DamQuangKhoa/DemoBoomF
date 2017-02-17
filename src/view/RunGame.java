package view;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RunGame  extends JFrame{
	Hinh hinh;
	public static final int SIZE= 700;
public RunGame() throws IOException {
hinh = new Hinh();
add(hinh);

setSize(SIZE,SIZE);
setTitle("Booom");
setDefaultCloseOperation(EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setVisible(true);
addKeyListener(hinh);

}
public static void main(String[] args) throws IOException {
	new RunGame();
}
}
