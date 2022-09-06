package com.kuang.demo01;

/**
 * @author chenpi
 * @create 2022-09-06 22:25
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
        seeHouse();
        fee();
        contract();
    }

    //看房
    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    //收中介费
    public void fee() {
        System.out.println("中介收中介费");
    }

    //签合同
    public void contract() {
        System.out.println("中介签合同");
    }
}
