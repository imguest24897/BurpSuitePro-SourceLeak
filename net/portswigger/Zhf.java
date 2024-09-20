package net.portswigger;

import burp.Zbqc;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Zhf {
  private static Zbqc[] ZJ;
  
  public static byte[] ZX(byte[] paramArrayOfbyte) {
    Zbqc[] arrayOfZbqc = ZE();
    try {
      if (null == paramArrayOfbyte)
        return null; 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(paramArrayOfbyte));
      byte[] arrayOfByte = new byte[4096];
      int i;
      while ((i = gZIPInputStream.read(arrayOfByte)) != -1) {
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
  
  public static int Zh(ByteArrayInputStream paramByteArrayInputStream, ByteArrayOutputStream paramByteArrayOutputStream) {
    int i = paramByteArrayInputStream.available();
    Zbqc[] arrayOfZbqc = ZE();
    try {
      GZIPInputStream gZIPInputStream = new GZIPInputStream(paramByteArrayInputStream, 1);
      byte[] arrayOfByte = new byte[4096];
      int j;
      while ((j = gZIPInputStream.read(arrayOfByte)) != -1) {
        paramByteArrayOutputStream.write(arrayOfByte, 0, j);
        if (arrayOfZbqc == null)
          break; 
      } 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
    } 
    return i - paramByteArrayInputStream.available();
  }
  
  public static byte[] ZT(byte[] paramArrayOfbyte) {
    try {
      if (null == paramArrayOfbyte)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
      gZIPOutputStream.write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      gZIPOutputStream.finish();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      return paramArrayOfbyte;
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public static void ZP(Zbqc[] paramArrayOfZbqc) {
    ZJ = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZE() {
    return ZJ;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    if (ZE() == null)
      ZP(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zhf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */