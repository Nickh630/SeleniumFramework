package Congif;

import Test.Example.BaseTest;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {

    static Properties properties = new Properties();
    //static String projectPath = System.getProperty("user.dir");

    public static void main(String[] args){
        getProperties();
        setProperties();
        getProperties();
    }

    public static void getProperties(){
        try {
            InputStream input = new FileInputStream("C:\\dev\\Raghav\\src\\test\\java\\Congif\\config.properties");
            properties.load(input);
            String browser = properties.getProperty("browser");
            System.out.println(browser);
            BaseTest.browserName = browser;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static void setProperties(){
        try {
            OutputStream output = new FileOutputStream( "src\\test\\java\\Congif\\config.properties");
            properties.setProperty("result", "pass");
            properties.store(output, null);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }
}
