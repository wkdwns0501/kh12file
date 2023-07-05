package oop.inherit3;

public class Test01 {
	public static void main(String[] args) {
		ChromeBrowser a = new ChromeBrowser();
		a.refresh();
		a.move();
		a.develop();
		a.choromeStore();
		
		EdgeBrowser b = new EdgeBrowser();
		b.refresh();
		b.move();
		b.fullScreen();
		
		WhaleBrowser c = new WhaleBrowser();
		c.refresh();
		c.move();
		c.papago();
		c.naverSearch();
	}
}
