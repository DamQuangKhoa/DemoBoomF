package model;

public class Hero {
	private static int xHero,yHero;

	public Hero(int xHero, int yHero) {
		super();
		this.xHero = xHero;
		this.yHero = yHero;
	}

	public Hero() {
		super();
		this.xHero = 2;
		this.yHero = 2;
	}

	public static int getxHero() {
		return xHero;
	}

	public static void setxHero(int xHero) {
		Hero.xHero = xHero;
	}

	public static int getyHero() {
		return yHero;
	}

	public static void setyHero(int yHero) {
		Hero.yHero = yHero;
	}

	@Override
	public String toString() {
		return "Vi Tri x: "+xHero+"\t"+"Vi Tri y: "+ yHero;
	}

}
