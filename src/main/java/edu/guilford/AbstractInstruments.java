package edu.guilford;

import java.util.Arrays;

import edu.guilford.Instrument.Note;

public class AbstractInstruments 
{
    public static void main( String[] args )
    {
        //Instantiate three objects of each type of instrument
        //three guitars
        Guitar guitar1 = new Guitar(1000.00, "Fender", true, 5);
        Guitar guitar2 = new Guitar(500.00, "Gibson", false, 0);
        Guitar guitar3 = new Guitar(200.00, "Epiphone", true, 0);
        
        //three pianos
        Piano piano1 = new Piano(10000.00, "Steinway", false, "grand");
        Piano piano2 = new Piano(5000.00, "Yamaha", true, "upright");
        Piano piano3 = new Piano(2000.00, "Kawai", false, "grand");

        //three clarinets
        Clarinet clarinet1 = new Clarinet(500.00, "Yamaha");
        Clarinet clarinet2 = new Clarinet(200.00, "Buffet");
        Clarinet clarinet3 = new Clarinet(100.00, "Selmer");

        //add an Eb clarinet to the list of clarinets
        Clarinet ebClarinet = new Clarinet(1000.00, "Buffet");
        ebClarinet.setTuning(Note.Eb);

        //demonstrate transposition
        //create the notes for Hot Cross Buns and store in a list
        Note[] hotCrossBuns = {Note.B, Note.A, Note.G, Note.B, Note.A, Note.G, Note.G, Note.G, Note.G, Note.A, Note.A, Note.A, Note.B, Note.A, Note.G};
        //Print the notes for Hot Cross Buns
        System.out.println("Hot Cross Buns: ");
        for (Note note : hotCrossBuns) {
            System.out.print(note + " ");
        }
        System.out.print("\n");
        System.out.println("\nDemonstrating inherited method (transposition): ");
        //transpose the notes for Hot Cross Buns for the clarinet
        Note[] clarinetHotCrossBuns = clarinet1.transpose(hotCrossBuns);
        //print the notes for Hot Cross Buns on the clarinet
        System.out.println("Clarinet Hot Cross Buns; " + clarinet1.getTuning() + " tuning: ");
        for (Note note : clarinetHotCrossBuns) {
            System.out.print(note + " ");
        }
        System.out.print("\n");
        //print the notes for Hot Cross Buns on the Eb clarinet
        System.out.println("Eb Clarinet Hot Cross Buns; " + ebClarinet.getTuning() + " tuning: ");
        Note[] ebClarinetHotCrossBuns = ebClarinet.transpose(hotCrossBuns);
        for (Note note : ebClarinetHotCrossBuns) {
            System.out.print(note + " ");
        }
        System.out.print("\n");
        //Demonstrate transposition for the guitar
        Note[] guitarHotCrossBuns = guitar1.transpose(hotCrossBuns);
        System.out.println("Guitar Hot Cross Buns on the " + guitar1.getCapoFret() + "th fret: ");
        for (Note note : guitarHotCrossBuns) {
            System.out.print(note + " ");
        }
        System.out.print("\n");
        //Demonstrate transposition for the piano
        Note[] pianoHotCrossBuns = piano1.transpose(hotCrossBuns);
        System.out.println("Piano Hot Cross Buns: ");
        for (Note note : pianoHotCrossBuns) {
            System.out.print(note + " ");
        }
        System.out.print("\n");


        //demonstrate tuning instructions
        System.out.println("\nDemonstrating abstract method and polymorphism (tuning instructions): ");
        System.out.println("\nTuning instructions for the " + guitar1.getBrand() + " guitar: ");
        guitar1.tuningInstructions();
        System.out.println("\nTuning instructions for the " + piano1.getBrand() + " piano: ");
        piano1.tuningInstructions();
        System.out.println("\nTuning instructions for the " + clarinet1.getBrand() + " clarinet: ");
        clarinet1.tuningInstructions();

        //demonstrate compareTo
        //create a list of each instrument type
        Guitar[] guitars = {guitar1, guitar2, guitar3};
        Piano[] pianos = {piano1, piano2, piano3};
        Clarinet[] clarinets = {clarinet1, clarinet2, clarinet3, ebClarinet};
        System.out.println("\nDemonstrating compareTo (compares by price): ");
        //Print out the unsorted lists
        System.out.println("\nUnsorted lists: ");
        System.out.println("\nGuitars: ");
        for (Guitar guitar : guitars) {
            System.out.println(guitar);
        }
        System.out.println("\nPianos: ");
        for (Piano piano : pianos) {
            System.out.println(piano);
        }
        System.out.println("\nClarinets: ");
        for (Clarinet clarinet : clarinets) {
            System.out.println(clarinet);
        }
        //sort each list
        Arrays.sort(guitars);
        Arrays.sort(pianos);
        Arrays.sort(clarinets);
        
        //print out the sorted lists
        System.out.println("\nSorted lists: ");
        System.out.println("\nGuitars: ");
        for (Guitar guitar : guitars) {
            System.out.println(guitar);
        }
        System.out.println("\nPianos: ");
        for (Piano piano : pianos) {
            System.out.println(piano);
        }
        System.out.println("\nClarinets: ");
        for (Clarinet clarinet : clarinets) {
            System.out.println(clarinet);
        }


    }
}
