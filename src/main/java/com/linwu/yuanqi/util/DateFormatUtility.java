package com.linwu.yuanqi.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * DateFormatUtility
 */
public class DateFormatUtility {
    private static final String SIMPLE_DATE_FORMAT = "MM-dd-yyyy";
    private static final String EFFECTIVE_DATE_FORMAT = "yyyy-MM-dd";
    private static final String SIMPLE_DATE_FORMAT_MDY = "MM/dd/yyyy";
    private static final String POINT_IN_TIMEDATE_FORMAT = "yyyyMMdd";
    private static final String POINT_IN_TIMEMONTH_FORMAT = "yyyyMM";
    private static final String SIMPLE_DATE_FORMAT_MONTH = "MMMM yyyy";
    private static final String EXCHANGE_RATE_SERVICE_DATE_FORMAT = "yyyy-MM-dd'T'hh:mm:ss"; // 2017-09-14T00:00:00
    private static final String EMPTY_STRING = "";


    /**
     * Parse date in format MM-DD-YYYY
     * @param dateString
     * @return Date or null if empty/null input
     * @throws ParseException
     */
    public static Date parseSimpleDateFromString(String dateString) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(SIMPLE_DATE_FORMAT);

        if (dateString != null && !dateString.isEmpty()) {
            return simpleDateFormat.parse(dateString);
        }
        else {
            return null;
        }
    }

    /**
     * Parse date string YYYY-MM-DD
     * @param text
     * @return
     * @throws ParseException
     */
    public static Date parseEffectiveDateFromString(String text) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(EFFECTIVE_DATE_FORMAT);


        if (text != null && !text.isEmpty()) {
            return simpleDateFormat.parse(text);
        } else {
            return null;
        }
    }

    /**
     * Parse date in format YYYYMMDD
     * @param dateString
     * @return
     * @throws ParseException
     */
    public static Date parsePointInTimeFromString(String dateString) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(POINT_IN_TIMEDATE_FORMAT);

        if (dateString != null && !dateString.isEmpty()) {
            return simpleDateFormat.parse(dateString);
        }
        else {
            return null;
        }
    }

    /**
     * Parse date in format YYYYMM
     * @param dateString
     * @return
     * @throws ParseException
     */
    public static Date parsePointInMonthFromString(String dateString) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(POINT_IN_TIMEMONTH_FORMAT);

        if (dateString != null && !dateString.isEmpty()) {
            return simpleDateFormat.parse(dateString);
        }
        else {
            return null;
        }
    }
    
    /**
     * Parse date in format MM/dd/yyyy
     * @param dateString
     * @return
     * @throws ParseException
     */
    public static Date parseSimpleDateFormatMdyFromString(String dateString) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(SIMPLE_DATE_FORMAT_MDY);

        if (dateString != null && !dateString.isEmpty()) {
            return simpleDateFormat.parse(dateString);
        }
        else {
            return null;
        }
    }
    

    public static String toYYYYMM(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(POINT_IN_TIMEMONTH_FORMAT);

        if (date != null) {
            return simpleDateFormat.format(date);
        }
        else {
            return null;
        }
    }

    /**
     * Convert date into YYYYMMDD as an Integer, in local timezone
     * @param date
     * @return
     */
    public static Integer toYYYYMMDD(Date date) {
        if (date == null) {
            return null;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return calendar.get(Calendar.YEAR) * 10000
                + (calendar.get(Calendar.MONTH) + 1) * 100
                + calendar.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * Convert to MM/dd/yyyy
     * @param date
     * @return
     */
    public static String toMMDDYYYY(Date date) {
        if (date == null) {
            return null;
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(SIMPLE_DATE_FORMAT_MDY);

        return simpleDateFormat.format(date);
    }

    public static Integer currentQuarter(Calendar calendar) {
        return calendar.get(Calendar.MONTH) / 3 + 1;
    }

    
    /**
     * Parse date string format from MM/dd/yyyy to yyyy-MM-dd
     * @param date
     * @return
     */
    public static String formatStringDateToString(String date){
    	String result = "";
    	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d  = format.parse(date);
			result = formatter.format(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return result;
    }

    /**
     * Parse date in format MM/DD/YYYY
     * @param dateString
     * @return Date or null if empty/null input
     * @throws ParseException
     */
    public static Date parseSimpleDateMDYFromString(String dateString) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(SIMPLE_DATE_FORMAT_MDY);

        if (dateString != null && !dateString.isEmpty()) {
            return simpleDateFormat.parse(dateString);
        }
        else {
            return null;
        }
    }

    /**
     * Parse date string from exchange rate service in format like 2017-09-14T00:00:00
     * @param dateString
     * @return
     * @throws ParseException
     */
    public static Date parseExchangeRateServiceDate(String dateString) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(EXCHANGE_RATE_SERVICE_DATE_FORMAT);

        if (dateString != null && !dateString.isEmpty()) {
            return simpleDateFormat.parse(dateString);
        }
        else {
            return null;
        }
    }

    public static String parseExchangeRateServiceDate(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(EXCHANGE_RATE_SERVICE_DATE_FORMAT);

        if (date != null) {
            return simpleDateFormat.format(date);
        }
        else {
            return null;
        }
    }

    /**
     * Parse date string format from MM/dd/yyyy to yyyy-MM-dd
     * @param date
     * @return
     */
    public static Date formatStringDateToDate(String date){
        Date result = null;
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d  = format.parse(date);
            String str = formatter.format(d);
            result = formatter.parse(str);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    public static String formatDateToString(Date date){
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }

    public static String formatDateToMMMString(Date date){
        return new SimpleDateFormat(SIMPLE_DATE_FORMAT_MONTH).format(date);
    }

    /**
     * Parse date string format from MM/dd/yyyy to MM/yyyy
     * @param date
     * @return
     */
    public static String formatMMyyyyString(String date){
        String result = null;
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat formatter = new SimpleDateFormat("MM/yyyy");
        try {
            Date d  = format.parse(date);
            result = formatter.format(d);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Parse date string format from dd/MM/yyyy to yyyy-MM-dd
     * @param date
     * @return
     */
    public static Date formatStringddMMyyyyToDate(String date){
        Date result = null;
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d  = format1.parse(date);
            String str = format2.format(d);
            result = format2.parse(str);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    /**
     *
     * @param date
     * @return
     */
    public static String formatStringddMMyyyyToString(String date){
        String str = null;
        SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d  = format1.parse(date);
            str = format2.format(d);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return str;
    }

    /**
     *
     * @param date
     * @return
     */
    public static String formatDateMMddyyyyToString(Date date){
        return  new SimpleDateFormat("MM/dd/yyyy").format(date);
    }
}
