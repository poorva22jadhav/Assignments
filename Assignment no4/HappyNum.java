class HappyNumber{
      public static void main(String args[]){
             int num=19;
             System.out.println(HappyNum(num));
             System.out.println(recursion(num));
             }

      static boolean HappyNum(int num){
             int sum=0;

         while(num>9){

             while(num!=0){
               int rem=num%10;
               sum=sum+(rem*rem);
               num=num/10;
               }

             num=sum;
             sum=0;
            
            }

        return num==1;
           }


      static boolean recursion(int num){
             if(num<10){
               return num==1;
              }

             int sum=0;
             while(num!=0){
               int rem=num%10;
               sum=sum+(rem*rem);
               num=num/10;
              }

             return recursion(sum);
              
         }

    }          