package ua.khpi.oop.riabov01;


class Main 
{
    public static void main(String args[]) 
    { 
      int a1 = 0x141D12;
      long a2 = 380633406623l;
      int a3 = 0b10111;
      int a4 = 14737;
      int a5 = (17 % 26) + 1;
      char b = (char) 64+18; 
      long temp;
      int odd = 0;
      int even = 0;
      int bin = 0;
      temp = a1;
      while (temp > 0) 
      {
        if (temp % 2 == 0) 
        {
          even += 1;
        }
        else 
        {
          odd += 1;
        }
        temp /= 10;      // уменьшение разряда
      }  
      temp = a1;
    while(temp!=0) 
    {
      if(temp%2==1) 
      {
        bin++;
      }
      temp/=2;
    }
      System.out.println("Первое число - " + a1 + "\n" + "В двоичном представлении:" + Integer.toString(a1, 2) + "\n количество чётных ифр: " + even + "\n количество нечётных цифр: " + odd + "\n количество единиц в двоичном представлении: " + bin + "\n");
      odd = 0;
      even = 0;
      bin = 0;
      temp = a2;
      while (temp > 0) 
      {
        if (temp % 2 == 0) 
        {
          even += 1;
        }
        else 
        {
          odd += 1;
        }
        temp /= 10;
      }
      temp = a2;
      while(temp!=0) 
      {
      if(temp%2==1) 
      {
        bin++;
      }
      temp/=2;
    }
      System.out.println("Второе число - " + a2  + "\n" + "В двоичном представлении:" +  Long.toString(a2, 2) +  "\n количество чётных цифр: " + even + "\n количество нечётных цифр: " + odd + "\n количество единиц в двоичном представлении: " + bin + "\n");
      odd = 0;
      even = 0;
      bin = 0;
      temp = a3;
      while (temp > 0) 
      {
        if (temp % 2 == 0) 
        {
          even += 1;
        }
        else 
        {
          odd += 1;
        }
        temp /= 10;
      }
      temp = a3;
      while(temp!=0) 
      {
      if(temp%2==1) 
      {
        bin++;
      }
      temp/=2;
    }
      System.out.println("Третье число - " + a3 + "\n" + "В двоичном представлении:" +  Integer.toString(a3, 2) +  "\n количество чётных цифр: " + even + "\n количество нечётных цифр: " + odd + "\n количество единиц в двоичном представлении: " + bin + "\n");
      odd = 0;
      even = 0;
      bin = 0;
      temp = a4;
      while (temp > 0) 
      {
        if (temp % 2 == 0) 
        {
          even += 1;
        }
        else 
        {
          odd += 1;
        }
        temp /= 10;
      }
      temp = a4;
      while(temp!=0) 
      {
      if(temp%2==1) 
      {
        bin++;
      }
      temp/=2;
    }
      System.out.println("Четвертое число - " + a4 + "\n" + "В двоичном представлении:" + Integer.toString(a4, 2) +  "\n количество чётных цифр: " + even + "\n количество нечётных цифр: " + odd + "\n количество единиц в двоичном представлении: " + bin + "\n");
      odd = 0;
      even = 0;
      bin = 0;
      temp = a5;
      while (temp > 0) 
      {
        if (temp % 2 == 0) 
        {
          even += 1;
        }
        else 
        {
          odd += 1;
        }
        temp /= 10;
      }
      temp = a5;
      while(temp!=0) 
      {
      if(temp%2==1) 
      {
        bin++;
      }
      temp/=2;
    }
      System.out.println("Пятое число - " + a5 + "\n" + "В двоичном представлении:" + Integer.toString(a5, 2) +  "\n количество чётных цифр: " + even + "\n количество нечётных цифр: " + odd + "\n количество единиц в двоичном представлении: " + bin + "\n");
      System.out.println("Символ полученный из пятого числа: " + b + "\n");
    }
  }