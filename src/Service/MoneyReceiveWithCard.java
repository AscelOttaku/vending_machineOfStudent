package Service;

import model.Card.Card;
import model.Products.CoinAcceptor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MoneyReceiveWithCard extends MoneyReceiverSystem {
    private Card[] cards;
    private Card userCard;

    public MoneyReceiveWithCard() {
       setCards();
    }

    private void setCards() {
        cards = new Card[]{new Card("Optima", "12345",12345, 1000),
                new Card("Demir", "Ken1", 4567, 300),
                new Card("MbBank", "Ken12", 98765, 100),
                new Card("RsKa", "Sam12345", 2000, 800),};
    }

    @Override
    public void getUserInput() {
        while (true) {
            String identity = getCorrectInput("Identity Number");
            String password = getCorrectInput("password");

            for (Card card : cards) {
                if (identity.equals(String.valueOf(card.getCardIdentityNumber())) && password.equals(card.getPassword())) {
                    userCard = card;
                    System.out.println("Card " + userCard.getCardName() + " has been received.");
                    return;
                }
            }
            System.out.println("Invalid Card identity number or password");
        }
    }

    private String getCorrectInput(String text) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf("Enter Card %s: ", text);

            try {
                return sc.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Invalid Password");
                System.out.println("Try again: ");
            }
        }
    }

    @Override
    public void transfer(CoinAcceptor coinAcceptor) {

        coinAcceptor.setAmount((int) Math.round(userCard.getBalance()));
    }
}
