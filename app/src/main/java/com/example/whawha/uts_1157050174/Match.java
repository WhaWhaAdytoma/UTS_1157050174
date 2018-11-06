package com.example.whawha.uts_1157050174;

public class Match {

    String Tim1;
    String Tim2;
    int Skor1;
    int Skor2;

    public Match(String Tim1, int Skor1, String Tim2, int Skor2) {
        this.Tim1 = Tim1;
        this.Skor1 = Skor1;
        this.Tim2 = Tim2;
        this.Skor2 = Skor2;
    }

    public String getTim1() {
        return Tim1;
    }

    public void setTim1(String Tim1) {
        this.Tim1 = Tim1;
    }

    public String getTim2() {
        return Tim2;
    }

    public void setTim2(String Tim2) {
        this.Tim2 = Tim2;
    }

    public int getSkor1() {
        return Skor1;
    }

    public void setSkor1(int Skor1) {
        this.Skor1 = Skor1;
    }

    public int getSkor2() {
        return Skor2;
    }

    public void setSkor2(int Skor2) {
        this.Skor2 = Skor2;
    }
}

