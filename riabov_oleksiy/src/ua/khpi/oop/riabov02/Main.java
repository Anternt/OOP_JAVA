package ua.khpi.oop.riabov02;

public class Main {
  public static void main(String[] args) {
     
    double rand_num;
    int x;
    System.out.println("      Number    |  Sum Even  \t|   Sum Odd    |");
      System.out.println("________________|_______________|______________|");
    for(int i=0;i<10;i++)
    {
      rand_num = Math.random()*100000000;
      x =  (int)rand_num;
      task(x);
      System.out.println("________________|_______________|______________|");
    }

      }
  
  public static void task(int x)
  { 
    int even = 0;
    int odd = 0;
    int numb = 0;
    System.out.print("     " + x ) ;
        while(x!=0)
        {
          numb = x%10;
          if(numb%2 == 0)
            even+=numb;
          else 
            odd+=numb;
          x /=10;
        }
        System.out.println( "\t|\t " + even + "\t|\t " + odd+"    |"); 
        return;
  }
   
}
