class palindrome{
      public static void main(String args[]){
             int num=1212;
             int reverse=0;
             int temp=num;
             System.out.println(palindrome(num,temp,reverse));
             }

       static boolean palindrome(int num,int temp,int reverse){
              if(num==0){
                 return temp==reverse;
                 }

             reverse=reverse*10+num%10;
             return palindrome(num/10,temp,reverse);
             }
          }