package com.example.demo.QRCode;




import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.example.demo.Entity.singer;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;





public class QrCodeGenerated {
	
	 public static void generatedQRCode(singer sin) throws WriterException, IOException {
		  String qrCodePath="D:\\MyRESTAPI\\QRCode\\";
		  String qrCodeName=qrCodePath+sin.getSid()+sin.getSname()+sin.getStype()+sin.getSprice()+" QRCODE.png";
		   QRCodeWriter qrCodeWriter = new QRCodeWriter();
		  
		  BitMatrix bitMatrix = qrCodeWriter.encode("ID:"+sin.getSid()+"\n"+
		            "SName:"+sin.getSname()+"\n"+
				  " SType:"+sin.getStype()+"\n"+
		            " SPrice:"+sin.getSprice(),BarcodeFormat.QR_CODE,400,400);
		  Path path=FileSystems.getDefault().getPath(qrCodeName);
		  MatrixToImageWriter.writeToPath(bitMatrix, "png", path);
				 

	 

	 
	 }
}
