package edu.guilford;

public class Guitar extends Instrument implements Comparable<Guitar> {
    private boolean electric;
    private int capoFret;

    // constructor
    public Guitar(Double price, String brand, boolean electric, int capoFret) {
        super("Guitar", "string", Note.C, price, brand);
        this.electric = electric;
        this.capoFret = capoFret;
    }

    // getters
    public boolean getElectric() {
        return electric;
    }

    public int getCapoFret() {
        return capoFret;
    }

    // setters
    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public void setCapoFret(int capoFret) {
        this.capoFret = capoFret;
    }

    // transpose method
    @Override
    public Note[] transpose(Note[] notes) {
        // transposes notes based on the capo fret, since tuning is always standard
        Note[] transposedNotes = new Note[notes.length];
        for (int i = 0; i < notes.length; i++) {
            // shifts the note down the steps based on the fret number of the capo
            // use an if statment to deal with negative ordinals of enum
            if (notes[i].ordinal() - capoFret < 0) {
                transposedNotes[i] = Note.values()[notes[i].ordinal() - capoFret + 12];
            } else {
                transposedNotes[i] = Note.values()[notes[i].ordinal() - capoFret];
            }
        }
        return transposedNotes;
    }

    // toString
    @Override
    public String toString() {
        return "Guitar{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", electric=" + electric +
                ", capoFret=" + capoFret +
                '}';
    }

    // abstract methods
    @Override
    public void tuningInstructions() {
        System.out.println("Tune the guitar by turning the tuning pegs.");
        System.out.println(
                "The highest pitch string should be tuned to E, the next to A, the next to D, the next to G, the next to B, and the lowest string to E.");
    }

    @Override
    public int compareTo(Guitar other) {
        return this.getPrice().compareTo(other.getPrice());
    }
}
