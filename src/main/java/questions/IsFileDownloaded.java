package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.File;

public class IsFileDownloaded implements Question {
    private final String filePath;
    private final int timeoutInSeconds;

    public IsFileDownloaded(String filePath, int timeoutInSeconds) {
        this.filePath = filePath;
        this.timeoutInSeconds = timeoutInSeconds;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        File downloadedFile = new File(filePath);
        int elapsedTime = 0;
        while (elapsedTime < timeoutInSeconds) {
            if (downloadedFile.exists() && downloadedFile.length() > 0) {
                return true;
            }
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            elapsedTime++;
        }
        return false;
    }

    public static IsFileDownloaded in(String filePath, int timeoutInSeconds) {
        return new IsFileDownloaded(filePath, timeoutInSeconds);
    }
}
