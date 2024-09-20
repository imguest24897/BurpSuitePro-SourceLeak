package net.portswigger;

import burp.Zbqc;
import java.io.IOException;
import java.io.OutputStream;

public class Zzt {
  private final OutputStream Zh;
  
  public Zzt(OutputStream paramOutputStream) {
    this.Zh = paramOutputStream;
  }
  
  public void ZI(byte[] paramArrayOfbyte) throws IOException {
    try {
      if (paramArrayOfbyte == null)
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZJ(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public void ZJ(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    this.Zh.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public void ZR(int paramInt) throws IOException {
    this.Zh.write(paramInt & 0xFF);
  }
  
  public void ZD(int paramInt) throws IOException {
    this.Zh.write(paramInt >>> 8 & 0xFF);
    this.Zh.write(paramInt & 0xFF);
  }
  
  public void ZG(long paramLong) throws IOException {
    this.Zh.write((int)(paramLong >>> 24L & 0xFFL));
    this.Zh.write((int)(paramLong >>> 16L & 0xFFL));
    this.Zh.write((int)(paramLong >>> 8L & 0xFFL));
    String[] arrayOfString = Zza.ZX();
    try {
      this.Zh.write((int)(paramLong & 0xFFL));
      if (Zbqc.Zwu() == null)
        Zza.Z_(new String[2]); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zzt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */