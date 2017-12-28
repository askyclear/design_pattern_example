package pattern;

public class Main {

	public static void main(String[] args) {
		Image axeImage = new WeaponImageProxy("�׽��徲");
		Image wandImage = new WeaponImageProxy("�ϵ�");
		
		axeImage.showImage();
		wandImage.showImage();
	}

}
