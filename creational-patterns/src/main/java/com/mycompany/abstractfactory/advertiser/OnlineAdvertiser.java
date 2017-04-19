package com.mycompany.abstractfactory.advertiser;

public final class OnlineAdvertiser implements IAdvertiser{
    @Override
    public void advertise() {
        System.out.println("Advertising on Websites");
    }
}
