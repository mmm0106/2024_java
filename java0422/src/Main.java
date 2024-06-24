import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.ZoneId;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
//        echo("これをエコーします");
        String inputDate = "2023/11/11";
        inputDate = displayDate(inputDate);
        System.out.println(inputDate);
    }

//    public static void echo(String str) {
//        System.out.println(str);
//    }

    public static String displayDate(String inputDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        try {
            Date d = sdf.parse(inputDate);
            calendar.setTime(d);
            calendar.add(Calendar.DAY_OF_MONTH,2);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        return sdf.format(calendar.getTime());
    }

    public static String addDate(String inputDate,int addday){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        try{
            Date d = sdf.parse(inputDate);
            calendar.setTime(d);
            calendar.add(Calendar.DAY_OF_MONTH,addday);
        }
        catch(ParseException e){
            e.printStackTrace();
        }
        return sdf.format(calendar.getTime());
    }
    public static String nextWeekday(String inputDate){
        int i = 1;
        while(isSaturdayOrSunday(addDate(inputDate, i))) i++;
        return addDate(inputDate,i);
    }

    public static int getDaysBetweenDates(Date date1,Date date2){
        // DateをLocalDateに変換
        LocalDate localDate1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate localDate2 = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // LocalDateの差分を計算
        long daysBetween = ChronoUnit.DAYS.between(localDate1, localDate2);

        return (int) daysBetween;
    }
    public static Date validateAndParseDate(String inputdate){
        //string>>Date
        try {
            String strDate = inputdate;
            SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
            Date date = format.parse(strDate);
            return date;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean isWeekday(String yyyymmdd){
        try{
            Date date = Main.validateAndParseDate(yyyymmdd);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            return (dayOfWeek != Calendar.SATURDAY && dayOfWeek !=Calendar.SUNDAY);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static boolean isSaturdayOrSunday(String yyyymmdd){
        try{
            Date date = Main.validateAndParseDate(yyyymmdd);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            return (dayOfWeek == Calendar.SATURDAY || dayOfWeek ==Calendar.SUNDAY);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static int countWorkingDays(String from,String to){
        try {
            SimpleDateFormat d = new SimpleDateFormat("yyyy/MM/dd");
            //String >> Dateオブジェクトに変換
            Date fromDate = d.parse(from);
            Date toDate = d.parse(to);

            //Calendarオブジェクト作成 >> Dateオブジェクトに設定
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fromDate);

            int workingDays = 0;
            //calendarオブジェクトの日付がtoDateよりも後でない限り
            while (!calendar.getTime().after(toDate)) {
                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY) {
                    workingDays++;
                }
                calendar.add(Calendar.DATE, 1);
            }
            System.out.println(workingDays);
            return workingDays;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String getNextWeekday(String from){
        int cnt = 1;
        while (isSaturdayOrSunday(addDate(from,cnt))){
            cnt++;
        }return addDate(from,cnt);
    }

}


    //sumTime




