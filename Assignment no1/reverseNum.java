class Reverse{
      public static void main(String args[]){
             int num=120;
             System.out.println(ReverseNum(num));
             }
      static int ReverseNum(int num){
             int reverse=0;
         
             while(num!=0){
                
                   reverse=reverse*10+num%10;
                   num=num/10;
                   }
            return reverse;
            }
        }
