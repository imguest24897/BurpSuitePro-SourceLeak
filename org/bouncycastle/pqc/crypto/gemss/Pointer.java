package org.bouncycastle.pqc.crypto.gemss;

import java.security.SecureRandom;
import java.util.Arrays;
import org.bouncycastle.util.Pack;

class Pointer {
  protected long[] array;
  
  protected int cp;
  
  public Pointer() {
    this.cp = 0;
  }
  
  public Pointer(int paramInt) {
    this.array = new long[paramInt];
    this.cp = 0;
  }
  
  public Pointer(Pointer paramPointer) {
    this.array = paramPointer.array;
    this.cp = paramPointer.cp;
  }
  
  public Pointer(Pointer paramPointer, int paramInt) {
    this.array = paramPointer.array;
    paramPointer.cp += paramInt;
  }
  
  public long get(int paramInt) {
    return this.array[this.cp + paramInt];
  }
  
  public long get() {
    return this.array[this.cp];
  }
  
  public void set(int paramInt, long paramLong) {
    this.array[this.cp + paramInt] = paramLong;
  }
  
  public void set(long paramLong) {
    this.array[this.cp] = paramLong;
  }
  
  public void setXor(int paramInt, long paramLong) {
    this.array[this.cp + paramInt] = this.array[this.cp + paramInt] ^ paramLong;
  }
  
  public void setXor(long paramLong) {
    this.array[this.cp] = this.array[this.cp] ^ paramLong;
  }
  
  public void setXorRange(Pointer paramPointer, int paramInt) {
    int i = this.cp;
    int j = paramPointer.cp;
    for (byte b = 0; b < paramInt; b++)
      this.array[i++] = this.array[i++] ^ paramPointer.array[j++]; 
  }
  
  public void setXorRange(Pointer paramPointer, int paramInt1, int paramInt2) {
    int i = this.cp;
    paramInt1 += paramPointer.cp;
    for (byte b = 0; b < paramInt2; b++)
      this.array[i++] = this.array[i++] ^ paramPointer.array[paramInt1++]; 
  }
  
  public void setXorRange(int paramInt1, Pointer paramPointer, int paramInt2, int paramInt3) {
    paramInt1 += this.cp;
    paramInt2 += paramPointer.cp;
    for (byte b = 0; b < paramInt3; b++)
      this.array[paramInt1++] = this.array[paramInt1++] ^ paramPointer.array[paramInt2++]; 
  }
  
  public void setXorRange_SelfMove(Pointer paramPointer, int paramInt) {
    int i = paramPointer.cp;
    for (byte b = 0; b < paramInt; b++)
      this.array[this.cp++] = this.array[this.cp++] ^ paramPointer.array[i++]; 
  }
  
  public void setXorMatrix_NoMove(Pointer paramPointer, int paramInt1, int paramInt2) {
    int i = this.cp;
    for (byte b = 0; b < paramInt2; b++) {
      byte b1 = 0;
      int j = i;
      while (b1 < paramInt1) {
        this.array[j++] = this.array[j++] ^ paramPointer.array[paramPointer.cp++];
        b1++;
      } 
    } 
  }
  
  public void setXorMatrix(Pointer paramPointer, int paramInt1, int paramInt2) {
    int i = this.cp;
    for (byte b = 0; b < paramInt2; b++) {
      byte b1 = 0;
      int j = i;
      while (b1 < paramInt1) {
        this.array[j++] = this.array[j++] ^ paramPointer.array[paramPointer.cp++];
        b1++;
      } 
    } 
    this.cp += paramInt1;
  }
  
  public void setXorRangeXor(int paramInt1, Pointer paramPointer1, int paramInt2, Pointer paramPointer2, int paramInt3, int paramInt4) {
    paramInt1 += this.cp;
    paramInt2 += paramPointer1.cp;
    paramInt3 += paramPointer2.cp;
    for (byte b = 0; b < paramInt4; b++)
      this.array[paramInt1++] = this.array[paramInt1++] ^ paramPointer1.array[paramInt2++] ^ paramPointer2.array[paramInt3++]; 
  }
  
