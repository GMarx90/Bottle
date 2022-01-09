package com.MarxGrzegorz;

public class Butelka {
    private double iloscPlynu;
    private double maxIlosc;

    public Butelka(double iloscPlynu, double maxIlosc){
        this.iloscPlynu=iloscPlynu;
        this.maxIlosc=maxIlosc;
    }

    public double getMaxIlosc() {
        return maxIlosc;
    }

    public double getIloscPlynu() {
        return iloscPlynu;
    }
    public void wylejPlyn(double ilosc){
        iloscPlynu-=ilosc;
        if (iloscPlynu<0){
            iloscPlynu=0;
            System.out.println("Wylewam. nie ma więcej wody w butelce, wylałem wszysto, chciałeś wylać za duzo. W butelce jest "+iloscPlynu+"l");
        }
    }
    public void wlejPlyn(double ilosc){
        iloscPlynu+=ilosc;
        double ileLacznie=iloscPlynu;
        if (iloscPlynu>maxIlosc){
            iloscPlynu=maxIlosc;
            System.out.println("za duzo wlałeś płynu, wylało się! Aktualnie jest " + maxIlosc+ "l plynu");
            System.out.println("wylałeś "+(ileLacznie-maxIlosc)+"l płynu");
        }

    }
    public void wylejWszsyto(){
        System.out.println("Wylałęś "+iloscPlynu+"l");
        iloscPlynu=0;
    }
    public void zapelnij(){
        iloscPlynu=maxIlosc;
    }
    public void dolejZInnej (double ilosc, Butelka zJakiej){
        zJakiej.wylejPlyn(ilosc);
        wlejPlyn(ilosc);
    }
    public void przelejDoInnej(double ilosc, Butelka doJakiej){
        wylejPlyn(ilosc);
        doJakiej.wlejPlyn(ilosc);
    }
}
