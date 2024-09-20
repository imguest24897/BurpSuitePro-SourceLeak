package META-INF.versions.9.org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.SimpleBigDecimal;
import org.bouncycastle.math.ec.ZTauElement;
import org.bouncycastle.util.BigIntegers;

class Tnaf {
  private static final BigInteger MINUS_ONE = ECConstants.ONE.negate();
  
  private static final BigInteger MINUS_TWO = ECConstants.TWO.negate();
  
  private static final BigInteger MINUS_THREE = ECConstants.THREE.negate();
  
  public static final byte WIDTH = 4;
  
  public static final ZTauElement[] alpha0 = new ZTauElement[] { 
      null, new ZTauElement(ECConstants.ONE, ECConstants.ZERO), null, new ZTauElement(MINUS_THREE, MINUS_ONE), null, new ZTauElement(MINUS_ONE, MINUS_ONE), null, new ZTauElement(ECConstants.ONE, MINUS_ONE), null, new ZTauElement(MINUS_ONE, ECConstants.ONE), 
      null, new ZTauElement(ECConstants.ONE, ECConstants.ONE), null, new ZTauElement(ECConstants.THREE, ECConstants.ONE), null, new ZTauElement(MINUS_ONE, ECConstants.ZERO) };
  
  public static final byte[][] alpha0Tnaf = new byte[][] { null, { 1 }, null, { -1, 0, 1 }, null, { 1, 0, 1 }, null, { -1, 0, 0, 1 } };
  
  public static final ZTauElement[] alpha1 = new ZTauElement[] { 
      null, new ZTauElement(ECConstants.ONE, ECConstants.ZERO), null, new ZTauElement(MINUS_THREE, ECConstants.ONE), null, new ZTauElement(MINUS_ONE, ECConstants.ONE), null, new ZTauElement(ECConstants.ONE, ECConstants.ONE), null, new ZTauElement(MINUS_ONE, MINUS_ONE), 
      null, new ZTauElement(ECConstants.ONE, MINUS_ONE), null, new ZTauElement(ECConstants.THREE, MINUS_ONE), null, new ZTauElement(MINUS_ONE, ECConstants.ZERO) };
  
  public static final byte[][] alpha1Tnaf = new byte[][] { null, { 1 }, null, { -1, 0, 1 }, null, { 1, 0, 1 }, null, { -1, 0, 0, -1 } };
  
  public static BigInteger norm(byte paramByte, ZTauElement paramZTauElement) {
    BigInteger bigInteger = paramZTauElement.u.multiply(paramZTauElement.u);
    if (paramByte == 1)
      return paramZTauElement.v.shiftLeft(1).add(paramZTauElement.u).multiply(paramZTauElement.v).add(bigInteger); 
    if (paramByte == -1)
      return paramZTauElement.v.shiftLeft(1).subtract(paramZTauElement.u).multiply(paramZTauElement.v).add(bigInteger); 
    throw new IllegalArgumentException("mu must be 1 or -1");
  }
  
  public static SimpleBigDecimal norm(byte paramByte, SimpleBigDecimal paramSimpleBigDecimal1, SimpleBigDecimal paramSimpleBigDecimal2) {
    SimpleBigDecimal simpleBigDecimal1;
    SimpleBigDecimal simpleBigDecimal2 = paramSimpleBigDecimal1.multiply(paramSimpleBigDecimal1);
    SimpleBigDecimal simpleBigDecimal3 = paramSimpleBigDecimal1.multiply(paramSimpleBigDecimal2);
    SimpleBigDecimal simpleBigDecimal4 = paramSimpleBigDecimal2.multiply(paramSimpleBigDecimal2).shiftLeft(1);
    if (paramByte == 1) {
      simpleBigDecimal1 = simpleBigDecimal2.add(simpleBigDecimal3).add(simpleBigDecimal4);
    } else if (paramByte == -1) {
      simpleBigDecimal1 = simpleBigDecimal2.subtract(simpleBigDecimal3).add(simpleBigDecimal4);
    } else {
      throw new IllegalArgumentException("mu must be 1 or -1");
    } 
    return simpleBigDecimal1;
  }
  
