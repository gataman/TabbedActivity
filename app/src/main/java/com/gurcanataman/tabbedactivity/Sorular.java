package com.gurcanataman.tabbedactivity;

/**
 * Created by gurcanataman on 10.06.2018.
 */

public class Sorular {
    private String soru;
    private String cevapA;
    private String cevapB;
    private String cevapC;
    private String cevapD;
    private int dogruCevap;

    public Sorular() {
    }


    public String getSoru() {
        return soru;
    }

    public void setSoru(String soru) {
        this.soru = soru;
    }

    public String getCevapA() {
        return cevapA;
    }

    public void setCevapA(String cevapA) {
        this.cevapA = cevapA;
    }

    public String getCevapB() {
        return cevapB;
    }

    public void setCevapB(String cevapB) {
        this.cevapB = cevapB;
    }

    public String getCevapC() {
        return cevapC;
    }

    public void setCevapC(String cevapC) {
        this.cevapC = cevapC;
    }

    public String getCevapD() {
        return cevapD;
    }

    public void setCevapD(String cevapD) {
        this.cevapD = cevapD;
    }

    public int getDogruCevap() {
        return dogruCevap;
    }

    public void setDogruCevap(int dogruCevap) {
        this.dogruCevap = dogruCevap;
    }
}
