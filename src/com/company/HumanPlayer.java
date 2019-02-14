package com.company;

public class HumanPlayer implements PlayerHand {

    private Deck deck;

    public HumanPlayer(Deck deck){

        this.deck = deck;
    }

    public void hand(){

        deck.makeFirstHand();
    }
}
