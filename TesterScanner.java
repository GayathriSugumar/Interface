package Interface.DTO;

public class TesterScanner {
	public static void main(String[]args) {
		ScannerImplDao scannerDao=new ScannerImplDao("panasonic",100000,"black","p1203","410feed sheet")
				ScannerDTO panasonic=scannerDao.CreateScannerObject("panasonic",100000,"black","p1203","410feed sheet");
		scannerDao.displayinfo(panasonic);
	}

}

