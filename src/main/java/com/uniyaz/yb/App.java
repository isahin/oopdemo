package com.uniyaz.yb;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Tamirci tamirci=new Tamirci();

        Laptop asuslaptop=new Laptop();
        Monitor samsungmonitor=new Monitor();

        asuslaptop.tamirEdilebilir();
        samsungmonitor.tamirEdilebilir();

        tamirci.tamirEt(asuslaptop);
        tamirci.tamirEt(samsungmonitor);

        tamirci.saglamCihaz(asuslaptop);
        tamirci.saglamCihaz(samsungmonitor);

    }
}








