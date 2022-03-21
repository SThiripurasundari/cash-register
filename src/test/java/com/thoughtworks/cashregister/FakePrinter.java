package com.thoughtworks.cashregister;

public class FakePrinter extends Printer {

    public boolean isPrintMethodCalled;
    public String processAsString;

    @Override
    public void print(String content) {
        isPrintMethodCalled = true;
        processAsString = content;
    }
}
