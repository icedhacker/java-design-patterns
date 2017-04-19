package com.mycompany.abstractfactory.advertiser;

public final class TvAdvertiser implements IAdvertiser{
    @Override
    public void advertise() {
        System.out.println("Advertising on TV");
    }
}
