
public class customer {
    
    public int Arrivaltimeminute;
    public int Arrivaltimehour;
    public int minute=0;
    public int entercheckout;
    public int leavecheckout;
    time clock;
    customer(int Arrivaltimeminute, int Arrivaltimehour, time clock){
        this.Arrivaltimeminute=Arrivaltimeminute;
        this.Arrivaltimehour=Arrivaltimehour;
        clock=new time();
    }
    public int getarrivalminute(){
        return Arrivaltimeminute;
    }

    public int getArrivaltimehour() {
        return Arrivaltimehour;
    }

    public int getleave(){
        return leavecheckout;
    }

    public int getEntercheckout() {
        return entercheckout;
    }
    public void minuteincrease(){
        minute+=1;
        
    }

    public int getMinute() {
        return minute;
    }
}

