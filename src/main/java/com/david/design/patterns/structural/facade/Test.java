package com.david.design.patterns.structural.facade;

/**
 * @author : wangwei
 * @date : Created in 2020/1/11 20:22
 * @description: ${description}
 * @modified By:
 * @version: ${version}
 */
public class Test {

    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T桖");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);

    }
}
