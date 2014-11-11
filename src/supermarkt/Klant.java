package supermarkt;

import java.util.ArrayList;
import java.util.List;
import supermarkt.Artikel;

public class Klant {
        
        // Klant kan meerder artikelen hebben in zijn mandje
        List<Artikel> artikelen = new ArrayList<Artikel>();
    
        // Klant kan een pad lopen
        public void loopPad(Pad pad){
            // Laat klant een pad lopen
            System.out.println("Standaard Klant loopt nu pad:" + pad.getPadNaam() );
        }
    
        // Klant gaat afrekenen bij een kassa
	public double afrekenenArtikel(Kassa kassa) {
            // Reken onze artikelen af bij de kassa
            // en geeft de de totale af te rekenen bedrag aan de klant terug
            return kassa.afrekenen(artikelen);
	}

        // Klant voeg een artikel toe aan zijn winkelmandje
	public void mandjeVullen(Artikel artikel) {
                // voeg de artikel toe aan het mandje van de klant
                artikelen.add(artikel);
	}
        
        // Laat alle artikelen in het mandje zien
        //
        public void showMandje(){
            
            // Laat 
            System.out.println("Winkelmand bevat de volgende items");
            
            // Print alle artikelen die de in zijn winkelmandje heeft
            for(Artikel item : artikelen)
            {
                System.out.println("Naam:" + item.getNaam() + " prijs:"+ item.getPrijs());
            }
        }

}
