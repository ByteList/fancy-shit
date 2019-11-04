package de.niklasemm.school.fancyshit;

import lombok.Getter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Niklas Emmrich on 04.09.2019.
 * <p>
 * Copyright by Niklas Emmrich.
 */
public class FancyShitLauncher {

    @Getter
    private static FancyShitLauncher instance;

    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    @Getter
    private FancyFrame fancyFrame;

    public static void main(String[] args) {
        FancyShitLauncher fancyShitLauncher = new FancyShitLauncher();
        instance = fancyShitLauncher;
        fancyShitLauncher.init();
    }

    private void init() {
        this.logInfo("Initializing fancy-shit...");


        this.fancyFrame = new FancyFrame();
        this.fancyFrame.init();

    }

    public void logInfo(String message) {
        System.out.println(this.getFormattedDate() + " - INFO  | " + message);
    }

    public void logError(String message) {
        System.out.println(this.getFormattedDate() + " - ERROR | " + message);
    }

    private String getFormattedDate() {
        return dateFormat.format(new Date(System.currentTimeMillis()));
    }
}
