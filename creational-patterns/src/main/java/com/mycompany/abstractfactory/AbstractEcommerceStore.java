package com.mycompany.abstractfactory;

import com.mycompany.abstractfactory.advertiser.IAdvertiser;
import com.mycompany.abstractfactory.advertiser.NewspaperAdvertiser;
import com.mycompany.abstractfactory.advertiser.OnlineAdvertiser;
import com.mycompany.abstractfactory.advertiser.TvAdvertiser;
import com.mycompany.abstractfactory.logistics.DelhiveryLogistics;
import com.mycompany.abstractfactory.logistics.FedexLogistics;
import com.mycompany.abstractfactory.logistics.ILogistics;

abstract class AbstractEcommerceStore {

    enum ShippingLocation {
        INDIA,
        INTERNATIONAL
    }

    enum AdvertisingMedium {
        Newspaper,
        Television,
        Online
    }

    ILogistics getLogisticsPartner(ShippingLocation shippingLocation) {
        switch(shippingLocation) {
            case INDIA:
                return new DelhiveryLogistics();
            case INTERNATIONAL:
                return new FedexLogistics();
            default:
                throw new IllegalArgumentException("Unknown Shipping Location");
        }
    }
    IAdvertiser getAdvertiser(AdvertisingMedium advertisingMedium) {
        switch(advertisingMedium) {
            case Newspaper:
                return new NewspaperAdvertiser();
            case Television:
                return new TvAdvertiser();
            case Online:
                return new OnlineAdvertiser();
            default:
                throw new IllegalArgumentException("Unknown Advertising Medium");
        }
    }
}
