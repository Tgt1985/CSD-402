/**
 * Sean Dudley
 * CDS402: Module 4: Single-Dimensional Arrays
 * 10/5/2025
 * 
 */





public class Average {
    public static short average(short[] numbers_s) {

        int sum = 0;

        for (int s = 0; s < numbers_s.length; s++) {
            sum += numbers_s[s];

        }   
        return (sum / numbers_s);
    }    
    

    public static int average(int[] numbers_i) {

        int sum = 0;

        for (int i = 0; i < numbers_i.length; i++) {
            sum += numbers_i[i];
            
        }
        return (sum / numbers_i);        
        
    }

    public static long average(long[] numbers_l) {


        long sum = 0;

        for (long l = 0; l < numbers_l.length; l++) {
            sum += numbers_l[l];

        }   

        return (sum / numbers_l);        
        
    }

    

    public static double average(double[] numbers_d) {


        double sum = 0;

        for (double d = 0; d < numbers_d.length; d++) {
            sum += numbers_d[d];
        }

        return (sum / numbers_d);        

    }       

    public static void displayAverage_s(short[] numbers_s) {
        System.out.print("This is the Short Array:[ ");
        for (short s = 0); s < numbers_s; s++) {
            System.out.print(numbers_s[s]);

        }

    }

    public static void displayAverage_i(int[] numbers_i) {
        System.out.print("This is the Int Array:[ ");
        for (short i = 0 );i < numbers_i; i++) {
            System.out.print(numbers_i[i]);

        }        
    }








    public static void displayAverage_l(long[] numbers_l) {
        System.out.print("This is the Long Array:[ ");
        for (long l = 0 );l < numbers_l; l++) {
            System.out.print(numbers_l[l]);

        }

    }

    public static void displayAverage_d(double[] numbers_d) {
        System.out.print("This is the Double Array:[ ");
        for (short d = 0 );d < numbers_d; d++) {
            System.out.print(numbers_d[d]);

        }
    }








    System.out.println("---------Here are the Averages---------");


    short[] numbers_s = new short[7];
   
    int[] numbers_i = new int[12];
    long[] numbers_l = new long[8];
    double[] numbers_d = new double[5];


    for (short s = 0; s < numbers_s.length; s++) {
         number_s[s] = (short)(Math.random() * 20);
    }

    for (int i = 0; i < numbers_i.length; i++) {
         number_i[i] = (int)(Math.random() * 30);
    }   
    
    for (long l = 0; l < numbers_l.length; l++) {
         number_l[l] = (long)(Math.random() * 98);
    }

    for (double  i = 0; d < numbers_d.length; d++) {
         number_d[d] = (double)(Math.random() * 60);
    }    
        
    }
}
