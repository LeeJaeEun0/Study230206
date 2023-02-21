package Ch06_Object_oriented_Programming;

public class Practice6_19 {

	public static void main(String[] args) {
		MyTv t = new MyTv();

		t.channel = 100;
		t.volume = 0;
		System.out.println("CH : " + t.channel + ", VOL : " + t.volume);

		t.channelDown();
		t.volumeDown();
		System.out.println("CH : " + t.channel + ", VOL : " + t.volume);

		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH : " + t.channel + ", VOL : " + t.volume);

	} // end of main

} // end of class

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	void turnOnOff() {
		// 1. isPowerOn의 값이 turn이면 false로, false면 true로
		// isPowerOn = (isPowerOn == true)? false: true;
		isPowerOn = !isPowerOn;
	} // end of turnOnOff

	void volumeUp() {
		// 2. volume의 값이 MAX_VOLUME보다 작을 때만 1 증가한다.
		if (volume < MAX_VOLUME)
			volume++;
	} // end of volumUp

	void volumeDown() {
		// 3. volume의 값이 MIN_VOLUME보다 클 때만 1 감소한다.
		if (volume > MIN_VOLUME)
			volume--;
	} // end of volumUp

	void channelUp() {
		// 4. channel의 값을 1 증가한다. 만약 MAX_CHANNEL이면 MIN_CHANNEL로 바뀜
		if (channel < MAX_CHANNEL)
			channel++;
		else
			channel = MIN_CHANNEL;
	}// end of channelUp

	void channelDown() {
		// 5. channel의 값을 1 감소한다. 만약 MIN_CHANNEL이면 MIN_CHANNEL로 바뀜
		if (channel > MIN_CHANNEL)
			channel--;
		else
			channel = MAX_CHANNEL;

	}// end of channelDown

} // end of class