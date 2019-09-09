package de.niklasemm.school.fancyshit.player;

import de.niklasemm.school.fancyshit.api.ILocation;
import de.niklasemm.school.fancyshit.api.IPlayer;
import de.niklasemm.school.fancyshit.api.Location;

/**
 * Created by Niklas Emmrich on 09.09.2019.
 * <p>
 * Copyright by Niklas Emmrich.
 */
public class Player implements IPlayer {


    private Location location;
    private boolean canMove, isMoving;

    @Override
    public void init() {
        this.location = new Location(5, 5);
        this.canMove = true;

    }

    @Override
    public ILocation getLocation() {
        return this.location;
    }

    @Override
    public boolean startMovement(int x, int y) {
        if (canMove() && !isMoving) {
            isMoving = true;

            double currentX = this.location.getY(), currentY = this.location.getY();

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
}
