//Write a console program in a class named Weather that reads an input file of temperatures, with real numbers representing //daily high temperatures such as:

//16.2   23.2
   19.2 7.7  22.9

//18.4  -1.6 14.6
//Your program should prompt for the file name to read, then read its data and print the change in temperature between each //pair of neighboring days.

//Input file? weather.txt 
//16.2 to 23.2, change = 7.0
//23.2 to 19.2, change = -4.0
//19.2 to 7.7, change = -11.5
//7.7 to 22.9, change = 15.2
//22.9 to 18.4, change = -4.5
//18.4 to -1.6, change = -20.0
//-1.6 to 14.6, change = 16.2
//If there are any non-numeric tokens of input in the file, your program should skip over them and ignore them. You may assume //that the user types the name of a file that exists and is readable.

//Yet another infinite loop...

import java.io.*;
import java.util.*;
public class Weather {
  public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String file = input.next();
        File readFile = new File(file);
        int temp1 = 0;
        int temp2 = 0;
        int tempChange = 0;
        
        while(input.hasNext()){
            int count = 0;
            if(input.hasNextInt()){
               temp1 = input.nextInt();
               temp2 = input.nextInt();
               tempChange = temp1 - temp2; 
                count ++;
            }
            else{
                   input.next(); 
                }
            if(count == 0){
              break;
            }
       }
       System.out.println(temp1 + " to " + temp2+ ", change = " + tempChange);
   }
}
         
