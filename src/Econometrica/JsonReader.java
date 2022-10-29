package Econometrica;

/**
 *
 * @author Μπορότης Βασίλειος
 * @author Ντουλάκης Ευστράτιος
 * @author Ντάφος Χρήστος
 */
/* Βσική κλάση για την κελυφοποίηση της δομής Json 
   όπως αυτή έρχεται με τα δεδομένα από το portal. 
   Η συγκεκριμένη κλάση χρησιμοποιείται ως πρώτο 
   επίπεδο */

public class JsonReader {
    private DataSet dataset;

    /* Μέθοδος constructor για την κλάση JsonReader */    
    public JsonReader(DataSet dataset) {
        this.dataset = dataset;
    }

    /* Μέθοδος Getter για την ανάκτηση των δεδομένων */ 
    public DataSet getDataset() {
        return dataset;
    }  
    
}