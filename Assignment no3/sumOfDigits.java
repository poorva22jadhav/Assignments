class sumOfDigits{
      public static void main(String args[]){
             int number=12346712;
             int sum=0;
             approach1(number,sum);
             System.out.println(recursion(number,sum));
             System.out.println(recursion2(number));
             }

      static void approach1(int number,int sum){
               while(number!=0){
                     int rem=number%10;
                     sum=sum+rem;
                     number=number/10;
                     }

              System.out.println(sum);
                  }


     static int recursion(int number,int sum){
            if(number==0){
              return sum;
               }

            sum=sum+(number%10);
            return recursion(number/10,sum);
              }


    static int recursion2(int number){
           if(number==0){
              return 0;
             }

           return number%10+recursion2(number/10);
             }
          }
     