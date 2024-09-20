package org.bouncycastle.pqc.crypto.gemss;

import java.security.SecureRandom;

class PointerUnion extends Pointer {
  protected int remainder;
  
  public PointerUnion(byte[] paramArrayOfbyte) {
    super((paramArrayOfbyte.length >> 3) + (((paramArrayOfbyte.length & 0x7) != 0) ? 1 : 0));
    byte b1 = 0;
    for (byte b2 = 0; b1 < paramArrayOfbyte.length && b2 < this.array.length; b2++) {
      byte b = 0;
      while (b < 8 && b1 < paramArrayOfbyte.length) {
        this.array[b2] = this.array[b2] | (paramArrayOfbyte[b1] & 0xFFL) << b << 3;
        b++;
        b1++;
      } 
    } 
    this.remainder = 0;
  }
  
  public PointerUnion(int paramInt) {
    super((paramInt >>> 3) + (((paramInt & 0x7) != 0) ? 1 : 0));
    this.remainder = 0;
  }
  
  public PointerUnion(PointerUnion paramPointerUnion) {
    super(paramPointerUnion);
    this.remainder = paramPointerUnion.remainder;
  }
  
  public PointerUnion(Pointer paramPointer) {
    super(paramPointer);
    this.remainder = 0;
  }
  
  public void moveNextBytes(int paramInt) {
    this.remainder += paramInt;
    this.cp += this.remainder >>> 3;
    this.remainder &= 0x7;
  }
  
  public void moveNextByte() {
    this.remainder++;
    this.cp += this.remainder >>> 3;
    this.remainder &= 0x7;
  }
  
  public long get() {
    return (this.remainder == 0) ? this.array[this.cp] : (this.array[this.cp] >>> this.remainder << 3 | this.array[this.cp + 1] << 8 - this.remainder << 3);
  }
  
  public long getWithCheck() {
    return (this.cp >= this.array.length) ? 0L : ((this.remainder == 0) ? this.array[this.cp] : ((this.cp == this.array.length - 1) ? (this.array[this.cp] >>> this.remainder << 3) : (this.array[this.cp] >>> this.remainder << 3 | this.array[this.cp + 1] << 8 - this.remainder << 3)));
  }
  
  public long getWithCheck(int paramInt) {
    paramInt += this.cp;
    return (paramInt >= this.array.length) ? 0L : ((this.remainder == 0) ? this.array[paramInt] : ((paramInt == this.array.length - 1) ? (this.array[paramInt] >>> this.remainder << 3) : (this.array[paramInt] >>> this.remainder << 3 | this.array[paramInt + 1] << 8 - this.remainder << 3)));
  }
  
  public long get(int paramInt) {
    return (this.remainder == 0) ? this.array[this.cp + paramInt] : (this.array[this.cp + paramInt] >>> this.remainder << 3 | this.array[this.cp + paramInt + 1] << 8 - this.remainder << 3);
  }
  
  public byte getByte() {
    return (byte)(int)(this.array[this.cp] >>> this.remainder << 3);
  }
  
  public byte getByte(int paramInt) {
    int i = this.cp + (paramInt + this.remainder >>> 3);
    int j = this.remainder + paramInt & 0x7;
    return (byte)(int)(this.array[i] >>> j << 3);
  }
  
  public void setRangeClear(int paramInt1, int paramInt2) {
    if (this.remainder == 0) {
      super.setRangeClear(paramInt1, paramInt2);
    } else {
      this.array[this.cp + paramInt1] = this.array[this.cp + paramInt1] & -1L >>> 8 - this.remainder << 3;
      super.setRangeClear(paramInt1 + 1, paramInt2);
      this.array[this.cp + paramInt2 + 1] = this.array[this.cp + paramInt2 + 1] & -1L << this.remainder << 3;
    } 
  }
  
  public void setAnd(int paramInt, long paramLong) {
    if (this.remainder == 0) {
      super.setAnd(paramInt, paramLong);
    } else {
      int i = this.remainder << 3;
      int j = 8 - this.remainder << 3;
      this.array[this.cp + paramInt] = this.array[this.cp + paramInt] & (paramLong << i | -1L >>> j);
      this.array[this.cp + paramInt + 1] = this.array[this.cp + paramInt + 1] & (paramLong >>> j | -1L << i);
    } 
  }
  
  public void indexReset() {
    this.cp = 0;
    this.remainder = 0;
  }
  
  public void setByteIndex(int paramInt) {
    this.remainder = paramInt & 0x7;
    this.cp = paramInt >>> 3;
  }
  
  public byte[] toBytes(int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    for (int i = this.remainder; i < arrayOfByte.length + this.remainder; i++)
      arrayOfByte[i - this.remainder] = (byte)(int)(this.array[this.cp + (i >>> 3)] >>> (i & 0x7) << 3); 
    return arrayOfByte;
  }
  
  public int toBytesMove(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    for (byte b = 0; b < paramInt2; b++) {
      paramArrayOfbyte[paramInt1++] = (byte)(int)(this.array[this.cp] >>> this.remainder++ << 3);
      if (this.remainder == 8) {
        this.remainder = 0;
        this.cp++;
      } 
    } 
    return paramInt1;
  }
  
  public void setXor(int paramInt, long paramLong) {
    if (this.remainder == 0) {
      super.setXor(paramInt, paramLong);
    } else {
      this.array[this.cp + paramInt] = this.array[this.cp + paramInt] ^ paramLong << this.remainder << 3;
      this.array[this.cp + paramInt + 1] = this.array[this.cp + paramInt + 1] ^ paramLong >>> 8 - this.remainder << 3;
    } 
  }
  
  public void setXor(long paramLong) {
    if (this.remainder == 0) {
      super.setXor(paramLong);
    } else {
      this.array[this.cp] = this.array[this.cp] ^ paramLong << this.remainder << 3;
      this.array[this.cp + 1] = this.array[this.cp + 1] ^ paramLong >>> 8 - this.remainder << 3;
    } 
  }
  
  public void setXorRangeAndMask(Pointer paramPointer, int paramInt, long paramLong) {
    if (this.remainder == 0) {
      super.setXorRangeAndMask(paramPointer, paramInt, paramLong);
      return;
    } 
    int i = this.cp;
    int j = paramPointer.cp;
    int k = this.remainder << 3;
    int m = 8 - this.remainder << 3;
    for (byte b = 0; b < paramInt; b++) {
      long l = paramPointer.array[j++] & paramLong;
      this.array[i] = this.array[i] ^ l << k;
      this.array[++i] = this.array[++i] ^ l >>> m;
    } 
  }
  
  public void setXorByte(int paramInt) {
    this.array[this.cp] = this.array[this.cp] ^ (paramInt & 0xFFL) << this.remainder << 3;
  }
  
  public void setAndByte(int paramInt, long paramLong) {
    int i = paramInt + this.remainder + (this.cp << 3);
    int j = i >>> 3;
    i &= 0x7;
    this.array[j] = this.array[j] & ((paramLong & 0xFFL) << i << 3 | 255L << i << 3 ^ 0xFFFFFFFFFFFFFFFFL);
  }
  
  public void setAndThenXorByte(int paramInt, long paramLong1, long paramLong2) {
    int i = paramInt + this.remainder + (this.cp << 3);
    int j = i >>> 3;
    i &= 0x7;
    this.array[j] = this.array[j] & ((paramLong1 & 0xFFL) << i << 3 | 255L << i << 3 ^ 0xFFFFFFFFFFFFFFFFL);
    this.array[j] = this.array[j] ^ (paramLong2 & 0xFFL) << i << 3;
  }
  
  public void set(int paramInt, long paramLong) {
    if (this.remainder == 0) {
      super.setXor(paramInt, paramLong);
    } else {
      int i = this.remainder << 3;
      int j = 8 - this.remainder << 3;
      this.array[this.cp + paramInt] = paramLong << i | this.array[this.cp + paramInt] & -1L >>> j;
      this.array[this.cp + paramInt + 1] = paramLong >>> j | this.array[this.cp + paramInt + 1] & -1L << i;
    } 
  }
  
  public void setByte(int paramInt) {
    this.array[this.cp] = (paramInt & 0xFFL) << this.remainder << 3 | this.array[this.cp] & -1L >>> 8 - this.remainder << 3;
  }
  
  public void fill(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    if (this.remainder != 0) {
      int i = this.cp + paramInt1;
      int j = this.remainder;
      this.array[i] = this.array[i] & (-1L << j << 3 ^ 0xFFFFFFFFFFFFFFFFL);
      byte b = 0;
      while (j < 8 && b < paramInt3) {
        this.array[i] = this.array[i] | (paramArrayOfbyte[paramInt2] & 0xFFL) << j << 3;
        paramInt2++;
        b++;
        j++;
      } 
      paramInt1++;
      paramInt3 -= 8 - this.remainder;
    } 
    super.fill(paramInt1, paramArrayOfbyte, paramInt2, paramInt3);
  }
  
  public void fillBytes(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    int i = paramInt1 + this.remainder;
    int j = this.cp + (i >>> 3);
    i &= 0x7;
    if (i != 0) {
      this.array[j] = this.array[j] & (-1L << i << 3 ^ 0xFFFFFFFFFFFFFFFFL);
      byte b = 0;
      while (i < 8 && b < paramInt3) {
        this.array[j] = this.array[j] | (paramArrayOfbyte[paramInt2] & 0xFFL) << i << 3;
        paramInt2++;
        b++;
        i++;
      } 
      j++;
      paramInt3 -= b;
    } 
    super.fill(j - this.cp, paramArrayOfbyte, paramInt2, paramInt3);
  }
  
  public void fillRandomBytes(int paramInt1, SecureRandom paramSecureRandom, int paramInt2) {
    byte[] arrayOfByte = new byte[paramInt2];
    paramSecureRandom.nextBytes(arrayOfByte);
    fillBytes(paramInt1, arrayOfByte, 0, arrayOfByte.length);
  }
  
  public void changeIndex(PointerUnion paramPointerUnion) {
    this.array = paramPointerUnion.array;
    this.cp = paramPointerUnion.cp;
    this.remainder = paramPointerUnion.remainder;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\gemss\PointerUnion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */