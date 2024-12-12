package model.Card;

public class Card {
    private final String cardName;
    private String password;
    private double balance;
    private final int cardIdentityNumber;

    public Card(String cardName, String password, int identityNumber, double balance) {
        this.cardName = cardName;
        this.password = password;
        cardIdentityNumber = identityNumber;
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

    public int getCardIdentityNumber() {
        return cardIdentityNumber;
    }
}
