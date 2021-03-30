
package com.deepdraft.deep_draft.models;

import java.util.ArrayList;

public class Stanza {

    private ArrayList<String> stanzaOne;
    private ArrayList<String> stanzaTwo;
    private ArrayList<String> stanzaThree;
    private ArrayList<String> stanzaFour;
    private ArrayList<String> stanzaFive;
    private ArrayList<String> stanzaSix;

    private ArrayList<String> envoiLineOne;
    private ArrayList<String> envoiLineTwo;
    private ArrayList<String> envoiLineThree;

    public Stanza() {}

    public ArrayList<String> getStanzaOne() {
        return stanzaOne;
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

    public void setStanzaFour(String one, String two, String three, String four, String five, String six) {
        ArrayList<String> stanzaFour = new ArrayList<>();
        stanzaFour.add(0, five);
        stanzaFour.add(1, three);
        stanzaFour.add(2, two);
        stanzaFour.add(3, six);
        stanzaFour.add(4, one);
        stanzaFour.add(5, four);
        this.stanzaFour = stanzaFour;
    }

    public ArrayList<String> getStanzaFive() {
        return stanzaFive;
    }

    public void setStanzaFive(String one, String two, String three, String four, String five, String six) {
        ArrayList<String> stanzaFive = new ArrayList<>();
        stanzaFive.add(0, four);
        stanzaFive.add(1, five);
        stanzaFive.add(2, one);
        stanzaFive.add(3, three);
        stanzaFive.add(4, six);
        stanzaFive.add(5, two);
        this.stanzaFive = stanzaFive;
    }

    public ArrayList<String> getStanzaSix() {
        return stanzaSix;
    }

    public void setStanzaSix(String one, String two, String three, String four, String five, String six) {
        ArrayList<String> stanzaSix = new ArrayList<>();
        stanzaSix.add(0, two);
        stanzaSix.add(1, four);
        stanzaSix.add(2, six);
        stanzaSix.add(3, five);
        stanzaSix.add(4, three);
        stanzaSix.add(5, one);
        this.stanzaSix = stanzaSix;
    }

    public ArrayList<String> getEnvoiLineOne() {
        return envoiLineOne;
    }

    public void setEnvoiLineOne(String one, String six) {
        ArrayList<String> envoyLineOne = new ArrayList<>();
        envoyLineOne.add(one);
        envoyLineOne.add(six);
        this.envoiLineOne = envoyLineOne;
    }

    public ArrayList<String> getEnvoiLineTwo() {
        return envoiLineTwo;
    }

    public void setEnvoiLineTwo(ArrayList<String> envoiLineTwo) {
        this.envoiLineTwo = envoiLineTwo;
    }

    public ArrayList<String> getEnvoiLineThree() {
        return envoiLineThree;
    }

    public void setEnvoiLineThree(ArrayList<String> envoiLineThree) {
        this.envoiLineThree = envoiLineThree;
    }
}