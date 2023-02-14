package org.example;

public class SplashMachine {
    public Splash getSplash(String name) {
        switch (name) {
            case "SmallSplash":
                return new SmallSplash();
            case "LargeSplash":
                return new LargeSplash();
            case "Landlord":
                return new Landlord();
            default:
                return null;
        }

    }
}
