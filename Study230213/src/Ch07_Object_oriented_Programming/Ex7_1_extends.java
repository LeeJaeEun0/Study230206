package Ch07_Object_oriented_Programming;

public class Ex7_1_extends {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
	    stv.channel = 10;
	    stv.channelUp();
	    System.out.println(stv.channel);
	    stv.displayCaption("Hello, World! - 자막 off");
	    stv.caption = true;
	    stv.displayCaption("Hello, World! - 자막 on");
	  }// end of main
	}// end of class

	class Tv{
	  boolean power; // 전원상태(on/off)
	  int channel; // 채널

	  void power(){power = !power;} 
	  void channelUp(){++channel;}
	  void channelDown(){--channel;}
	} // end of class

	class SmartTv extends Tv{ // SmartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	  boolean caption; // 캡션 상태(on/off)
	  void displayCaption(String text){
	    if (caption){ // 캡션 상태가 on(true)일 때만 text를 보여준다
	      System.out.println(text);
	    }
	  } // end of displayCaption
	} // end of main