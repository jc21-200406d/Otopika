import jp.jc21.t.yoshizawa.otopika.Otopika;

/**
 * 
 */

/**
 * @author AB2B05
 *
 */
public class OtoSample01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Otopika oto = new Otopika();
		oto.powerOn();
		while (true) {
			oto.lightAll();
			oto.lightOff();
			oto.lightGreen();
			oto.lightGreenYellow();
			oto.lightYellow();
			oto.lightYellowRed();
			oto.lightRed();
			oto.lightGreenRed();
		}

	}

}
