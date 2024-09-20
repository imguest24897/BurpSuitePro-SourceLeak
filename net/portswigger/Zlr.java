package net.portswigger;

import burp.Zbqc;
import java.io.ByteArrayOutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class Zlr {
  public static byte[] ZY(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = Zk(paramArrayOfbyte, false);
    if (arrayOfByte == paramArrayOfbyte)
      arrayOfByte = Zk(paramArrayOfbyte, true); 
    if (arrayOfByte == paramArrayOfbyte) {
      byte[] arrayOfByte1 = new byte[paramArrayOfbyte.length + 2];
      arrayOfByte1[0] = 120;
      arrayOfByte1[1] = -100;
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte1, 2, paramArrayOfbyte.length);
      byte[] arrayOfByte2 = Zk(arrayOfByte1, false);
      if (arrayOfByte2 == arrayOfByte1)
        arrayOfByte2 = Zk(arrayOfByte1, true); 
      if (arrayOfByte2 != arrayOfByte1)
        arrayOfByte = arrayOfByte2; 
    } 
    return arrayOfByte;
  }
  
  private static byte[] Zk(byte[] paramArrayOfbyte, boolean paramBoolean) {
    Zbqc[] arrayOfZbqc = Zhf.ZE();
    try {
      if (paramArrayOfbyte.length == 0)
        return paramArrayOfbyte; 
    } catch (DataFormatException dataFormatException) {
      throw a(null);
    } 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(paramArrayOfbyte.length);
    Inflater inflater = new Inflater(paramBoolean);
    inflater.reset();
    inflater.setInput(paramArrayOfbyte);
    byte[] arrayOfByte = new byte[1024];
    while (!inflater.finished()) {
      try {
        int i = inflater.inflate(arrayOfByte);
        if (i != 0 || arrayOfZbqc == null)
          byteArrayOutputStream.write(arrayOfByte, 0, i); 
      } catch (DataFormatException dataFormatException) {
        try {
          Zah.Zl(dataFormatException, Zk_.COMMON_RUNTIME_FAILURE);
          if (byteArrayOutputStream.size() > 0)
            return byteArrayOutputStream.toByteArray(); 
        } catch (DataFormatException dataFormatException1) {
          throw a(null);
        } 
        return paramArrayOfbyte;
      } 
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  private static DataFormatException a(DataFormatException paramDataFormatException) {
    return paramDataFormatException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zlr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */