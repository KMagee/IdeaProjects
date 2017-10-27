package com.avaya;

public class Main {

    public static void main(String[] args) {
	//see what args came in
        //System.out.println(args[2]);
        // declare an array of names
        // Array myArray = new Array ({},{},{})
        //String[] names = {"Ada", "Mable", "Charles", "Herman", "Fred"};
        // find a name by its index number

        //int numItems = args.length;

        String names[] = new String[args.length];

        for(int i =0; i<args.length; i++){
            names[i] = args[i];
            System.out.println(i + " " +  names[i]);
    }}
}
