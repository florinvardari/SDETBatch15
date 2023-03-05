package class31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo2 {
    public static void main(String[] args) throws IOException {
        /*
        Path where we want to create the new file and the name of the file with ist extension
         */
        String path="Files/testMy.properties";

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();

        properties.setProperty("Name","Florin");
        properties.setProperty("Age","31");
        properties.setProperty("Id","F159825456");
        properties.store(fileOutputStream,"A ne file has been created");



    }
}
