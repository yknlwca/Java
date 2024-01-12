package selenum_practice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CatImage {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get(
                "https://www.google.com/search?q=%EA%B3%A0%EC%96%91%EC%9D%B4&sca_esv=597681688&tbm=isch&source=lnms&sa=X&ved=2ahUKEwi3vPyZ5taDAxVsk1YBHXdGCioQ_AUoAXoECAIQAw&biw=1884&bih=924&dpr=1");

        List<WebElement> images = driver.findElements(By.cssSelector(".rg_i"));

        int count = 0;

        for (WebElement image : images) {
            if (count == 10)
                break;
            count++;

            image.click();

            WebElement imgElement = wait
                    .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".sFlh5c.pT0Scc.iPVvYb")));

            String imgSrc = imgElement.getAttribute("src");
            
            if (imgSrc.contains(".webp")) {
                count++;
                continue;
            }

            try {
                BufferedImage saveImage = ImageIO.read(new URL(imgSrc));
                ImageIO.write(saveImage, "jpg", new File("cat" + count + ".jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}