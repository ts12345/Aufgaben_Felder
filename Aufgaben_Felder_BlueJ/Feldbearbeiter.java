public class Feldbearbeiter {
    private double[] feld;

    public Feldbearbeiter(double[] feld) {
        this.feld = feld;        
    }

    /*
     * bestimmt das Minimum des Feldes
     */
    public double min() {
        double min = 9E99;
        for(double x : feld) {
            if(x < min) min = x;
        }
        return min;
    }

    /*
     * bestimmt das Maximum des Feldes
     */
    public double max() {
        double max = -9E99;
        for(double x : feld) {
            if(x > max) max = x;
        }
        return max;
    }

    /*
     * berechnet die Summe der Werte im Feld
     */
    public double summe() {
        return 0.0;
    }

    /*
     * berechnet das kummulative Produkt der Werte im Feld
     */
    public double produkt() {
        double res = 1;
        for (double d : feld) {
            res *= d;
        }
        return res;
    }

    /*
     * berechnet den Mittelwert der Werte im Feld
     */
    public double mittelwert() {
        return 0.0;
    }

    /*
     * berechnet die Standardabweichung der Werte im Feld
     */
    public double standardabweichung() {
        return 0.0;
    }

    /*
     * dreht das Feld um
     * aus 1,2,3 wird 3,2,1 usw.
     */
    public void dreheFeldUm() {
        double[] kopie = new double[feld.length];
        for(int i = 0; i < feld.length; i++){
            kopie[i] = feld[i];
        }
        for(int i = 0; i < feld.length; i++){
            feld[i] = kopie[kopie.length-i-1];
        }
    }

    /*
     * sortiert das Feld in auf bzw. absteigender Reihenfolge
     * 
     * @param aufsteigendSortieren gibt an, ob aufsteigend sortiert werden soll
     */
    public void sortiereFeld(boolean aufsteigendSortieren) {
    }
}