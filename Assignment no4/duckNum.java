class DuckNum{
      public static void main(String args[]){
             int num=1010;
            
             System.out.println(DuckNumber(num));
             System.out.println(Recursion(num));
             }

       static boolean DuckNumber(int num) {
          while (num > 0) {
              int digit = num % 10;
               if (digit == 0) {
                   return true;
                       }
              num = num / 10;
        }

      
        return false;
    }


      static boolean Recursion(int num){

             if(num==0){
               return false;
              }

             int rem=num%10;
             

             if(rem==0){
               return true;
               }

            
            return Recursion(num/10);

              }
            


               

}