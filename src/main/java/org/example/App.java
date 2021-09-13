package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Vishal Choday

Exercise 23 - Troubleshooting Car Issues
        An expert system is a type of artificial intelligence program that uses a knowledge base and a set of rules to perform a task that a human expert might do. Many websites are available that will help you self-diagnose a medical issue by answering a series of questions. And many hardware and software companies offer online troubleshooting tools to help people solve simple technical issues before calling a human.

        Create a program that walks the user through troubleshooting issues with a car. Use the following decision tree to build the system:

@startuml
if (Is the car silent when you turn the key?) then (yes)
        if (Are the battery terminals corroded?) then (yes)
        :Clean terminals and try starting again.;
        stop
        else (no)
        :Replace cables and try again.;
        stop
        endif
        else (no)
        if (Does the car make a slicking noise?) then (yes)
        :Replace the battery.;
        stop
        else (no)
        if (Does the car crank up but fail to start?) then (yes)
        :Check spark plug connections.;
        stop
        else (no)
        if (Does the engine start and then die?) then (yes)
        if (Does you car have fuel injection?) then (yes)
        :Get it in for service.;
        stop
        else (no)
        :Check to ensure the choke is opening and closing.;
        stop
        endif
        else (no)
        :This should not be possible.;
        stop
        endif
        endif
        endif
        endif
@enduml
Example Output
        Is the car silent when you turn the key? y
        Are the battery terminals corroded? n
        Replace cables and try again.
*/
import java.util.Scanner;
import static java.lang.System.exit;
public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String First_Answer = input.nextLine();

        if(First_Answer.equals("y") || First_Answer.equals("Y")){
            System.out.print("Are the battery terminals corroded? ");
            String Answer_Two = input.nextLine();


            if(Answer_Two.equals("y") || First_Answer.equals("Y")){
                System.out.println("Clean terminals and try starting again.")
                ;
                exit(0);
            }else
            {
                System.out.println("Replace cables and try again.");
                exit(0);
            }
        }else
        {
            System.out.print("Does the car make a slicking noise? ");
            String Third_Answer = input.nextLine();

            if(Third_Answer.equals("y") || Third_Answer.equals("Y")){
                System.out.println("replace the battery");
                exit(0);
            }else
            {
                System.out.print("Does the car crank up and fail to start? ");
                String ForthAnswer = input.nextLine();

                if(ForthAnswer.equals("y") || First_Answer.equals("Y")){
                    System.out.println("Check the spark plug connection.");
                    exit(0);
                }else
                {
                    System.out.print("Does the engine start and then die? ");
                    String FifthAnswer = input.nextLine();

                    if(FifthAnswer.equals("y") || First_Answer.equals("Y")){
                        System.out.print("Does the car have fuel injection? ");
                        String Sixth_Answer = input.nextLine();

                        if(Sixth_Answer.equals("y") || Sixth_Answer.equals("Y")){
                            System.out.println("Get it in for service.");
                            exit(0);
                        }else
                        {
                            System.out.println("Check to ensure the choke is opening and closing");
                            exit(0);
                        }
                    }else
                    {

                        System.out.println("This should not be possible");
                        exit(0);
                    }
                }
            }
        }
    }
}