  public static ZTauElement round(SimpleBigDecimal paramSimpleBigDecimal1, SimpleBigDecimal paramSimpleBigDecimal2, byte paramByte) {
    SimpleBigDecimal simpleBigDecimal6;
    SimpleBigDecimal simpleBigDecimal7;
    int i = paramSimpleBigDecimal1.getScale();
    if (paramSimpleBigDecimal2.getScale() != i)
      throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale"); 
    if (paramByte != 1 && paramByte != -1)
      throw new IllegalArgumentException("mu must be 1 or -1"); 
    BigInteger bigInteger1 = paramSimpleBigDecimal1.round();
    BigInteger bigInteger2 = paramSimpleBigDecimal2.round();
    SimpleBigDecimal simpleBigDecimal1 = paramSimpleBigDecimal1.subtract(bigInteger1);
    SimpleBigDecimal simpleBigDecimal2 = paramSimpleBigDecimal2.subtract(bigInteger2);
    SimpleBigDecimal simpleBigDecimal3 = simpleBigDecimal1.add(simpleBigDecimal1);
    if (paramByte == 1) {
      simpleBigDecimal3 = simpleBigDecimal3.add(simpleBigDecimal2);
    } else {
      simpleBigDecimal3 = simpleBigDecimal3.subtract(simpleBigDecimal2);
    } 
    SimpleBigDecimal simpleBigDecimal4 = simpleBigDecimal2.add(simpleBigDecimal2).add(simpleBigDecimal2);
    SimpleBigDecimal simpleBigDecimal5 = simpleBigDecimal4.add(simpleBigDecimal2);
    if (paramByte == 1) {
      simpleBigDecimal6 = simpleBigDecimal1.subtract(simpleBigDecimal4);
      simpleBigDecimal7 = simpleBigDecimal1.add(simpleBigDecimal5);
    } else {
      simpleBigDecimal6 = simpleBigDecimal1.add(simpleBigDecimal4);
      simpleBigDecimal7 = simpleBigDecimal1.subtract(simpleBigDecimal5);
    } 
    byte b1 = 0;
    byte b2 = 0;
    if (simpleBigDecimal3.compareTo(ECConstants.ONE) >= 0) {
      if (simpleBigDecimal6.compareTo(MINUS_ONE) < 0) {
        b2 = paramByte;
      } else {
        b1 = 1;
      } 
    } else if (simpleBigDecimal7.compareTo(ECConstants.TWO) >= 0) {
      b2 = paramByte;
    } 
    if (simpleBigDecimal3.compareTo(MINUS_ONE) < 0) {
      if (simpleBigDecimal6.compareTo(ECConstants.ONE) >= 0) {
        b2 = (byte)-paramByte;
      } else {
        b1 = -1;
      } 
    } else if (simpleBigDecimal7.compareTo(MINUS_TWO) < 0) {
      b2 = (byte)-paramByte;
    } 
    BigInteger bigInteger3 = bigInteger1.add(BigInteger.valueOf(b1));
    BigInteger bigInteger4 = bigInteger2.add(BigInteger.valueOf(b2));
    return new ZTauElement(bigInteger3, bigInteger4);
  }
  
  public static SimpleBigDecimal approximateDivisionByN(BigInteger paramBigInteger1, BigInteger paramBigInteger2, BigInteger paramBigInteger3, byte paramByte, int paramInt1, int paramInt2) {
    int i = (paramInt1 + 5) / 2 + paramInt2;
    BigInteger bigInteger1 = paramBigInteger1.shiftRight(paramInt1 - i - 2 + paramByte);
    BigInteger bigInteger2 = paramBigInteger2.multiply(bigInteger1);
    BigInteger bigInteger3 = bigInteger2.shiftRight(paramInt1);
    BigInteger bigInteger4 = paramBigInteger3.multiply(bigInteger3);
    BigInteger bigInteger5 = bigInteger2.add(bigInteger4);
    BigInteger bigInteger6 = bigInteger5.shiftRight(i - paramInt2);
    if (bigInteger5.testBit(i - paramInt2 - 1))
      bigInteger6 = bigInteger6.add(ECConstants.ONE); 
    return new SimpleBigDecimal(bigInteger6, paramInt2);
  }
  
