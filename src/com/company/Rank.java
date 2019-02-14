package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Rank {

    private ArrayList<String> ranks = new ArrayList<>(Arrays.asList("Ace", "2", "3",
            "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" ));

    public ArrayList<String> getRanks() {
        return ranks;
    }

    public void setRanks(ArrayList<String> ranks) {
        this.ranks = ranks;
    }
}
