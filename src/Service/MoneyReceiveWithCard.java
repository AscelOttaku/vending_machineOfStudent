package Service;

import model.Card.Card;
import model.Products.CoinAcceptor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MoneyReceiveWithCard extends MoneyReceiverSystem {
    private double balanceLimit;
    Card card;

    public MoneyReceiveWithCard() {
       card = new Card("Card", "12345", 1000);
    }

    @Override
    public void getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Card password: ");

        try {
            String password = sc.nextLine();

            if (!password.equals(card.getPassword())) {
                throw new InputMismatchException();
            }

            card.setPassword(password);

        } catch (InputMismatchException e) {
            System.out.println("Invalid Password");
            System.out.println("Try again: ");
        }
    }

    public void transfer(CoinAcceptor coinAcceptor) {
        coinAcceptor.setAmount((int) Math.round(card.getBalance()));
    }
}
