public class Time {
    //instance variables
    private int hour;
    private int minute;
    private int seconds;
    private String t;
    //Creates Time object
    public Time(int a, int b, int c){
        hour = a;
        minute = b;
        seconds = c;
    }
    //prints out 24 hour time
    public String info(){
        m();
        return t;
   }
   //increases seconds and changes hours and minutes as needed
   public void tick(){
        seconds+= 1;
        if(seconds >= 60){
            seconds -= 60;
            minute++;
        }
        if(minute >= 60){
            minute -= 60;
            hour++;
        }
        if(hour > 23){
            hour -= 23;
            minute = 0;
            seconds = 0;
        }
   }
    //helper class that returns the time in 24 hour format
    private String m(){
        t = "";
        if(hour <= 9){
            t += "0" + hour + ":";
        }else{
            t += hour + ":";
        }
        if(minute <= 9){
            t += "0" + minute + ":";
        }else{
            t += minute + ":";
        }
        if(seconds <= 9){
            t += "0" + seconds;
        }else{
            t += seconds;
        }
        return t;
   }
}
