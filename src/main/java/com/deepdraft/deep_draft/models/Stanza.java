
package com.deepdraft.deep_draft.models;

import java.util.ArrayList;

public class Stanza extends EndWord {

    private ArrayList<String> stanzaOne;
    private ArrayList<String> stanzaTwo;
    private ArrayList<String> stanzaThree;
    private ArrayList<String> stanzaFour;
    private ArrayList<String> stanzaFive;
    private ArrayList<String> stanzaSix;

    private ArrayList<String> envoyLineOne;
    private ArrayList<String> envoyLineTwo;
    private ArrayList<String> envoyLineThree;


    public Stanza() {}

    public Stanza(String one, String two, String three, String four, String five, String six, ArrayList<String> stanzaOne, ArrayList<String> stanzaTwo, ArrayList<String> stanzaThree, ArrayList<String> stanzaFour, ArrayList<String> stanzaFive, ArrayList<String> stanzaSix, ArrayList<String> envoyLineOne, ArrayList<String> envoyLineTwo, ArrayList<String> envoyLineThree) {
        super(one, two, three, four, five, six);
        this.stanzaOne = stanzaOne;
        this.stanzaTwo = stanzaTwo;
        this.stanzaThree = stanzaThree;
        this.stanzaFour = stanzaFour;
        this.stanzaFive = stanzaFive;
        this.stanzaSix = stanzaSix;
        this.envoyLineOne = envoyLineOne;
        this.envoyLineTwo = envoyLineTwo;
        this.envoyLineThree = envoyLineThree;
    }

    public void setStanzaOne(String one, String two, String three, String four, String five, String six) {
        ArrayList<String> stanzaOne = new ArrayList<>();
        stanzaOne.add(0, one);
        stanzaOne.add(1, two);
        stanzaOne.add(2, three);
        stanzaOne.add(3, four);
        stanzaOne.add(4, five);
        stanzaOne.add(5, six);
        this.stanzaOne = stanzaOne;
    }

    public ArrayList<String> getStanzaOne() {
        return stanzaOne;
    }

    public ArrayList<String> getStanzaTwo() {
        return stanzaTwo;
    }

    public void setStanzaTwo(String one, String two, String three, String four, String five, String six) {
        ArrayList<String> stanzaTwo = new ArrayList<>();
        stanzaTwo.add(0, six);
        stanzaTwo.add(1, one);
        stanzaTwo.add(2, five);
        stanzaTwo.add(3, two);
        stanzaTwo.add(4, four);
        stanzaTwo.add(5, three);
        this.stanzaTwo = stanzaTwo;
    }

    public ArrayList<String> getStanzaThree() {
        return stanzaThree;
    }

    public void setStanzaThree(String one, String two, String three, String four, String five, String six) {
        ArrayList<String> stanzaThree = new ArrayList<>();
        stanzaThree.add(0, three);
        stanzaThree.add(1, six);
        stanzaThree.add(2, four);
        stanzaThree.add(3, one);
        stanzaThree.add(4, two);
        stanzaThree.add(5, five);
        this.stanzaThree = stanzaThree;
    }

    public ArrayList<String> getStanzaFour() {
        return stanzaFour;
    }

    public void setStanzaFour(ArrayList<String> stanzaFour) {
        this.stanzaFour = stanzaFour;
    }

    public ArrayList<String> getStanzaFive() {
        return stanzaFive;
    }

    public void setStanzaFive(ArrayList<String> stanzaFive) {
        this.stanzaFive = stanzaFive;
    }

    public ArrayList<String> getStanzaSix() {
        return stanzaSix;
    }

    public void setStanzaSix(ArrayList<String> stanzaSix) {
        this.stanzaSix = stanzaSix;
    }

    public ArrayList<String> getEnvoyLineOne() {
        return envoyLineOne;
    }

    public void setEnvoyLineOne(ArrayList<String> envoyLineOne) {
        this.envoyLineOne = envoyLineOne;
    }

    public ArrayList<String> getEnvoyLineTwo() {
        return envoyLineTwo;
    }

    public void setEnvoyLineTwo(ArrayList<String> envoyLineTwo) {
        this.envoyLineTwo = envoyLineTwo;
    }

    public ArrayList<String> getEnvoyLineThree() {
        return envoyLineThree;
    }

    public void setEnvoyLineThree(ArrayList<String> envoyLineThree) {
        this.envoyLineThree = envoyLineThree;
    }
}