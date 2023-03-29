package Ex6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;

public class TravelTimeCalculation {
	public static void main(String args[]) {

//driverclass
		DayCalculation t = new DayCalculation();
		t.setTimeDuration(100, 101000, "2023-01-24", "20:59:54");
		double d = t.calcDuration();
		System.out.println();
		t.destinationTime(d);
		System.out.println();
		t.calculateDate();

	}

}

class TimeDuration {
	double speed, distance, timeDuration;
	String startDate, startTime;
	double reqdDays, reqdHrs, reqdMin;
	int day, year, hour, minute, second;
	Month month;
	LocalDate date;

	// getting parameters and parsing them for use

	public void setTimeDuration(double speed, double distance, String startDate, String startTime) {
		this.speed = speed;
		this.distance = distance;
		this.startDate = startDate;
		this.startTime = startTime;

		date = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
		day = date.getDayOfMonth();
		month = date.getMonth();
		year = date.getYear();
		System.out.println(day + " " + month + " " + year);
		// String myDateString = "13:24:40";
		LocalTime localTime = LocalTime.parse(startTime, DateTimeFormatter.ofPattern("HH:mm:ss"));
		hour = localTime.get(ChronoField.CLOCK_HOUR_OF_DAY);
		if (hour == 24)
			hour = 0;
		minute = localTime.get(ChronoField.MINUTE_OF_HOUR);
		second = localTime.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println(hour + " " + minute + " " + second);

	}

	// calculating total time reqd
	public double calcDuration() {
		timeDuration = distance / speed;

		return timeDuration;
	}

	// calculates no of days hrs and minutes it will take to reach destination
	public void destinationTime(double timeDuration) {
		// outputs like 5 days 12hrs 30 mins

		if (timeDuration >= 24) {
			reqdDays = timeDuration / 24;
			reqdHrs = (reqdDays - Math.floor(reqdDays)) * 24;
		}

		else {
			System.out.println(timeDuration);
			reqdHrs = (timeDuration - Math.floor(timeDuration)) * 24;
		}

		reqdMin = (reqdHrs - Math.floor(reqdHrs)) * 60;
		System.out.println(
				Math.floor(reqdDays) + " days " + Math.floor(reqdHrs) + " hrs " + Math.floor(reqdMin) + " minutes");

		hour += reqdHrs;
		minute += reqdMin;

	}

}

//calculates the date it will reach destination
class DayCalculation extends TimeDuration {

	// add with days 42days 2 hrs 0 mins

	DayCalculation() {
		System.out.println(day);
	}

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
		System.out.println(date + " " + hour + " " + minute);

	}

}
