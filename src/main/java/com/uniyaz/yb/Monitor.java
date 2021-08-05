package com.uniyaz.yb;

public class Monitor extends OyuncuCihaz implements TamirEdilebilir{
        @Override
        public void tamirEdilebilir() {
            System.out.println("Monitör Tamir Edildi");
        }

        public void saglamCihaz(){
            System.out.println("Monitor Çalışıyor");
        }
    }
