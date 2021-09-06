package com.bookit.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


    private static Properties properties = new Properties();



    static {
        String path = "configuration.properties";

        try {

            FileInputStream file = new FileInputStream(path);

            properties.load(file);

            file.close();

        } catch (IOException e) {
            System.out.println("File not found in the properties");
        }
    }



    public static String getProperties(String word){

        return properties.getProperty(word);

    }


}
