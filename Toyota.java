class Toyota {
    //global variables are set to be 0 or null
    //1. static variables (and constants)
    static String company;

    //2. instance variables (not static)
    //each other gets its OWN COPY of these.
    final String model;
    private int odometer;
    String colour = "Blue";
    double fuel = 40.0;

    //3. constructor(s)
    Toyota(String m) {
        model = m;
        odometer = 25;
        //System.out.println("Make Toyota");
    }

    Toyota(String model, int odometer) {
        this.model = model;
        this.odometer = odometer;
        //System.out.println("Make Toyota");
    }
    
    //4. static methods
    //Don't need to make object to access them
    //Example: x = Math.Random() instead of rgen = new Random() --> x = rgen.NextInt(100);

    //5. instance methods
    //get and set for private variables
    int getOdo()
    {
        return odometer;
    }

    void setOdo(int odo)
    {
        System.out.println("No!");
    }

    void drive(int km)
    {
        odometer += Math.abs(km); //disallows negative km
    }

    public String toString()
    {
        String s = String.format("Model = %s, Odo = %dkm", model, odometer);
        return s;
    }
}
