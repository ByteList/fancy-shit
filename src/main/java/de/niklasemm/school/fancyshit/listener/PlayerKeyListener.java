package de.niklasemm.school.fancyshit.listener;

import de.niklasemm.school.fancyshit.api.IPlayer;
import javafx.scene.input.KeyCode;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Niklas Emmrich on 11.09.2019.
 * <p>
 * Copyright by Niklas Emmrich.
 */
public class PlayerKeyListener implements KeyListener {

    private final IPlayer player;

    public PlayerKeyListener(IPlayer player) {
        this.player = player;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                this.player.addMovement(KeyCode.W);
                break;
            case KeyEvent.VK_A:
                this.player.addMovement(KeyCode.A);
                break;
            case KeyEvent.VK_S:
                this.player.addMovement(KeyCode.S);
                break;
            case KeyEvent.VK_D:
                this.player.addMovement(KeyCode.D);
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
