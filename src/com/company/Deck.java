package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private Rank rank = new Rank();
    private Suit suit = new Suit();
    private ArrayList<Card> deck = new ArrayList<>();
    ArrayList<Card> handTwo = new ArrayList<>(26);
    ArrayList<Card> handOne = new ArrayList<>(26);



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

        makeADeck();

        shuffleDeck();

        for(int i = 0; i < deck.size(); i++){
            handOne.add(deck.get(i));
               deck.remove(i);
        }

        return deck;
    }


    public ArrayList<Card> makeSecondHand(){
        ArrayList<Card> leftOverDeck = makeFirstHand();


        for(int i = 0; i < leftOverDeck.size(); i++){

            handTwo.add(leftOverDeck.get(i));
        }

        return handTwo;
    }

    public void printFirstHand(){
        System.out.println("Hand One :" + handOne.size() + " cards \n");
        for(Card c : handOne){
            System.out.println(c + "\n");
        }
    }

    public void printSecondHand(){
        System.out.println("Hand Two :" + handTwo.size() + " cards. \n");
        for(Card c : handTwo){
            System.out.println(c +  "\n");
        }
    }

    public Card getP1FirstCard(){

        Card c = handOne.get(0);

        return c;

    }


    public Card getP2FirstCard(){

        Card c = handTwo.get(0);

        return c;
    }



    public void addToP1Hand(Card c){
        handOne.add(c);
    }

    public void addToP2Hand(Card c){

        handTwo.add(c);
    }


    public int getCardNumericalValueAtFirstIndexValue(String rank){

        int card = 0;


        if(rank.equalsIgnoreCase("jack")){

            card = 11;

        } else if(rank.equalsIgnoreCase("queen")){
            card =12;

        } else if (rank.equalsIgnoreCase("king")){

            card =13;

        } else if(rank.equalsIgnoreCase("ace")){
            card = 1;
        }
            else {

            card = Integer.parseInt(rank);
        }

        return card;

    }


}


