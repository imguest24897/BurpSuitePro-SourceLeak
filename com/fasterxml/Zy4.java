package com.fasterxml;

import java.io.IOException;
import java.io.InputStream;

public final class Zy4 extends InputStream {
  private final Zv9 Za;
  
  private final InputStream Zx;
  
  private byte[] ZY;
  
  private int Zc;
  
  private final int Zy;
  
  public Zy4(Zv9 paramZv9, InputStream paramInputStream, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.Za = paramZv9;
    this.Zx = paramInputStream;
    this.ZY = paramArrayOfbyte;
    this.Zc = paramInt1;
    this.Zy = paramInt2;
  }
  
  public int available() throws IOException {
    try {
      if (this.ZY != null)
        return this.Zy - this.Zc; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return this.Zx.available();
  }
  
  public void close() throws IOException {
    ZQ();
    this.Zx.close();
  }
  
  public synchronized void mark(int paramInt) {
    if (this.ZY == null)
      this.Zx.mark(paramInt); 
  }
  
  public boolean markSupported() {
    return (this.ZY == null && this.Zx.markSupported());
  }
  
  public int read() throws IOException {
    if (this.ZY != null) {
      int i = this.ZY[this.Zc++] & 0xFF;
      try {
        if (this.Zc >= this.Zy)
          ZQ(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return i;
    } 
    return this.Zx.read();
  }
  
  public int read(byte[] paramArrayOfbyte) throws IOException {
    return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    if (this.ZY != null) {
      int i = this.Zy - this.Zc;
      if (paramInt2 > i)
        paramInt2 = i; 
      try {
        System.arraycopy(this.ZY, this.Zc, paramArrayOfbyte, paramInt1, paramInt2);
        this.Zc += paramInt2;
        if (this.Zc >= this.Zy)
          ZQ(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return paramInt2;
    } 
    return this.Zx.read(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public synchronized void reset() throws IOException {
    try {
      if (this.ZY == null)
        this.Zx.reset(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public long skip(long paramLong) throws IOException {
    long l = 0L;
    if (this.ZY != null) {
      int i = this.Zy - this.Zc;
      try {
        if (i > paramLong) {
          this.Zc += (int)paramLong;
          return paramLong;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      ZQ();
      l += i;
      paramLong -= i;
    } 
    if (paramLong > 0L)
      l += this.Zx.skip(paramLong); 
    return l;
  }
  
  private void ZQ() {
    byte[] arrayOfByte = this.ZY;
    if (arrayOfByte != null) {
      this.ZY = null;
      if (this.Za != null)
        this.Za.ZO(arrayOfByte); 
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */