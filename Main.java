import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static void file(String filename,double [] array){
        try{
            File myfile = new File(filename);

            if(myfile.createNewFile()){

            }
            String value=" ";
            for(int num=0;num< array.length;num++){
               value+=" "+array[num];
            }
            FileWriter write=new FileWriter(filename);
            write.write("Averages"+value);
            write.close();

        }
        catch(Exception e){

            System.out.println(e);
        }


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int historicalcustomer;
        double wait;
        double averagetime;
        System.out.println("Enter historical customer");
        historicalcustomer = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter historical wait at checkout");
        wait = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter historical average time spent shopping");
        averagetime = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter amount of Queues");
        int queueamount=0;
        queueamount= scan.nextInt();
        scan.nextLine();

        Random rand = new Random();
        server[] queue = new server[queueamount];
        for(int number=0;number<queue.length;number++){
            queue[number]=new server();
        }
        algorithm distribution = new algorithm(historicalcustomer, wait, averagetime);
        time clock = new time();
        int day=0;
        ArrayList<customer> allcustomers = new ArrayList<customer>();
        boolean left = false;
        for (int num = 0; num < historicalcustomer; num++) {
            allcustomers.add(new customer(clock.Arrivaltimeminute(), clock.Arrivaltimehour(), clock));
        }
        int arrayplace=0;
        System.out.println(historicalcustomer + " have entered the store at " + clock.Arrivaltimehour() + ":" + clock.Arrivaltimeminute() + clock.Arrival());
        for (day=0; day<7;day++) {
            while (clock.Arrivaltimeminute() != 0 || clock.Arrivaltimehour() != clock.timeend || !clock.Arrival().equals("P.M") && left == false) {

                if (clock.Arrivaltimeminute() % 5 == 0) {
                    double random = rand.nextDouble();
                    if (distribution.Poissond5mins() >= random) {
                        int value = historicalcustomer / 12;
                        for (int num = 0; num < value; num++) {
                            allcustomers.add(new customer(clock.Arrivaltimeminute(), clock.Arrivaltimehour(), clock));
                        }
                        if (clock.Arrivaltimeminute() < 10) {
                            System.out.println(historicalcustomer + " have entered the store at " + clock.Arrivaltimehour() + ":" + "0" + clock.Arrivaltimeminute() + clock.Arrival());
                        }
                        if (clock.Arrivaltimeminute() >= 10) {


                            System.out.println(historicalcustomer + " have entered the store at " + clock.Arrivaltimehour() + ":" + clock.Arrivaltimeminute() + clock.Arrival());
                        }

                    }
                }

                if (clock.Arrivaltimeminute() % 10 == 0) {
                    double random = rand.nextDouble();
                    if (distribution.Poissond10mins() >= random) {
                        int value = historicalcustomer / 6;
                        for (int num = 0; num < value; num++) {
                            allcustomers.add(new customer(clock.Arrivaltimeminute(), clock.Arrivaltimehour(), clock));
                        }
                        if (clock.Arrivaltimeminute() < 10) {
                            System.out.println(historicalcustomer + " have entered the store at " + clock.Arrivaltimehour() + ":" + "0" + clock.Arrivaltimeminute() + clock.Arrival());
                        }
                        if (clock.Arrivaltimeminute() >= 10) {


                            System.out.println(historicalcustomer + " have entered the store at " + clock.Arrivaltimehour() + ":" + clock.Arrivaltimeminute() + clock.Arrival());
                        }

                    }
                }

                if (clock.Arrivaltimeminute() % 15 == 0) {
                    double random = rand.nextDouble();
                    if (distribution.Poissond15mins() >= random) {
                        int value = historicalcustomer / 4;
                        for (int num = 0; num < value; num++) {
                            allcustomers.add(new customer(clock.Arrivaltimeminute(), clock.Arrivaltimehour(), clock));
                        }
                        if (clock.Arrivaltimeminute() < 10) {
                            System.out.println(historicalcustomer + " have entered the store at " + clock.Arrivaltimehour() + ":" + "0" + clock.Arrivaltimeminute() + clock.Arrival());
                        }
                        if (clock.Arrivaltimeminute() >= 10) {


                            System.out.println(historicalcustomer + " have entered the store at " + clock.Arrivaltimehour() + ":" + clock.Arrivaltimeminute() + clock.Arrival());
                        }

                    }
                }


                if (clock.Arrivaltimeminute() % 60 == 0) {
                    double random = rand.nextDouble();
                    if (distribution.Poissond60mins() >= random) {
                        for (int num = 0; num < historicalcustomer; num++) {
                            allcustomers.add(new customer(clock.Arrivaltimeminute(), clock.Arrivaltimehour(), clock));
                        }
                        if (clock.Arrivaltimeminute() < 10) {
                            System.out.println(historicalcustomer + " have entered the store at " + clock.Arrivaltimehour() + ":" + "0" + clock.Arrivaltimeminute() + clock.Arrival());
                        }
                        if (clock.Arrivaltimeminute() >= 10) {


                            System.out.println(historicalcustomer + " have entered the store at " + clock.Arrivaltimehour() + ":" + clock.Arrivaltimeminute() + clock.Arrival());
                        }

                    }
                }
                clock.increasetime();
                if (clock.Arrivaltimeminute() < 10) {
                    System.out.println("Current time:" + clock.Arrivaltimehour() + ":" + "0" + clock.Arrivaltimeminute() + clock.Arrival());
                }
                if (clock.Arrivaltimeminute() >= 10) {


                    System.out.println("Current time:" + clock.Arrivaltimehour() + ":" + clock.Arrivaltimeminute() + clock.Arrival());
                }

                double value = rand.nextFloat();
                for (int num = arrayplace; num < allcustomers.size(); num++) {
                    value = rand.nextFloat();

                    if (allcustomers.get(num).Shopping) {
                        allcustomers.get(num).minuteincrease();
                        if (distribution.ExponenetialdistributionShop(allcustomers.get(num).currenttimeinstore) >= value) {
                            int go = queue[0].Queuecheck();
                            int place = 0;
                            for (int number = 1; number < queue.length; number++) {
                                if (go > queue[number].Queuecheck()) {
                                    place = number;
                                }
                            }
                            queue[place].QueueAdd(allcustomers.get(num));
                            System.out.println("Customer has arrived at checkout");


                        }
                        allcustomers.get(num).setCurrenttimeinstore();

                    }
                }


                for (int num = arrayplace; num < allcustomers.size(); num++) {
                    value = rand.nextDouble();
                    if (allcustomers.get(num).checkout) {
                        allcustomers.get(num).minuteincrease();
                        allcustomers.get(num).setCurrenttimecheckout();
                    }

                }
                for (int number = 0; number < queue.length; number++) {
                    value = rand.nextDouble();
                    if (!queue[number].empty()) {
                        System.out.println(distribution.ExponenetialdistributionCheckout(queue[number].top().currenttimecheckout));
                        //System.out.println("Queue amount: "+ queue[number].Queuecheck());
                        if (distribution.ExponenetialdistributionCheckout(queue[number].top().currenttimecheckout) >= value) {
                            queue[number].Queueremove();
                            System.out.println("customer has left");
                        }
                        if (queue[number].empty()) {
                            //  System.out.print("is empty");
                        }
                    }


                }
                int check = 0;
                for (int num = arrayplace; num < allcustomers.size(); num++) {
                    check++;
                    if (allcustomers.get(num).left == false) {
                        check -= 1;
                        break;
                    }

                }
                if (check == allcustomers.size()) {
                    left = true;
                }
            }

                left = false;

                double average = 0;
                for (int num = 0; num < allcustomers.size(); num++) {
                    average += allcustomers.get(num).getMinute();
                }


                arrayplace = allcustomers.size();
                average = average / allcustomers.size();
                clock.dayvalues[day] = average;
                System.out.println("The average time spent in store is " + average);
                clock.resettime();
                if (day < 6) {
                    System.out.println("The date is " + clock.Days[day + 1]);

                    for (int num = 0; num < historicalcustomer; num++) {
                        allcustomers.add(new customer(clock.Arrivaltimeminute(), clock.Arrivaltimehour(), clock));
                    }

                }


        }
        file("file1",clock.dayvalues);
    }
}


