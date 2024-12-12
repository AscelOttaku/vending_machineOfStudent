package Service;

import model.Products.CoinAcceptor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MoneyReceiveWithCash extends MoneyReceiverSystem {
    private double cash;

    @Override
    public void getUserInput() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your cash");

            try {
                int cash = sc.nextInt();

                if (cash < 0 || cash > 4000) {
                    throw new IllegalArgumentException("Cash should be between 0 and 4000");
                }

                this.cash = cash;
                return;

            } catch (InputMismatchException | IllegalArgumentException e) {
                sc.nextLine();
                String msg = e.getMessage() == null ? "Value should be an Integer": e.getMessage();
                System.out.println("Invalid input: ");
                System.out.println("Cause: " + msg);
            }
        }
    }

    @Override
    public void transfer(CoinAcceptor coinAcceptor) {
        coinAcceptor.setAmount((int) cash);
    }
}
