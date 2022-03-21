package com.thoughtworks.cashregister;

import org.junit.jupiter.api.Test;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CashRegisterTest {

    @Test
    void checkTheCashRegisterProcessCallsPrint() {

        Purchase purchase = new Purchase(emptyList());
        FakePrinter fakePrinter = new FakePrinter();
        CashRegister cashRegister = new CashRegister(fakePrinter);

        cashRegister.process(purchase);

        assertTrue(fakePrinter.isPrintMethodCalled());
    }

    @Test
    void checkTheCashRegisterProcessPrintsPurchaseAsString() {
        FakePurchase fakePurchase = new FakePurchase(emptyList());
        FakePrinter fakePrinter = new FakePrinter();
        CashRegister cashRegister = new CashRegister(fakePrinter);

        cashRegister.process(fakePurchase);

        assertEquals(fakePurchase.asString(), fakePrinter.getProcessAsString());
    }
}