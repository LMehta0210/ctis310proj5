package edu.guilford;

public abstract class Instrument {
    //attrributes
    protected String name;
    protected String type;
    protected Note tuning;
    protected Double price;
    protected String brand;

    //enum for notes of chromatic scale
    public static enum Note {
        Ab, A, Bb, B, C, Db, D, Eb, E, F, Gb, G
    }

    //constructor
    public Instrument(String name, String type, Note tuning, Double price, String brand) {
        this.name = name;
        this.type = type;
        this.tuning = tuning;
        this.price = price;
        this.brand = brand;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Note getTuning() {
        return tuning;
    }

    public Double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        if (type.equals("string") || type.equals("wind") || type.equals("percussion")) {
            this.type = type;
        } else {
            System.out.println("Invalid type. Please enter string, wind, or percussion.");
        }
    }

    public void setTuning(Note tuning) {
        this.tuning = tuning;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //toString
    @Override
    public String toString() {
        return "Name: " + name + "\nType: " + type + "\nTuning: " + tuning;
    }

    //transpose
    //transposes a list of notes to the tuning of the instrument
    public Note[] transpose(Note[] notes) {
        Note[] transposedNotes = new Note[notes.length];
        for (int i = 0; i < notes.length; i++) {
            if (notes[i].ordinal() + tuning.ordinal() > 11) {
                //shifts the note up an octave if it is below the tuning
                transposedNotes[i] = Note.values()[notes[i].ordinal() - 12 + tuning.ordinal()];
            } else {
                //shifts the note down to the tuning
                transposedNotes[i] = Note.values()[notes[i].ordinal() + tuning.ordinal()];
            }
        }
        return transposedNotes;
    }

    //abstract methods
    public abstract void tuningInstructions();


}
