/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Econometrica;

/**
 *
 * @author Μπορότης Βασίλειος
 * @author Ντουλάκης Ευστράτιος
 * @author Ντάφος Χρήστος
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadCSVFile {

    /**
     * @return the Name
     */
/* Τοπικές μεταβλητές για την αποθήκευση των δεδομένων 
   που λαμβάνονται από το τοπικό αρχείο για μετέπειτα
   χρήση.                                            */    
private ArrayList Name;   // Αντιστοιχεί στο Country Name
private ArrayList Alpha2; // Αντιστοιχεί στο Country Country Alpha2 code
private ArrayList Alpha3; // Αντιστοιχεί στο Country Country Alpha3 code
private ArrayList Number; // Αντιστοιχεί στο Country Country number

    /*  Getter method για την ανάκτηση της λίστας ονομάτων */
    public ArrayList getName() {
        return this.Name;
    }

    /**
     * @param Name the Name to set
     */
    /*  Setter method για την ανάθεση της λίστας ονομάτων */
    public void setName(ArrayList Name) {
        this.Name = Name;
    }
    /* Μέθοδος για την προσθήκη ονόματος σε συγκεκριμένη 
       θέση της λίστας                                    */
    public void addName(int i, String name) {
        this.Name.add(i, name);
    }

    /*  Getter method για την ανάκτηση της λίστας Alpha2 codes */
    public ArrayList getAlpha2() {
        return this.Alpha2;
    }

    /*  Setter method για την ανάθεση της λίστας των Alpha2 codes */
    public void setAlpha2(ArrayList Alpha2) {
        this.Alpha2 = Alpha2;
    }

    /*  Getter method για την ανάκτηση της λίστας Alpha2 codes */
    public ArrayList getAlpha3() {
        return this.Alpha3;
    }
    
    /*  Getter method για την ανάκτηση συγκεκριμένου κωδικού 
        Alpha3 βάση θέσης. Η θέση δίνεται παραμετρικά          */
    public String getAlpha3Code(int code){
         String A3Code = this.Alpha3.get(code).toString();
       return A3Code;
    }

    /*  Setter method για την ανάθεση της λίστας των Alpha3 codes */
    public void setAlpha3(ArrayList Alpha3) {
        this.Alpha3 = Alpha3;
    }

    /*  Getter method για την ανάκτηση της λίστας των αριθμητικών 
        κωδικών που βρίσκονται αποθηκευμένοι στο εξωτερικό αρχείο */
    public ArrayList getNumber() {
        return this.Number;
    }
   
   /*  Setter method για την ανάθεση της λίστας των αριθμητικών 
        κωδικών                                                   */
    public void setNumber(ArrayList number) {
        this.Number = number;
    }

    /* Μέθοδος για την ανάγνωση του εξωτερικού αρχείου CSV        */    
    public void ReadCSVFile () {
    String FileName = "iso-countries.csv"; 
    ArrayList name = new ArrayList();
    ArrayList alpha2 = new ArrayList();
    ArrayList alpha3 = new ArrayList();
    ArrayList number = new ArrayList();
// **************************************************************
try
{
    /* Διαδικασία ανάγνωσης του αρχείου                  */
    try
        (FileReader inputFile = new FileReader(FileName)) {
         Scanner parser = new Scanner(inputFile);
         int cnt = 0;
    /* Πέρασμα του περιεχομένου του αρχείου σε εσωτερικές λίστες */      
         while (parser.hasNextLine()) {
		String line = parser.nextLine();
	        String[] col = line.split(";");
//		System.out.println(col[0]);
                name.add(cnt, col[0]);
//	        System.out.println(col[1]);
                alpha2.add(cnt, col[1]);
//		System.out.println(col[2]);
                alpha3.add(cnt, col[2]);
//		System.out.println(col[3]);
                number.add(cnt, col[3]);
                cnt = cnt +1;
                }
//         this.Name = name;
         this.setName(name);
         this.setAlpha2(alpha2);
         this.setAlpha3(alpha3);
         this.setNumber(number);

        }
} catch(FileNotFoundException exception) {
	System.out.println(FileName + " not found");
  }
  catch(IOException exception) {
	System.out.println("Unexpected I/O error occured.");
  }      
 }

   
}

