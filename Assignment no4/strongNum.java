class StrongNumber{
      public static void main(String args[]){
              int num=145;
              int sum=0;
              
              int temp=num;
              System.out.println(StrongNum(num,temp,sum));
              System.out.println(recursion(num,temp,sum));
              }

     static boolean StrongNum(int num,int temp,int sum){
             
             while(num!=0){
                   int product=1;
                   int rem=num%10;
                   for(int i=1;i<=rem;i++){
                       product=product*i;
                       }
                   sum=sum+product;
                   num=num/10;
                 }

             return temp==sum;
             }

   static int factorial(int num){
          if(num==0){
             return 1;
            }

         return num*factorial(--num);
       }



    static boolean recursion(int num,int temp,int sum){
           
           if(num==0){
              return temp==sum;
             }

           int rem=num%10;
           int fact=factorial(rem);
           sum=sum+fact;
           return recursion(num/10,temp,sum);

        }      
             
     }        