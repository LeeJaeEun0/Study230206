package Ch02_Variable;

public class Ex16_Signed_Integer_Overflow {

	public static void main(String[] args) {
		// 부호가 있는 경우와 부호가 없는 경우의 max, min의 값이 다름
		short sMin = -32768, sMax = 32767;
		char cMin = 0, cMax = 65535;
		
		System.out.println("min-1은 최고값");
		System.out.println("sMin = " + sMin);
		System.out.println("sMin-1 = "+(short)(sMin-1));
		System.out.println();
		
		System.out.println("max+1은 최저값");
		System.out.println("sMax = "+sMax);
		System.out.println("sMax+1 = "+(short)(sMax+1));
		System.out.println();
		
		System.out.println("min-1은 최고값");
		System.out.println("cMin = "+(int)cMin);
		System.out.println("cMin-1 = "+(int)--cMin);
		System.out.println("sMax+1 = "+(short)(sMax+1));
		System.out.println();
		
		System.out.println("max+1은 최저값");
		System.out.println("cMax = "+ (int)cMax);
		System.out.println("cMax+1 = "+ (int)++cMax);
		
	} // end of main

} // end of class
