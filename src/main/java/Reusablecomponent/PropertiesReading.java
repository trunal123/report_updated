package Reusablecomponent;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReading {
    public static String getProperty(String FileName,String key) throws IOException
    {
        FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/AppCofiguration/"+FileName+".properties");
        Properties properties = new Properties();
        properties.load(fis);
        String value=properties.getProperty(key);
        return value;

    }


}
