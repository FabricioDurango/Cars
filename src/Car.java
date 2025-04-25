import java.io.Serializable;

public class Car implements Serializable {
    private String make;
    private int year;
    private static  final  long serialVersionUID = 1L;
    private  transient String model;

    public Car( String make, int year, String model){
        this.make = make;
        this.year = year;
        this.model = model;
    }

     @Override
    public String toString(){
        String carInto = "";
        carInto += "\nBrand: " + this.make;
        carInto += "\nYear: " + this.year;
        carInto += "\nModel: " + this.model;
        return carInto;
    }
}

