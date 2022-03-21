package com.thoughtworks.cashregister;

public class FakePrinter extends Printer {

    public boolean isPrintMethodCalled;

    @Override
    public void print(String content) {
        isPrintMethodCalled = true;
    }
}
