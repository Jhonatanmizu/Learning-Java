package poo;

import java.util.Date;

public class Overload {
    String overloadName = "";
    Date createdAt = new Date();


    public Overload() {

    }

    public Overload(String overloadName) {
        this.overloadName = overloadName;
    }


    public Overload(String overloadName, Date createdAt) {
        this.overloadName = overloadName;
        this.createdAt = new Date();
    }

    public static void main(String[] args) {
        Overload newOverload = new Overload();
    }
}
