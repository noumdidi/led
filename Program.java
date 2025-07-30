public class Program {
  public static void main(String[] args) {
    // instantiate a new LED object (from the LED class)
    // and set its color to red
    LED redLED = new LED("red");

    // get the current color of our LED object
    System.out.println("LED Color: " + redLED.getColor());

    // turn ON the LED object
    redLED.turnOn();
    System.out.println("LED is " + (redLED.isLEDOn() ? "ON" : "OFF"));

    // turn OFF the LED object
    redLED.turnOff();
    System.out.println("LED is " + (redLED.isLEDOn() ? "ON" : "OFF"));
    LED_Lamp lamp = new LED_Lamp();
    lamp.showlight(0);
    lamp.showlight(1);
    lamp.showlight(2);
    lamp.showlight(3);
    lamp.showlight(0);
  }
}
