package com.thoughtworks.cashregister;

public class FakePrinter extends Printer {

    private boolean isPrintMethodCalled;
    private String processAsString;

    @Override
    public void print(String content) {
        isPrintMethodCalled = true;
        processAsString = content;
    }

    public boolean isPrintMethodCalled() {
        return isPrintMethodCalled;
    }

    public String getProcessAsString() {
        return processAsString;
    }
}
