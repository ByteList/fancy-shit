package de.niklasemm.school.fancyshit.api;

import javafx.scene.input.KeyCode;

/**
 * Created by Niklas Emmrich on 09.09.2019.
 * <p>
 * Copyright by Niklas Emmrich.
 */
public interface IPlayer {

    public void init();

    public ILocation getLocation();

    public boolean startMovement();

    public boolean endMovement();

    public boolean canMove();

    public void addMovement(KeyCode keyCode);
}
