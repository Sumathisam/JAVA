 class AlternatePrimeNumbers {
 public static void main(String[]args)
 { 
 int num = 20;
 Systeam.out.print(Alternate Prime Numbers up to " + num+ "are: ");
 printAlternatePrimeNumber(num);
 }
 static int checkPrime(int num)
 {
 int i, flag = 0;
 for(i = 2; i<=num / 2; i++)
 {
 if(num % i ==0)
 {
 flag = 1;
 break;
 }
 }
 if(flag ==0)
 return 1;
 else
 return 0;
 }
 static void printAlternatePrimeNumber(int n)
 {
 int temp = 2;
 for(int num = 2; num <= n-1; num++)
 {
 if (checkprime(num)==1)
 {
 if (temp % 2 ==0)
 Systeam.out.print(num + "");
 temp ++;
 }
 }
 }
 }