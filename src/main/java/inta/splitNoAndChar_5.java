package inta;

public class splitNoAndChar_5 {

    public static void main(String args[]){
        String str = "abc12345";
        StringBuffer num = new StringBuffer();
        StringBuffer alp = new StringBuffer();
        StringBuffer spc = new StringBuffer();
        for(int i = 0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                alp.append(str.charAt(i));
            }
            else if(Character.isDigit(str.charAt(i))){
                num.append(str.charAt(i));
            }
            else{
                spc.append(str.charAt(i));
            }
        }
        System.out.println(num + "" + "" + spc + "" + alp);
    }
}
