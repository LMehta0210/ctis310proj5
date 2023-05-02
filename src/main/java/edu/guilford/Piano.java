package edu.guilford;

public class Piano extends Instrument implements Comparable<Piano>{
    private boolean digital;
    private String size;
    
    //constructor
    public Piano(Double price, String brand, boolean digital, String size) {
        super("Piano", "percussion", Note.Ab, price, brand);
        this.digital = digital;
        this.size = size;
    }

    //getters
    public boolean getDigital() {
        return digital;
    }

    public String getSize() {
        return size;
    }

    //setters
    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public void setSize(String size) {
        if (size.equals("grand") || size.equals("upright")) {
            this.size = size;
        } else {
            System.out.println("Invalid size. Please enter grand or upright.");
        }
    }

    //toString
    @Override
    public String toString() {
        return "Piano{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", digital=" + digital +
                '}';
    }

    //abstract methods
    @Override
    public void tuningInstructions() {
        System.out.println("Tune the piano by turning the tuning pins with a tuning hammer.");
        System.out.println("This should be done by a professional piano tuner, and not by the owner.");
    }

    @Override
    public int compareTo(Piano other){
        return this.getPrice().compareTo(other.getPrice());
    }

}
