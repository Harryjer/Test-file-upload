

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

    public class UploadTestFile {
        WebDriver driver = new ChromeDriver();

        @BeforeTest
        public void initialSetup(){
            WebDriverManager.chromedriver().setup();
            driver.manage().window().maximize();
        }

        @Test
        public void loadURL(){
            driver.get("https://www.ebay.com/");
        }

        @Test
        public void extractData(){
            File excelFile = new File("src/main/resources/TestFile.xlsx");
            System.out.println(excelFile.exists());
        }


    }

