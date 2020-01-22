package com.david.design.patterns.structural.facade;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @author : wangwei
 * @date : Created in 2019/12/4 22:03
 * @description: ${description}
 * @modified By:
 * @version: ${version}
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift) {
        // 扣减积分
        System.out.println("支付" + pointsGift.getName() + " 积分成功");
        return true;
    }
}
