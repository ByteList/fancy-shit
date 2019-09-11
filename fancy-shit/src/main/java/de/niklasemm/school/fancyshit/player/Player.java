package de.niklasemm.school.fancyshit.player;

import de.niklasemm.school.fancyshit.api.ILocation;
import de.niklasemm.school.fancyshit.api.IPlayer;
import de.niklasemm.school.fancyshit.api.Location;
import de.niklasemm.school.fancyshit.listener.PlayerKeyListener;
import javafx.scene.input.KeyCode;

/**
 * Created by Niklas Emmrich on 09.09.2019.
 * <p>
 * Copyright by Niklas Emmrich.
 */
public class Player implements IPlayer {


    private Location location;
    private boolean canMove, isMoving;
    private PlayerKeyListener playerKeyListener;

    private double movingValueX = 0, movingValueY = 0;

    @Override
    public void init() {
        this.location = new Location(5, 5);
        this.canMove = true;

        this.playerKeyListener = new PlayerKeyListener(this);
    }

    @Override
    public ILocation getLocation() {
        return this.location;
    }

    @Override
    public boolean startMovement() {
        if (canMove() && !isMoving) {
            isMoving = true;


            while (isMoving) {
                double currentX = this.location.getY(), currentY = this.location.getY();
                

            }

            return true;
        }
        return false;
    }

    @Override
    public boolean endMovement() {
        if (canMove() && isMoving) {
            isMoving = false;

            return true;
        }
        return false;
    }

    @Override
    public boolean canMove() {
        return this.canMove;
    }

    @Override
    public void addMovement(KeyCode keyCode) {
        switch (keyCode) {
            case W:
                break;
            case A:
                break;
            case S:
                break;
            case D:
                break;
        }
    }
}
