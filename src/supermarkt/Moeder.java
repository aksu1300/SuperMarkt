package supermarkt;

public class Moeder extends Klant {
        // Klant kan een pad lopen
        public void loopPad(Pad pad){
            // Laat klant een pad lopen
            System.out.println("Moeder klant loopt nu pad:" + pad.getPadNaam() );
        }
    
}
