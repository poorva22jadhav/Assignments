class AbundantNum{
      public static void main(String args[]){
             int num=14;
             int sum=0;
             int i=1;
             System.out.println(Recursion(num,sum,i));
             System.out.println(AbundantNum(num));
             }

      static boolean AbundantNum(int num){
             int sum=0;
             for(int i=1;i<num;i++){
                if(num%i==0){
                  sum=sum+i;
                  }
               }

            return sum>num;
          }

      static boolean Recursion(int num,int sum,int i){
             if(i==num){
               return sum>num;
              }

            if(num%i==0){
              sum=sum+i;
              }

           return Recursion(num,sum,++i);
          }
       }
 
