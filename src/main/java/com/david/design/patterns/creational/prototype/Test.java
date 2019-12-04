package com.david.design.patterns.creational.prototype;

/**
 * Created by wangwei on 2019/10/25.
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail: " + mail);
        for (int i = 0; i < 10; i++) {
            Mail tempMail = (Mail) mail.clone();
            tempMail.setName("姓名" + i);
            tempMail.setEmailAddress("姓名" + i + "@imooc.com");
            tempMail.setContent("恭喜您，此次慕课网活动中奖了");
            MailUtils.sendMail(tempMail);
            System.out.println("克隆tempMail: " + tempMail);
        }
        MailUtils.saveOriginMailRecord(mail);
    }
}
