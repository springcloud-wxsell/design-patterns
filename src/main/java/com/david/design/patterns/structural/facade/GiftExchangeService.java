package com.david.design.patterns.structural.facade;

/**
 * @author : wangwei
 * @date : Created in 2020/1/11 20:15
 * @description: ${description}
 * @modified By:
 * @version: ${version}
 */
public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvaliable(pointsGift)) {
            // 资格校验通过
            if (pointsPaymentService.pay(pointsGift)) {
                // 积分支付成功
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功，订单号: " + shippingOrderNo);
            }
        }
    }
}
