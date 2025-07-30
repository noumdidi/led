public class LED_Lamp {
    private LED red, green, blue;
    public LED_Lamp(){
         red = new LED("red");
         green = new LED("green");
         blue = new LED("blue");
    }
    public boolean showlight (int lightIdx){
switch(lightIdx){
    case 0:
        red.turnOn();
        green.turnOff();
        blue.turnOff();
        System.out.println("Light is now " + red.getColor());
        return true;
    case 1:
        red.turnOff();
        green.turnOn();
        blue.turnOff();
        System.out.println("Light is now " + green.getColor());
        return true;
    case 2:
        red.turnOff();
        green.turnOff();
        blue.turnOn();
        System.out.println("Light is now " + blue.getColor());
        return true;
    default:
        System.out.println("Error!! Expects 0, 1 or 2.");
        return false;
}
    }
}
