package Service;

import model.Products.CoinAcceptor;

public abstract class MoneyReceiverSystem {

    public abstract void transfer(CoinAcceptor coinAcceptor);

    public abstract void getUserInput();
}
