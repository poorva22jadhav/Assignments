class perfectNumber{
      public static void main(String args[]){
             int num=6;
             int i=1;
             int sum=0;
             System.out.println(perfectNum(num));
             System.out.println(perfectNumber(num,i,sum));
             }

      static boolean perfectNum(int num){
             int sum=0;
             for(int i=1;i<num;i++){
                 if(num%i==0){
                   sum=sum+i;
                    }
                  }

             return num==sum;
               }


     static boolean perfectNumber(int num,int i,int sum){
            if(i==num){
               return num==sum;
                  }

            if(num%i==0){
               sum=sum+i;
             }

           return perfectNumber(num,++i,sum);
                 } 
              } 