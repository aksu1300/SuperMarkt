package supermarkt;

public class Ouder extends Klant {
        // Klant kan een pad lopen
        public void loopPad(Pad pad){
            // Laat klant een pad lopen
            System.out.println("Ouder klant loopt nu pad:" + pad.getPadNaam() );
        }
    
}
