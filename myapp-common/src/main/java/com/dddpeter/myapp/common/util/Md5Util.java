package com.dddpeter.myapp.common.util;

import java.security.MessageDigest;

/**
 * @author Peter Lee
 * @ClassName: Md5Util
 * @Description: Md5编码程序
 * @date 2014年8月11日 下午1:58:28
 */
public class Md5Util {

    private static MessageDigest md5 = null;

    static {
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * ֵ
     *
     * @param string
     * @return
     */
    public static String getMd5(String string) {
        byte[] bs = md5.digest(string.getBytes());
        StringBuilder sb = new StringBuilder(40);
        for (byte x : bs) {
            if ((x & 0xff) >> 4 == 0) {
                sb.append("0").append(Integer.toHexString(x & 0xff));
            } else {
                sb.append(Integer.toHexString(x & 0xff));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getMd5("admin"));
    }
}
