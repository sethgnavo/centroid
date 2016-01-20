package com.sethgnavo.centroid;

/**
 * Classe définissant les propriétés d'un point, qui hérite d'un barycentre.
 *
 * @author Seth-Pharès Gnavo
 */
public class Point extends Centroid {
    float p;

    /**
     * Constructeur sans argument d'un objet Point
     */
    public Point() {
    }

    /**
     * Constructeur avec arguments d'un objet Point
     *
     * @param a L'abscisse du point
     * @param b L'ordonnée du point
     * @param p Le coefficient de pondération du point
     */
    public Point(float a, float b, float p) {
        super.x = a;
        super.y = b;
        this.p = p;
    }

    /**
     * Accesseur permettent d'accéder à la valeur du coefficient de pondération
     * du point
     *
     * @return Le coefficient de pondération
     */
    public float getP() {
        return p;
    }

    /**
     * Accesseur permettent d'accéder à la valeur de l'abscisse du point
     *
     * @return Un float de valeur de x
     */
    @Override
    public float getX() {
        return x;
    }

    /**
     * Accesseur permettent d'accéder à la valeur de l'ordonnée du point
     *
     * @return Un float de valeur de y
     */
    @Override
    public float getY() {
        return y;
    }

    /**
     * Méthode définissant les coordonnées d'un point et son coefficient de
     * pondération.
     *
     * @param x L'abscisse, sur l'axe (o,i)
     * @param y L'ordonnée sur l'axe (o,j)
     * @param p Le coefficient de pondération
     */
    public void setPoint(float x, float y, float p) {
        super.x = x;
        super.y = y;
        this.p = p;
    }

    /**
     * Définit le coefficient de pondération d'un point
     *
     * @param p La valeur du coefficient de pondération
     */
    public void setPoderationValue(float p) {
        this.p = p;
    }
}
