//Write a console program in a class named Election that prompts for the name of, and then reads, a file of poll data about two candidates in an election. Each line of the file contains data from one state or region in the election, along with the percentage of the vote that each candidate won. The data will be provided in the following format:

//State  Candidate1%  Candidate2%  ElectoralVotes  Pollster
//CT 56 31 7 Oct U. of Connecticut
//NE 37 56 5 Sep Rasmussen
//AZ 41 49 10 Oct Northern Arizona U.
//...
//For example, in the data above, Candidate 1 won Connecticut with 56% of the vote, earning 7 electoral votes in the process. Candidate 2 won NE and AZ earning 5 + 10 = 15 electoral votes. And so on.

//Your program should prompt for the file name to read, then read its data and print how many electoral votes each candidate leads in, and who is leading overall in the polls. If the two candidates tie in a given region, don't give anybody those votes.

//Input file? polls.txt 
//Candidate 1: 325 votes
//Candidate 2: 183 votes
//You may assume that the user types the name of a file that exists and is readable, and that the data is in the valid format shown above.

import java.io.*;
import java.util.*;
public class Election {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String file = input.next();
        File readFile = new File(file);
        int candidate1 = 0;
        int candidate2 = 0;
    
        while(input.hasNext()){
            if(input.hasNextInt()){
                candidate1 = input.nextInt();
                candidate2 = input.nextInt();
                int eVotes = input.nextInt();
                if(candidate1 > candidate2) {
                    candidate1 = candidate1 + eVotes;
                }else if(candidate2 > candidate1){
                    candidate2 = candidate2 + eVotes;
                }else if(candidate1 == candidate2){
                    System.out.println("The poll was a tie.");
                }else{
                    input.next();
                }
            }//correct output just infinite loop :(
        }
        System.out.println("Candidate 1: " + candidate1 + " votes");
        System.out.println("Candidate 2: " + candidate2 + " votes");
           
    }
}
