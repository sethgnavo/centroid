package com.sethgnavo.centroid;

/**
 * This class describes a basic Point element without the poderation coefficient.
 *
 * @author Seth-Pharès Gnavo
 */
public class Centroid {
    public float x;
    public float y;

    /**
     * Constructeur par défaut d'un barycentre
     */
    public Centroid() {
    }

    /**
     * Constructeur avec paramètres d'un barycentre
     *
     * @param x l'abscisse du barycentre
     * @param y l'ordonnée du barycentre
     */
    public Centroid(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    /**
     * Définit les coordonnées d'un baryccentre ou d'un point
     *
     * @param x abscisse du barycentre
     * @param y ordonnée du barycentre
     */
    public void setCoordonees(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
