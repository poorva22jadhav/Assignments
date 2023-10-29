class prime{
      public static void main(String args[]){
             int N=20;
             int count=0;
             int i=1;
             System.out.println(approach1( N));
             System.out.println( recursion(N,count,i));
             }

      static boolean approach1(int N){
             int count=0;
             for(int i=1;i<=N;i++){
                if(N%i==0){
                  count++;
                   }

                 }

             return count==2;

             }

    static boolean recursion(int N,int count,int i){
           if(i==N+1){
             return count==2;
              }

           if(N%i==0){
              count++;
             }

           return recursion(N,count,++i);
          
         }

     }