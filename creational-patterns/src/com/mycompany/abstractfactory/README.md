**Case Study**

Consider an E-commerce Group like Flipkart. It has multiple stores under it :
- Flipkart
- Myntra
- Jabong

Two important functions which are shared among these stores are :
- Logistics
- Advertising

There are 2 contractors for Logistics : 
- For India Shipping
- For International Shipping

For Advertising : 
- Online
- TV
- Newspaper

We will use the Abstract Factory Design Pattern to design a solution for Flipkart.

**Simple Class Structure**

```
AbstractEcommerceStore
- GetAdvertiser()
- GetLogisticsPartner()

FlipkartStore extends AbstractEcommerceStore
MyntraStore extends AbstractEcommerceStore
JabongStore extends AbstractEcommerceStore

ILogistics
- ShipProduct()

DelhiveryLogistics implements ILogistics
FedexLogistics implements ILogistics

IAdvertiser
- Advertise()

TvAdvertiser implements IAdvertiser
OnlineAdvertiser implements IAdvertiser
NewspaperAdvertiser implements IAdvertiser
```

**PS:** Self made case study. Please comment / correct me if anything is wrong.