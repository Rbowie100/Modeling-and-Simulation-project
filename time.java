public class time {
    int minute=0;
    int hour=6;
    String Time1="A.M";
    String Time2="P.M";
    boolean AM=true;
    boolean PM=false;
    int timeend=10;
    int timestart=6;
    String[] Days;

    public int Arrivaltimehour (){
        return hour;
    }
    public int Arrivaltimeminute (){
        return minute;
    }
    public String Arrival(){
        if(AM){
            return Time1;
        }
        if(PM){
        return Time2;
        }
        return "AM";
    }
    public void printtime(){

    }
    public void increasetime(){
      minute+=1;
      if(minute==60){
          hour+=1;
      }
      if(hour==12){
          PM=true;
          AM=false;
      }

    }
   public int leavetime;
}

