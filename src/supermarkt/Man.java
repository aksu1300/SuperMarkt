package supermarkt;

public class Man extends Klant implements IKlant {
    
        // Klant kan een pad lopen
        public void loopPad(Pad pad){
            // Laat klant een pad lopen
            System.out.println("Mannelijke klant loopt nu pad:" + pad.getPadNaam() );
        }
       
    

}
