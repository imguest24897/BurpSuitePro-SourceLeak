package burp;

import java.io.IOException;
import java.io.InputStream;

public class Zkdu extends InputStream {
  private final InputStream ZH;
  
  private final byte[] Zz;
  
  private int Zv;
  
  public Zkdu(InputStream paramInputStream, byte[] paramArrayOfbyte) {
    this.ZH = paramInputStream;
    this.Zz = paramArrayOfbyte;
    this.Zv = paramArrayOfbyte.length;
  }
  
  public int read() throws IOException {
    try {
      if (this.Zv == 0)
        return this.ZH.read(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte[] arrayOfByte = new byte[1];
    int i = read(arrayOfByte, 0, 1);
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (i == 1) ? arrayOfByte[0] : -1;
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    try {
      if (this.Zv == 0)
        return this.ZH.read(paramArrayOfbyte, paramInt1, paramInt2); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = paramInt2;
    if (i > this.Zv)
      i = this.Zv; 
    System.arraycopy(this.Zz, this.Zz.length - this.Zv, paramArrayOfbyte, paramInt1, i);
    this.Zv -= i;
    return i;
  }
  
  public long skip(long paramLong) throws IOException {
    int i = Zkh7.ZD();
    long l = 0L;
    try {
      if (this.Zv > 0) {
        if (this.Zv >= paramLong) {
          this.Zv = (int)(this.Zv - paramLong);
          l = paramLong;
          paramLong = 0L;
          if (i != 0) {
            paramLong -= this.Zv;
            l = this.Zv;
            this.Zv = 0;
            return l + this.ZH.skip(paramLong);
          } 
          return l + this.ZH.skip(paramLong);
        } 
      } else {
        return l + this.ZH.skip(paramLong);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramLong -= this.Zv;
    l = this.Zv;
    this.Zv = 0;
    return l + this.ZH.skip(paramLong);
  }
  
  public int available() throws IOException {
    return this.Zv + this.ZH.available();
  }
  
  public void close() throws IOException {
    this.ZH.close();
  }
  
  public void mark(int paramInt) {
    this.ZH.mark(paramInt);
  }
  
  public void reset() throws IOException {
    this.ZH.reset();
  }
  
  public boolean markSupported() {
    return false;
  }
  
  public int read(byte[] paramArrayOfbyte) throws IOException {
    return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkdu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */