package javaAssignment;

public class topic2_As3_Novel extends topic2_As1_Book {
    String authorNovel;
    public topic2_As3_Novel(String authorNovel1){
        super(1, "Day and Night","Cameron", 100);
        authorNovel = authorNovel1;
    }
    public void displayNovel(){
        System.out.println("Author of the novel: " + authorNovel);

        
    }

    public static void main(String args[]){
        topic2_As1_Book topic2_as1_book = new topic2_As1_Book(1, "Day and Night","Cameron", 100);
        topic2_as1_book.displayDeta_ils();
        topic2_As3_Novel topic2_As3_Novel = new topic2_As3_Novel("James");
        topic2_As3_Novel.displayNovel();
    }
}
