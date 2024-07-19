class AssignOp{

    public static void main(String[] args) {
        
        int a = 10;
        int b = 3;

        int result1 = a+b;
        int result2 = a-b;
        int result3 = a*b;
        int result4 = a/b;
        int result5 = a%b;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        result1 += 1;
        result2++;
        result3--;

        System.out.println("Arithematic operator: " +result1);
        System.out.println("Increemnt : " +result2);
        System.out.println("Decrement : " +result3);

       int ap = 3;
       int r =ap++;  //first it will print the value and  op=3
       int r1 = ++ap;    //it will incremnt  first and print after op=4
       
       System.out.println("Post Incremenet:"+r);
       System.out.println("Pre-increment :" +r1);

    }
}


