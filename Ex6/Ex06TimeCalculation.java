package Ex6;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Ex06TimeCalculation {
	public static void main(String args[]) {
		JourneyDestination journey1 = new JourneyDestination();
		journey1.setTimeDuration(100, 101000, "2023-01-24", "20:59:54");
		ReportArrivalTime.calculateReachtime(journey1);
	}
}

class ReportArrivalTime {
	public static void calculateReachtime(JourneyDestination spec) {
		double d = spec.calcDuration();
		spec.destinationTime(d);
		spec.calculateDate();

	}
}

class JourneySpecification {
	double speed, distance, timeDuration;
	String startDate, startTime;
	double reqdDays, reqdHrs, reqdMin;
	int day, year, hour, minute, second;
	Month month;
	LocalDate date;
	LocalTime localTime;

	// getting parameters and parsing them for use

	public void setTimeDuration(double speed, double distance, String startDate, String startTime) {
		this.speed = speed;
		this.distance = distance;
		this.startDate = startDate;
		this.startTime = startTime;
        
		try {
		date = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
		localTime = LocalTime.parse(startTime, DateTimeFormatter.ofPattern("HH:mm:ss"));
		}
		catch(DateTimeParseException e) { 
			e.printStackTrace();}
		catch( DateTimeException e) {
			   e.printStackTrace();
		}
			
	
		day = date.getDayOfMonth();
		month = date.getMonth();
		year = date.getYear();
		System.out.print("Journey start time : "+date);
		//System.out.print("StartTime : "+day + " " + month + " " + year+" ");
		// String myDateString = "13:24:40";
		
		hour = localTime.get(ChronoField.CLOCK_HOUR_OF_DAY);
		if (hour == 24)
			hour = 0;
		minute = localTime.get(ChronoField.MINUTE_OF_HOUR);
		second = localTime.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println(" " +hour + "hrs " + minute + "min ");

	}

	public double calcDuration() {
		try {
		timeDuration = distance / speed;
		}
		catch(ArithmeticException e) {
			  e.printStackTrace();
		}
		
		return timeDuration;
	}

	public void destinationTime(double timeDuration) {
		// outputs like 5 days 12hrs 30 mins

		if (timeDuration >= 8) {
			reqdDays = timeDuration / 8; // since the driver works for only 8 hrs per day
			reqdHrs = (reqdDays - Math.floor(reqdDays)) * 24;
		}

		else {
			System.out.println(timeDuration);
			reqdHrs = (timeDuration - Math.floor(timeDuration)) * 8;
		}

		reqdMin = (reqdHrs - Math.floor(reqdHrs)) * 60;
//		System.out.println(
//				Math.floor(reqdDays) + " days " + Math.floor(reqdHrs) + " hrs " + Math.floor(reqdMin) + " minutes");

		hour += reqdHrs;
		minute += reqdMin;

	}
}

class JourneyDestination extends JourneySpecification {

	public void calculateDate() {
		while (reqdDays > 0) {

			date = date.plusDays(1);

			WeekFields weekFields = WeekFields.of(Locale.getDefault());
			int weekNumber = date.get(weekFields.weekOfMonth());

			if ((date.getDayOfWeek() == DayOfWeek.SUNDAY)
					|| (weekNumber == 2) && (date.getDayOfWeek() == DayOfWeek.SATURDAY)
					|| (weekNumber == 4) && (date.getDayOfWeek() == DayOfWeek.SATURDAY)
					|| (date.getMonth() == Month.AUGUST) && (date.getDayOfMonth() == 15)
					|| (date.getMonth() == Month.JANUARY) && (date.getDayOfMonth() == 26)
					|| (date.getMonth() == Month.JANUARY) && (date.getDayOfMonth() == 1))

				continue;
			reqdDays--;

		}
		System.out.println("Destination Reach Time :  " + date + " " + hour + "hrs " + minute + "mins ");

	}

}
