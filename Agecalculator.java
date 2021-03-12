package project1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Agecalculator {


	public static void main(String[] args) throws ParseException {
		//String s = "1999/11/08";
				Scanner scan = new Scanner(System.in);
				System.out.println("Please enter your year of birth: ");
				int y = scan.nextInt();
				System.out.println("Please enter the month of birth");
				int m = scan.nextInt();
				System.out.println("Please enter your day of birth");
				int day = scan.nextInt();
				scan.close();
				String input = y+"/"+m+"/"+day;
				  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
				  Date d = sdf.parse(input);
				  Calendar calendar = Calendar.getInstance();
				  calendar.setTime(d);
				  int year = calendar.get(Calendar.YEAR);
				  int month = calendar.get(Calendar.MONTH) + 1;
				  int date = calendar.get(Calendar.DATE);
				  LocalDate birthday = LocalDate.of(year, month, date);
				  LocalDate presentday = LocalDate.now();
				  Period period = Period.between(birthday, presentday);
				  System.out.println(birthday);
				  System.out.println(presentday);
				  System.out.println("age:" + period.getYears() + " years");

	}

}
