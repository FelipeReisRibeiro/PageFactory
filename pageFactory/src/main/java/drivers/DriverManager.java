package drivers;

import org.openqa.selenium.WebDriver;

public class DriverManager {

		private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
		
		private  DriverManager() {
			
		}
		public static WebDriver getDriver() {
			return driver.get();
		}
	
		public static void setDriver(WebDriver wDriver) {
			DriverManager.driver.set(wDriver);
		}
		public static void fechar() {
			DriverManager.driver.get().quit();
			driver.remove();
		}
}
