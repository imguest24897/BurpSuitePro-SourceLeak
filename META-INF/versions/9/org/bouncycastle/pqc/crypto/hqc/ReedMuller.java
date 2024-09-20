package META-INF.versions.9.org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.pqc.crypto.hqc.Utils;
import org.bouncycastle.util.Arrays;

class ReedMuller {
  static void encodeSub(Codeword paramCodeword, int paramInt) {
    int i = Bit0Mask(paramInt >> 7);
    i ^= Bit0Mask(paramInt >> 0) & 0xAAAAAAAA;
    i ^= Bit0Mask(paramInt >> 1) & 0xCCCCCCCC;
    i ^= Bit0Mask(paramInt >> 2) & 0xF0F0F0F0;
    i ^= Bit0Mask(paramInt >> 3) & 0xFF00FF00;
    i ^= Bit0Mask(paramInt >> 4) & 0xFFFF0000;
    paramCodeword.type32[0] = i;
    i ^= Bit0Mask(paramInt >> 5);
    paramCodeword.type32[1] = i;
    i ^= Bit0Mask(paramInt >> 6);
    paramCodeword.type32[3] = i;
    i ^= Bit0Mask(paramInt >> 5);
    paramCodeword.type32[2] = i;
  }
  
  private static void hadamardTransform(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    int[] arrayOfInt1 = Arrays.clone(paramArrayOfint1);
    int[] arrayOfInt2 = Arrays.clone(paramArrayOfint2);
    for (byte b = 0; b < 7; b++) {
      for (byte b1 = 0; b1 < 64; b1++) {
        arrayOfInt2[b1] = arrayOfInt1[2 * b1] + arrayOfInt1[2 * b1 + 1];
        arrayOfInt2[b1 + 64] = arrayOfInt1[2 * b1] - arrayOfInt1[2 * b1 + 1];
      } 
      int[] arrayOfInt = arrayOfInt1;
      arrayOfInt1 = arrayOfInt2;
      arrayOfInt2 = arrayOfInt;
    } 
    System.arraycopy(arrayOfInt2, 0, paramArrayOfint1, 0, paramArrayOfint1.length);
    System.arraycopy(arrayOfInt1, 0, paramArrayOfint2, 0, paramArrayOfint2.length);
  }
  
  private static void expandThenSum(int[] paramArrayOfint, Codeword[] paramArrayOfCodeword, int paramInt1, int paramInt2) {
    byte b;
    for (b = 0; b < 4; b++) {
      for (byte b1 = 0; b1 < 32; b1++) {
        long l = ((paramArrayOfCodeword[0 + paramInt1]).type32[b] >> b1 & 0x1);
        paramArrayOfint[b * 32 + b1] = (paramArrayOfCodeword[0 + paramInt1]).type32[b] >> b1 & 0x1;
      } 
    } 
    for (b = 1; b < paramInt2; b++) {
      for (byte b1 = 0; b1 < 4; b1++) {
        for (byte b2 = 0; b2 < 32; b2++)
          paramArrayOfint[b1 * 32 + b2] = paramArrayOfint[b1 * 32 + b2] + ((paramArrayOfCodeword[b + paramInt1]).type32[b1] >> b2 & 0x1); 
      } 
    } 
  }
  
  private static int findPeaks(int[] paramArrayOfint) {
    byte b1 = 0;
    boolean bool = false;
    int i = 0;
    byte b2;
    for (b2 = 0; b2 < ''; b2++) {
      int j = paramArrayOfint[b2];
      int k = (j > 0) ? -1 : 0;
      int m = k & j | (k ^ 0xFFFFFFFF) & -j;
      bool = (m > b1) ? j : bool;
      i = (m > b1) ? b2 : i;
      b1 = (m > b1) ? m : b1;
    } 
    b2 = bool ? 1 : 0;
    i |= 128 * b2;
    return i;
  }
  
  private static int Bit0Mask(int paramInt) {
    return -(paramInt & 0x1) & 0xFFFFFFFF;
  }
  
  public static void encode(long[] paramArrayOflong, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = Arrays.clone(paramArrayOfbyte);
    Codeword[] arrayOfCodeword = new Codeword[paramInt1 * paramInt2];
    byte b1;
    for (b1 = 0; b1 < arrayOfCodeword.length; b1++)
      arrayOfCodeword[b1] = new Codeword(); 
    for (b1 = 0; b1 < paramInt1; b1++) {
      int i = b1 * paramInt2;
      encodeSub(arrayOfCodeword[i], arrayOfByte[b1]);
      for (byte b = 1; b < paramInt2; b++)
        arrayOfCodeword[i + b] = arrayOfCodeword[i]; 
    } 
    int[] arrayOfInt = new int[arrayOfCodeword.length * 4];
    boolean bool = false;
    for (byte b2 = 0; b2 < arrayOfCodeword.length; b2++) {
      System.arraycopy((arrayOfCodeword[b2]).type32, 0, arrayOfInt, bool, (arrayOfCodeword[b2]).type32.length);
      bool += true;
    } 
    Utils.fromByte32ArrayToLongArray(paramArrayOflong, arrayOfInt);
  }
  
  public static void decode(byte[] paramArrayOfbyte, long[] paramArrayOflong, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = Arrays.clone(paramArrayOfbyte);
    Codeword[] arrayOfCodeword = new Codeword[paramArrayOflong.length / 2];
    int[] arrayOfInt1 = new int[paramArrayOflong.length * 2];
    Utils.fromLongArrayToByte32Array(arrayOfInt1, paramArrayOflong);
    for (byte b1 = 0; b1 < arrayOfCodeword.length; b1++) {
      arrayOfCodeword[b1] = new Codeword();
      for (byte b = 0; b < 4; b++)
        (arrayOfCodeword[b1]).type32[b] = arrayOfInt1[b1 * 4 + b]; 
    } 
    int[] arrayOfInt2 = new int[128];
    for (byte b2 = 0; b2 < paramInt1; b2++) {
      expandThenSum(arrayOfInt2, arrayOfCodeword, b2 * paramInt2, paramInt2);
      int[] arrayOfInt = new int[128];
      hadamardTransform(arrayOfInt2, arrayOfInt);
      arrayOfInt[0] = arrayOfInt[0] - 64 * paramInt2;
      arrayOfByte[b2] = (byte)findPeaks(arrayOfInt);
    } 
    int[] arrayOfInt3 = new int[arrayOfCodeword.length * 4];
    boolean bool = false;
    for (byte b3 = 0; b3 < arrayOfCodeword.length; b3++) {
      System.arraycopy((arrayOfCodeword[b3]).type32, 0, arrayOfInt3, bool, (arrayOfCodeword[b3]).type32.length);
      bool += true;
    } 
    Utils.fromByte32ArrayToLongArray(paramArrayOflong, arrayOfInt3);
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\hqc\ReedMuller.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */