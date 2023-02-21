package Ch9_Java_lang_package;

/**
 * Ex9_10
 */
public class Ex9_10 {
    public static void main(String[] args) {                                                                                                                                                                                                                                  
        int iVal =100;
        String strVal = String.valueOf(iVal); // int를 String로 변환

        double dVal = 200.0;
        String strVal2 = dVal +""; // int를 String로 변환

        // 문자열을 숫자로 바꾸는 방법
        double sum = Integer.parseInt("+"+strVal) + Double.parseDouble(strVal2);
        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
    
        System.out.println(String.join("",strVal+"+"+strVal2,"=")+sum);
        System.out.println(strVal+" + "+ strVal2+" = " + sum2);
    } // end of main
    
} // end of class