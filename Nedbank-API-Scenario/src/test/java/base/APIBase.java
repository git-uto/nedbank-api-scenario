package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class APIBase {
    public static String endpoint;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/test/resources/configs/config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        endpoint =  properties.getProperty("endpoint");
    }
}
