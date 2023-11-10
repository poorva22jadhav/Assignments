class HarshadNumber{
      public static void main(String args[]){
             int num=12;
             int temp=num;
             int sum=0;
             boolean result=HarshadNum(num);
             boolean result2=Recursion(num,temp,sum);
             System.out.println(result2);
             }

      static boolean HarshadNum(int num){
             int sum=0;
             int temp=num;

             while(temp!=0){
               sum=sum+temp%10;
               temp=temp/10;
              }

            return num%sum==0;
                  }


    static boolean Recursion(int num,int temp,int sum){
           if(temp==0){
             return num%sum==0;
              }

           int rem=temp%10;
           sum=sum+rem;
           return Recursion(num,temp/10,sum);
           }
        }
             
             