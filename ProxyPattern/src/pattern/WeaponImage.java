package pattern;

public class WeaponImage implements Image {
	private String weaponName;
	
	public WeaponImage(String weaponName) {
		this.weaponName = weaponName;
	}
	
	@Override
	public void showImage() {
		loadImageFromDisk();
	}
	
	private void loadImageFromDisk() {
		System.out.println("Load Image From Disk..");
		System.out.println(weaponName + " image created");
	}
	
}
