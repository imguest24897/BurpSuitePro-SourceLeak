package org.bouncycastle.pqc.legacy.math.ntru.util;

import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import org.bouncycastle.pqc.legacy.math.ntru.euclid.IntEuclidean;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.DenseTernaryPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.SparseTernaryPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.TernaryPolynomial;
import org.bouncycastle.util.Integers;

public class Util {
  private static volatile boolean IS_64_BITNESS_KNOWN;
  
  private static volatile boolean IS_64_BIT_JVM;
  
  public static int invert(int paramInt1, int paramInt2) {
    paramInt1 %= paramInt2;
    if (paramInt1 < 0)
      paramInt1 += paramInt2; 
    return (IntEuclidean.calculate(paramInt1, paramInt2)).x;
  }
  
  public static int pow(int paramInt1, int paramInt2, int paramInt3) {
    int i = 1;
    for (byte b = 0; b < paramInt2; b++)
      i = i * paramInt1 % paramInt3; 
    return i;
  }
  
  public static long pow(long paramLong1, int paramInt, long paramLong2) {
    long l = 1L;
    for (byte b = 0; b < paramInt; b++)
      l = l * paramLong1 % paramLong2; 
    return l;
  }
  
  public static TernaryPolynomial generateRandomTernary(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, SecureRandom paramSecureRandom) {
    return (TernaryPolynomial)(paramBoolean ? SparseTernaryPolynomial.generateRandom(paramInt1, paramInt2, paramInt3, paramSecureRandom) : DenseTernaryPolynomial.generateRandom(paramInt1, paramInt2, paramInt3, paramSecureRandom));
  }
  
  public static int[] generateRandomTernary(int paramInt1, int paramInt2, int paramInt3, SecureRandom paramSecureRandom) {
    Integer integer1 = Integers.valueOf(1);
    Integer integer2 = Integers.valueOf(-1);
    Integer integer3 = Integers.valueOf(0);
    ArrayList<Integer> arrayList = new ArrayList();
    byte b1;
    for (b1 = 0; b1 < paramInt2; b1++)
      arrayList.add(integer1); 
    for (b1 = 0; b1 < paramInt3; b1++)
      arrayList.add(integer2); 
    while (arrayList.size() < paramInt1)
      arrayList.add(integer3); 
    Collections.shuffle(arrayList, paramSecureRandom);
    int[] arrayOfInt = new int[paramInt1];
    for (byte b2 = 0; b2 < paramInt1; b2++)
      arrayOfInt[b2] = ((Integer)arrayList.get(b2)).intValue(); 
    return arrayOfInt;
  }
  
  public static boolean is64BitJVM() {
    if (!IS_64_BITNESS_KNOWN) {
      String str1 = System.getProperty("os.arch");
      String str2 = System.getProperty("sun.arch.data.model");
      IS_64_BIT_JVM = ("amd64".equals(str1) || "x86_64".equals(str1) || "ppc64".equals(str1) || "64".equals(str2));
      IS_64_BITNESS_KNOWN = true;
    } 
    return IS_64_BIT_JVM;
  }
  
  public static byte[] readFullLength(InputStream paramInputStream, int paramInt) throws IOException {
    byte[] arrayOfByte = new byte[paramInt];
    if (paramInputStream.read(arrayOfByte) != arrayOfByte.length)
      throw new IOException("Not enough bytes to read."); 
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\math\ntr\\util\Util.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */