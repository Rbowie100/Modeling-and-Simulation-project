import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;


public class Main {

    public static void file(String filename, double[] array, int runnumber) {
        try {
            File myfile = new File(filename);

            if (myfile.createNewFile()) {

            }
            String value = " ";

            FileWriter write = new FileWriter(filename);
            write.write("Averages" + value);
            write.close();

        } catch (Exception e) {

            System.out.println(e);
        }


    }
    public static void file(String filename, String value, int runnumber,String parameters) {
        try {
            File myfile = new File(filename);

            if (myfile.createNewFile()) {

            }


            FileWriter write = new FileWriter(filename);
            write.write(parameters+"\nValues:,\n " + value);
            write.close();

        } catch (Exception e) {

            System.out.println(e);
        }


    }
    public static void file(String filename, long value, int runnumber) {
        try {
            File myfile = new File(filename);

            if (myfile.createNewFile()) {

            }

            String value1= String.valueOf(value);


            FileWriter write = new FileWriter(filename);
            write.write(value1);
            write.close();

        } catch (Exception e) {

            System.out.println(e);
        }


    }
    public static void main(String[] args) {
        int runnumber = 1;
        Scanner scan = new Scanner(System.in);
        int historicalcustomer = 0;
        double wait = 0;
        double averagetime = 0;
        int run = 1;

        while (run == 1) {
            String parameters="";


            int queueamount = 0;
            while (historicalcustomer <= 0 || wait <= 0 || averagetime <= 0 ||queueamount<=0) {
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

                queueamount = scan.nextInt();
                scan.nextLine();

               parameters="Parameters \nHistorical Customer:,"+historicalcustomer+", Wait:,"+wait+", Average Shopping:,"+averagetime+", Queue:,"+queueamount+",";

                if(historicalcustomer < 0 || wait < 0 || averagetime < 0 ||queueamount<0){
                    System.out.println("Invalid value entered please enter values again");
                }
            }
                long begin = System.nanoTime();
                Random rand = new Random();
                server[] queue = new server[queueamount];
                for (int number = 0; number < queue.length; number++) {
                    queue[number] = new server();
                }
                algorithm distribution = new algorithm(historicalcustomer, wait, averagetime);
                time clock = new time();
                int day = 0;
                String queuevalue = "";
                ArrayList<customer> allcustomers = new ArrayList<customer>();
                boolean left = false;
                for (int num = 0; num < historicalcustomer; num++) {
                    allcustomers.add(new customer(clock.Arrivaltimeminute(), clock.Arrivaltimehour(), clock));
                }
                int arrayplace = 0;
                System.out.println(historicalcustomer + " have entered the store at " + clock.Arrivaltimehour() + ":0" + clock.Arrivaltimeminute() + clock.Arrival());

                for (day = 0; day < 7; day++) {
                    boolean dayend=false;
                    while (dayend==false|| left==false) {
                    if(clock.Arrivaltimehour() ==10 &&  clock.Arrival().equals("P.M") ) {
                        dayend=true;
                    }
                    if(dayend==false){
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
                                if (allcustomers.get(num).Shopping) {

                                    allcustomers.get(num).minuteincrease();
                                    allcustomers.get(num).setCurrenttimeinstore();
                                }
                                if (clock.Arrivaltimeminute() % 5== 0) {

                                    value = rand.nextFloat();

                                    if (allcustomers.get(num).Shopping) {
                                        if (distribution.ExponenetialdistributionShop(allcustomers.get(num).currenttimeinstore) >= value) {
                                            int go = queue[0].number;
                                            int place = 0;

                                            for (int number = 1; number < queue.length; number++) {
                                                if (go > queue[number].number) {
                                                    place = number;
                                                }
                                            }
                                            queue[place].QueueAdd(allcustomers.get(num));
                                            System.out.println("Customer has arrived at checkout");


                                        }

                                    }
                                }


                        }



                        for (int num = arrayplace; num < allcustomers.size(); num++) {

                            if (allcustomers.get(num).checkout) {
                                allcustomers.get(num).minuteincrease();
                            }

                        }
                        if (clock.Arrivaltimeminute() % 2== 0) {
                            for (int number = 0; number < queue.length; number++) {

                                value = rand.nextDouble();
                                if (!queue[number].isempty()) {
                                    // System.out.println(distribution.ExponenetialdistributionCheckout(queue[number].top().currenttimecheckout));
                                    //System.out.println("Queue amount: "+ queue[number].Queuecheck());
                                    if (clock.Arrivaltimeminute() < 10) {
                                        queuevalue += "Queue " + number + " amount:, " + queue[number].number + ", at " + clock.Arrivaltimehour() + ",:" + "0" + clock.Arrivaltimeminute() + ",\n";
                                    }
                                    if (clock.Arrivaltimeminute() >= 10) {

                                        queuevalue += "Queue " + number + " amount:," + queue[number].number + ", at " + clock.Arrivaltimehour() + ",:" + clock.Arrivaltimeminute() + ",\n";

                                    }
                                    queue[number].top().setCurrenttimecheckout();

                                    if (distribution.ExponenetialdistributionCheckout(queue[number].top().currenttimecheckout) >= value) {

                                        queue[number].top().setLeavecheckouthour(clock.Arrivaltimehour());
                                        queue[number].top().setLeavecheckout(clock.Arrivaltimeminute());
                                        queue[number].Queueremove();
                                        System.out.println("customer has left");
                                    }


                                }

                                if (queue[number].isempty()) {

                                }


                            }
                        }
                        left=true;

                        for (int num = arrayplace; num < allcustomers.size(); num++) {

                            if (allcustomers.get(num).left == false) {
                                left=false;

                                break;
                            }

                        }

                    }



                    double average = 0;
                    int dayamount= allcustomers.size()-arrayplace;
                    int max=allcustomers.get(arrayplace).getMinute();;
                    int min=allcustomers.get(arrayplace).getMinute();;
                    for (int num = arrayplace; num < allcustomers.size(); num++) {
                        average += allcustomers.get(num).getMinute();
                        if(max<allcustomers.get(num).getMinute()){
                            max=allcustomers.get(num).getMinute();
                        }
                        if(min>allcustomers.get(num).getMinute()){
                            min=allcustomers.get(num).getMinute();
                        }


                    }



                    average = (average / dayamount);
                    double standarddeviation=0;
                    for (int num = arrayplace; num < allcustomers.size(); num++) {
                        standarddeviation+=(Math.pow(allcustomers.get(num).getMinute()-average,2));


                    }
                    standarddeviation=Math.sqrt(standarddeviation/dayamount);
                    double confidenceintervalplus=average+1.96*(standarddeviation/Math.sqrt(dayamount));
                    double confidenceintervalminus=average-1.96*(standarddeviation/Math.sqrt(dayamount));
                    clock.confidenceintervalplus[day]=confidenceintervalplus;
                    clock.confidenceintervalminus[day]=confidenceintervalminus;
                    clock.standarddeviation[day]=standarddeviation;
                    arrayplace= allcustomers.size()-1;
                    clock.dayvalues[day] = average;
                    clock.max[day]=max;
                    clock.min[day]=min;
                    System.out.println("The average time spent in store is " + average);
                    clock.resettime();
                    if (day < 6) {
                        System.out.println("The date is " + clock.Days[day + 1]);

                        for (int num = 0; num < historicalcustomer; num++) {
                            allcustomers.add(new customer(clock.Arrivaltimeminute(), clock.Arrivaltimehour(), clock));
                        }

                    }


                }
                String ArrivalLeave = "";

                for (int num = 0; num < allcustomers.size(); num++) {
                    ArrivalLeave += "Customer," + (num + 1) + ", Arrival time," + allcustomers.get(num).Arrivaltimehour + ",:" + allcustomers.get(num).Arrivaltimeminute + ",Exit time:," + allcustomers.get(num).leavecheckouthour + ": "+allcustomers.get(num).leavecheckout+", Time spent:"+allcustomers.get(num).getMinute()+"\n";
                }
                double average=0;
                int max=0;
            int min=allcustomers.get(arrayplace).getMinute();;
            for (int num = 0; num < allcustomers.size(); num++) {
                average += allcustomers.get(num).getMinute();
                if(max<allcustomers.get(num).getMinute()){
                    max=allcustomers.get(num).getMinute();
                }
                if(min>allcustomers.get(num).getMinute()){
                    min=allcustomers.get(num).getMinute();
                }


            }
            average = (average / allcustomers.size());
            double standarddeviation=0;
            for (int num = 0; num < allcustomers.size(); num++) {
                standarddeviation+=(Math.pow(allcustomers.get(num).getMinute()-average,2));


            }
            standarddeviation=Math.sqrt(standarddeviation/allcustomers.size());
                String value="";
            for (int num = 0; num < clock.dayvalues.length; num++) {
                value += clock.Days[num]+","+clock.dayvalues[num]+",max:,"+ clock.max[num]+",min:,"+clock.min[num]+",Standard deviation:,"+clock.standarddeviation[num]+",Confidence interval:,"+ clock.confidenceintervalplus[num]+","+clock.confidenceintervalminus[num]+",\n";
            }
            double confidenceintervalplus=average+1.96*(standarddeviation/Math.sqrt(allcustomers.size()));
            double confidenceintervalminus=average-1.96*(standarddeviation/Math.sqrt(allcustomers.size()));
            value+="Average,"+average+",max:,"+ max+",min:,"+min+",Standard deviation:,"+standarddeviation+",Confidence interval:,"+confidenceintervalplus+","+confidenceintervalminus+",\n";


            file(("CustomerAverage"+runnumber+".csv"), value, runnumber,parameters);
            file(("Customer times"+runnumber+".csv"), ArrivalLeave, runnumber,parameters);
            file(("QueueValues"+runnumber+".csv"), queuevalue, runnumber,parameters);
                long endvalue = System.nanoTime();

                long timespent = (endvalue - begin) / 1000000;
                System.out.println("Time spent running in miliseconds:" + timespent);
                System.out.println("Do you want to end simulation type zero to do so");
                int end = scan.nextInt();
                scan.nextLine();
                if (end == 0) {
                    run = 0;
                }
                runnumber++;
            }

        }

    }





