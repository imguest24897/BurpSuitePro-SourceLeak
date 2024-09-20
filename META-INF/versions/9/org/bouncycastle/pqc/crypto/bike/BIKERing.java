package META-INF.versions.9.org.bouncycastle.pqc.crypto.bike;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

class BIKERing {
  private static final int PERMUTATION_CUTOFF = 64;
  
  private final int bits;
  
  private final int size;
  
  private final int sizeExt;
  
  private final Map<Integer, Integer> halfPowers = new HashMap<>();
  
  BIKERing(int paramInt) {
    if ((paramInt & 0xFFFF0001) != 1)
      throw new IllegalArgumentException(); 
    this.bits = paramInt;
    this.size = paramInt + 63 >>> 6;
    this.sizeExt = this.size * 2;
    generateHalfPowersInv(this.halfPowers, paramInt);
  }
  
  void add(long[] paramArrayOflong1, long[] paramArrayOflong2, long[] paramArrayOflong3) {
    for (byte b = 0; b < this.size; b++)
      paramArrayOflong3[b] = paramArrayOflong1[b] ^ paramArrayOflong2[b]; 
  }
  
  void addTo(long[] paramArrayOflong1, long[] paramArrayOflong2) {
    for (byte b = 0; b < this.size; b++)
      paramArrayOflong2[b] = paramArrayOflong2[b] ^ paramArrayOflong1[b]; 
  }
  
  void copy(long[] paramArrayOflong1, long[] paramArrayOflong2) {
    for (byte b = 0; b < this.size; b++)
      paramArrayOflong2[b] = paramArrayOflong1[b]; 
  }
  
  long[] create() {
    return new long[this.size];
  }
  
  long[] createExt() {
    return new long[this.sizeExt];
  }
  
  void decodeBytes(byte[] paramArrayOfbyte, long[] paramArrayOflong) {
    int i = this.bits & 0x3F;
    Pack.littleEndianToLong(paramArrayOfbyte, 0, paramArrayOflong, 0, this.size - 1);
    byte[] arrayOfByte = new byte[8];
    System.arraycopy(paramArrayOfbyte, this.size - 1 << 3, arrayOfByte, 0, i + 7 >>> 3);
    paramArrayOflong[this.size - 1] = Pack.littleEndianToLong(arrayOfByte, 0);
  }
  
  byte[] encodeBitsTransposed(long[] paramArrayOflong) {
    byte[] arrayOfByte = new byte[this.bits];
    arrayOfByte[0] = (byte)(int)(paramArrayOflong[0] & 0x1L);
    for (byte b = 1; b < this.bits; b++)
      arrayOfByte[this.bits - b] = (byte)(int)(paramArrayOflong[b >>> 6] >>> (b & 0x3F) & 0x1L); 
    return arrayOfByte;
  }
  
