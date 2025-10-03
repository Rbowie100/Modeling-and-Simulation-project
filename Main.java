import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int historicalcustomer;
        int wait;
        int averagetime;
        System.out.println("Enter historical customer");
        historicalcustomer = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter historical wait at checkout");
        wait = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter historical average time spent shopping");
        averagetime = scan.nextInt();
        scan.nextLine();
        Random rand = new Random();
        server queue=new server();
        algorithm distribution = new algorithm(historicalcustomer, wait, averagetime);
        time clock = new time();
        ArrayList<customer> allcustomers = new ArrayList<customer>();
        for (int num = 0; num < historicalcustomer; num++) {
            allcustomers.add(new customer(clock.Arrivaltimeminute(), clock.Arrivaltimehour(), clock));
        }
        System.out.println(historicalcustomer + " have entered the store at " + clock.Arrivaltimehour() + ":" + clock.Arrivaltimeminute() + "0" + clock.Arrival());
        while (clock.Arrivaltimeminute() != 0 || clock.Arrivaltimehour() != clock.timeend || !clock.Arrival().equals("P.M")) {

            if (clock.Arrivaltimeminute() % 5 == 0) {
                double random = rand.nextDouble();
                if (distribution.Poissond5mins() >= random) {
                    int value = historicalcustomer / 12;
                    for (int num = 0; num < value; num++) {
                        allcustomers.add(new customer(clock.Arrivaltimeminute(), clock.Arrivaltimehour(), clock));
                    }
                    System.out.print(value + " have entered the store at " + clock.Arrivaltimehour() + ":" + clock.Arrivaltimeminute() + "0" + clock.Arrival());
                }
            }
            if (clock.Arrivaltimeminute() % 10 == 0) {
                double random = rand.nextDouble();
                if (distribution.Poissond10mins() >= random) {
                    int value = historicalcustomer / 6;
                    for (int num = 0; num < value; num++) {
                        allcustomers.add(new customer(clock.Arrivaltimeminute(), clock.Arrivaltimehour(), clock));
                    }
                    System.out.print(value + " have entered the store at " + clock.Arrivaltimehour() + ":" + clock.Arrivaltimeminute() + "0" + clock.Arrival());
                }
            }
            if (clock.Arrivaltimeminute() % 15 == 0) {
                double random = rand.nextDouble();
                if (distribution.Poissond15mins() >= random) {
                    int value = historicalcustomer / 4;
                    for (int num = 0; num < value; num++) {
                        allcustomers.add(new customer(clock.Arrivaltimeminute(), clock.Arrivaltimehour(), clock));
                    }
                    System.out.print(value + " have entered the store at " + clock.Arrivaltimehour() + ":" + clock.Arrivaltimeminute() + "0" + clock.Arrival());
                }

            }
            if (clock.Arrivaltimeminute() % 60 == 0) {
                double random = rand.nextDouble();
                if (distribution.Poissond60mins() >= random) {
                    for (int num = 0; num < historicalcustomer; num++) {
                        allcustomers.add(new customer(clock.Arrivaltimeminute(), clock.Arrivaltimehour(), clock));
                    }
                    System.out.print(historicalcustomer + " have entered the store at " + clock.Arrivaltimehour() + ":" + clock.Arrivaltimeminute() + "0" + clock.Arrival());
                }
            }
            clock.increasetime();
            System.out.println("Current time:" + clock.Arrivaltimehour() + ":" + clock.Arrivaltimeminute() + clock.Arrival());
            double value= rand.nextDouble();
            for (int num = 0; num < allcustomers.size(); num++) {
                if (allcustomers.get(num).Shopping) {
                    if (distribution.ExponenetialdistributionShop(allcustomers.get(num).currenttimeinstore)>=value){
                        queue.QueueAdd(allcustomers.get(num));


                    }
                    allcustomers.get(num).setCurrenttimeinstore();
                }

            }
            for (int num = 0; num < allcustomers.size(); num++) {
                if (allcustomers.get(num).checkout) {

                    allcustomers.get(num).setCurrenttimecheckout();
                }

            }
            if(!queue.empty()){
            if (distribution.ExponenetialdistributionCheckout(queue.top().currenttimecheckout)>=value) {
                queue.Queueremove();
            }

            }
        }
    }
}
