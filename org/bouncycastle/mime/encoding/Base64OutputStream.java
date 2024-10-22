package org.bouncycastle.mime.encoding;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.encoders.Base64Encoder;

public class Base64OutputStream extends FilterOutputStream {
  private static final Base64Encoder ENCODER = new Base64Encoder();
  
  private static final int INBUF_SIZE = 54;
  
  private static final int OUTBUF_SIZE = 74;
  
  private final byte[] inBuf = new byte[54];
  
  private final byte[] outBuf = new byte[74];
  
  private int inPos = 0;
  
  public Base64OutputStream(OutputStream paramOutputStream) {
    super(paramOutputStream);
    this.outBuf[72] = 13;
    this.outBuf[73] = 10;
  }
  
  public void write(int paramInt) throws IOException {
    this.inBuf[this.inPos++] = (byte)paramInt;
    if (this.inPos == 54) {
      encodeBlock(this.inBuf, 0);
      this.inPos = 0;
    } 
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    int i = 54 - this.inPos;
    if (paramInt2 < i) {
      System.arraycopy(paramArrayOfbyte, paramInt1, this.inBuf, this.inPos, paramInt2);
      this.inPos += paramInt2;
      return;
    } 
    int j = 0;
    if (this.inPos > 0) {
      System.arraycopy(paramArrayOfbyte, paramInt1, this.inBuf, this.inPos, i);
      j += i;
      encodeBlock(this.inBuf, 0);
    } 
    int k;
    while ((k = paramInt2 - j) >= 54) {
      encodeBlock(paramArrayOfbyte, paramInt1 + j);
      j += 54;
    } 
    System.arraycopy(paramArrayOfbyte, paramInt1 + j, this.inBuf, 0, k);
    this.inPos = k;
  }
  
  public void write(byte[] paramArrayOfbyte) throws IOException {
    write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public void close() throws IOException {
    if (this.inPos > 0) {
      int i = ENCODER.encode(this.inBuf, 0, this.inPos, this.outBuf, 0);
      this.inPos = 0;
      this.outBuf[i++] = 13;
      this.outBuf[i++] = 10;
      this.out.write(this.outBuf, 0, i);
    } 
    this.out.close();
  }
  
  private void encodeBlock(byte[] paramArrayOfbyte, int paramInt) throws IOException {
    ENCODER.encode(paramArrayOfbyte, paramInt, 54, this.outBuf, 0);
    this.out.write(this.outBuf, 0, 74);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\mime\encoding\Base64OutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */