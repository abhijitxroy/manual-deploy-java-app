import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {

		LocalDate curentDate = LocalDate.now();
		LocalDate myDob = LocalDate.of(1989, 8, 02);
		Period myPeriod = Period.between(myDob, curentDate);

		System.out.println("Age : " + myPeriod.getYears() + " years, " + myPeriod.getMonths() + " months and "
				+ myPeriod.getDays() + " days.");
		System.out.println("You are " + myPeriod.getYears() + " years old.");

		LocalDate customDate = LocalDate.parse("02-08-1989", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		Period customPeriod = Period.between(customDate, curentDate);
		System.out.println("Age : " + customPeriod.getYears() + " years, " + customPeriod.getMonths() + " months and "
				+ customPeriod.getDays() + " days.");
		System.out.println("You are : " + customPeriod.getYears() + " years old.");

	}
}
