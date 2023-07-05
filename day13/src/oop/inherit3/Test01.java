package oop.inherit3;

public class Test01 {
	public static void main(String[] args) {
		//Browser는 생성하면 안된다
		ChromeBrowser a = new ChromeBrowser();
		a.setUrl("https://www.google.com");
		a.refresh();
		a.move();
		a.develop();
		a.choromeStore();
		
		EdgeBrowser b = new EdgeBrowser();
		a.setUrl("https://www.google.com");
		b.refresh();
		b.move();
		b.fullScreen();
		
		WhaleBrowser c = new WhaleBrowser();
		a.setUrl("https://www.google.com");
		c.refresh();
		c.move();
		c.papago();
		c.naverSearch();
	}
}
