package activities;

 class Activity1 {
     Car carName = new Car();

    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.make = 2014;
        toyota.color = "Black";
        toyota.transmission = "Manual";

        //Using Car class method
        toyota.displayCharacterstics();
        toyota.accelerate();
        toyota.brake();
    }

}