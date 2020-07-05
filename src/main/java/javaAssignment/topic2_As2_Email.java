package javaAssignment;

public class topic2_As2_Email extends topic2_As2_Document{


    String sender,recepient,title;

    public String getSender(){
        return sender;
    }
    public String getRecepient(){
        return recepient;
    }
    public String getTitle(){
        return title;
    }

    public topic2_As2_Email(String sender1, String recepient1, String title1){
        super("Hi All, Greetings");
        sender = sender1;
        recepient = recepient1;
        title = title1;
    }
    public String toString(){
        return text + sender + recepient + title;
    }

    public static void main(String args[]){
        topic2_As2_Email topic2_As2_Email = new topic2_As2_Email("Ravi", "Guru","Important Mail");
        topic2_As2_Document topic2_As2_Document = new topic2_As2_Document("Hi All, Greetings");
        topic2_As2_Document.text = "Hi All, Greetings";
        topic2_As2_Email.toString();
        System.out.println(topic2_As2_Email.toString());
    }

}
