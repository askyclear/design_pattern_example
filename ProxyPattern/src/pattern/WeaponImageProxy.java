package pattern;

public class WeaponImageProxy implements Image{
	WeaponImage image;
	String weaponName;
	
	public WeaponImageProxy(String weaponName) {
		this.weaponName = weaponName;
	}
	
	@Override
	public void showImage() {
		if(image == null) {
			image = new WeaponImage(weaponName);
		}
		image.showImage();
	}

}
