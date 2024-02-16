
package dummybox;
import java.util.Scanner;
/**
 *@author Ahmet Batuhan YÜRÜDÜR, byurudur
 * @author Furkan Aydemir, deerborg
 * @since 2024
 */

public class uCard {
    
    private String information;
    private String fullName;
    private int year;
    private int day;
    private int month;
    private int birthDay;
    private String horoscope;
    private int age;
    private String hobbies;
    private String status;
    private double longLine;
    private double shortLine;
    private double line;
    private double feedBack;
    private String bracket;
    private String object;
    private double radius;
    private double kilogram;
    private double height;
    private int crapGame;
    
    // Program usege
    public void information(){
        bracket();
        System.out.println("** This program was written to describe and develop constructor and OOP topics. You can edit and improve the given methods. **");
        System.out.println("** The use of methods is stated below. **");
        bracket();
        System.out.println("How to use: uCard example = new uCard()");
        bracket();
        System.out.println("To create a card : example.create_card() -- It creates a card with the information it requests from you.");
        bracket();
        System.out.println("Horoscope information: example.horoscope(int day, int month) -- Calculates your horoscope with day and month information.");
        bracket();
        System.out.println("Age information: example.age(int year) -- Only year - 2024");
        bracket();
        System.out.println("Birthday information: example.birhtDay(int year, int month, int day) -- It just concatenates the given values.");
        bracket();
        System.out.println("Area calculation: example.area_calculation()  -- It calculates the area based on the object and value you provide.");
        bracket();
        System.out.println("BMI calculation: exmaple.bmi_calculation() -- It calculates the bmi values ");
        bracket();
    }
    // Method to create profile card, saves the given information. And it prints out the info
    public void create_card(){
        System.out.println("START THE DUMMY AI");
        bracket();
        Scanner value = new Scanner(System.in);
        System.out.println("Can you tell me your name and surname?");
        this.fullName = value.nextLine();
        System.out.println("Thank you, I started preparing your card.");
        while(true){
            System.out.println("I was wondering about your zodiac sign, can you write in which year you were born? For example, 1990.");
            this.year = value.nextInt();
            if(year <= 1900){
                System.out.println("You're really old, were there horoscopes back then? I don't know, I couldn't calculate it.");
                System.out.println("I have to ask you again.");
                continue;
            }break;
        }
        while(true){
            System.out.println("Yes, I save it. Can you write the month you were born now? For example 11.");
            this.month = value.nextInt();
            if(month > 13 || month <= 0){
                System.out.println("Like the Mayan calendar? You're taking me too seriously. I'm a stupid creator(for the program). The values ​​I need are between 1 and 12. January February March...");
                System.out.println("I have to ask you again.");
                continue;
            }break;
        }
        while(true){
            System.out.println("Hmm, we're getting closer. Can you write the day you were born? For example 21.");
            this.day = value.nextInt();
            if(day > 30 || day <= 0){
                System.out.println("We were so close. They said that the new operation in CS2 would come on February 33. I was confused at the time.");
                System.out.println("I have to ask you again.");
                continue;
            }break;
        }
        System.out.println("I think I know your zodiac sign. I will use this when creating your personal card.");
        System.out.println("There should be information density in this card. Can you write what your hobbies are?");
        Scanner habbiesValue = new Scanner(System.in);
        this.hobbies = hobbiesValue.nextLine();
        System.out.println("What are you working on right now? For example, I am learning Java.");
        this.status = value.nextLine();
        System.out.println("I'm creating your card... I'm working on it... I think I'm succeeding!");
       // Horoscope calculation
       if(month == 3 && day >= 21 || month == 4 && day <= 20){
           this.horoscope = "Aries";
       }
       if(month == 4 && day >= 21 || month == 5 && day <= 20){
           this.horoscope = "Taurus";
       }
       if(month == 5 && day >= 21 || month == 6 && day <= 20){
           this.horoscope = "Gemini";
       }
       if(month == 6 && day >= 21 || month == 7 && day <= 20){ 
           this.horoscope = "Cancer";
       }
       if(month == 7 && day >= 21 || month == 8 && day <= 20){ 
           this.horoscope = "Leo";
       }
       if(month == 8 && day >= 21 || month == 9 && day <= 20){
           this.horoscope = "Virgo";
       }
       if(month == 9 && day >= 21 || month == 10 && day <= 20){
           this.horoscope = "Libra";
       }
       if(month == 10 && day >= 21 || month == 11 && day <= 20){
           this.horoscope = "Scorpio";
       }
       if(month == 11 && day >= 21 || month == 12 && day <= 20){
           this.horoscope = "Sagittarius";
       }
       if(month == 12 && day >= 21 || month == 1 && day <= 20){
           this.horoscope = "Capricorn";
       }
       if(month == 1 && day >= 21 || month == 2 && day <= 20){
           this.horoscope = "Aquarius";
       }
       if(month == 2 && day >= 21 || month == 3 && day <= 20){
           this.horoscope = "Pisces";
       }
       // Card printout
        System.out.println("__________________________________________");
        System.out.println("Name and Surname: " + fullName);
        System.out.println("Your Horoscope: " + horoscope);
        System.out.println("Your Birthday: " + day + "/" + month + "/" + year);
        System.out.println("Your Hobbies: " + hobbies);
        System.out.println("Nowadays " + status + " you are trying");
        bracket();
        System.out.println("Was I successful in creating your card? Your feedback is important to me. How many points would you give me? 1-100.");
        // Feedback and scoring
        this.feedBack = value.nextDouble();
        if(feedBack >= 80){
            System.out.println(feedBack +" Wow! Was I that good?");
            bracket();
        }
        else if(feedBack <= 79 && feedBack > 59){
            System.out.println(feedBack +" Help me develop. https://github.com/deerborg");
            bracket();
        }
        else if(feedBack < 59){
            System.out.println(feedBack +" Please let me know. https://github.com/deerborg");
            bracket();
        }
        System.out.println("Please also try BMI and area calculation methods.");
        bracket();
        System.out.println("example.area_calculation & example.BMI_calcualtion");
  
    }
    // Basic age calculation
    public void age(int year){
        System.out.println("Age: " + (2024 - year));
    }
    // Basic birthday printout
    public void birthDay(int year, int month, int day){
        System.out.println("Your Birthday: " + day + "/" + month + "/" + year);
    }
    // Horoscope calculation method
    public void horoscope(int day, int month){
        
        if(month == 3 && day >= 21 || month == 4 && day <= 20){
           this.horoscope = "Aries";
           System.out.println("Your Horoscope: " + horoscope);
       }
       if(month == 4 && day >= 21 || month == 5 && day <= 20){
           this.horoscope = "Taurus";
           System.out.println("Your Horoscope: " + horoscope);
       }
       if(month == 5 && day >= 21 || month == 6 && day <= 20){
           this.horoscope = "Gemini";
           System.out.println("Your Horoscope: " + horoscope);
       }
       if(month == 6 && day >= 21 || month == 7 && day <= 20){ 
           this.horoscope = "Cancer";
           System.out.println("Your Horoscope: " + horoscope);
       }
       if(month == 7 && day >= 21 || month == 8 && day <= 20){ 
           this.horoscope = "Leo";
           System.out.println("Your Horoscope: " + horoscope);
       }
       if(month == 8 && day >= 21 || month == 9 && day <= 20){
           this.horoscope = "Virgo";
           System.out.println("Your Horoscope: " + horoscope);
       }
       if(month == 9 && day >= 21 || month == 10 && day <= 20){
           this.horoscope = "Libra";
           System.out.println("Your Horoscope: " + horoscope);
       }
       if(month == 10 && day >= 21 || month == 11 && day <= 20){
           this.horoscope = "Scorpio";
           System.out.println("Your Horoscope: " + horoscope);
       }
       if(month == 11 && day >= 21 || month == 12 && day <= 20){
           this.horoscope = "Sagittarius";
           System.out.println("Your Horoscope: " + horoscope);
       }
       if(month == 12 && day >= 21 || month == 1 && day <= 20){
           this.horoscope = "Capricorn";
           System.out.println("Your Horoscope: " + horoscope);
       }
       if(month == 1 && day >= 21 || month == 2 && day <= 20){
           this.horoscope = "Aquarius";
           System.out.println("Your Horoscope: " + horoscope);
       }
       if(month == 2 && day >= 21 || month == 3 && day <= 20){
           this.horoscope = "Pisces";
           System.out.println("Your Horoscope: " + horoscope);
       }
    }
    // Area calculation method
    public void area_calculation(){
        double pi = 3.14;
       while(true){
           System.out.println("Which geometric object do you want to calculate the area of? Square, rectangle or circle? If you want to exit, type (Q).");
           System.out.println("Please specify in writing. For example square");
           Scanner value = new Scanner(System.in);
           this.object = value.nextLine();
           if(object.equals("Q") || object.equals("q")){
                   System.out.println("Exiting..");
                   break;
               }
           while(true){
               // Square area
               if(object.equals("square") || object.equals("Square")){
               System.out.println("Enter the side length.");
               this.line = value.nextDouble();
               if(line <= 0){
                   System.out.println("It cannot be less than 0.");
                   continue;
               }
               System.out.println("Area: " + (line*line));break;
           }
               // Rectangle area
               else if(object.equals("rectangle") || object.equals("Rectangle")){
                System.out.println("Enter the long side.");
                this.longLine = value.nextDouble();
                 if(longLine <= 0){
                   System.out.println("It cannot be less than 0.");
                   continue;
               }
                   System.out.println("Enter the short side");
                   this.shortLine = value.nextDouble();
                   if(shortLine <= 0 || shortLine > longLine){
                   System.out.println("It cannot be less than 0 and the short side cannot be greater than the long side value.");
                   continue;
               }System.out.println("Area: " + (longLine*shortLine));break;
               }
               // Circle area
               else if(object.equals("circle") || object.equals("Circle")){
                   System.out.println("Enter the radius.");
                   this.radius = value.nextDouble();
                   if(radius <= 0){
                       System.out.println("It cannot be less than 0.");
                       continue;
                   }
                   System.out.println("Area: " + (pi*(radius*radius)));break;
               }
               // Wrong value
               else {
                   bracket();
                   System.out.println("Make sure you wrote it correctly. ");
                   System.out.println("Square");
                   System.out.println("Rectangle");
                   System.out.println("Circle");
                   bracket();break; 
               }
         }
      } 
    }
    // BMI calculation method
    public void bmi_calculation(){
        System.out.println("Enter your kilgoram:");
        Scanner value = new Scanner(System.in);
        this.kilogram = value.nextDouble();
        
        System.out.println("Enter your height in meters:");
        this.height = value.nextDouble();
        double bmi = kilogram / (height*height) ;
        if(bmi <= 18.4){
            System.out.println("Underweight " + bmi);
        }
        else if (bmi > 18.5 && bmi <= 24.9){
            System.out.println("Normal " + bmi);
        }
        else if(bmi > 25){
            System.out.println("Obese " + bmi);
        } 
    }
    public void crap_game(){

            //Explaining the craps game to the user.

            System.out.println("Craps is a type of dice game. It is played with two dice. " +
                    "The dice are rolled and you win or lose depending on the outcome.\n" +
                    "A sum of 7 directly loses the bet.\n");

            System.out.println("To win, you must roll 6-6, 5-5, or 3-3. " +
                    "The losing dice are 4-4, 2-2, 1-1. " +
                    "Good luck!");

            //Creating a random for dices.


            Random rand = new Random();
            // Determining the computer's dice.
            int rand_dice1 = rand.nextInt(6)+1;
            int rand_dice2 = rand.nextInt(6)+1;
            int rand_dice3 = rand.nextInt(6)+1;
            int rand_dice4 = rand.nextInt(6)+1;


            //Output the dice and win-lose information with if blocks.
            System.out.println("The computer's dices are " + rand_dice1 + " - " + rand_dice2);
            System.out.println("Your dices are " + rand_dice3 + " - " + rand_dice4);

            //Arranging the conditionals due to craps rule.
            if(     rand_dice1 == 3 && rand_dice2 == 3
                    || rand_dice1 == 5 && rand_dice2 == 5
                    || rand_dice1 == 6 && rand_dice2 == 6){
                System.out.println("Computer wins the bet.");
            } else if (rand_dice3 == 3 && rand_dice4 == 3
                    || rand_dice3 == 5 && rand_dice4 == 5
                    || rand_dice3 == 6 && rand_dice4 == 6) {
                System.out.println("You win the bet.");
            }else if (rand_dice1 == 1 && rand_dice2 == 1
                    || rand_dice1 == 2 && rand_dice2 == 2
                    || rand_dice1 == 4 && rand_dice2 == 4){
                System.out.println("You win the bet. ");
            } else if (rand_dice3 == 1 && rand_dice4 == 1
                    || rand_dice3 == 2 && rand_dice4 == 2
                    || rand_dice3 == 4 && rand_dice4 == 4) {
                System.out.println("You lost the bet. Try again.");
            }else if (rand_dice1 == rand_dice3 && rand_dice2 == rand_dice4
                    || rand_dice1 + rand_dice2 == 7 && rand_dice3 + rand_dice4 == 7){
                System.out.println("What a luck, it is a tie.");
            } else if (rand_dice1 + rand_dice2 == 7) {
                System.out.println("You win. Computer had a hard 7.");
            } else if (rand_dice3 + rand_dice4 == 7) {
                System.out.println("Computer wins. It's a seven.");
            } else if (rand_dice1 == 1 && rand_dice2 == 1
                    || rand_dice1 == 2 && rand_dice2 == 2
                    || rand_dice1 == 4 && rand_dice2 == 4
                    && rand_dice3 + rand_dice4 == 7) {
                System.out.println("Computer wins. 7 loses directly.");
            } else if (rand_dice3 == 1 && rand_dice4 == 1
                    || rand_dice3 == 2 && rand_dice4 == 2
                    || rand_dice3 == 4 && rand_dice4 == 4
                    && rand_dice1 + rand_dice2 == 7) {
                System.out.println("You win. 7 loses directly.");
            } else{
                System.out.println("Spent dices. No winners or losers.");
            }


        }
        }
    }
    // Bracket for printout
    public void bracket(){
        System.out.println("--------------------------------------");
    }
    // End methods

    /**
     * @return the information
     */
    public String getInformation() {
        return information;
    }

    /**
     * @param information the information to set
     */
    public void setInformation(String information) {
        this.information = information;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the birthDay
     */
    public int getBirthDay() {
        return birthDay;
    }

    /**
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * @return the horoscope
     */
    public String getHoroscope() {
        return horoscope;
    }

    /**
     * @param horoscope the horoscope to set
     */
    public void setHoroscope(String horoscope) {
        this.horoscope = horoscope;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the hobbies
     */
    public String getHobbies() {
        return hobbies;
    }

    /**
     * @param hobbies the hobbies to set
     */
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the longLine
     */
    public double getLongLine() {
        return longLine;
    }

    /**
     * @param longLine the longLine to set
     */
    public void setLongLine(double longLine) {
        this.longLine = longLine;
    }

    /**
     * @return the shortLine
     */
    public double getShortLine() {
        return shortLine;
    }

    /**
     * @param shortLine the shortLine to set
     */
    public void setShortLine(double shortLine) {
        this.shortLine = shortLine;
    }

    /**
     * @return the line
     */
    public double getLine() {
        return line;
    }

    /**
     * @param line the line to set
     */
    public void setLine(double line) {
        this.line = line;
    }

    /**
     * @return the feedBack
     */
    public double getFeedBack() {
        return feedBack;
    }

    /**
     * @param feedBack the feedBack to set
     */
    public void setFeedBack(double feedBack) {
        this.feedBack = feedBack;
    }
    
    
    
}
