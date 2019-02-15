package com.company;

public class ComputerPlayer implements PlayerHand{

    private Deck deck = new Deck();

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public ComputerPlayer(){


    }

    public void hand(){
        deck.makeSecondHand();

    }



    public int getComputerPlayerHandSize(){
        return deck.handTwo.size();
    }


    public String getOneCard(){


        return deck.getP2FirstCard().getRank();
    }

    public int getCardNumberAtFirstIndex(String cardOne){

        cardOne = getOneCard();

        int cardNum = deck.getCardNumericalValueAtFirstIndexValue(cardOne);

       return cardNum;
    }



}
