package model;

public class Boom {
private int[] listX,listY;
private int xBom,yBom;
int countX =0,countY=0;
public Boom() {
	super();
	this.listX =  new int[10];
	this.listY = new int[10];
}
public int[] getListX() {
	return listX;
}
public void setListX(int[] listX) {
	this.listX = listX;
}
public int[] getListY() {
	return listY;
}
public void setListY(int[] listY) {
	this.listY = listY;
}
public int getxBom() {
	return xBom;
}
public void setxBom(int xBom) {
	this.listX[++countX] = xBom;
}
public int getyBom() {
	return yBom;
}
public void setyBom(int yBom) {
	this.listY[++countY] = yBom;
}
@Override
public String toString() {
	return "xBom=" + xBom + ", yBom=" + yBom ;
}
public int getCountX() {
	return countX;
}
}