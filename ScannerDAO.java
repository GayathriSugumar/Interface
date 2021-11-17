package Interface.DTO;



public interface ScannerDAO  {
	
	public void displayinfo(ScannerDTO obj);
	public ScannerDTO CreateScannerObject(String brand, int price, String color, String version, String size);
	public ScannerDTO updatebyVersion(ScannerDTO obj,String version);

}
