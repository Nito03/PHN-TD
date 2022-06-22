import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Client eddy = new Client();
        eddy.setNom("Mutoke");
        eddy.setPrenom("Eddy");
        eddy.setAdresse(new Adresse("8", "Congo", "Kinkole", "Bel-Air", "L'shi"));

        
        Detail detail = new Detail();
        detail.ajouterLigne(new Ligne(1, 5, new Produit<String>("1", "Chocolat", 500, new Date(), "Kg")));
        detail.ajouterLigne(new Ligne(2, 6, new Produit<String>("4", "Chocolat", 150, new Date(), "Kg")));



        Facture fact = new Facture();
        fact.setNumero(1);
        fact.setClient(eddy);
        fact.setDetail(detail);

        System.out.println("Monsieur " + eddy.getNom() + " " + eddy.getPrenom() + " Nous doit ");
        System.out.println("Le prix total : " + fact.getTotal());
        System.out.println("La TVA : " + fact.getTVA());


    }
}
