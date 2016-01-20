package com.sethgnavo.centroid;

/**
 * C'est un groupe de points qui comporte exactement 3 objets point.
 *
 * @author Seth-Pharès Gnavo
 */
public class PointGroup {
    Point p1 = new Point();
    Point p2 = new Point();
    Point p3 = new Point();

    /**
     * Constructeur par défaut d'un groupe de 3 points
     */
    public PointGroup() {
    }

    /**
     * Constructeur avec paramètres d'un groupe de 3 points
     *
     * @param p1 Le premier point
     * @param p2 Le deuxième point
     * @param p3 Le troisième point
     */
    public PointGroup(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }


    /**
     * Méthode sans paramètres permettant de calculer le barycentre d'un groupe
     * de 3 points ayant des coordonées et un coefficient de pondération
     *
     * @return Un objet barycentre
     */
    public Centroid calculerBarycentre() {
        float pa = p1.getP();
        float xa = p1.getX();
        float ya = p1.getY();

        float pb = p2.getP();
        float xb = p2.getX();
        float yb = p2.getY();

        float pc = p3.getP();
        float xc = p3.getX();
        float yc = p3.getY();

        float xg = (pa * xa + pb * xb + pc * xc) / (pa + pb + pc);
        float yg = (pa * ya + pb * yb + pc * yc) / (pa + pb + pc);

        Centroid bar = new Centroid(xg, yg);

        return bar;
    }

    /**
     * Méthode avec paramètres parmettant de calculer le barycentre de 3 points
     *
     * @param a L'instance du premier point
     * @param b L'instance du deuxième point
     * @param c L'instance du troisième point
     * @return Un objet barycentre
     */
    public Centroid calculerBarycentre(Point a, Point b, Point c) {
        a = new Point();
        b = new Point();
        c = new Point();

        float pa = p1.getP();
        float xa = p1.getX();
        float ya = p1.getY();

        float pb = p2.getP();
        float xb = p2.getX();
        float yb = p2.getY();

        float pc = p3.getP();
        float xc = p3.getX();
        float yc = p3.getY();

        float xg = (pa * xa + pb * xb + pc * xc) / (pa + pb + pc);
        float yg = (pa * ya + pb * yb + pc * yc) / (pa + pb + pc);

        Centroid bar = new Centroid(xg, yg);

        return bar;
    }
}
