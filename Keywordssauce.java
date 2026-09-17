package Datadriventesting;

import KeyWordDriven.KeyWordExecutors;
import KeyWordDriven.KeywordsauceExecutors;

public class Keywordssauce {
	public static void main(String[] args) throws InterruptedException {
		KeywordsauceExecutors e=new KeywordsauceExecutors();
		
		e.executors1("LAUNCH_BROWSER");
		e.executors1("OPEN_URL");
		e.executors1("ENTER_USERNAME");
		e.executors1("ENTER_PASSWORD");
		e.executors1("CLICK_LOGIN");
		e.executors1("CLOSE_BROWSER");
	}

}



