package edu.guilford;

public class Clarinet extends Instrument implements Comparable<Clarinet>{
    //constructor
    public Clarinet(Double price, String brand) {
        super("Clarinet", "wind", Note.Bb, price, brand);
    }

    //toString
    @Override
    public String toString() {
        return "Clarinet{" +
                "tuning=" + tuning +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    //abstract methods
    @Override
    public void tuningInstructions() {
        System.out.println("Tune the clarinet by pulling the mouthpiece out or pushing it in.");
        System.out.println("The mouthpiece should be pulled out to lower the pitch and pushed in to raise the pitch.");
        System.out.println("Open C on the clarinet should be tuned to the Bb on a piano.");
        System.out.println("Tune the notes C, G, and low E on the clarinet to the corresponding notes on a piano.");
    }

    @Override
    public int compareTo(Clarinet other){
        return this.getPrice().compareTo(other.getPrice());
    }


}
