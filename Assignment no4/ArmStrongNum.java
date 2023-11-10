class ArmstrongNum{
      public static void main(String args[]){
             int num=370;
             int original=num;
             System.out.println(ArmStrongNum(num));
             
             if (num==recursion(num,original)){
                System.out.println(num+ " is ArmStrong Number");
             }

             else{
                 System.out.println(num+ " is not ArmStrong Number");
                 }
              }

      static boolean ArmStrongNum(int num){
             int temp=num;
             int temp2=num;
             int count=0;
             while(temp!=0){
                count++;
                 temp=temp/10;
                }

             int sum=0;
            
             
             while(num!=0){
                 int rem=num%10;
                  int mult=1;
                 for(int i=0;i<count;i++){
                    mult=mult*rem;
                   }
                 sum=sum+mult;
                 num=num/10;
                }

            return temp2==sum;
          }


     static int countDigits(int n){
            if(n==0){
              return 0;
             }

            return 1+countDigits(n/10);
          }

      static int recursion(int num,int original){
          if (original == 0){
            return 0;
                }

             int rem=original%10;
             
             return (int)(Math.pow(rem, countDigits(num))) + recursion(num, original / 10);
         }
             
       }
                