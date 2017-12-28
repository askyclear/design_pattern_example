package pattern;

public class Main {

	public static void main(String[] args) {
		Image axeImage = new WeaponImageProxy("액스쎾쓰");
		Image wandImage = new WeaponImageProxy("완도");
		
		axeImage.showImage();
		wandImage.showImage();
	}

}
