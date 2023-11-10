class SadNum{
      public static void main(String args[]){
             int num=8;
             
             System.out.println(Recursion(num));
             System.out.println(SadNum(num));
             }

      static boolean SadNum(int num){
             int sum=0;
             int temp=num;

            while(temp>10){
                 sum=0;
              while(temp!=0){
                 int rem=temp%10;
                 sum=sum+(rem*rem);
                 temp=temp/10;
                }

           temp=sum;
                }

           return temp==4;
                  }


       static boolean Recursion(int temp){
              int sum=0;
              

              if(temp<10){
                return temp==4;
                   }

              while(temp!=0){
                    int rem=temp%10;
                    sum=sum+(rem*rem);
                    temp=temp/10;
                } 

              temp=sum;
              return Recursion(temp);
              
               }


             }
            

   