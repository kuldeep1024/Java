import java.util.Scanner;

public class APPMto24hours {

    static String timeConversion(String s) {
        int hour = Integer.valueOf(s.substring(0,2));
        hour = s.endsWith("AM")? (hour==12?00:hour) : hour%12+12;
        
        String sstr="";
        if(hour<9){
        	sstr="0"+hour;
        }else{
        	sstr=hour+"";
        }
        
        String rest = s.substring(2,s.length()-2);
        return sstr+rest;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
