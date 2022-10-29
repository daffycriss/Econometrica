package Econometrica;

/**
 *
 * @author Μπορότης Βασίλειος
 * @author Ντουλάκης Ευστράτιος
 * @author Ντάφος Χρήστος
 */

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

 public class DataSet{
        @SerializedName("id")
        private int id;              // Κωδικός της εγγραφής της πληροφορίας
        private String name;         // Name της πληροφορίας
        private String description;  // Αναλυτική περιγραφή της πληροφορίας 
        @SerializedName("start_date")
        private String startDate;    // Ημερομηνία Από: η πληροφορία είναι διαθέσιμη
        @SerializedName("end_date")
        private String endDate;      // Ημερομηνία Έως: η πληροφορία είναι διαθέσιμη
        private List<ArrayList<Object>> data; /* δομή λίστας μέσα σε λίστα για 
                                                 την αποθήκευση των τιμών της πληροφορίας.
                                                 Η εσωτερική λίστα αποθηκεύει value και έτος
                                                 Η εξωτερική λίστα αποθηκεύει το πλήθος αυτών */
    
    /* Μέθοδος constructor της Dataset */     
    public DataSet(int id, String name, String description, List<ArrayList<Object>> data){
        this.id = id;
        this.name = name;
        this.description = description;
        this.data = data;
    }     

        /* Μέθοδος Getter για την ανάκτηση του Κωδικού Εγγραφής */ 
        public int getId() {
            return id;
        }
        
        /* Μέθοδος Setter για την ανάθεση του Κωδικού Εγγραφής */
        public void setId(int id) {
		this.id = id;
	}

        /* Μέθοδος Getter για την ανάκτηση του ονόματος της εγγραφής */
        public String getName() {
            return name;
        }

        /* Μέθοδος Setter για την ανάθεση του ονόματος της εγγραφής */        
        public void setName(String name) {
		this.name = name;
	}

        /* Μέθοδος Getter για την ανάκτηση της περιγραφής της πληροφορίας */        
        public String getDescription() {
            return description;
        }
        
        /* Μέθοδος Setter για την ανάθεση της περιγραφής της πληροφορίας */
        public void setDescription(String description) {
		this.description = description;
	}

        /* Μέθοδος Getter για την ανάκτηση της 1ης ημερομηνία όπου έχουμε πληροφορία */ 
        public String getStartDate() {
            return startDate;
        }
        
        /* Μέθοδος Getter για την ανάκτηση της τελευταίας ημερομηνίας όπου έχουμε πληροφορία */
        public String getEndDate() {
            return endDate;
        }
        
        /* Μέθοδος Getter για την ανάκτηση της αναλυτικής λίστας της πληροφορία */
        public List<ArrayList<Object>> getData() {
            return data;
        }

}