  public void setXorRange(int paramInt1, PointerUnion paramPointerUnion, int paramInt2, int paramInt3) {
    paramInt1 += this.cp;
    paramInt2 += paramPointerUnion.cp;
    if (paramPointerUnion.remainder == 0) {
      for (byte b = 0; b < paramInt3; b++)
        this.array[paramInt1++] = this.array[paramInt1++] ^ paramPointerUnion.array[paramInt2++]; 
    } else {
      int i = paramPointerUnion.remainder << 3;
      int j = 8 - paramPointerUnion.remainder << 3;
      for (byte b = 0; b < paramInt3; b++)
        this.array[paramInt1++] = this.array[paramInt1++] ^ (paramPointerUnion.array[paramInt2] >>> i | paramPointerUnion.array[++paramInt2] << j); 
    } 
  }
  
  public void setXorRangeAndMask(Pointer paramPointer, int paramInt, long paramLong) {
    int i = this.cp;
    int j = paramPointer.cp;
    for (byte b = 0; b < paramInt; b++)
      this.array[i++] = this.array[i++] ^ paramPointer.array[j++] & paramLong; 
  }
  
  public void setXorRangeAndMaskMove(Pointer paramPointer, int paramInt, long paramLong) {
    int i = this.cp;
    for (byte b = 0; b < paramInt; b++)
      this.array[i++] = this.array[i++] ^ paramPointer.array[paramPointer.cp++] & paramLong; 
  }
  
  public void setRangeRotate(int paramInt1, Pointer paramPointer, int paramInt2, int paramInt3, int paramInt4) {
    int i = 64 - paramInt4;
    paramInt1 += this.cp;
    paramInt2 += paramPointer.cp;
    for (byte b = 0; b < paramInt3; b++)
      this.array[paramInt1++] = paramPointer.array[paramInt2] >>> i ^ paramPointer.array[++paramInt2] << paramInt4; 
  }
  
  public void move(int paramInt) {
    this.cp += paramInt;
  }
  
  public void moveIncremental() {
    this.cp++;
  }
  
  public long[] getArray() {
    return this.array;
  }
  
  public int getIndex() {
    return this.cp;
  }
  
  public void setAnd(int paramInt, long paramLong) {
    this.array[this.cp + paramInt] = this.array[this.cp + paramInt] & paramLong;
  }
  
  public void setAnd(long paramLong) {
    this.array[this.cp] = this.array[this.cp] & paramLong;
  }
  
  public void setClear(int paramInt) {
    this.array[this.cp + paramInt] = 0L;
  }
  
  public void changeIndex(Pointer paramPointer) {
    this.array = paramPointer.array;
    this.cp = paramPointer.cp;
  }
  
  public void changeIndex(int paramInt) {
    this.cp = paramInt;
  }
  
  public void changeIndex(Pointer paramPointer, int paramInt) {
    this.array = paramPointer.array;
    paramPointer.cp += paramInt;
  }
  
  public void setRangeClear(int paramInt1, int paramInt2) {
    paramInt1 += this.cp;
    Arrays.fill(this.array, paramInt1, paramInt1 + paramInt2, 0L);
  }
  
  public int getLength() {
    return this.array.length - this.cp;
  }
  
  public void copyFrom(Pointer paramPointer, int paramInt) {
    System.arraycopy(paramPointer.array, paramPointer.cp, this.array, this.cp, paramInt);
  }
  
  public void copyFrom(int paramInt1, Pointer paramPointer, int paramInt2, int paramInt3) {
    System.arraycopy(paramPointer.array, paramPointer.cp + paramInt2, this.array, this.cp + paramInt1, paramInt3);
  }
  
  public void set1_gf2n(int paramInt1, int paramInt2) {
    int i = this.cp + paramInt1;
    this.array[i++] = 1L;
    for (byte b = 1; b < paramInt2; b++)
      this.array[i++] = 0L; 
  }
  
