package javaAssignment;

public class topic2_As3_Magazine extends topic2_As1_Book{
    String type;
    public topic2_As3_Magazine(String type1) {
        super(1, "Day and Night","Cameron", 100);
        type = type1;
    }
    public void displayMagazine(){
        System.out.println("Magazine Type: " + type);
    }
    public static void main(String args[]){
        topic2_As1_Book topic2_as1_book = new topic2_As1_Book(1, "Day and Night","Cameron", 100);
        topic2_as1_book.displayDeta_ils();
        topic2_As3_Magazine topic2_As3_Magazine = new topic2_As3_Magazine("classifides");
        topic2_As3_Magazine.displayMagazine();
    }
}