  void encodeBytes(long[] paramArrayOflong, byte[] paramArrayOfbyte) {
    int i = this.bits & 0x3F;
    Pack.longToLittleEndian(paramArrayOflong, 0, this.size - 1, paramArrayOfbyte, 0);
    byte[] arrayOfByte = new byte[8];
    Pack.longToLittleEndian(paramArrayOflong[this.size - 1], arrayOfByte, 0);
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, this.size - 1 << 3, i + 7 >>> 3);
  }
  
  void inv(long[] paramArrayOflong1, long[] paramArrayOflong2) {
    long[] arrayOfLong1 = create();
    long[] arrayOfLong2 = create();
    long[] arrayOfLong3 = create();
    copy(paramArrayOflong1, arrayOfLong1);
    copy(paramArrayOflong1, arrayOfLong3);
    int i = this.bits - 2;
    int j = 32 - Integers.numberOfLeadingZeros(i);
    for (byte b = 1; b < j; b++) {
      squareN(arrayOfLong1, 1 << b - 1, arrayOfLong2);
      multiply(arrayOfLong1, arrayOfLong2, arrayOfLong1);
      if ((i & 1 << b) != 0) {
        int k = i & (1 << b) - 1;
        squareN(arrayOfLong1, k, arrayOfLong2);
        multiply(arrayOfLong3, arrayOfLong2, arrayOfLong3);
      } 
    } 
    square(arrayOfLong3, paramArrayOflong2);
  }
  
  void multiply(long[] paramArrayOflong1, long[] paramArrayOflong2, long[] paramArrayOflong3) {
    long[] arrayOfLong = createExt();
    implMultiplyAcc(paramArrayOflong1, paramArrayOflong2, arrayOfLong);
    reduce(arrayOfLong, paramArrayOflong3);
  }
  
  void reduce(long[] paramArrayOflong1, long[] paramArrayOflong2) {
    int i = this.bits & 0x3F;
    int j = 64 - i;
    long l = -1L >>> j;
    Nat.shiftUpBits64(this.size, paramArrayOflong1, this.size, j, paramArrayOflong1[this.size - 1], paramArrayOflong2, 0);
    addTo(paramArrayOflong1, paramArrayOflong2);
    paramArrayOflong2[this.size - 1] = paramArrayOflong2[this.size - 1] & l;
  }
  
  int getSize() {
    return this.size;
  }
  
  int getSizeExt() {
    return this.sizeExt;
  }
  
  void square(long[] paramArrayOflong1, long[] paramArrayOflong2) {
    long[] arrayOfLong = createExt();
    implSquare(paramArrayOflong1, arrayOfLong);
    reduce(arrayOfLong, paramArrayOflong2);
  }
  
  void squareN(long[] paramArrayOflong1, int paramInt, long[] paramArrayOflong2) {
    if (paramInt >= 64) {
      implPermute(paramArrayOflong1, paramInt, paramArrayOflong2);
      return;
    } 
    long[] arrayOfLong = createExt();
    implSquare(paramArrayOflong1, arrayOfLong);
    reduce(arrayOfLong, paramArrayOflong2);
    while (--paramInt > 0) {
      implSquare(paramArrayOflong2, arrayOfLong);
      reduce(arrayOfLong, paramArrayOflong2);
    } 
  }
  
  private static int implModAdd(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt2 + paramInt3 - paramInt1;
    return i + (i >> 31 & paramInt1);
  }
  
  protected void implMultiplyAcc(long[] paramArrayOflong1, long[] paramArrayOflong2, long[] paramArrayOflong3) {
    long[] arrayOfLong = new long[16];
    for (byte b1 = 0; b1 < this.size; b1++)
      implMulwAcc(arrayOfLong, paramArrayOflong1[b1], paramArrayOflong2[b1], paramArrayOflong3, b1 << 1); 
    long l1 = paramArrayOflong3[0];
    long l2 = paramArrayOflong3[1];
    for (byte b2 = 1; b2 < this.size; b2++) {
      l1 ^= paramArrayOflong3[b2 << 1];
      paramArrayOflong3[b2] = l1 ^ l2;
      l2 ^= paramArrayOflong3[(b2 << 1) + 1];
    } 
    long l3 = l1 ^ l2;
    int i;
    for (i = 0; i < this.size; i++)
      paramArrayOflong3[this.size + i] = paramArrayOflong3[i] ^ l3; 
    i = this.size - 1;
    for (byte b3 = 1; b3 < i * 2; b3++) {
      int j = Math.min(i, b3);
      int k = b3 - j;
      while (k < j) {
        implMulwAcc(arrayOfLong, paramArrayOflong1[k] ^ paramArrayOflong1[j], paramArrayOflong2[k] ^ paramArrayOflong2[j], paramArrayOflong3, b3);
        k++;
        j--;
      } 
    } 
  }
  
  private void implPermute(long[] paramArrayOflong1, int paramInt, long[] paramArrayOflong2) {
    int i = this.bits;
    int j = ((Integer)this.halfPowers.get(Integers.valueOf(paramInt))).intValue();
    int k = implModAdd(i, j, j);
    int m = implModAdd(i, k, k);
    int n = implModAdd(i, m, m);
    int i1 = i - n;
    int i2 = implModAdd(i, i1, j);
    int i3 = implModAdd(i, i1, k);
    int i4 = implModAdd(i, i2, k);
    int i5 = implModAdd(i, i1, m);
    int i6 = implModAdd(i, i2, m);
    int i7 = implModAdd(i, i3, m);
    int i8 = implModAdd(i, i4, m);
    for (byte b = 0; b < this.size; b++) {
      long l = 0L;
      for (byte b1 = 0; b1 < 64; b1 += 8) {
        i1 = implModAdd(i, i1, n);
        i2 = implModAdd(i, i2, n);
        i3 = implModAdd(i, i3, n);
        i4 = implModAdd(i, i4, n);
        i5 = implModAdd(i, i5, n);
        i6 = implModAdd(i, i6, n);
        i7 = implModAdd(i, i7, n);
        i8 = implModAdd(i, i8, n);
        l |= (paramArrayOflong1[i1 >>> 6] >>> i1 & 0x1L) << b1 + 0;
        l |= (paramArrayOflong1[i2 >>> 6] >>> i2 & 0x1L) << b1 + 1;
        l |= (paramArrayOflong1[i3 >>> 6] >>> i3 & 0x1L) << b1 + 2;
        l |= (paramArrayOflong1[i4 >>> 6] >>> i4 & 0x1L) << b1 + 3;
        l |= (paramArrayOflong1[i5 >>> 6] >>> i5 & 0x1L) << b1 + 4;
        l |= (paramArrayOflong1[i6 >>> 6] >>> i6 & 0x1L) << b1 + 5;
        l |= (paramArrayOflong1[i7 >>> 6] >>> i7 & 0x1L) << b1 + 6;
        l |= (paramArrayOflong1[i8 >>> 6] >>> i8 & 0x1L) << b1 + 7;
      } 
      paramArrayOflong2[b] = l;
    } 
    paramArrayOflong2[this.size - 1] = paramArrayOflong2[this.size - 1] & -1L >>> -i;
  }
  
  private static int generateHalfPower(int paramInt1, int paramInt2, int paramInt3) {
    int i = 1;
    int j;
    for (j = paramInt3; j >= 32; j -= 32) {
      int k = paramInt2 * i;
      long l1 = (k & 0xFFFFFFFFL) * paramInt1;
      long l2 = l1 + i;
      i = (int)(l2 >>> 32L);
    } 
    if (j > 0) {
      int k = -1 >>> -j;
      int m = paramInt2 * i & k;
      long l1 = (m & 0xFFFFFFFFL) * paramInt1;
      long l2 = l1 + i;
      i = (int)(l2 >>> j);
    } 
    return i;
  }
  
  private static void generateHalfPowersInv(Map<Integer, Integer> paramMap, int paramInt) {
    int i = paramInt - 2;
    int j = 32 - Integers.numberOfLeadingZeros(i);
    int k = Mod.inverse32(-paramInt);
    for (byte b = 1; b < j; b++) {
      int m = 1 << b - 1;
      if (m >= 64 && !paramMap.containsKey(Integers.valueOf(m)))
        paramMap.put(Integers.valueOf(m), Integers.valueOf(generateHalfPower(paramInt, k, m))); 
      if ((i & 1 << b) != 0) {
        int n = i & (1 << b) - 1;
        if (n >= 64 && !paramMap.containsKey(Integers.valueOf(n)))
          paramMap.put(Integers.valueOf(n), Integers.valueOf(generateHalfPower(paramInt, k, n))); 
      } 
    } 
  }
  
  private static void implMulwAcc(long[] paramArrayOflong1, long paramLong1, long paramLong2, long[] paramArrayOflong2, int paramInt) {
    paramArrayOflong1[1] = paramLong2;
    int i;
    for (i = 2; i < 16; i += 2) {
      paramArrayOflong1[i] = paramArrayOflong1[i >>> 1] << 1L;
      paramArrayOflong1[i + 1] = paramArrayOflong1[i] ^ paramLong2;
    } 
    i = (int)paramLong1;
    long l1 = 0L;
    long l2 = paramArrayOflong1[i & 0xF] ^ paramArrayOflong1[i >>> 4 & 0xF] << 4L;
    byte b = 56;
    while (true) {
      i = (int)(paramLong1 >>> b);
      long l = paramArrayOflong1[i & 0xF] ^ paramArrayOflong1[i >>> 4 & 0xF] << 4L;
      l2 ^= l << b;
      l1 ^= l >>> -b;
      b -= 8;
      if (b <= 0) {
        for (byte b1 = 0; b1 < 7; b1++) {
          paramLong1 = (paramLong1 & 0xFEFEFEFEFEFEFEFEL) >>> 1L;
          l1 ^= paramLong1 & paramLong2 << b1 >> 63L;
        } 
        paramArrayOflong2[paramInt] = paramArrayOflong2[paramInt] ^ l2;
        paramArrayOflong2[paramInt + 1] = paramArrayOflong2[paramInt + 1] ^ l1;
        return;
      } 
    } 
  }
  
  private void implSquare(long[] paramArrayOflong1, long[] paramArrayOflong2) {
    Interleave.expand64To128(paramArrayOflong1, 0, this.size, paramArrayOflong2, 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\bike\BIKERing.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */