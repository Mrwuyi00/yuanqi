package org.smart4j.chapter2.util;

import com.linwu.yuanqi.threadtest.TheradTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by linwu on 12/25/2017.
 * 属性文件工具类
 *
 */
public class PropsUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * 加载属性文件
     * @param fileName
     * @return
     */
    public static Properties loadProps(String fileName){
        Properties props = null;
        InputStream is = null;
        try{
            is = TheradTest.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            if(is == null){
                throw new FileNotFoundException(fileName + "file is not found");
            }
            props = new Properties();
            props.load(is);
        }catch (IOException e){
            LOGGER.error("load properties file failure", e);
        }finally {
            if (is != null){
                try{
                    is.close();
                }catch (IOException e){
                    LOGGER.error("close input stream failure", e);
                }
            }
        }
        return props;
    }

    /*public static String getString(Properties props, String key, String defaultValue){
        String value = defaultValue;
        if
    }*/

}
