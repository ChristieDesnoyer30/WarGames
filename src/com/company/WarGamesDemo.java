package com.company;

import java.util.Scanner;

public class WarGamesDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deck d = new Deck();
        d.makeADeck();
        d.shuffleDeck();

        HumanPlayer hP = new HumanPlayer();
        hP.hand();

        ComputerPlayer cP = new ComputerPlayer();
        cP.hand();

        do {

            System.out.println("Player one press enter to flip card");
            String enter = scan.nextLine();
            System.out.println(hP.getOneCard());

            System.out.println("Player two press enter to flip card");
            scan.nextLine();
            System.out.println(cP.getOneCard());

            if (hP.getCardNumberAtFirstIndexValue(hP.getOneCard()) == cP.getCardNumberAtFirstIndex(cP.getOneCard())) {

                //TODO:WAR

                System.out.println("WAR!");
                break;

            } else if (hP.getCardNumberAtFirstIndexValue(hP.getOneCard()) > cP.getCardNumberAtFirstIndex(cP.getOneCard())) {

                System.out.println("P1 VALUE: " + hP.getCardNumberAtFirstIndexValue(hP.getOneCard()));

                System.out.println("P2 Value:" + cP.getCardNumberAtFirstIndex(cP.getOneCard()));
                System.out.println("Player ONE WINS");

                hP.getDeck().addToP1Hand(hP.getDeck().getP1FirstCard());
                hP.getDeck().addToP1Hand(cP.getDeck().getP2FirstCard());
                hP.getDeck().printFirstHand();

            } else {

                System.out.println("P1 VALUE: " + hP.getCardNumberAtFirstIndexValue(hP.getOneCard()));
                System.out.println("P2 Value:" + cP.getCardNumberAtFirstIndex(cP.getOneCard()));
                System.out.println("Player TWO WINS");
                System.out.println("Player One card: " + hP.getOneCard());
                System.out.println("Player TWO CARD " + cP.getOneCard());

                cP.getDeck().addToP2Hand(hP.getDeck().getP1FirstCard());
                cP.getDeck().addToP2Hand(cP.getDeck().getP2FirstCard());
                cP.getDeck().printSecondHand();;
            }


        }while(hP.getHumanPlayerHandSize() != 0 || cP.getComputerPlayerHandSize() !=0);



    }
}
