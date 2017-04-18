package com.mycompany.abstractfactory;

import com.mycompany.abstractfactory.advertiser.IAdvertiser;
import com.mycompany.abstractfactory.logistics.ILogistics;

public class FlipkartStore extends AbstractEcommerceStore {
    private ILogistics logisticsProvider;
    private IAdvertiser advertiser;

    public FlipkartStore(ShippingLocation shippingLocation, AdvertisingMedium advertisingMedium) {
        super();
        this.logisticsProvider = getLogisticsPartner(shippingLocation);
        this.advertiser = getAdvertiser(advertisingMedium);
    }

    public void ship() {
        logisticsProvider.shipProduct();
    }

    public void advertise() {
        advertiser.advertise();
    }
}
