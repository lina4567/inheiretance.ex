
package mountainbike;

class Bicyle {protected int gear;
    protected int speed;
    public int Bike;
    public Bicyle(int startGear, int startSpeed ){
        gear = startGear;
        speed= startSpeed;
    }
public void  setGear(int newValue){
        gear = newValue;

}
    public void  ApplyBreak(int decrement) {
        speed -= decrement;



 public  void speedUp(int incremnt){
        speed += incremnt;

    }
}
public class Bike extends Bicyle {
    public int seatHeight;
    public Bike(int startHeight,int startSpeed,int startGear){
        super(startSpeed , startGear);
        seatHeight= startHeight;

    }
    public void setHeight(int newValue){
        seatHeight = newValue;
    }

    public static <MountainBike> void main(String[] args) {
        MountainBike mountaineBike = new MountainBike(15 ,14 ,13);
        System.out.println("gear is " + mountaineBike.Gear);
        System.out.println("seat height is " + mountaineBike.seatHeight);
        System.out.println(" bike speed is " + mountaineBike.Speed);

    }

}

