package Service;

import model.Products.CoinAcceptor;

import java.util.Scanner;

public class MoneyReceiveWithCash extends MoneyReceiverSystem {
    private double cash;

    @Override
    public void getUserInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your cash");

        try {
            int cash = sc.nextInt();

            if (cash < 0 || cash > 4000) {
                throw new IllegalArgumentException("Cash should be between 0 and 4000");
            }
        } catch (IllegalArgumentException e) {
            String msg = e.getMessage() == null ? "undefined": e.getMessage();
            System.out.println("Invalid input: ");
            System.out.println("Enter Integer Number");
            System.out.println("Cause: " + msg);
        }
    }

    @Override
    public void transfer(CoinAcceptor coinAcceptor) {
        coinAcceptor.setAmount((int) cash);
    }
}
