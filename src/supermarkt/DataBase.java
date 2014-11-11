package supermarkt;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DataBase extends HibernateUtil  {
        
        // Now get the artikels from the db
        Session session = this.getSessionFactory().openSession();
    
        // Default constructor for initializing
        public DataBase(){
            
        }
        
        /**
         * Get a list of artikels
         * @return 
         */
        public List<Artikel> getArtikelen(){
            // Create a transaction
            Transaction tx = session.beginTransaction();
            
            // Create a query to get the artikelen from the Database
            Query query = session.createQuery("from Artikel");
            
            // Return a list from the database
            return query.list();
        }
        
        // Get one artikel from Database
        //
        /**
         * 
         * @param id
         * @return 
         */
        public Artikel getArtikel(int id){
            // Create a transaction
            Transaction tx = session.beginTransaction();
            
            // Create a query to get a single item 
           Artikel artikel = (Artikel)session.get(Artikel.class, id);
           
           // return the result 
           return artikel;
        }
        
}
