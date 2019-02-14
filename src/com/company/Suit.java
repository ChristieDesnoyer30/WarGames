package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Suit {



    private ArrayList<String> suits = new ArrayList<>(Arrays.asList("Hearts","Diamonds","Spades","Clubs"));

    public ArrayList<String> getSuits() {
        return suits;
    }

    public void setSuits(ArrayList<String> suits) {
        this.suits = suits;
    }
}
