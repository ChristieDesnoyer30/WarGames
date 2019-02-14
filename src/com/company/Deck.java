package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private Rank rank = new Rank();
    private Suit suit = new Suit();
    private ArrayList<Card> deck = new ArrayList<>();



    public void makeADeck() {

        for (String s : suit.getSuits()) {
            for (String r : rank.getRanks()) {
                Card card = new Card(s, r);
                deck.add(card);
            }


        }

    }

    public ArrayList<Card> shuffleDeck(){

        Collections.shuffle(deck);

        return deck;
    }


    public ArrayList<Card> makeFirstHand(){
        ArrayList<Card> handOne = new ArrayList<>(26);

        for(int i = 0; i < deck.size(); i++){
            handOne.add(deck.get(i));
            deck.remove(i);
        }

        System.out.println("Make Player Ones Pile of " + handOne.size() + " cards;");
        return handOne;
    }


    public ArrayList<Card> makeSecondHand(){


        ArrayList<Card> handTwo = new ArrayList<>(26);
        for(int i = 0; i < deck.size(); i++){

            handTwo.add(deck.get(i));
        }

        System.out.println("Made Player Two's hand of " + handTwo.size() + " cards.");
        return handTwo;
    }



}


