package ex2;

public class LivretA extends CompteBancaire {

    /**
     * tauxRemuneration : taux de rémunération dans le cas d'un livret A
     */

    private double tauxRemuneration;

    /**
     * définition du constructeur à partir de la classe mère
     *
     * @param solde
     * @param tauxRemuneration
     */
    public LivretA(double solde, double tauxRemuneration) {
        super(solde, 0);
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public void debiterMontant(double montant) {
        if (this.getSolde() - montant > 0) {
            this.setSolde(this.getSolde() - montant);
        } else {
            System.out.println("vous ne pouvez pas debiter ce montant (découvert dépassé)");
        }
    }

    /**
     * Applique la rémuneration annuelle
     */
    public void appliquerRemuAnnuelle() {
        this.setSolde(this.getSolde() + this.getSolde() * tauxRemuneration / 100);
    }

    /**
     * Getter for tauxRemuneration
     *
     * @return the tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Setter
     *
     * @param tauxRemuneration the tauxRemuneration to set
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }
}
