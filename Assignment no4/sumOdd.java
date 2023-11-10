class oddSum{
      public static void main(String args[]){
             int number=92945;
             int sum=0;
              
             System.out.println(sumOdd(number,sum));
             }

      static int sumOdd(int number,int sum){
             if(number==0){
                return sum;
               }

            int rem=number%10;
            if(rem%2==1){
               sum=sum+rem;
             }

            return sumOdd(number/10,sum);
         }
     }