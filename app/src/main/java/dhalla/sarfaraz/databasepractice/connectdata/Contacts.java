package dhalla.sarfaraz.databasepractice.connectdata;

/**
 * Created by muchbeer on 6/25/2015.
 */


//this class enable to maintain single contact as an object using getter and setter
public class Contacts {

    //private variables
    int uid;
    String name;
    String price;

    //Empty Constructor
    public Contacts() {

    }

    //constructor
    public Contacts(int uid, String name, String price) {
        this.uid = uid;
        this.name=name;
        this.price=price;
    }

    //constructor
    public Contacts(String name , String price) {
        this.name=name;
        this.price=price;

    }

    //getting ID
    public int getUid() {
        return  this.uid;
    }

    //setting id
    public void setUid(int uid) {
        this.uid = uid;
    }

    //getting name
    public String getName() {
        return this.name;
    }

    //setting name
    public void setName(String name) {
        this.name=name;
    }

    //getting price
    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price=price;
    }
}