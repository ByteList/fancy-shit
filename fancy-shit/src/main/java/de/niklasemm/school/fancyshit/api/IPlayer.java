package de.niklasemm.school.fancyshit.api;

/**
 * Created by Niklas Emmrich on 09.09.2019.
 * <p>
 * Copyright by Niklas Emmrich.
 */
public interface IPlayer {

    public void init();

    public ILocation getLocation();

    public boolean startMovement(int x, int y);

    public boolean endMovement();

    public boolean canMove();
}
