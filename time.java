public class time {
    int minute=0;
    int hour=6;
    String Time1="A.M";
    String Time2="P.M";
    boolean AM=true;
    boolean PM=false;
    int timeend=10;
    int timestart=6;
    String[] Days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    double [] dayvalues=new double[7];
    double [] max=new double[7];
    double [] min=new double[7];
    double [] standarddeviation=new double[7];
    double [] confidenceintervalplus= new double [7];
    double [] confidenceintervalminus= new double [7];


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

    public void increasetime(){
      minute+=1;
      if(minute==60){
          hour+=1;
          minute=0;
      }
      if(hour==12){
          PM=true;
          AM=false;
      }
      if(hour==13){
          hour=1;
      }

    }

    public void resettime(){
        hour=6;
        minute=0;
        PM=false;
        AM=true;
    }
   public int leavetime;
}
