package javaAssignment;

public class topic2_As1_Book {

    int isbn; String title, author; float price;

    public topic2_As1_Book(int isbn1, String title1, String author1, float price1){
        isbn = isbn1;
        title = title1;
        author = author1;
        price = price1;
    }

    public void displayDeta_ils(){
        System.out.println("Book no is: "+ isbn + " title: " + title + " author: " + author + " price: " + price);
    }

    public void discountedprice(float discount){
        float discountedPrice = (price * (discount/100) ) - price;
        System.out.println("Discounted price: " + discountedPrice);
    }

    public static void main(String args[]){
        topic2_As1_Book book = new topic2_As1_Book(1, "Day and Night","Cameron", 100);
        book.displayDeta_ils();
        book.discountedprice(10);
    }

}
