package com.thoughtworks.cashregister;

import java.util.List;

public class FakePurchase extends Purchase {

    private static final String FAKE_PURCHASE_AS_STRING = "Fake purchase as string";

    public FakePurchase(List<Item> items) {
        super(items);
    }

    @Override
    public String asString() {
        return FAKE_PURCHASE_AS_STRING;
    }
}
