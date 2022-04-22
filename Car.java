class Car {
    String color;
    int milesDriven;
   
    public Car(String carColor) {
      color = carColor;
      milesDriven = 0;         
    }
   
    public void drive() {
       String message = "Miles driven: " + milesDriven;
       System.out.println(message);
    }
   
    public static void main(String[] args){
       Car myFastCar = new Car("red");
       myFastCar.drive();
       myFastCar.milesDriven = 50000;
       myFastCar.drive();
    }
  }