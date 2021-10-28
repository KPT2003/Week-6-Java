public class LabClass {


    void lab1() {
        double a = Math.random()*100;
        int a1 = (int)a;
        //System.out.println(a1);

        double b = Math.random()*100;
        int b1 = (int)b;
        //System.out.println(b1);

        double c = Math.random()*100;
        int c1 = (int)c;
        //System.out.println(c1);

        int second_largest = 0;


        if((a1 > b1) && (a1<c1))
            second_largest = a1;

        else if((a1 < b1) && (a1 >c1))
            second_largest = a1;

        else if((b1 > a1) && (b1 < c1))
            second_largest = b1;

        else if((b1 < a1) && (b1 > c1))
            second_largest = b1;

        else if((c1 > a1) && (c1 <b1))
            second_largest = c1;

        else if ((c1 < a1) && (c1 > b1))
            second_largest = c1;

        System.out.println("For the values: " + a1 + " , " + b1 + " , " + c1 + " , " + "The second largest number is: " + second_largest);
    }

    void lab2() {
        String s1 = "vic3070";
        String pc1 = "VIC";
        String pc2 = pc1.toLowerCase();

        int num1 = Integer.parseInt(s1.substring(3,7));
        System.out.println(num1);

        if((s1.substring(0,3).toLowerCase().contains(pc2) && (num1 % 2 == 0)))
            System.out.println("Your postcode is in Victoria with an even number.");
        else if((s1.substring(0,3).toLowerCase().contains(pc2) && (num1 % 2 >= 1)))
            System.out.println("Your postcode is in Victoria, with an odd number.");
        else System.out.println("Unknown state or territory");

    }

    void lab3() {
        //String s1 = "vic3071";
        //String pc1 = "VIC";
        //String pc2 = pc1.toLowerCase();

        //int num2 = Integer.parseInt(s1.substring(3,7));
        //int num2 = n;
        //System.out.println(num1);

        //String s2 = s2.substring(0,3).toLowerCase().contains(pc2);
        //System.out.println(s2);

        //switch(s1) {
            //case 1 (s1.substring(0,3).toLowerCase().contains(pc2) && (num1 % 2 == 0))
                //System.out.println("Your postcode is in Victoria with an even number.");
            //case 2 (s1.substring(0,3).toLowerCase().contains(pc2) && (num1 % 2 >= 1));
                //System.out.println("Your postcode is in Victoria, with an odd number.");
            //default:
                //System.out.println("Unknown state or territory");

    }

    void lab4() {
        // your code for lab task 4
    }

    public static void main(String[] args) {
        LabClass labClass = new LabClass();

        // to execute, uncomment one method at a time
        //labClass.lab1();
        labClass.lab2();
        labClass.lab3();
        //labClass.lab4();

    }


}
