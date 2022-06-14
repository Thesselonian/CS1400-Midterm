import java.util.Scanner;
public class Horoscope {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userBirthMonth = 0;
        int userBirthDay = 0;
        

        System.out.println("Please enter your birth month (1-12).");
        userBirthMonth = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Please enter the day of the month that you were born.");
        userBirthDay = keyboard.nextInt();
        // Call method for determining zodiac sign, pass in users month # and day #
        System.out.println("Your zodiac sign is: " + ZodiacLookup(userBirthMonth, userBirthDay));
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
}