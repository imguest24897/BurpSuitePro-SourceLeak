package net.portswigger;

import burp.Zbqc;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import org.brotli.dec.BrotliInputStream;

public class Zaf {
  public static byte[] ZH(byte[] paramArrayOfbyte) {
    Zbqc[] arrayOfZbqc = Zhf.ZE();
    try {
      if (paramArrayOfbyte == null)
        return null; 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      BrotliInputStream brotliInputStream = new BrotliInputStream(new ByteArrayInputStream(paramArrayOfbyte));
      byte[] arrayOfByte = new byte[4096];
      int i;
      while ((i = brotliInputStream.read(arrayOfByte)) != -1) {
        byteArrayOutputStream.write(arrayOfByte, 0, i);
        if (arrayOfZbqc == null)
          break; 
      } 
    } catch (EOFException eOFException) {
      Zah.Zl(eOFException, Zk_.IGNORED);
      return byteArrayOutputStream.toByteArray();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      return paramArrayOfbyte;
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  private static EOFException a(EOFException paramEOFException) {
    return paramEOFException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zaf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */