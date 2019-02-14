package com.company;

public class ComputerPlayer implements PlayerHand{

    private Deck deck;

    public ComputerPlayer(Deck deck){

        this.deck = deck;

    }

    public void hand(){ 
        deck.makeSecondHand();
    }



}
