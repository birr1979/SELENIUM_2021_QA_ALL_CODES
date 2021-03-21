package SeleniumClass5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

    public static void main(String[] args) throws IOException {

        //reading there properties file
        //returns the file path where the project is located
        System.out.println(System.getProperty("user.dir"));

        //providing  the Config file path
        Properties config = new Properties();
        Properties ObjRepo = new Properties();

        FileInputStream fis_config = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\Config.Properties");
        FileInputStream fis_ObjRepo = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\ObjectRepository.Properties");
        //load the property file

        config.load(fis_config);
        //read the text
        System.out.println(config.getProperty("browser"));


    }

}
