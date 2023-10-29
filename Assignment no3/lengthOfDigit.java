class lengthOfDigit{
      public static void main(String args[]){
             int N=1234;
             int count=0;
             System.out.println(digits(N));
             System.out.println(recursion(N,count));
             }

     static int digits(int N){
            int count=0;
            while(N!=0){
                  N=N/10;
                  count++;
                 }

           return count;
           }


    static int recursion(int N,int count){
           if(N==0){
             return count;
             }
           N=N/10;
           count++;
           return recursion(N,count);
           
           

           
         }
       }          