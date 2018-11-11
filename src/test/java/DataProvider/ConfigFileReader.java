package DataProvider;

import java.io.*;
import java.util.Properties;

public class ConfigFileReader  {
   static Properties properties;
    static File file;

  /*  public static void main(String []args)
    {
        readPropertyFile();
    }*/

    public static void readPropertyFile() {
        properties = new Properties();
        //file = new File(System.getProperties()+"\\src\\test\\Configs\\Configuration.properties");
       // FileReader read = new FileReader(file);
       // InputStream input = ConfigFileReader.class.getClassLoader().getResourceAsStream("src/test/Configs/Configuration.properties");
        try {
            InputStream input = new FileInputStream("C:\\Users\\Sridevi\\IdeaProjects\\LoginFeatures\\src\\test\\Configs\\Configuration.properties");
            properties.load(input);
            System.out.println(properties.getProperty("name"));
        } catch (Exception e) {
            e.printStackTrace();
        }

   }
   public String getUrl(){
        return properties.getProperty("url");
   }

/*
    public static String getData(String Data) throws IOException{
        readData();
        String data = properties.getProperty(Data);
        return data;
    } */

}
