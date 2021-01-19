package kr.co.bonjin.portfolio.common.util;

import lombok.RequiredArgsConstructor;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.UUID;

@RequiredArgsConstructor
public class ServiceUtil {

    /**
     *
     * @param str
     * @return
     */
    public static String base64Encoded(String str) {
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encodeByte = encoder.encode(str.getBytes());
        return new String(encodeByte);
    }

    /**
     *
     * @param str
     * @return
     */
    public static String base64Decoded(String str) {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodeByte = decoder.decode(str);
        String fileName = new String(decodeByte);
        return fileName;
    }

    /**
     * 임시 비밀번호 생성
     * @return
     */
    public static String getTempPw() {
        String pw = "";
        for (int i = 0; i < 8; i++) {
            pw += (char) ((Math.random() * 26) + 97);
        }
        return pw;
    }

    /**
     * Client IP
     * @param request
     * @return
     */
    public static String getIp(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");

        if (ip == null) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null) {
            ip = request.getHeader("WL-Proxy-Client-IP"); // 웹로직
        }
        if (ip == null) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    /**
     * 오늘날짜 생성
     * @return
     */
    public static String getDate() {
        LocalDate localDate = LocalDate.now();
        return localDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    }

    /**
     *
     * @return
     */
    public static String getUUID() {
        return UUID.randomUUID().toString();
    }

    /**
     *
     * @return
     */
    public static String getContextPath() {
        return "";
    }
}
