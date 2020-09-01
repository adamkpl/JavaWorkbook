package pl.virgom.pageObjects.components;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.util.Calendar.*;

public class DateOperations {


    private static String DD_MM_YYYY = "dd/MM/yyyy";
    private static String YYYY_MM_DD = "yyyy/MM/dd";
    private static String dd_MMMM_yyyy_hh_mm = "dd MMMMM yyyy hh:mm"; // force a strict date format
    private static final String DATE_OF_ESTABLISHMENT = "01/10/1991"; // dd/MM/yyyy

    private static final String TODAY = java.text.DateFormat
            .getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT, Locale.UK)
            .format(Calendar.getInstance().getTime());

    private static final String TODAY2 = java.text.DateFormat
            .getDateTimeInstance()
            .format(Calendar.getInstance().getTime());

    public static void main(String[] args) throws ParseException {
        System.out.println(TODAY); // 01 September 2020 14:07 // "dd MMMMM yyyy hh:mm"
        System.out.println(TODAY2); // Sep 1, 2020 2:07:34 PM

        System.out.println("This works on ENG, but not POL: ");
        System.out.println(parseDate(TODAY, "dd MMMMM yyyy hh:mm"));

        /*
        System.out.println("This works on POL, but not ENG: ");
        System.out.println(parseDate(TODAY2, "M dd, yyyy hh:mm:ss a"));
        */
    }


    public final static int getCurrentYearsAmountSinceCompanyEstablishmentAndToday() throws ParseException {
        return getYearsDifference(parseDate(DATE_OF_ESTABLISHMENT, DD_MM_YYYY), parseDate(TODAY, dd_MMMM_yyyy_hh_mm));
    }

    private static Date parseDate(String dateToParse, String simpleDateFormat) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(simpleDateFormat);
        return sdf.parse(dateToParse);
    }

    private static Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }

    private static int getYearsDifference(Date first, Date last) {
        Calendar a = getCalendar(first);
        Calendar b = getCalendar(last);
        int difference = b.get(YEAR) - a.get(YEAR);

        if (a.get(MONTH) > b.get(MONTH) || (a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE))) {
            difference--;
        }
        return difference;
    }

}