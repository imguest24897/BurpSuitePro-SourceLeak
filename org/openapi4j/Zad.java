package org.openapi4j;

import burp.Zbqc;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public final class Zad {
  public static String ZK(InputStream paramInputStream, String paramString) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    Zbqc[] arrayOfZbqc = Zpa.Za();
    byte[] arrayOfByte = new byte[4096];
    int i;
    while ((i = paramInputStream.read(arrayOfByte)) != -1) {
      byteArrayOutputStream.write(arrayOfByte, 0, i);
      if (arrayOfZbqc == null)
        break; 
    } 
    try {
      if (Zbqc.Zwu() == null)
        Zpa.Zw(new Zbqc[5]); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return byteArrayOutputStream.toString(paramString);
  }
  
  public static String ZC(byte[] paramArrayOfbyte, Charset paramCharset) {
    return new String(paramArrayOfbyte, paramCharset);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zad.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */