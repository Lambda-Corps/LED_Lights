public class LEDStripDriver {
	
	public static final boolean isHardware = false;
	
	public static void main(String[] args) {
		
		try {
			LEDStrip l = new LEDStrip(192);
			
			l.gradient(  0,  64, 255, 255, 255, 255,   0,   0);
			l.gradient( 64, 128, 255, 255, 255,   0, 255,   0);
			l.gradient(128, 192, 255, 255, 255,   0,   0, 255);
			while(true) {
				l.shiftLayer(-1);
				l.update();
				Thread.sleep(30);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
