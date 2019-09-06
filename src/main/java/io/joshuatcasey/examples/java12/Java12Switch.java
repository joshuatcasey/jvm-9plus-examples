package io.joshuatcasey.examples.java12;

public class Java12Switch {

    public String vintageSwitch(int i) {
        switch(i) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            default: return "dunno";
        }
    }

    public String enhancedSwitch(int i) {
        return switch(i) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            default -> "dunno";
        };
    }
}
