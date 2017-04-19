package com.mycompany.abstractfactory.logistics;

public final class DelhiveryLogistics implements  ILogistics{
    @Override
    public void shipProduct() {
        System.out.println("Ship Product in India");
    }
}
