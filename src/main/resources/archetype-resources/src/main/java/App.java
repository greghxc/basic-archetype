package ${groupId};

import java.util.Properties;

public class App
{
    public static void main( String[] args )
    {
        Properties prop = PropertiesLoader.getProperties();
        System.out.println(prop.getProperty("test.value"));
    }
}
