package com.david.design.patterns.structural.facade;

/**
 * @author : wangwei
 * @date : Created in 2020/1/11 20:12
 * @description: ${description}
 * @modified By:
 * @version: ${version}
 */
public class ShippingService {

    public String shipGift(PointsGift pointsGift) {
        // 物流系统的对接逻辑
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
