
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){

		String output = super.toString();
		output += String.format("Assert tag: %-10s\n Description: %-10s \n Optical Zoom: %10s", getAssetTag());
		// Write your codes here
		return output;
	}
}


