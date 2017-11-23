package cn.tower.base.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public final static String DATE_FORMAT="yyyy-MM-dd hh:mm:ss";

	
	/**
	   * 获取当前时间
	   * 
	   * @return返回字符串格式 yyyy-MM-dd
	   */
	public static String getStringCurrentDate() {
	   Date currentTime = new Date();
	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	   String dateString = formatter.format(currentTime);
	   return dateString;
	}
	
	/**
	 * 获取指定日期字符串
	 */
	public static String getDateString(Date date) {
	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	   String dateString = formatter.format(date);
	   return dateString;
	}
	
	/**
	 * 获取字符串的date类型
	 */
	public static Date getDateByStr(String strDate) {
		Date date = null; 
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	   
	    try {
		   date = formatter.parse(strDate);
		} catch (Exception e) {
			// TODO: handle exception
		}
	   
	    return date;
	}
	
	/**
	 * 获取当前时间
	 * @param format 指定格式
	 * @return
	 */
	public static String getCurrentTime(String format){
		 Date currentTime = new Date();
		   SimpleDateFormat formatter = new SimpleDateFormat(format);
		   String dateString = formatter.format(currentTime);
		   return dateString;
	}
	/**
	 * 获取当前时间毫秒数
	 * @return
	 */
	public static long getTime(){
		return new Date().getTime();
	}
	/**
	 *获取过去个月的日期
	 */
	public static String getMonth(int index){
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.MONTH, -index);
		Date m = c.getTime  ();
		String month = new SimpleDateFormat("yyyy-MM-dd").format(m);
		return month;
	}
	/**
	 *获取过去年的日期
	 */
	public static String getYear(int index){
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.YEAR, -index);
		Date m = c.getTime();
		String year = new SimpleDateFormat("yyyy-MM-dd").format(m);
		return year;
	}
	/** 
     * 获取当年的第一天 
     * @param year 
     * @return 
     */  
    public static String getCurrYearFirst(){  
        Calendar currCal=Calendar.getInstance();    
        int currentYear = currCal.get(Calendar.YEAR);  
        return new SimpleDateFormat("yyyy-MM-dd").format(getYearFirst(currentYear));  
    }  
    /** 
     * 获取某年第一天日期 
     * @param year 年份 
     * @return Date 
     */  
    public static Date getYearFirst(int year){  
        Calendar calendar = Calendar.getInstance();  
        calendar.clear();  
        calendar.set(Calendar.YEAR, year);  
        Date currYearFirst = calendar.getTime();  
        return currYearFirst;  
    } 
    
    /**
     * long类型获取时间
     */
    public static String getStringDateByLong(long dateLong){
    		Date date = new Date(dateLong);
    		return getDateString(date);
    }
    
    /**
     * 获取上n年 年份
     */
    public static String getYearByN(int n){
    	Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.YEAR, -n);
		Date m = c.getTime();
		String year = new SimpleDateFormat("yyyy").format(m);
		return year;
    }
    
    /**
     * 获取今年的 年
     * @return
     */
    public static String getNowYear(){
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.YEAR,0);
		Date m = c.getTime();
		String year = new SimpleDateFormat("yyyy").format(m);
		return year;
    }
    
    /**
     * 获取当前日期的前N周一 或者后N周一
     * n为推迟的周数，0本周，-1向前推迟一周，1下周，依次类推
     * @param n
     * @return
     */
    public static String getMondey(int n){
    	Calendar cal = Calendar.getInstance();
    	String monday;
    	cal.add(Calendar.DATE, n*7);
    	//想周几，这里就传几Calendar.MONDAY（TUESDAY...）
    	cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
    	monday = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
    	System.out.println(monday);
    	return monday;
    }
    
    /**
     * 获取当前日期的前N周日或者后N周日
     * n为推迟的周数，0上周，-1向前推迟一周，1向后推一周，依次类推
     * @param n
     * @return
     */
    public static String getSunday(int n){
    	Calendar cal = Calendar.getInstance();
    	String monday;
    	cal.add(Calendar.DATE, n*7);
    	//想周几，这里就传几Calendar.MONDAY（TUESDAY...）
    	cal.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
    	monday = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
    	System.out.println(monday);
    	return monday;
    }
    
    public static void main(String[] args) {
    	getSunday(1);
	}
    
}
