package com.interviewPrep;

import java.util.HashMap;
//
//Key ===> Character Value ===> Occurances
public class StringOccuranceCount {
    public static void main(String[] args) {
        String str = "Java is a lang"; //Initializing a string
        int count = 0; //initial count
        char ch; //initial character value
        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>(); //creating hashmap
        for (int i=0;i<str.length();i++){ //Loop
            ch = str.charAt(i); //Assigning the hashmap key as character
            if(hashMap.containsKey(ch)){ //if the key contains char value
                count = hashMap.get(ch); //assigning the count as 1
                count++;//increasing the count for next time
                hashMap.replace(ch,count);//replacing the count with old
            }else{
                hashMap.put(ch,1);//if char is not availble assiging the char as just 1
            }
        }
            for (Character key: hashMap.keySet()) { //For each
                System.out.println(key+" = "+hashMap.get(key)); //Printing the final key and count
            }


    }
}
