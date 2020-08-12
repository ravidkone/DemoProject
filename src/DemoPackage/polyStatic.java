package DemoPackage;

interface Switch{
	void on();
	void off();
}
class bulb implements Switch{
	public void on() {
		System.out.println("Bulb On");
	}
	public void off() {
		System.out.println("Buld off");
	}
}
class fan implements Switch
{
	public void on() {
		System.out.println("Fan On");
	}
	public void off() {
		System.out.println("Fan off");
	}
}
class myswitchclass{
	static Switch myswitch(char ch) {
		if(ch=='B') {
			return new bulb();
		}else {
			return new fan();
		}
	}
}
public class polyStatic {

	public static void main(String[] args) {
		Switch s=myswitchclass.myswitch('B');
		s.on();
		s.off();

	}

}
