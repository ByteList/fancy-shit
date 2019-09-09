package de.niklasemm.school.fancyshit.api;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Niklas Emmrich on 09.09.2019.
 * <p>
 * Copyright by Niklas Emmrich.
 */
public class Location implements ILocation {

    @Getter@Setter
    private double x, y;

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }

}
