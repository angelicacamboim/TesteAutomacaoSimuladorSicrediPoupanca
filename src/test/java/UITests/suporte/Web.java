package UITests.suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver createChrome(String url) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_77.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        navegador.get(url);

        return navegador;
    }
    public static WebDriver createFirefox(String url) {

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver navegador = new FirefoxDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        navegador.get(url);

        return navegador;
    }
}
