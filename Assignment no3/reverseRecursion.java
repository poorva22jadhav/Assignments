class palindrome{
      public static void main(String args[]){
             int number=121;
             int temp=number;
             int reverse=0;
             System.out.println(approach1(number));
             System.out.println(recursion(number,temp,reverse));
             }

     static boolean approach1(int number){
            int reverse=0;
            int temp=number;
            while(temp!=0){
                  int rem=temp%10;
                  reverse=reverse*10+rem;
                  temp=temp/10;
                  }
            if(reverse==number){
               return true;
              }
            else{
               return false;
                }
               }


   static boolean recursion(int number,int temp,int reverse){
          if(temp==0){
             return number==reverse;    
            }
         reverse=reverse*10+temp%10;
         return recursion(number,temp/10,reverse);
            }
          
           }
                  
             