package com.mycompany.abstractfactory.advertiser;

public final class NewspaperAdvertiser implements IAdvertiser{
    @Override
    public void advertise() {
        System.out.println("Advertising on Newspaper");
    }
}