  public byte[] toBytes(int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    for (byte b = 0; b < arrayOfByte.length; b++)
      arrayOfByte[b] = (byte)(int)(this.array[this.cp + (b >>> 3)] >>> (b & 0x7) << 3); 
    return arrayOfByte;
  }
  
  public void indexReset() {
    this.cp = 0;
  }
  
  public void fillRandom(int paramInt1, SecureRandom paramSecureRandom, int paramInt2) {
    byte[] arrayOfByte = new byte[paramInt2];
    paramSecureRandom.nextBytes(arrayOfByte);
    fill(paramInt1, arrayOfByte, 0, arrayOfByte.length);
  }
  
  public void fill(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    byte b = 0;
    int i;
    for (i = this.cp + paramInt1; i < this.array.length && b + 8 <= paramInt3; i++) {
      this.array[i] = Pack.littleEndianToLong(paramArrayOfbyte, paramInt2);
      paramInt2 += 8;
      b += 8;
    } 
    if (b < paramInt3 && i < this.array.length) {
      byte b1 = 0;
      this.array[i] = 0L;
      while (b1 < 8 && b < paramInt3) {
        this.array[i] = this.array[i] | (paramArrayOfbyte[paramInt2] & 0xFFL) << b1 << 3;
        b1++;
        paramInt2++;
        b++;
      } 
    } 
  }
  
  public void setRangeFromXor(int paramInt1, Pointer paramPointer1, int paramInt2, Pointer paramPointer2, int paramInt3, int paramInt4) {
    paramInt1 += this.cp;
    paramInt2 += paramPointer1.cp;
    paramInt3 += paramPointer2.cp;
    for (byte b = 0; b < paramInt4; b++)
      this.array[paramInt1++] = paramPointer1.array[paramInt2++] ^ paramPointer2.array[paramInt3++]; 
  }
  
  public void setRangeFromXor(Pointer paramPointer1, Pointer paramPointer2, int paramInt) {
    byte b = 0;
    int i = this.cp;
    int j = paramPointer1.cp;
    int k = paramPointer2.cp;
    while (b < paramInt) {
      this.array[i++] = paramPointer1.array[j++] ^ paramPointer2.array[k++];
      b++;
    } 
  }
  
  public void setRangeFromXorAndMask_xor(Pointer paramPointer1, Pointer paramPointer2, long paramLong, int paramInt) {
    int i = this.cp;
    int j = paramPointer1.cp;
    int k = paramPointer2.cp;
    for (byte b = 0; b < paramInt; b++) {
      this.array[i] = (paramPointer1.array[j] ^ paramPointer2.array[k]) & paramLong;
      paramPointer1.array[j++] = paramPointer1.array[j++] ^ this.array[i];
      paramPointer2.array[k++] = paramPointer2.array[k++] ^ this.array[i++];
    } 
  }
  
  public int is0_gf2n(int paramInt1, int paramInt2) {
    long l = get(paramInt1);
    for (byte b = 1; b < paramInt2; b++)
      l |= get(paramInt1 + b); 
    return (int)GeMSSUtils.NORBITS_UINT(l);
  }
  
  public long getDotProduct(int paramInt1, Pointer paramPointer, int paramInt2, int paramInt3) {
    paramInt1 += this.cp;
    paramInt2 += paramPointer.cp;
    long l = this.array[paramInt1++] & paramPointer.array[paramInt2++];
    for (byte b = 1; b < paramInt3; b++)
      l ^= this.array[paramInt1++] & paramPointer.array[paramInt2++]; 
    return l;
  }
  
  public int getD_for_not0_or_plus(int paramInt1, int paramInt2) {
    int i = paramInt2;
    int j = 0;
    long l = 0L;
    int k = this.cp;
    while (i > 0) {
      long l1 = this.array[k++];
      for (byte b = 1; b < paramInt1; b++)
        l1 |= this.array[k++]; 
      l |= GeMSSUtils.ORBITS_UINT(l1);
      j = (int)(j + l);
      i--;
    } 
    return j;
  }
  
