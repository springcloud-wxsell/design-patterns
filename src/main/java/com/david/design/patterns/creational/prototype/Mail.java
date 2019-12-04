package com.david.design.patterns.creational.prototype;

/**
 * Created by wangwei on 2019/9/2.
 */
public class Mail implements Cloneable{

    private String name;

    private String emailAddress;

    private String content;

    public Mail(String name, String emailAddress, String content) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.content = content;
    }

    public Mail() {
        System.out.println("Mail class Construtor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Clone Mail Object");
        return super.clone();
    }
}
