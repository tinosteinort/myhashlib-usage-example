package de.tse.myhashlib.example;

import de.tse.myhashlib.HashFunction;
import de.tse.myhashlib.HashFunctions;

public class MyHashlibExample {

    public static void main(String[] args) {

        System.out.println("Available Hashing Functions:");
        for (String name : HashFunctions.getAvailableHashFunctions()) {
            System.out.println(" * " + name);
        }

        final String someData = "Hallo-Test";
        final String otherData = "Hallo_Test";


        System.out.println("");
        System.out.println("WeakHash");
        final HashFunction weakHash = HashFunctions.getInstance("WeakHash");
        System.out.println("Data: '" + someData  + "' Hash: " + weakHash.execute(someData));
        System.out.println("Data: '" + otherData  + "' Hash: " + weakHash.execute(otherData));

        System.out.println();
        System.out.println("SHA");
        final HashFunction sha512Hash = HashFunctions.getInstance("SHA-512");
        System.out.println("Data: '" + someData  + "' Hash: " + sha512Hash.execute(someData));
        System.out.println("Data: '" + otherData  + "' Hash: " + sha512Hash.execute(otherData));
    }
}
