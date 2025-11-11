
public class customer {
    double currenttimeinstore=1;
    double currenttimecheckout=1;
    boolean Shopping=true;
    boolean left=false;
    boolean checkout=false;
    public int Arrivaltimeminute;
    public int Arrivaltimehour;
    public int minute=0;
    public int entercheckout;
    public int leavecheckout;
    public int leavecheckouthour;
    time clock;
    customer(int Arrivaltimeminute, int Arrivaltimehour, time clock){
        this.Arrivaltimeminute=Arrivaltimeminute;
        this.Arrivaltimehour=Arrivaltimehour;
    }
    public int getarrivalminute(){
        return Arrivaltimeminute;
    }

    public int getArrivaltimehour() {
        return Arrivaltimehour;
    }

    public int getleaveminute(){
        return leavecheckout;
    }
    public int getleavehour(){
        return leavecheckouthour;
    }
    public int getEntercheckout() {
        return entercheckout;
    }
    public void minuteincrease(){
        minute+=1;

    }

    public void setLeavecheckouthour(int leavecheckouthour) {
        this.leavecheckouthour = leavecheckouthour;
    }

    public void setLeavecheckout(int leavecheckout) {
        this.leavecheckout = leavecheckout;
    }

    public double getCurrenttimecheckout() {
        return currenttimecheckout;
    }

    public double getCurrenttimeinstore() {
        return currenttimeinstore;
    }

    public void setCurrenttimecheckout() {
        currenttimecheckout += 1;
    }

    public void setCurrenttimeinstore() {
        currenttimeinstore += 1;
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
