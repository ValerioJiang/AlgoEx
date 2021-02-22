package main;

import linkedList.SingleLinkedList;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();

        for (int i = 0; i < 20; i++){
            sl.add(i);
        }

        System.out.println(sl.contains(19));

        sl.removeElement(17);
        System.out.println(sl);
        System.out.println(sl.getSize());
        sl.clear();
        System.out.println(sl);
    }
}
