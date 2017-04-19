package com.mycompany.abstractfactory.logistics;

public final class FedexLogistics implements ILogistics{
    @Override
    public void shipProduct() {
        System.out.println("Ship Product outside India");
    }
}
