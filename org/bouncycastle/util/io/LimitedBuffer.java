package org.bouncycastle.util.io;

import java.io.OutputStream;

public class LimitedBuffer extends OutputStream {
  private final byte[] buf;
  
  private int count;
  
  public LimitedBuffer(int paramInt) {
    this.buf = new byte[paramInt];
    this.count = 0;
  }
  
  public int copyTo(byte[] paramArrayOfbyte, int paramInt) {
    System.arraycopy(this.buf, 0, paramArrayOfbyte, paramInt, this.count);
    return this.count;
  }
  
  public int limit() {
    return this.buf.length;
  }
  
  public void reset() {
    this.count = 0;
  }
  
  public int size() {
    return this.count;
  }
  
  public void write(int paramInt) {
    this.buf[this.count++] = (byte)paramInt;
  }
  
  public void write(byte[] paramArrayOfbyte) {
    System.arraycopy(paramArrayOfbyte, 0, this.buf, this.count, paramArrayOfbyte.length);
    this.count += paramArrayOfbyte.length;
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    System.arraycopy(paramArrayOfbyte, paramInt1, this.buf, this.count, paramInt2);
    this.count += paramInt2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastl\\util\io\LimitedBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */