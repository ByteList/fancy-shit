package de.niklasemm.school.fancyshit;

import javax.swing.*;

/**
 * Created by Niklas Emmrich on 09.09.2019.
 * <p>
 * Copyright by Niklas Emmrich.
 */
public class FancyFrame extends JFrame {

    private final FancyShitLauncher fancyShitLauncher = FancyShitLauncher.getInstance();

    void init() {
        fancyShitLauncher.logInfo("Initializing FancyFrame...");

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setSize(1200, 600);
        this.setVisible(true);

        fancyShitLauncher.logInfo("FancyFrame initialized.");
    }



}
