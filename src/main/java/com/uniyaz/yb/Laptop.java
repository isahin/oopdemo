package com.uniyaz.yb;

public class Laptop extends OyuncuCihaz implements TamirEdilebilir{

    @Override
    public void tamirEdilebilir() {
        System.out.println("Laptop Tamir Edildi..");
    }

    public void saglamCihaz() {
        System.out.println("Laptop çalışıyor");
    }
}