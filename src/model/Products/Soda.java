package model.Products;

import enums.ActionLetter;

public class Soda extends Product {
    public Soda(ActionLetter actionLetter, int price) {
        super("Soda", actionLetter, price);
    }
}
