package kr.co.bonjin.portfolio.common.util;

public class SystemUtil {

    /**
     *
     * @param key
     * @param value
     * @return
     */
    public static String setProperty(SystemPropertyKey key, String value) {
        return System.setProperty(key.getValue(), value);
    }

    /**
     *
     * @param key
     * @return
     */
    public static String getProperty(SystemPropertyKey key) {
        return System.getProperty(key.getValue());
    }
}
