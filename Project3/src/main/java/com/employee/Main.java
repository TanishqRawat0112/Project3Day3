package com.employee;
import java.util.ArrayList;

public class Main {
    public <T>  void exchangePosition(ArrayList<T>arr,int pos1,int pos2){
        T temp=arr.get(pos1);
        arr.set(pos1,arr.get(pos2));
        arr.set(pos2,temp);
    }
    public static void main(String[] args) {
        System.out.println("------Start of Program ------");
        Main m = new Main();

        System.out.println("------ String Array ------");
        ArrayList<String>strArr = new ArrayList<String>();
        strArr.add("H");
        strArr.add("E");
        strArr.add("L");
        strArr.add("L");
        strArr.add("O");

        m.exchangePosition(strArr,0,2);
        for(String s:strArr){
            System.out.println(s);
        }

        System.out.println("------Integer Array ------");
        ArrayList<Integer>intArr = new ArrayList<Integer>();
        intArr.add(1);
        intArr.add(2);
        intArr.add(3);
        intArr.add(4);
        intArr.add(5);

        m.exchangePosition(intArr,0,2);
        for(Integer i:intArr){
            System.out.println(i);
        }
        System.out.println("------End of Program ------");
    }
}