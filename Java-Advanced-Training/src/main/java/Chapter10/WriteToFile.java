package Chapter10;

import java.awt.desktop.SystemSleepEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/15/2026
 **/

public class WriteToFile {
    public static void main(String[] args) {
       String filePath = "src/main/resources/Hobbies.txt";

       File hobbiesFile = new File(filePath);
       try {
           PrintStream pen = new PrintStream(hobbiesFile);
           pen.println("Tennis");
           pen.println("Soccer");
           pen.println("Hiking");
           pen.close();
       } catch(FileNotFoundException ex){
           System.err.println(ex.getMessage());
       }

    }
}
