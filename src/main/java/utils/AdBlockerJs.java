package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AdBlockerJs {

    public static void AdBlockerJs(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "function removeAds() {" +
                "  document.querySelectorAll('.adsbygoogle').forEach(function(ad) {" +
                "    ad.style.display = 'none';" +
                "  });" +
                "}" +
                "document.addEventListener('DOMContentLoaded', removeAds);" +
                "window.addEventListener('load', removeAds);" +
                "setInterval(removeAds, 1000);"; // Continuously check for ads every second
        js.executeScript(script);
    }
}
