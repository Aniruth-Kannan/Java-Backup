package inta;

import java.util.HashMap;

public class occurunceStrngHashMap_4 {
    public static void main(String args[]){
        String str = "Aniruth Kannnan Aniruth";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] strArr = str.split(" ");
        for(int i =0; i<strArr.length; i++){
            if(map.containsKey(strArr[i])){
                map.put(strArr[i],map.get(strArr[i])+1);
            }
            else{
                map.put(strArr[i],1);
            }
        }
        System.out.println(map);

    }
}