  public int setRange_xi(long paramLong, int paramInt1, int paramInt2) {
    byte b = 0;
    while (b < paramInt2) {
      this.array[this.cp + paramInt1] = -(paramLong >>> b & 0x1L);
      b++;
      paramInt1++;
    } 
    return paramInt1;
  }
  
  public int searchDegree(int paramInt1, int paramInt2, int paramInt3) {
    while (is0_gf2n(paramInt1 * paramInt3, paramInt3) != 0 && paramInt1 >= paramInt2)
      paramInt1--; 
    return paramInt1;
  }
  
  public void setRangePointerUnion(PointerUnion paramPointerUnion, int paramInt) {
    if (paramPointerUnion.remainder == 0) {
      System.arraycopy(paramPointerUnion.array, paramPointerUnion.cp, this.array, this.cp, paramInt);
    } else {
      int i = 8 - paramPointerUnion.remainder << 3;
      int j = paramPointerUnion.remainder << 3;
      int k = this.cp;
      int m = paramPointerUnion.cp;
      for (byte b = 0; b < paramInt; b++)
        this.array[k++] = paramPointerUnion.array[m] >>> j ^ paramPointerUnion.array[++m] << i; 
    } 
  }
  
  public void setRangePointerUnion(PointerUnion paramPointerUnion, int paramInt1, int paramInt2) {
    int i = paramInt2 & 0x3F;
    int j = 64 - i;
    int k = this.cp;
    int m = paramPointerUnion.cp;
    if (paramPointerUnion.remainder == 0) {
      for (byte b = 0; b < paramInt1; b++)
        this.array[k++] = paramPointerUnion.array[m] >>> i ^ paramPointerUnion.array[++m] << j; 
    } else {
      int n = paramPointerUnion.remainder << 3;
      int i1 = 8 - paramPointerUnion.remainder << 3;
      for (byte b = 0; b < paramInt1; b++)
        this.array[k++] = (paramPointerUnion.array[m] >>> n | paramPointerUnion.array[++m] << i1) >>> i ^ (paramPointerUnion.array[m] >>> n | paramPointerUnion.array[m + 1] << i1) << j; 
    } 
  }
  
  public void setRangePointerUnion_Check(PointerUnion paramPointerUnion, int paramInt1, int paramInt2) {
    int i = paramInt2 & 0x3F;
    int j = 64 - i;
    int k = this.cp;
    int m = paramPointerUnion.cp;
    if (paramPointerUnion.remainder == 0) {
      byte b;
      for (b = 0; b < paramInt1 && m < paramPointerUnion.array.length - 1; b++)
        this.array[k++] = paramPointerUnion.array[m] >>> i ^ paramPointerUnion.array[++m] << j; 
      if (b < paramInt1)
        this.array[k] = paramPointerUnion.array[m] >>> i; 
    } else {
      int n = paramPointerUnion.remainder << 3;
      int i1 = 8 - paramPointerUnion.remainder << 3;
      byte b;
      for (b = 0; b < paramInt1 && m < paramPointerUnion.array.length - 2; b++)
        this.array[k++] = (paramPointerUnion.array[m] >>> n | paramPointerUnion.array[++m] << i1) >>> i ^ (paramPointerUnion.array[m] >>> n | paramPointerUnion.array[m + 1] << i1) << j; 
      if (b < paramInt1)
        this.array[k] = (paramPointerUnion.array[m] >>> n | paramPointerUnion.array[++m] << i1) >>> i ^ paramPointerUnion.array[m] >>> n << j; 
    } 
  }
  
  public int isEqual_nocst_gf2(Pointer paramPointer, int paramInt) {
    int i = paramPointer.cp;
    int j = this.cp;
    for (byte b = 0; b < paramInt; b++) {
      if (this.array[j++] != paramPointer.array[i++])
        return 0; 
    } 
    return 1;
  }
  
  public void swap(Pointer paramPointer) {
    long[] arrayOfLong = paramPointer.array;
    int i = paramPointer.cp;
    paramPointer.array = this.array;
    paramPointer.cp = this.cp;
    this.array = arrayOfLong;
    this.cp = i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\gemss\Pointer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */