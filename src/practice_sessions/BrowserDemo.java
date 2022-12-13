package practice_sessions;
/* Runtime Polymorphism use
 * Here we have created "WebBrowser" as a parent class with methods having no logic
 * then we created 3 different child browser classes with similar methods 
 * In runtime polymorphism we create reference of parent class
 * And object of child class 
 * So parent class will be visible and object class methods will execute
 * here to run different browsers we just have to change object
 * It wil execute parent(reference) class methods + child (object) class methods
 * */
public class BrowserDemo {
	public static void main(String[] args) {
		WebBrowser web=new ChromeBrowser();
		web.openlink();
		web.closelink();//It will run chrome browser methods
		
	}

}
class WebBrowser{
	public void openlink() {
		
	}
	public void closelink() {
		
	}
}
class ChromeBrowser extends WebBrowser{
	public void openlink() {
		System.out.println("Open Chrome Browser");
	}
	public void closelink() {
		System.out.println("Close chrome Browser");
	}
}
class MozillBrowser extends WebBrowser{
	public void openlink() {
		System.out.println("Open Mozilla Browser");
	}
	public void closelink() {
		System.out.println("Close Mozilla Browser");
	}
}
class EdgeBrowser extends WebBrowser{
	public void openlink() {
		System.out.println("Open Edge Browser");
	}
	public void closelink() {
		System.out.println("Close Edge Browser");
	}
	
}

