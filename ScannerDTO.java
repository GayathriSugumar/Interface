package Interface.DTO;

public class ScannerDTO {

	private String brand;
	private int price;
	private String color;
	private String version;
	private String size;
	public ScannerDTO(String brand, int price, String color, String version, String size) {
		
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.version = version;
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
	
	
}
