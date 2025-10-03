
public class customer {
    double currenttimeinstore=.016;
    double currenttimecheckout=.016;
    boolean Shopping=true;
    boolean left=false;
    boolean checkout=false;
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

    public double getCurrenttimecheckout() {
        return currenttimecheckout;
    }

    public double getCurrenttimeinstore() {
        return currenttimeinstore;
    }

    public void setCurrenttimecheckout(double currenttimecheckout) {
        this.currenttimecheckout += .16;
    }

    public void setCurrenttimeinstore(double currenttimeinstore) {
        this.currenttimeinstore += .16;
    }

    public void setShopping(boolean shopping) {
        Shopping = shopping;
    }

    public boolean isCheckout() {
        return checkout;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isShopping() {
        return Shopping;
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public int getMinute() {
        return minute;
    }
}

