import java.util.Scanner;
import java.util.Random;
public class Horoscope {
    Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Boolean keepGoing = true;
        while(keepGoing) {
            int userBirthMonth = 0;
            int userBirthDay = 0;
    
            System.out.println("Please enter your birth month (1-12).");
            userBirthMonth = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Please enter the day of the month that you were born.");
            userBirthDay = keyboard.nextInt();
            // Call method for determining zodiac sign, pass in users month # and day #
            System.out.println("Your zodiac sign is: " + ZodiacLookup(userBirthMonth, userBirthDay));
            System.out.println(HoroscopeGenerator());
            keepGoing = Continue();
        }
        keyboard.close();
    }

    public static Boolean Continue() {
        Boolean valid = false;
        Boolean returnedResponse = false;
        String userResponse = "";
        Scanner keyboard = new Scanner(System.in);
        while(!valid) {
            System.out.println("Would you like to get another horoscope? (y/n)");
            userResponse = keyboard.nextLine();
            if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("n")) {
                if (userResponse.equalsIgnoreCase("y")) {
                    valid = true;
                    returnedResponse = true;
                }
                else {
                    valid = true;
                    returnedResponse = false;
                }
            }
            else {
                System.out.println("Please enter a valid response");
            }
        }
        return returnedResponse;
    }

    public static String ZodiacLookup(int month, int day) {
        int dayOfYear = 0;
        String zodiac = "";
        // using month # and day of month # for user birth date determine which day of the year
        if (month == 1) {
            dayOfYear = day;
        }
        else if(month == 2) {
            dayOfYear = 31 + day;
        }
        else if(month == 3) {
            dayOfYear = 31 + 28 + day;
        }
        else if(month == 4) {
            dayOfYear = 31 + 28 + 31 + day;
        }
        else if(month == 5) {
            dayOfYear = 31 + 28 + 31 + 30 + day;
        }
        else if(month == 6) {
            dayOfYear = 31 + 28 + 31 + 30 + 31 + day;
        }
        else if(month == 7) {
            dayOfYear = 31 + 28 + 31 + 30 + 31 + 30 + day;
        }
        else if(month == 8) {
            dayOfYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
        }
        else if(month == 9) {
            dayOfYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
        }
        else if(month == 10) {
            dayOfYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
        }
        else if(month == 11) {
            dayOfYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
        }
        else {
            dayOfYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
        }
        
        // If statements to find zodiac based on day of year the user was born
        if (dayOfYear > 356 || dayOfYear <= 20) {
            zodiac = "Capricorn";
        }
        else if (dayOfYear > 20 && dayOfYear <= 50) {
            zodiac = "Aquarius";
        }
        else if (dayOfYear > 50 && dayOfYear <= 80) {
            zodiac = "Pisces";
        }
        else if (dayOfYear > 80 && dayOfYear <= 110) {
            zodiac = "Aries";
        }
        else if (dayOfYear > 110 && dayOfYear <= 141) {
            zodiac = "Taurus";
        }
        else if (dayOfYear > 141 && dayOfYear <= 172) {
            zodiac = "Gemini";
        }
        else if (dayOfYear > 172 && dayOfYear <= 204) {
            zodiac = "Cancer";
        }
        else if (dayOfYear > 204 && dayOfYear <= 235) {
            zodiac = "Leo";
        }
        else if (dayOfYear > 235 && dayOfYear <= 266) {
            zodiac = "Virgo";
        }
        else if (dayOfYear > 266 && dayOfYear <= 296) {
            zodiac = "Libra";
        }
        else if (dayOfYear > 296 && dayOfYear <= 326) {
            zodiac = "Scorpio";
        }
        else {
            zodiac = "Sagittarius";
        }
        return zodiac;
    }

    public static String HoroscopeGenerator() {
        Random r = new Random();
        int randomNumber = r.nextInt(6) +1;
        String[] horoscopes = {
            "If you think you're spending too much time slacking, then study it out and do the right thing. Bear in mind that nobody can hold you down but yourself.",
            "Are you wondering about talking to your significant other? This week is ultimately a turning point in your life and you'll know what to do. You feel emotionally centered and ready for almost anything.",
            "Your next Career: Taxidermist. Buy a box of fake eyeballs. You'll thanks us later.",
            "After months of backbreaking effort, you'll finally finish your first novel. Now, imagine how difficult it would be to actually write one.",
            "Just when you finally have all the answers, someone has changed all the questions.",
            "Are you wondering about taking a big step in a new direction? The coming week might be the day you became YOU and you'll have to make a decision."
        };
        return horoscopes[randomNumber];
    }
}