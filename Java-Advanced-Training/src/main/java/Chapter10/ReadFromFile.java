package Chapter10;

import java.io.*;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/15/2026
 **/

public class ReadFromFile {
    public static void main(String[] args) {
        String filePath = "src/main/resources/Modules.txt";
        File moduleFile = new File(filePath);
        String text;

        try {
            FileReader fileReader = new FileReader(moduleFile);
            BufferedReader reader = new BufferedReader(fileReader);


            while((text = reader.readLine()) != null){
                System.out.println(text);
            }

            reader.close();
            fileReader.close();
        } catch(IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