  public static byte[] tauAdicNaf(byte paramByte, ZTauElement paramZTauElement) {
    if (paramByte != 1 && paramByte != -1)
      throw new IllegalArgumentException("mu must be 1 or -1"); 
    BigInteger bigInteger1 = norm(paramByte, paramZTauElement);
    int i = bigInteger1.bitLength();
    boolean bool = (i > 30) ? (i + 4) : true;
    byte[] arrayOfByte = new byte[bool];
    byte b1 = 0;
    byte b2 = 0;
    BigInteger bigInteger2 = paramZTauElement.u;
    BigInteger bigInteger3 = paramZTauElement.v;
    while (true) {
      if (!bigInteger2.equals(ECConstants.ZERO) || !bigInteger3.equals(ECConstants.ZERO)) {
        if (bigInteger2.testBit(0)) {
          arrayOfByte[b1] = (byte)ECConstants.TWO.subtract(bigInteger2.subtract(bigInteger3.shiftLeft(1)).mod(ECConstants.FOUR)).intValue();
          if (arrayOfByte[b1] == 1) {
            bigInteger2 = bigInteger2.clearBit(0);
          } else {
            bigInteger2 = bigInteger2.add(ECConstants.ONE);
          } 
          b2 = b1;
        } else {
          arrayOfByte[b1] = 0;
        } 
        BigInteger bigInteger4 = bigInteger2;
        BigInteger bigInteger5 = bigInteger2.shiftRight(1);
        if (paramByte == 1) {
          bigInteger2 = bigInteger3.add(bigInteger5);
        } else {
          bigInteger2 = bigInteger3.subtract(bigInteger5);
        } 
        bigInteger3 = bigInteger4.shiftRight(1).negate();
        b1++;
        continue;
      } 
      byte[] arrayOfByte1 = new byte[++b2];
      System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, b2);
      return arrayOfByte1;
    } 
  }
  
  public static ECPoint.AbstractF2m tau(ECPoint.AbstractF2m paramAbstractF2m) {
    return paramAbstractF2m.tau();
  }
  
  public static byte getMu(ECCurve.AbstractF2m paramAbstractF2m) {
    if (!paramAbstractF2m.isKoblitz())
      throw new IllegalArgumentException("No Koblitz curve (ABC), TNAF multiplication not possible"); 
    return paramAbstractF2m.getA().isZero() ? -1 : 1;
  }
  
  public static byte getMu(ECFieldElement paramECFieldElement) {
    return (byte)(paramECFieldElement.isZero() ? -1 : 1);
  }
  
  public static byte getMu(int paramInt) {
    return (byte)((paramInt == 0) ? -1 : 1);
  }
  
  public static BigInteger[] getLucas(byte paramByte, int paramInt, boolean paramBoolean) {
    BigInteger bigInteger1;
    BigInteger bigInteger2;
    if (paramByte != 1 && paramByte != -1)
      throw new IllegalArgumentException("mu must be 1 or -1"); 
    if (paramBoolean) {
      bigInteger1 = ECConstants.TWO;
      bigInteger2 = BigInteger.valueOf(paramByte);
    } else {
      bigInteger1 = ECConstants.ZERO;
      bigInteger2 = ECConstants.ONE;
    } 
    for (byte b = 1; b < paramInt; b++) {
      BigInteger bigInteger4 = bigInteger2;
      if (paramByte < 0)
        bigInteger4 = bigInteger4.negate(); 
      BigInteger bigInteger3 = bigInteger4.subtract(bigInteger1.shiftLeft(1));
      bigInteger1 = bigInteger2;
      bigInteger2 = bigInteger3;
    } 
    return new BigInteger[] { bigInteger1, bigInteger2 };
  }
  
  public static BigInteger getTw(byte paramByte, int paramInt) {
    if (paramInt == 4)
      return (paramByte == 1) ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L); 
    BigInteger[] arrayOfBigInteger = getLucas(paramByte, paramInt, false);
    BigInteger bigInteger1 = ECConstants.ZERO.setBit(paramInt);
    BigInteger bigInteger2 = arrayOfBigInteger[1].modInverse(bigInteger1);
    return arrayOfBigInteger[0].shiftLeft(1).multiply(bigInteger2).mod(bigInteger1);
  }
  
  public static BigInteger[] getSi(ECCurve.AbstractF2m paramAbstractF2m) {
    if (!paramAbstractF2m.isKoblitz())
      throw new IllegalArgumentException("si is defined for Koblitz curves only"); 
    return getSi(paramAbstractF2m.getFieldSize(), paramAbstractF2m.getA().toBigInteger().intValue(), paramAbstractF2m.getCofactor());
  }
  
  public static BigInteger[] getSi(int paramInt1, int paramInt2, BigInteger paramBigInteger) {
    byte b = getMu(paramInt2);
    int i = getShiftsForCofactor(paramBigInteger);
    int j = paramInt1 + 3 - paramInt2;
    BigInteger[] arrayOfBigInteger = getLucas(b, j, false);
    if (b == 1) {
      arrayOfBigInteger[0] = arrayOfBigInteger[0].negate();
      arrayOfBigInteger[1] = arrayOfBigInteger[1].negate();
    } 
    BigInteger bigInteger1 = ECConstants.ONE.add(arrayOfBigInteger[1]).shiftRight(i);
    BigInteger bigInteger2 = ECConstants.ONE.add(arrayOfBigInteger[0]).shiftRight(i).negate();
    return new BigInteger[] { bigInteger1, bigInteger2 };
  }
  
  protected static int getShiftsForCofactor(BigInteger paramBigInteger) {
    if (paramBigInteger != null) {
      if (paramBigInteger.equals(ECConstants.TWO))
        return 1; 
      if (paramBigInteger.equals(ECConstants.FOUR))
        return 2; 
    } 
    throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
  }
  
  public static ZTauElement partModReduction(ECCurve.AbstractF2m paramAbstractF2m, BigInteger paramBigInteger, byte paramByte1, byte paramByte2, byte paramByte3) {
    BigInteger bigInteger1;
    BigInteger bigInteger2;
    int i = paramAbstractF2m.getFieldSize();
    BigInteger[] arrayOfBigInteger = paramAbstractF2m.getSi();
    if (paramByte2 == 1) {
      bigInteger1 = arrayOfBigInteger[0].add(arrayOfBigInteger[1]);
    } else {
      bigInteger1 = arrayOfBigInteger[0].subtract(arrayOfBigInteger[1]);
    } 
    if (paramAbstractF2m.isKoblitz()) {
      bigInteger2 = ECConstants.ONE.shiftLeft(i).add(ECConstants.ONE).subtract(paramAbstractF2m.getOrder().multiply(paramAbstractF2m.getCofactor()));
    } else {
      BigInteger[] arrayOfBigInteger1 = getLucas(paramByte2, i, true);
      bigInteger2 = arrayOfBigInteger1[1];
    } 
    SimpleBigDecimal simpleBigDecimal1 = approximateDivisionByN(paramBigInteger, arrayOfBigInteger[0], bigInteger2, paramByte1, i, paramByte3);
    SimpleBigDecimal simpleBigDecimal2 = approximateDivisionByN(paramBigInteger, arrayOfBigInteger[1], bigInteger2, paramByte1, i, paramByte3);
    ZTauElement zTauElement = round(simpleBigDecimal1, simpleBigDecimal2, paramByte2);
    BigInteger bigInteger3 = paramBigInteger.subtract(bigInteger1.multiply(zTauElement.u)).subtract(arrayOfBigInteger[1].multiply(zTauElement.v).shiftLeft(1));
    BigInteger bigInteger4 = arrayOfBigInteger[1].multiply(zTauElement.u).subtract(arrayOfBigInteger[0].multiply(zTauElement.v));
    return new ZTauElement(bigInteger3, bigInteger4);
  }
  
  public static ECPoint.AbstractF2m multiplyRTnaf(ECPoint.AbstractF2m paramAbstractF2m, BigInteger paramBigInteger) {
    ECCurve.AbstractF2m abstractF2m = (ECCurve.AbstractF2m)paramAbstractF2m.getCurve();
    int i = abstractF2m.getA().toBigInteger().intValue();
    byte b = getMu(i);
    ZTauElement zTauElement = partModReduction(abstractF2m, paramBigInteger, (byte)i, b, (byte)10);
    return multiplyTnaf(paramAbstractF2m, zTauElement);
  }
  
  public static ECPoint.AbstractF2m multiplyTnaf(ECPoint.AbstractF2m paramAbstractF2m, ZTauElement paramZTauElement) {
    ECCurve.AbstractF2m abstractF2m = (ECCurve.AbstractF2m)paramAbstractF2m.getCurve();
    ECPoint.AbstractF2m abstractF2m1 = (ECPoint.AbstractF2m)paramAbstractF2m.negate();
    byte b = getMu(abstractF2m.getA());
    byte[] arrayOfByte = tauAdicNaf(b, paramZTauElement);
    return multiplyFromTnaf(paramAbstractF2m, abstractF2m1, arrayOfByte);
  }
  
  public static ECPoint.AbstractF2m multiplyFromTnaf(ECPoint.AbstractF2m paramAbstractF2m1, ECPoint.AbstractF2m paramAbstractF2m2, byte[] paramArrayOfbyte) {
    ECCurve eCCurve = paramAbstractF2m1.getCurve();
    ECPoint.AbstractF2m abstractF2m = (ECPoint.AbstractF2m)eCCurve.getInfinity();
    byte b = 0;
    for (int i = paramArrayOfbyte.length - 1; i >= 0; i--) {
      b++;
      byte b1 = paramArrayOfbyte[i];
      if (b1 != 0) {
        abstractF2m = abstractF2m.tauPow(b);
        b = 0;
        ECPoint.AbstractF2m abstractF2m1 = (b1 > 0) ? paramAbstractF2m1 : paramAbstractF2m2;
        abstractF2m = (ECPoint.AbstractF2m)abstractF2m.add((ECPoint)abstractF2m1);
      } 
    } 
    if (b > 0)
      abstractF2m = abstractF2m.tauPow(b); 
    return abstractF2m;
  }
  
  public static byte[] tauAdicWNaf(byte paramByte, ZTauElement paramZTauElement, int paramInt1, int paramInt2, ZTauElement[] paramArrayOfZTauElement) {
    if (paramByte != 1 && paramByte != -1)
      throw new IllegalArgumentException("mu must be 1 or -1"); 
    BigInteger bigInteger1 = norm(paramByte, paramZTauElement);
    int i = bigInteger1.bitLength();
    int j = (i > 30) ? (i + 4 + paramInt1) : (34 + paramInt1);
    byte[] arrayOfByte = new byte[j];
    int k = 1 << paramInt1;
    int m = k - 1;
    int n = 32 - paramInt1;
    BigInteger bigInteger2 = paramZTauElement.u;
    BigInteger bigInteger3 = paramZTauElement.v;
    byte b = 0;
    while (true) {
      if (bigInteger2.bitLength() > 62 || bigInteger3.bitLength() > 62) {
        if (bigInteger2.testBit(0)) {
          int i1 = bigInteger2.intValue() + bigInteger3.intValue() * paramInt2;
          int i2 = i1 & m;
          arrayOfByte[b] = (byte)(i1 << n >> n);
          bigInteger2 = bigInteger2.subtract((paramArrayOfZTauElement[i2]).u);
          bigInteger3 = bigInteger3.subtract((paramArrayOfZTauElement[i2]).v);
        } 
        b++;
        BigInteger bigInteger = bigInteger2.shiftRight(1);
        if (paramByte == 1) {
          bigInteger2 = bigInteger3.add(bigInteger);
        } else {
          bigInteger2 = bigInteger3.subtract(bigInteger);
        } 
        bigInteger3 = bigInteger.negate();
        continue;
      } 
      long l1 = BigIntegers.longValueExact(bigInteger2);
      long l2;
      for (l2 = BigIntegers.longValueExact(bigInteger3); (l1 | l2) != 0L; l2 = -l) {
        if ((l1 & 0x1L) != 0L) {
          int i1 = (int)l1 + (int)l2 * paramInt2;
          int i2 = i1 & m;
          arrayOfByte[b] = (byte)(i1 << n >> n);
          l1 -= (paramArrayOfZTauElement[i2]).u.intValue();
          l2 -= (paramArrayOfZTauElement[i2]).v.intValue();
        } 
        b++;
        long l = l1 >> 1L;
        if (paramByte == 1) {
          l1 = l2 + l;
        } else {
          l1 = l2 - l;
        } 
      } 
      return arrayOfByte;
    } 
  }
  
  public static ECPoint.AbstractF2m[] getPreComp(ECPoint.AbstractF2m paramAbstractF2m, byte paramByte) {
    ECPoint.AbstractF2m abstractF2m = (ECPoint.AbstractF2m)paramAbstractF2m.negate();
    byte[][] arrayOfByte = (paramByte == 0) ? alpha0Tnaf : alpha1Tnaf;
    ECPoint.AbstractF2m[] arrayOfAbstractF2m = new ECPoint.AbstractF2m[arrayOfByte.length + 1 >>> 1];
    arrayOfAbstractF2m[0] = paramAbstractF2m;
    int i = arrayOfByte.length;
    for (byte b = 3; b < i; b += 2)
      arrayOfAbstractF2m[b >>> 1] = multiplyFromTnaf(paramAbstractF2m, abstractF2m, arrayOfByte[b]); 
    paramAbstractF2m.getCurve().normalizeAll((ECPoint[])arrayOfAbstractF2m);
    return arrayOfAbstractF2m;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\Tnaf.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */