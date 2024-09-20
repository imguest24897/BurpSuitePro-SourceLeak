package org.bouncycastle.oer;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

public class BitBuilder {
  private static final byte[] bits = new byte[] { Byte.MIN_VALUE, 64, 32, 16, 8, 4, 2, 1 };
  
  byte[] buf = new byte[1];
  
  int pos = 0;
  
  public BitBuilder writeBit(int paramInt) {
    if (this.pos / 8 >= this.buf.length) {
      byte[] arrayOfByte = new byte[this.buf.length + 4];
      System.arraycopy(this.buf, 0, arrayOfByte, 0, this.pos / 8);
      Arrays.clear(this.buf);
      this.buf = arrayOfByte;
    } 
    if (paramInt == 0) {
      this.buf[this.pos / 8] = (byte)(this.buf[this.pos / 8] & (bits[this.pos % 8] ^ 0xFFFFFFFF));
    } else {
      this.buf[this.pos / 8] = (byte)(this.buf[this.pos / 8] | bits[this.pos % 8]);
    } 
    this.pos++;
    return this;
  }
  
  public BitBuilder writeBits(long paramLong, int paramInt) {
    for (int i = paramInt - 1; i >= 0; i--) {
      boolean bool = ((paramLong & 1L << i) > 0L) ? true : false;
      writeBit(bool);
    } 
    return this;
  }
  
  public BitBuilder writeBits(long paramLong, int paramInt1, int paramInt2) {
    for (int i = paramInt1 - 1; i >= paramInt1 - paramInt2; i--) {
      boolean bool = ((paramLong & 1L << i) != 0L) ? true : false;
      writeBit(bool);
    } 
    return this;
  }
  
  public int write(OutputStream paramOutputStream) throws IOException {
    int i = (this.pos + this.pos % 8) / 8;
    paramOutputStream.write(this.buf, 0, i);
    paramOutputStream.flush();
    return i;
  }
  
  public int writeAndClear(OutputStream paramOutputStream) throws IOException {
    int i = (this.pos + this.pos % 8) / 8;
    paramOutputStream.write(this.buf, 0, i);
    paramOutputStream.flush();
    zero();
    return i;
  }
  
  public void pad() {
    this.pos += this.pos % 8;
  }
  
  public void write7BitBytes(int paramInt) {
    boolean bool = false;
    for (byte b = 4; b >= 0; b--) {
      if (!bool && (paramInt & 0xFE000000) != 0)
        bool = true; 
      if (bool)
        writeBit(b).writeBits(paramInt, 32, 7); 
      paramInt <<= 7;
    } 
  }
  
  public void write7BitBytes(BigInteger paramBigInteger) {
    int i = (paramBigInteger.bitLength() + paramBigInteger.bitLength() % 8) / 8;
    BigInteger bigInteger = BigInteger.valueOf(254L).shiftLeft(i * 8);
    boolean bool = false;
    for (int j = i; j >= 0; j--) {
      if (!bool && paramBigInteger.and(bigInteger).compareTo(BigInteger.ZERO) != 0)
        bool = true; 
      if (bool) {
        BigInteger bigInteger1 = paramBigInteger.and(bigInteger).shiftRight(8 * i - 8);
        writeBit(j).writeBits(bigInteger1.intValue(), 8, 7);
      } 
      paramBigInteger = paramBigInteger.shiftLeft(7);
    } 
  }
  
  public void zero() {
    Arrays.clear(this.buf);
    this.pos = 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\BitBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */