package com.company;

public class HumanPlayer implements PlayerHand {

    private Deck deck;


    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public HumanPlayer(){

        this.deck = new Deck();
    }

    public void hand(){

        deck.makeFirstHand();


    }

    public int getHumanPlayerHandSize(){
        return deck.handOne.size();
    }


    public String getOneCard(){


      return deck.getP1FirstCard().getRank();
    }

    public int getCardNumberAtFirstIndexValue(String card){

        card = getOneCard();

        int cardNum = deck.getCardNumericalValueAtFirstIndexValue(card);

        return cardNum;
    }


}

