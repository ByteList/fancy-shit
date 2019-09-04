package de.niklasemm.school.fancyshit;

/**
 * Created by Niklas Emmrich on 04.09.2019.
 * <p>
 * Copyright by Niklas Emmrich.
 */
public class FancyShitLauncher {
    private static FancyShitLauncher ourInstance = new FancyShitLauncher();

    public static FancyShitLauncher getInstance() {
        return ourInstance;
    }

    private FancyShitLauncher() {
        init();
    }

    private void init() {
        System.out.println("Init fancy-shit...");
    }
}
