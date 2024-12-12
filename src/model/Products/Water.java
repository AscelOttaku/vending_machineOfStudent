package model.Products;

import enums.ActionLetter;

public class Water extends Product {
    public Water(ActionLetter actionLetter, int price) {
        super("Water", actionLetter, price);
    }
}
