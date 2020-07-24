package com.cfx.demo.car;

import java.util.ArrayList;
import java.util.List;

public class Shop4 {

    private static List<ICar> carList = new ArrayList<>();

    static {
        carList.add(new BenzCar("梅赛德斯-迈巴赫S级轿车",138));
        carList.add(new BenzCar("梅赛德斯-AMG S 63 L 4MATIC+", 230));
        carList.add(new BenzCar("梅赛德斯-奔驰V级", 50));
    }

    public static void main(String[] args) {
        System.out.println("4s店售车记录:");
        for (ICar car: carList){
            System.out.println("车名：" + car.getName() + "\t价格：" + car.getPrice() + "万元");
        }
    }
}
