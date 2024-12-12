package model.Card;

public class Card {
    private final String cardName;
    private String password;
    private double balance;

    public Card(String cardName, String password, double balance) {
        this.cardName = cardName;
        this.password = password;
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public String getCardName() {
        return cardName;
    }
}
