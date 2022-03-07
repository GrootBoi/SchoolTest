public class CarTest {
    public static void main (String [] args)
    {
        //static variable -- No need to make object
        Toyota.company = "Car Rental";
        Toyota car1 = new Toyota("Yarris");
        //car1.odometer = 1000; is private

        Toyota car2 = new Toyota("Corrolla");
        System.out.println(car2.colour);
        System.out.println(car1.model);
        System.out.println(car1);
    }
}
