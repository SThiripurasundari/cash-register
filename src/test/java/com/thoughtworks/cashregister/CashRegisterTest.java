package com.thoughtworks.cashregister;

import org.junit.jupiter.api.Test;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CashRegisterTest {

    @Test
    void checkTheCashRegisterProcessCallsPrint() {

        Purchase purchase = new Purchase(emptyList());
        FakePrinter fakePrinter = new FakePrinter();
        CashRegister cashRegister = new CashRegister(fakePrinter);

        cashRegister.process(purchase);

        assertTrue(fakePrinter.isPrintMethodCalled);
    }
}