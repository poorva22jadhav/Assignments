class CompositeNumber{
      public static void main(String args[]){
             int num=12;
             int factor=0;
             int i=1;
             System.out.println(Recursion(num,factor,i));
             System.out.println(CompositeNum(num));
             }

      static boolean CompositeNum(int num){
             int factor=0;
             for(int i=1;i<=num;i++){
                if(num%i==0){
                  factor++;
                 }
             }

             return factor>2;
                }


     static boolean Recursion(int num,int factor,int i){
            if(i==num+1){
              return factor>2;
             }

            if(num%i==0){
               factor++;
              }

            return Recursion(num,factor,++i);
             }

           }