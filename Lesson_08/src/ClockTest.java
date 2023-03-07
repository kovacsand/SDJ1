public class ClockTest
{
  public static void main(String[] args)
  {
    //Declaring variables
    Clock time1 = new Clock(23,59,59);
    Clock time2 = new Clock(32123);

    //Output for the first time
    System.out.println(time1);
    System.out.println(time2);

    //Testing set method
    time2.set(10,32,45);

    //Testing get methods
    System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());

    //Testing tic
    time1.tic();
    System.out.println(time1);

    //Testing timeTo (it uses timeInSecondsTo which uses convertToSeconds)
    Clock time3 = new Clock(16,10,0);
    System.out.println(time1.timeTo(time3));

    //Testing isBefore
    System.out.println(time3.isBefore(time2));

    //Testing setTimeFormat24
    time1.setTimeFormat24(12);
    time1.tic();
    System.out.println(time1);
  }
}
