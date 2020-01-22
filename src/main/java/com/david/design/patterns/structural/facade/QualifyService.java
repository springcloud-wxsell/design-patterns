package com.david.design.patterns.structural.facade;

/**
 * @author : wangwei
 * @date : Created in 2019/12/4 21:58
 * @description: ${description}
 * @modified By:
 * @version: ${version}
 */
public class QualifyService {

    public boolean isAvaliable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " 积分资格通过，库存通过" );
        return true;
    }
}
