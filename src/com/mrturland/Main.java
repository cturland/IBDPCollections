package com.mrturland;

public class Main {

    public static void main(String[] args) {
	    Collection<Integer> c = new Collection<>();
	    c.addItem(1);
        c.addItem(2);
        c.addItem(3);
        while(c.hasNext()){
            System.out.println(c.getNext());
        }
    }
}
