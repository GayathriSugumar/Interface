package Interface.DTO;

/*import.Interface.DTO.ScannerDTO;*/
 
public abstract class ScannerImplDao extends ScannerDTO implements ScannerDAO{
	
	public ScannerImplDao (String brand, int price, String color, String version, String size) {
		super(brand,price,color,version,size);
		System.out.println("Inside a ScannerDAO constructor");
		}
	
	public ScannerDTO CreateScannerObject(String brand, int price, String color, String version, String size) {
		System.out.println("Inside a create method");
		ScannerDTO scannerDto=new ScannerDTO(brand,price,color,version,size);
		return scannerDto;
	}
	
	public ScannerDTO updatebyVersion(ScannerDTO obj,String version) {
		System.out.println("Inside a update method");
		obj.setVersion(version);
		return obj;
	}
	public void displayinfo(ScannerDTO obj) {
		System.out.println("Inside a display method");
		System.out.println(obj.getBrand());
		System.out.println(obj.getPrice());
		System.out.println(obj.getColor());
		System.out.println(obj.getVersion());
		System.out.println(obj.getSize());
		
	}
 
}
