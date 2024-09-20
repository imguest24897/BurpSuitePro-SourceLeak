package net.portswigger;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Zrm2 extends InputStream {
  private int ZE;
  
  private final InputStream ZI;
  
  private final ByteArrayOutputStream ZZ;
  
  Zrm2(int paramInt, InputStream paramInputStream) {
    this.ZE = paramInt;
    this.ZI = paramInputStream;
    this.ZZ = new ByteArrayOutputStream();
  }
  
  public byte[] ZM() {
    return this.ZZ.toByteArray();
  }
  
  public int read() throws IOException {
    int i = this.ZI.read();
    this.ZZ.write(i);
    Zd();
    return i;
  }
  
  public int read(byte[] paramArrayOfbyte) throws IOException {
    int i = this.ZI.read(paramArrayOfbyte);
    try {
      if (i > 0) {
        this.ZZ.write(paramArrayOfbyte, 0, i);
        Zd();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return i;
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    int i = this.ZI.read(paramArrayOfbyte, paramInt1, paramInt2);
    try {
      if (i > 0) {
        this.ZZ.write(paramArrayOfbyte, paramInt1, i);
        Zd();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return i;
  }
  
  private void Zd() {
    try {
      if (this.ZE != -1)
        try {
          if (this.ZZ.size() > this.ZE)
            throw new Zrzm(); 
        } catch (Zrzm zrzm) {
          throw a(null);
        }  
    } catch (Zrzm zrzm) {
      throw a(null);
    } 
  }
  
  public void Zf(int paramInt) {
    this.ZE = paramInt;
  }
  
  public void reset() {
    this.ZZ.reset();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrm2.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */