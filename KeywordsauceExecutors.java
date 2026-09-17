package KeyWordDriven;

public class KeywordsauceExecutors {
	KeywordSauceImplementation k = new KeywordSauceImplementation();
	
	public void executors1(String keyword) throws InterruptedException {
		if(keyword.equals("LAUNCH_BROWSER")) {
			k.launchbrowser();
		}
		else if(keyword.equals("OPEN_URL")) {
			k.openurl();
		}
		else if(keyword.equals("ENTER_USERNAME")) {
			k.username();
		}
		else if(keyword.equals("ENTER_PASSWORD")) {
			k.password();
		}
		else if(keyword.equals("CLICK_LOGIN")) {
			k.login();
		}
		else if(keyword.equals("CLOSE_BROWSER")) {
			k.closebrowser();
		}
		
	}
}

	
	


