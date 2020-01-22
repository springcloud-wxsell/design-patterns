package com.david.design.patterns.structural;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.util.Base64;

/**
 * @author : wangwei
 * @date : Created in 2019/12/4 21:54
 * @description: ${description}
 * @modified By:
 * @version: ${version}
 */
public class B {


    public static void main(String[] args) throws IOException {
        String sb="最喜欢你了！！！！";
        BASE64Encoder encode=new BASE64Encoder();//创建BASE64Encoder对象
        String out=encode.encodeBuffer(sb.getBytes("UTF-8"));//传入一个字节数组得到
        System.out.println("BASE64Encoder加密后的字符串: " + out);

        BASE64Decoder dencode=new BASE64Decoder();//创建解码对象
        byte[] s= dencode.decodeBuffer(out);//得到字节数组
        System.out.println("BASE64Encoder解码后字符串: " + new String(s,"utf-8"));//转化为看得懂的编码


        Base64.Encoder encoder = Base64.getEncoder();//创建BASE64Encoder对象
        String out1 = encoder.encodeToString(sb.getBytes("UTF-8"));//传入一个字节数组得到
        System.out.println("Base64.Encoder加密后的字符串: " + out1);

        Base64.Decoder decoder = Base64.getDecoder();//创建解码对象
        byte[] s1 = decoder.decode(out1);//得到字节数组
        System.out.println("Base64.Encoder解码后字符串: " + new String(s1,"utf-8"));//转化为看得懂的编码
    }
}
