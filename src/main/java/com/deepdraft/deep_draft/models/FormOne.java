package com.deepdraft.deep_draft.models;

public class FormOne extends FormTwo {

    private String END1;
    private String END2;
    private String END3;
    private String END4;
    private String END5;
    private String END6;

    public FormOne() {}

    public FormOne(String END1, String END2, String END3, String END4, String END5, String END6) {
        this.END1 = END1;
        this.END2 = END2;
        this.END3 = END3;
        this.END4 = END4;
        this.END5 = END5;
        this.END6 = END6;
    }

    public String getEND1() {
        return END1;
    }

    public void setEND1(String END1) {
        this.END1 = END1;
    }

    public String getEND2() {
        return END2;
    }

    public void setEND2(String END2) {
        this.END2 = END2;
    }

    public String getEND3() {
        return END3;
    }

    public void setEND3(String END3) {
        this.END3 = END3;
    }

    public String getEND4() {
        return END4;
    }

    public void setEND4(String END4) {
        this.END4 = END4;
    }

    public String getEND5() {
        return END5;
    }

    public void setEND5(String END5) {
        this.END5 = END5;
    }

    public String getEND6() {
        return END6;
    }

    public void setEND6(String END6) {
        this.END6 = END6;
    }
}
