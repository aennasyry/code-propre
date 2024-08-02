package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 *
 * @author alaee
 */

public class CompteBancaire {

    /**
     * solde : solde du compte
     */
    private double solde;

    /**
     * decouvert : un découvert est autorisé seulement pour les comptes courants
     */
    private double decouvert;


    /**
     * @param solde
     * @param decouvert
     */
    public CompteBancaire(double solde, double decouvert) {
        this.solde = solde;
        this.decouvert = decouvert;
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public void debiterMontant(double montant) {
        if (this.solde - montant > decouvert) {
            this.solde = solde - montant;
        } else {
            System.out.println("vous ne pouvez pas debiter ce montant (découvert dépassé)");
        }
    }


    /**
     * Getter for solde
     *
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter
     *
     * @param solde the solde to set
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Getter for decouvert
     *
     * @return the decouvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Setter
     *
     * @param decouvert the decouvert to set
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }



}
