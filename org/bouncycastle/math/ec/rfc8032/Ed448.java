package org.bouncycastle.math.ec.rfc8032;

import java.security.SecureRandom;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.math.ec.rfc7748.X448;
import org.bouncycastle.math.ec.rfc7748.X448Field;
import org.bouncycastle.math.raw.Nat;

public abstract class Ed448 {
  private static final int COORD_INTS = 14;
  
  private static final int POINT_BYTES = 57;
  
  private static final int SCALAR_INTS = 14;
  
  private static final int SCALAR_BYTES = 57;
  
  public static final int PREHASH_SIZE = 64;
  
  public static final int PUBLIC_KEY_SIZE = 57;
  
  public static final int SECRET_KEY_SIZE = 57;
  
  public static final int SIGNATURE_SIZE = 114;
  
  private static final byte[] DOM4_PREFIX = new byte[] { 83, 105, 103, 69, 100, 52, 52, 56 };
  
  private static final int[] P = new int[] { 
      -1, -1, -1, -1, -1, -1, -1, -2, -1, -1, 
      -1, -1, -1, -1 };
  
  private static final int[] B_x = new int[] { 
      118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 
      73756743, 57518561, 94773951, 248652241, 107736333, 82941708 };
  
  private static final int[] B_y = new int[] { 
      36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 
      175338348, 209069246, 3626697, 38307682, 24032956, 110359655 };
  
  private static final int[] B225_x = new int[] { 
      110141154, 30892124, 160820362, 264558960, 217232225, 47722141, 19029845, 8326902, 183409749, 170134547, 
      90340180, 222600478, 61097333, 7431335, 198491505, 102372861 };
  
  private static final int[] B225_y = new int[] { 
      221945828, 50763449, 132637478, 109250759, 216053960, 61612587, 50649998, 138339097, 98949899, 248139835, 
      186410297, 126520782, 47339196, 78164062, 198835543, 169622712 };
  
  private static final int C_d = 39081;
  
  private static final int WNAF_WIDTH_225 = 5;
  
  private static final int WNAF_WIDTH_BASE = 7;
  
  private static final int PRECOMP_BLOCKS = 5;
  
  private static final int PRECOMP_TEETH = 5;
  
  private static final int PRECOMP_SPACING = 18;
  
  private static final int PRECOMP_RANGE = 450;
  
  private static final int PRECOMP_POINTS = 16;
  
  private static final int PRECOMP_MASK = 15;
  
  private static final Object PRECOMP_LOCK = new Object();
  
  private static PointAffine[] PRECOMP_BASE_WNAF = null;
  
  private static PointAffine[] PRECOMP_BASE225_WNAF = null;
  
  private static int[] PRECOMP_BASE_COMB = null;
  
  private static byte[] calculateS(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    int[] arrayOfInt1 = new int[28];
    Scalar448.decode(paramArrayOfbyte1, arrayOfInt1);
    int[] arrayOfInt2 = new int[14];
    Scalar448.decode(paramArrayOfbyte2, arrayOfInt2);
    int[] arrayOfInt3 = new int[14];
    Scalar448.decode(paramArrayOfbyte3, arrayOfInt3);
    Nat.mulAddTo(14, arrayOfInt2, arrayOfInt3, arrayOfInt1);
    byte[] arrayOfByte = new byte[114];
    Codec.encode32(arrayOfInt1, 0, arrayOfInt1.length, arrayOfByte, 0);
    return Scalar448.reduce912(arrayOfByte);
  }
  
  private static boolean checkContextVar(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte != null && paramArrayOfbyte.length < 256);
  }
  
  private static int checkPoint(PointAffine paramPointAffine) {
    int[] arrayOfInt1 = F.create();
    int[] arrayOfInt2 = F.create();
    int[] arrayOfInt3 = F.create();
    F.sqr(paramPointAffine.x, arrayOfInt2);
    F.sqr(paramPointAffine.y, arrayOfInt3);
    F.mul(arrayOfInt2, arrayOfInt3, arrayOfInt1);
    F.add(arrayOfInt2, arrayOfInt3, arrayOfInt2);
    F.mul(arrayOfInt1, 39081, arrayOfInt1);
    F.subOne(arrayOfInt1);
    F.add(arrayOfInt1, arrayOfInt2, arrayOfInt1);
    F.normalize(arrayOfInt1);
    F.normalize(arrayOfInt3);
    return F.isZero(arrayOfInt1) & (F.isZero(arrayOfInt3) ^ 0xFFFFFFFF);
  }
  
  private static int checkPoint(PointProjective paramPointProjective) {
    int[] arrayOfInt1 = F.create();
    int[] arrayOfInt2 = F.create();
    int[] arrayOfInt3 = F.create();
    int[] arrayOfInt4 = F.create();
    F.sqr(paramPointProjective.x, arrayOfInt2);
    F.sqr(paramPointProjective.y, arrayOfInt3);
    F.sqr(paramPointProjective.z, arrayOfInt4);
    F.mul(arrayOfInt2, arrayOfInt3, arrayOfInt1);
    F.add(arrayOfInt2, arrayOfInt3, arrayOfInt2);
    F.mul(arrayOfInt2, arrayOfInt4, arrayOfInt2);
    F.sqr(arrayOfInt4, arrayOfInt4);
    F.mul(arrayOfInt1, 39081, arrayOfInt1);
    F.sub(arrayOfInt1, arrayOfInt4, arrayOfInt1);
    F.add(arrayOfInt1, arrayOfInt2, arrayOfInt1);
    F.normalize(arrayOfInt1);
    F.normalize(arrayOfInt3);
    F.normalize(arrayOfInt4);
    return F.isZero(arrayOfInt1) & (F.isZero(arrayOfInt3) ^ 0xFFFFFFFF) & (F.isZero(arrayOfInt4) ^ 0xFFFFFFFF);
  }
  
  private static boolean checkPointFullVar(byte[] paramArrayOfbyte) {
    if ((paramArrayOfbyte[56] & Byte.MAX_VALUE) != 0)
      return false; 
    int i = Codec.decode32(paramArrayOfbyte, 52);
    int j = i;
    int k = i ^ P[13];
    int m;
    for (m = 12; m > 0; m--) {
      int n = Codec.decode32(paramArrayOfbyte, m * 4);
      if (k == 0 && n + Integer.MIN_VALUE > P[m] + Integer.MIN_VALUE)
        return false; 
      j |= n;
      k |= n ^ P[m];
    } 
    m = Codec.decode32(paramArrayOfbyte, 0);
    return (j == 0 && m + Integer.MIN_VALUE <= -2147483647) ? false : (!(k == 0 && m + Integer.MIN_VALUE >= P[0] - 1 + Integer.MIN_VALUE));
  }
  
  private static boolean checkPointOrderVar(PointAffine paramPointAffine) {
    PointProjective pointProjective = new PointProjective();
    scalarMultOrderVar(paramPointAffine, pointProjective);
    return normalizeToNeutralElementVar(pointProjective);
  }
  
  private static boolean checkPointVar(byte[] paramArrayOfbyte) {
    if ((paramArrayOfbyte[56] & Byte.MAX_VALUE) != 0)
      return false; 
    if (Codec.decode32(paramArrayOfbyte, 52) != P[13])
      return true; 
    int[] arrayOfInt = new int[14];
    Codec.decode32(paramArrayOfbyte, 0, arrayOfInt, 0, 14);
    return !Nat.gte(14, arrayOfInt, P);
  }
  
  private static byte[] copy(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte, 0, paramInt2);
    return arrayOfByte;
  }
  
  public static Xof createPrehash() {
    return createXof();
  }
  
  private static Xof createXof() {
    return (Xof)new SHAKEDigest(256);
  }
  
  private static boolean decodePointVar(byte[] paramArrayOfbyte, boolean paramBoolean, PointAffine paramPointAffine) {
    int i = (paramArrayOfbyte[56] & 0x80) >>> 7;
    F.decode(paramArrayOfbyte, paramPointAffine.y);
    int[] arrayOfInt1 = F.create();
    int[] arrayOfInt2 = F.create();
    F.sqr(paramPointAffine.y, arrayOfInt1);
    F.mul(arrayOfInt1, 39081, arrayOfInt2);
    F.negate(arrayOfInt1, arrayOfInt1);
    F.addOne(arrayOfInt1);
    F.addOne(arrayOfInt2);
    if (!F.sqrtRatioVar(arrayOfInt1, arrayOfInt2, paramPointAffine.x))
      return false; 
    F.normalize(paramPointAffine.x);
    if (i == 1 && F.isZeroVar(paramPointAffine.x))
      return false; 
    if ((paramBoolean ^ ((i != (paramPointAffine.x[0] & 0x1)) ? 1 : 0)) != 0) {
      F.negate(paramPointAffine.x, paramPointAffine.x);
      F.normalize(paramPointAffine.x);
    } 
    return true;
  }
  
  private static void dom4(Xof paramXof, byte paramByte, byte[] paramArrayOfbyte) {
    int i = DOM4_PREFIX.length;
    byte[] arrayOfByte = new byte[i + 2 + paramArrayOfbyte.length];
    System.arraycopy(DOM4_PREFIX, 0, arrayOfByte, 0, i);
    arrayOfByte[i] = paramByte;
    arrayOfByte[i + 1] = (byte)paramArrayOfbyte.length;
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, i + 2, paramArrayOfbyte.length);
    paramXof.update(arrayOfByte, 0, arrayOfByte.length);
  }
  
  private static void encodePoint(PointAffine paramPointAffine, byte[] paramArrayOfbyte, int paramInt) {
    F.encode(paramPointAffine.y, paramArrayOfbyte, paramInt);
    paramArrayOfbyte[paramInt + 57 - 1] = (byte)((paramPointAffine.x[0] & 0x1) << 7);
  }
  
  public static void encodePublicPoint(PublicPoint paramPublicPoint, byte[] paramArrayOfbyte, int paramInt) {
    F.encode(paramPublicPoint.data, 16, paramArrayOfbyte, paramInt);
    paramArrayOfbyte[paramInt + 57 - 1] = (byte)((paramPublicPoint.data[0] & 0x1) << 7);
  }
  
  private static int encodeResult(PointProjective paramPointProjective, byte[] paramArrayOfbyte, int paramInt) {
    PointAffine pointAffine = new PointAffine();
    normalizeToAffine(paramPointProjective, pointAffine);
    int i = checkPoint(pointAffine);
    encodePoint(pointAffine, paramArrayOfbyte, paramInt);
    return i;
  }
  
  private static PublicPoint exportPoint(PointAffine paramPointAffine) {
    int[] arrayOfInt = new int[32];
    F.copy(paramPointAffine.x, 0, arrayOfInt, 0);
    F.copy(paramPointAffine.y, 0, arrayOfInt, 16);
    return new PublicPoint(arrayOfInt);
  }
  
  public static void generatePrivateKey(SecureRandom paramSecureRandom, byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != 57)
      throw new IllegalArgumentException("k"); 
    paramSecureRandom.nextBytes(paramArrayOfbyte);
  }
  
  public static void generatePublicKey(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2) {
    Xof xof = createXof();
    byte[] arrayOfByte1 = new byte[114];
    xof.update(paramArrayOfbyte1, paramInt1, 57);
    xof.doFinal(arrayOfByte1, 0, arrayOfByte1.length);
    byte[] arrayOfByte2 = new byte[57];
    pruneScalar(arrayOfByte1, 0, arrayOfByte2);
    scalarMultBaseEncoded(arrayOfByte2, paramArrayOfbyte2, paramInt2);
  }
  
  public static PublicPoint generatePublicKey(byte[] paramArrayOfbyte, int paramInt) {
    Xof xof = createXof();
    byte[] arrayOfByte1 = new byte[114];
    xof.update(paramArrayOfbyte, paramInt, 57);
    xof.doFinal(arrayOfByte1, 0, arrayOfByte1.length);
    byte[] arrayOfByte2 = new byte[57];
    pruneScalar(arrayOfByte1, 0, arrayOfByte2);
    PointProjective pointProjective = new PointProjective();
    scalarMultBase(arrayOfByte2, pointProjective);
    PointAffine pointAffine = new PointAffine();
    normalizeToAffine(pointProjective, pointAffine);
    if (0 == checkPoint(pointAffine))
      throw new IllegalStateException(); 
    return exportPoint(pointAffine);
  }
  
  private static int getWindow4(int[] paramArrayOfint, int paramInt) {
    int i = paramInt >>> 3;
    int j = (paramInt & 0x7) << 2;
    return paramArrayOfint[i] >>> j & 0xF;
  }
  
  private static void implSign(Xof paramXof, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, int paramInt1, byte[] paramArrayOfbyte4, byte paramByte, byte[] paramArrayOfbyte5, int paramInt2, int paramInt3, byte[] paramArrayOfbyte6, int paramInt4) {
    dom4(paramXof, paramByte, paramArrayOfbyte4);
    paramXof.update(paramArrayOfbyte1, 57, 57);
    paramXof.update(paramArrayOfbyte5, paramInt2, paramInt3);
    paramXof.doFinal(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
    byte[] arrayOfByte1 = Scalar448.reduce912(paramArrayOfbyte1);
    byte[] arrayOfByte2 = new byte[57];
    scalarMultBaseEncoded(arrayOfByte1, arrayOfByte2, 0);
    dom4(paramXof, paramByte, paramArrayOfbyte4);
    paramXof.update(arrayOfByte2, 0, 57);
    paramXof.update(paramArrayOfbyte3, paramInt1, 57);
    paramXof.update(paramArrayOfbyte5, paramInt2, paramInt3);
    paramXof.doFinal(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
    byte[] arrayOfByte3 = Scalar448.reduce912(paramArrayOfbyte1);
    byte[] arrayOfByte4 = calculateS(arrayOfByte1, arrayOfByte3, paramArrayOfbyte2);
    System.arraycopy(arrayOfByte2, 0, paramArrayOfbyte6, paramInt4, 57);
    System.arraycopy(arrayOfByte4, 0, paramArrayOfbyte6, paramInt4 + 57, 57);
  }
  
  private static void implSign(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, byte paramByte, byte[] paramArrayOfbyte3, int paramInt2, int paramInt3, byte[] paramArrayOfbyte4, int paramInt4) {
    if (!checkContextVar(paramArrayOfbyte2))
      throw new IllegalArgumentException("ctx"); 
    Xof xof = createXof();
    byte[] arrayOfByte1 = new byte[114];
    xof.update(paramArrayOfbyte1, paramInt1, 57);
    xof.doFinal(arrayOfByte1, 0, arrayOfByte1.length);
    byte[] arrayOfByte2 = new byte[57];
    pruneScalar(arrayOfByte1, 0, arrayOfByte2);
    byte[] arrayOfByte3 = new byte[57];
    scalarMultBaseEncoded(arrayOfByte2, arrayOfByte3, 0);
    implSign(xof, arrayOfByte1, arrayOfByte2, arrayOfByte3, 0, paramArrayOfbyte2, paramByte, paramArrayOfbyte3, paramInt2, paramInt3, paramArrayOfbyte4, paramInt4);
  }
  
  private static void implSign(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, byte[] paramArrayOfbyte3, byte paramByte, byte[] paramArrayOfbyte4, int paramInt3, int paramInt4, byte[] paramArrayOfbyte5, int paramInt5) {
    if (!checkContextVar(paramArrayOfbyte3))
      throw new IllegalArgumentException("ctx"); 
    Xof xof = createXof();
    byte[] arrayOfByte1 = new byte[114];
    xof.update(paramArrayOfbyte1, paramInt1, 57);
    xof.doFinal(arrayOfByte1, 0, arrayOfByte1.length);
    byte[] arrayOfByte2 = new byte[57];
    pruneScalar(arrayOfByte1, 0, arrayOfByte2);
    implSign(xof, arrayOfByte1, arrayOfByte2, paramArrayOfbyte2, paramInt2, paramArrayOfbyte3, paramByte, paramArrayOfbyte4, paramInt3, paramInt4, paramArrayOfbyte5, paramInt5);
  }
  
  private static boolean implVerify(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, byte[] paramArrayOfbyte3, byte paramByte, byte[] paramArrayOfbyte4, int paramInt3, int paramInt4) {
    if (!checkContextVar(paramArrayOfbyte3))
      throw new IllegalArgumentException("ctx"); 
    byte[] arrayOfByte1 = copy(paramArrayOfbyte1, paramInt1, 57);
    byte[] arrayOfByte2 = copy(paramArrayOfbyte1, paramInt1 + 57, 57);
    byte[] arrayOfByte3 = copy(paramArrayOfbyte2, paramInt2, 57);
    if (!checkPointVar(arrayOfByte1))
      return false; 
    int[] arrayOfInt1 = new int[14];
    if (!Scalar448.checkVar(arrayOfByte2, arrayOfInt1))
      return false; 
    if (!checkPointFullVar(arrayOfByte3))
      return false; 
    PointAffine pointAffine1 = new PointAffine();
    if (!decodePointVar(arrayOfByte1, true, pointAffine1))
      return false; 
    PointAffine pointAffine2 = new PointAffine();
    if (!decodePointVar(arrayOfByte3, true, pointAffine2))
      return false; 
    Xof xof = createXof();
    byte[] arrayOfByte4 = new byte[114];
    dom4(xof, paramByte, paramArrayOfbyte3);
    xof.update(arrayOfByte1, 0, 57);
    xof.update(arrayOfByte3, 0, 57);
    xof.update(paramArrayOfbyte4, paramInt3, paramInt4);
    xof.doFinal(arrayOfByte4, 0, arrayOfByte4.length);
    byte[] arrayOfByte5 = Scalar448.reduce912(arrayOfByte4);
    int[] arrayOfInt2 = new int[14];
    Scalar448.decode(arrayOfByte5, arrayOfInt2);
    int[] arrayOfInt3 = new int[8];
    int[] arrayOfInt4 = new int[8];
    if (!Scalar448.reduceBasisVar(arrayOfInt2, arrayOfInt3, arrayOfInt4))
      throw new IllegalStateException(); 
    Scalar448.multiply225Var(arrayOfInt1, arrayOfInt4, arrayOfInt1);
    PointProjective pointProjective = new PointProjective();
    scalarMultStraus225Var(arrayOfInt1, arrayOfInt3, pointAffine2, arrayOfInt4, pointAffine1, pointProjective);
    return normalizeToNeutralElementVar(pointProjective);
  }
  
  private static boolean implVerify(byte[] paramArrayOfbyte1, int paramInt1, PublicPoint paramPublicPoint, byte[] paramArrayOfbyte2, byte paramByte, byte[] paramArrayOfbyte3, int paramInt2, int paramInt3) {
    if (!checkContextVar(paramArrayOfbyte2))
      throw new IllegalArgumentException("ctx"); 
    byte[] arrayOfByte1 = copy(paramArrayOfbyte1, paramInt1, 57);
    byte[] arrayOfByte2 = copy(paramArrayOfbyte1, paramInt1 + 57, 57);
    if (!checkPointVar(arrayOfByte1))
      return false; 
    int[] arrayOfInt1 = new int[14];
    if (!Scalar448.checkVar(arrayOfByte2, arrayOfInt1))
      return false; 
    PointAffine pointAffine1 = new PointAffine();
    if (!decodePointVar(arrayOfByte1, true, pointAffine1))
      return false; 
    PointAffine pointAffine2 = new PointAffine();
    F.negate(paramPublicPoint.data, pointAffine2.x);
    F.copy(paramPublicPoint.data, 16, pointAffine2.y, 0);
    byte[] arrayOfByte3 = new byte[57];
    encodePublicPoint(paramPublicPoint, arrayOfByte3, 0);
    Xof xof = createXof();
    byte[] arrayOfByte4 = new byte[114];
    dom4(xof, paramByte, paramArrayOfbyte2);
    xof.update(arrayOfByte1, 0, 57);
    xof.update(arrayOfByte3, 0, 57);
    xof.update(paramArrayOfbyte3, paramInt2, paramInt3);
    xof.doFinal(arrayOfByte4, 0, arrayOfByte4.length);
    byte[] arrayOfByte5 = Scalar448.reduce912(arrayOfByte4);
    int[] arrayOfInt2 = new int[14];
    Scalar448.decode(arrayOfByte5, arrayOfInt2);
    int[] arrayOfInt3 = new int[8];
    int[] arrayOfInt4 = new int[8];
    if (!Scalar448.reduceBasisVar(arrayOfInt2, arrayOfInt3, arrayOfInt4))
      throw new IllegalStateException(); 
    Scalar448.multiply225Var(arrayOfInt1, arrayOfInt4, arrayOfInt1);
    PointProjective pointProjective = new PointProjective();
    scalarMultStraus225Var(arrayOfInt1, arrayOfInt3, pointAffine2, arrayOfInt4, pointAffine1, pointProjective);
    return normalizeToNeutralElementVar(pointProjective);
  }
  
  private static void invertZs(PointProjective[] paramArrayOfPointProjective) {
    int i = paramArrayOfPointProjective.length;
    int[] arrayOfInt1 = F.createTable(i);
    int[] arrayOfInt2 = F.create();
    F.copy((paramArrayOfPointProjective[0]).z, 0, arrayOfInt2, 0);
    F.copy(arrayOfInt2, 0, arrayOfInt1, 0);
    byte b = 0;
    while (++b < i) {
      F.mul(arrayOfInt2, (paramArrayOfPointProjective[b]).z, arrayOfInt2);
      F.copy(arrayOfInt2, 0, arrayOfInt1, b * 16);
    } 
    F.invVar(arrayOfInt2, arrayOfInt2);
    b--;
    int[] arrayOfInt3 = F.create();
    while (b > 0) {
      byte b1 = b--;
      F.copy(arrayOfInt1, b * 16, arrayOfInt3, 0);
      F.mul(arrayOfInt3, arrayOfInt2, arrayOfInt3);
      F.mul(arrayOfInt2, (paramArrayOfPointProjective[b1]).z, arrayOfInt2);
      F.copy(arrayOfInt3, 0, (paramArrayOfPointProjective[b1]).z, 0);
    } 
    F.copy(arrayOfInt2, 0, (paramArrayOfPointProjective[0]).z, 0);
  }
  
  private static void normalizeToAffine(PointProjective paramPointProjective, PointAffine paramPointAffine) {
    F.inv(paramPointProjective.z, paramPointAffine.y);
    F.mul(paramPointAffine.y, paramPointProjective.x, paramPointAffine.x);
    F.mul(paramPointAffine.y, paramPointProjective.y, paramPointAffine.y);
    F.normalize(paramPointAffine.x);
    F.normalize(paramPointAffine.y);
  }
  
  private static boolean normalizeToNeutralElementVar(PointProjective paramPointProjective) {
    F.normalize(paramPointProjective.x);
    F.normalize(paramPointProjective.y);
    F.normalize(paramPointProjective.z);
    return (F.isZeroVar(paramPointProjective.x) && !F.isZeroVar(paramPointProjective.y) && F.areEqualVar(paramPointProjective.y, paramPointProjective.z));
  }
  
  private static void pointAdd(PointAffine paramPointAffine, PointProjective paramPointProjective, PointTemp paramPointTemp) {
    int[] arrayOfInt1 = paramPointTemp.r1;
    int[] arrayOfInt2 = paramPointTemp.r2;
    int[] arrayOfInt3 = paramPointTemp.r3;
    int[] arrayOfInt4 = paramPointTemp.r4;
    int[] arrayOfInt5 = paramPointTemp.r5;
    int[] arrayOfInt6 = paramPointTemp.r6;
    int[] arrayOfInt7 = paramPointTemp.r7;
    F.sqr(paramPointProjective.z, arrayOfInt1);
    F.mul(paramPointAffine.x, paramPointProjective.x, arrayOfInt2);
    F.mul(paramPointAffine.y, paramPointProjective.y, arrayOfInt3);
    F.mul(arrayOfInt2, arrayOfInt3, arrayOfInt4);
    F.mul(arrayOfInt4, 39081, arrayOfInt4);
    F.add(arrayOfInt1, arrayOfInt4, arrayOfInt5);
    F.sub(arrayOfInt1, arrayOfInt4, arrayOfInt6);
    F.add(paramPointAffine.y, paramPointAffine.x, arrayOfInt7);
    F.add(paramPointProjective.y, paramPointProjective.x, arrayOfInt4);
    F.mul(arrayOfInt7, arrayOfInt4, arrayOfInt7);
    F.add(arrayOfInt3, arrayOfInt2, arrayOfInt1);
    F.sub(arrayOfInt3, arrayOfInt2, arrayOfInt4);
    F.carry(arrayOfInt1);
    F.sub(arrayOfInt7, arrayOfInt1, arrayOfInt7);
    F.mul(arrayOfInt7, paramPointProjective.z, arrayOfInt7);
    F.mul(arrayOfInt4, paramPointProjective.z, arrayOfInt4);
    F.mul(arrayOfInt5, arrayOfInt7, paramPointProjective.x);
    F.mul(arrayOfInt4, arrayOfInt6, paramPointProjective.y);
    F.mul(arrayOfInt5, arrayOfInt6, paramPointProjective.z);
  }
  
  private static void pointAdd(PointProjective paramPointProjective1, PointProjective paramPointProjective2, PointTemp paramPointTemp) {
    int[] arrayOfInt1 = paramPointTemp.r0;
    int[] arrayOfInt2 = paramPointTemp.r1;
    int[] arrayOfInt3 = paramPointTemp.r2;
    int[] arrayOfInt4 = paramPointTemp.r3;
    int[] arrayOfInt5 = paramPointTemp.r4;
    int[] arrayOfInt6 = paramPointTemp.r5;
    int[] arrayOfInt7 = paramPointTemp.r6;
    int[] arrayOfInt8 = paramPointTemp.r7;
    F.mul(paramPointProjective1.z, paramPointProjective2.z, arrayOfInt1);
    F.sqr(arrayOfInt1, arrayOfInt2);
    F.mul(paramPointProjective1.x, paramPointProjective2.x, arrayOfInt3);
    F.mul(paramPointProjective1.y, paramPointProjective2.y, arrayOfInt4);
    F.mul(arrayOfInt3, arrayOfInt4, arrayOfInt5);
    F.mul(arrayOfInt5, 39081, arrayOfInt5);
    F.add(arrayOfInt2, arrayOfInt5, arrayOfInt6);
    F.sub(arrayOfInt2, arrayOfInt5, arrayOfInt7);
    F.add(paramPointProjective1.y, paramPointProjective1.x, arrayOfInt8);
    F.add(paramPointProjective2.y, paramPointProjective2.x, arrayOfInt5);
    F.mul(arrayOfInt8, arrayOfInt5, arrayOfInt8);
    F.add(arrayOfInt4, arrayOfInt3, arrayOfInt2);
    F.sub(arrayOfInt4, arrayOfInt3, arrayOfInt5);
    F.carry(arrayOfInt2);
    F.sub(arrayOfInt8, arrayOfInt2, arrayOfInt8);
    F.mul(arrayOfInt8, arrayOfInt1, arrayOfInt8);
    F.mul(arrayOfInt5, arrayOfInt1, arrayOfInt5);
    F.mul(arrayOfInt6, arrayOfInt8, paramPointProjective2.x);
    F.mul(arrayOfInt5, arrayOfInt7, paramPointProjective2.y);
    F.mul(arrayOfInt6, arrayOfInt7, paramPointProjective2.z);
  }
  
  private static void pointAddVar(boolean paramBoolean, PointAffine paramPointAffine, PointProjective paramPointProjective, PointTemp paramPointTemp) {
    int[] arrayOfInt8;
    int[] arrayOfInt9;
    int[] arrayOfInt10;
    int[] arrayOfInt11;
    int[] arrayOfInt1 = paramPointTemp.r1;
    int[] arrayOfInt2 = paramPointTemp.r2;
    int[] arrayOfInt3 = paramPointTemp.r3;
    int[] arrayOfInt4 = paramPointTemp.r4;
    int[] arrayOfInt5 = paramPointTemp.r5;
    int[] arrayOfInt6 = paramPointTemp.r6;
    int[] arrayOfInt7 = paramPointTemp.r7;
    if (paramBoolean) {
      arrayOfInt8 = arrayOfInt4;
      arrayOfInt9 = arrayOfInt1;
      arrayOfInt10 = arrayOfInt6;
      arrayOfInt11 = arrayOfInt5;
      F.sub(paramPointAffine.y, paramPointAffine.x, arrayOfInt7);
    } else {
      arrayOfInt8 = arrayOfInt1;
      arrayOfInt9 = arrayOfInt4;
      arrayOfInt10 = arrayOfInt5;
      arrayOfInt11 = arrayOfInt6;
      F.add(paramPointAffine.y, paramPointAffine.x, arrayOfInt7);
    } 
    F.sqr(paramPointProjective.z, arrayOfInt1);
    F.mul(paramPointAffine.x, paramPointProjective.x, arrayOfInt2);
    F.mul(paramPointAffine.y, paramPointProjective.y, arrayOfInt3);
    F.mul(arrayOfInt2, arrayOfInt3, arrayOfInt4);
    F.mul(arrayOfInt4, 39081, arrayOfInt4);
    F.add(arrayOfInt1, arrayOfInt4, arrayOfInt10);
    F.sub(arrayOfInt1, arrayOfInt4, arrayOfInt11);
    F.add(paramPointProjective.y, paramPointProjective.x, arrayOfInt4);
    F.mul(arrayOfInt7, arrayOfInt4, arrayOfInt7);
    F.add(arrayOfInt3, arrayOfInt2, arrayOfInt8);
    F.sub(arrayOfInt3, arrayOfInt2, arrayOfInt9);
    F.carry(arrayOfInt8);
    F.sub(arrayOfInt7, arrayOfInt1, arrayOfInt7);
    F.mul(arrayOfInt7, paramPointProjective.z, arrayOfInt7);
    F.mul(arrayOfInt4, paramPointProjective.z, arrayOfInt4);
    F.mul(arrayOfInt5, arrayOfInt7, paramPointProjective.x);
    F.mul(arrayOfInt4, arrayOfInt6, paramPointProjective.y);
    F.mul(arrayOfInt5, arrayOfInt6, paramPointProjective.z);
  }
  
  private static void pointAddVar(boolean paramBoolean, PointProjective paramPointProjective1, PointProjective paramPointProjective2, PointTemp paramPointTemp) {
    int[] arrayOfInt9;
    int[] arrayOfInt10;
    int[] arrayOfInt11;
    int[] arrayOfInt12;
    int[] arrayOfInt1 = paramPointTemp.r0;
    int[] arrayOfInt2 = paramPointTemp.r1;
    int[] arrayOfInt3 = paramPointTemp.r2;
    int[] arrayOfInt4 = paramPointTemp.r3;
    int[] arrayOfInt5 = paramPointTemp.r4;
    int[] arrayOfInt6 = paramPointTemp.r5;
    int[] arrayOfInt7 = paramPointTemp.r6;
    int[] arrayOfInt8 = paramPointTemp.r7;
    if (paramBoolean) {
      arrayOfInt9 = arrayOfInt5;
      arrayOfInt10 = arrayOfInt2;
      arrayOfInt11 = arrayOfInt7;
      arrayOfInt12 = arrayOfInt6;
      F.sub(paramPointProjective1.y, paramPointProjective1.x, arrayOfInt8);
    } else {
      arrayOfInt9 = arrayOfInt2;
      arrayOfInt10 = arrayOfInt5;
      arrayOfInt11 = arrayOfInt6;
      arrayOfInt12 = arrayOfInt7;
      F.add(paramPointProjective1.y, paramPointProjective1.x, arrayOfInt8);
    } 
    F.mul(paramPointProjective1.z, paramPointProjective2.z, arrayOfInt1);
    F.sqr(arrayOfInt1, arrayOfInt2);
    F.mul(paramPointProjective1.x, paramPointProjective2.x, arrayOfInt3);
    F.mul(paramPointProjective1.y, paramPointProjective2.y, arrayOfInt4);
    F.mul(arrayOfInt3, arrayOfInt4, arrayOfInt5);
    F.mul(arrayOfInt5, 39081, arrayOfInt5);
    F.add(arrayOfInt2, arrayOfInt5, arrayOfInt11);
    F.sub(arrayOfInt2, arrayOfInt5, arrayOfInt12);
    F.add(paramPointProjective2.y, paramPointProjective2.x, arrayOfInt5);
    F.mul(arrayOfInt8, arrayOfInt5, arrayOfInt8);
    F.add(arrayOfInt4, arrayOfInt3, arrayOfInt9);
    F.sub(arrayOfInt4, arrayOfInt3, arrayOfInt10);
    F.carry(arrayOfInt9);
    F.sub(arrayOfInt8, arrayOfInt2, arrayOfInt8);
    F.mul(arrayOfInt8, arrayOfInt1, arrayOfInt8);
    F.mul(arrayOfInt5, arrayOfInt1, arrayOfInt5);
    F.mul(arrayOfInt6, arrayOfInt8, paramPointProjective2.x);
    F.mul(arrayOfInt5, arrayOfInt7, paramPointProjective2.y);
    F.mul(arrayOfInt6, arrayOfInt7, paramPointProjective2.z);
  }
  
  private static void pointCopy(PointAffine paramPointAffine, PointProjective paramPointProjective) {
    F.copy(paramPointAffine.x, 0, paramPointProjective.x, 0);
    F.copy(paramPointAffine.y, 0, paramPointProjective.y, 0);
    F.one(paramPointProjective.z);
  }
  
  private static void pointCopy(PointProjective paramPointProjective1, PointProjective paramPointProjective2) {
    F.copy(paramPointProjective1.x, 0, paramPointProjective2.x, 0);
    F.copy(paramPointProjective1.y, 0, paramPointProjective2.y, 0);
    F.copy(paramPointProjective1.z, 0, paramPointProjective2.z, 0);
  }
  
  private static void pointDouble(PointProjective paramPointProjective, PointTemp paramPointTemp) {
    int[] arrayOfInt1 = paramPointTemp.r1;
    int[] arrayOfInt2 = paramPointTemp.r2;
    int[] arrayOfInt3 = paramPointTemp.r3;
    int[] arrayOfInt4 = paramPointTemp.r4;
    int[] arrayOfInt5 = paramPointTemp.r7;
    int[] arrayOfInt6 = paramPointTemp.r0;
    F.add(paramPointProjective.x, paramPointProjective.y, arrayOfInt1);
    F.sqr(arrayOfInt1, arrayOfInt1);
    F.sqr(paramPointProjective.x, arrayOfInt2);
    F.sqr(paramPointProjective.y, arrayOfInt3);
    F.add(arrayOfInt2, arrayOfInt3, arrayOfInt4);
    F.carry(arrayOfInt4);
    F.sqr(paramPointProjective.z, arrayOfInt5);
    F.add(arrayOfInt5, arrayOfInt5, arrayOfInt5);
    F.carry(arrayOfInt5);
    F.sub(arrayOfInt4, arrayOfInt5, arrayOfInt6);
    F.sub(arrayOfInt1, arrayOfInt4, arrayOfInt1);
    F.sub(arrayOfInt2, arrayOfInt3, arrayOfInt2);
    F.mul(arrayOfInt1, arrayOfInt6, paramPointProjective.x);
    F.mul(arrayOfInt4, arrayOfInt2, paramPointProjective.y);
    F.mul(arrayOfInt4, arrayOfInt6, paramPointProjective.z);
  }
  
  private static void pointLookup(int paramInt1, int paramInt2, PointAffine paramPointAffine) {
    int i = paramInt1 * 16 * 2 * 16;
    for (byte b = 0; b < 16; b++) {
      int j = (b ^ paramInt2) - 1 >> 31;
      F.cmov(j, PRECOMP_BASE_COMB, i, paramPointAffine.x, 0);
      i += 16;
      F.cmov(j, PRECOMP_BASE_COMB, i, paramPointAffine.y, 0);
      i += 16;
    } 
  }
  
  private static void pointLookup(int[] paramArrayOfint1, int paramInt, int[] paramArrayOfint2, PointProjective paramPointProjective) {
    int i = getWindow4(paramArrayOfint1, paramInt);
    int j = i >>> 3 ^ 0x1;
    int k = (i ^ -j) & 0x7;
    byte b = 0;
    boolean bool = false;
    while (b < 8) {
      int m = (b ^ k) - 1 >> 31;
      F.cmov(m, paramArrayOfint2, bool, paramPointProjective.x, 0);
      bool += true;
      F.cmov(m, paramArrayOfint2, bool, paramPointProjective.y, 0);
      bool += true;
      F.cmov(m, paramArrayOfint2, bool, paramPointProjective.z, 0);
      bool += true;
      b++;
    } 
    F.cnegate(j, paramPointProjective.x);
  }
  
  private static void pointLookup15(int[] paramArrayOfint, PointProjective paramPointProjective) {
    char c = 'Ő';
    F.copy(paramArrayOfint, c, paramPointProjective.x, 0);
    c += '\020';
    F.copy(paramArrayOfint, c, paramPointProjective.y, 0);
    c += '\020';
    F.copy(paramArrayOfint, c, paramPointProjective.z, 0);
  }
  
  private static int[] pointPrecompute(PointProjective paramPointProjective, int paramInt, PointTemp paramPointTemp) {
    PointProjective pointProjective1 = new PointProjective();
    pointCopy(paramPointProjective, pointProjective1);
    PointProjective pointProjective2 = new PointProjective();
    pointCopy(paramPointProjective, pointProjective2);
    pointDouble(pointProjective2, paramPointTemp);
    int[] arrayOfInt = F.createTable(paramInt * 3);
    boolean bool = false;
    byte b = 0;
    while (true) {
      F.copy(pointProjective1.x, 0, arrayOfInt, bool);
      bool += true;
      F.copy(pointProjective1.y, 0, arrayOfInt, bool);
      bool += true;
      F.copy(pointProjective1.z, 0, arrayOfInt, bool);
      bool += true;
      if (++b == paramInt)
        return arrayOfInt; 
      pointAdd(pointProjective2, pointProjective1, paramPointTemp);
    } 
  }
  
  private static void pointPrecompute(PointAffine paramPointAffine, PointProjective[] paramArrayOfPointProjective, int paramInt1, int paramInt2, PointTemp paramPointTemp) {
    PointProjective pointProjective = new PointProjective();
    pointCopy(paramPointAffine, pointProjective);
    pointDouble(pointProjective, paramPointTemp);
    paramArrayOfPointProjective[paramInt1] = new PointProjective();
    pointCopy(paramPointAffine, paramArrayOfPointProjective[paramInt1]);
    for (byte b = 1; b < paramInt2; b++) {
      paramArrayOfPointProjective[paramInt1 + b] = new PointProjective();
      pointCopy(paramArrayOfPointProjective[paramInt1 + b - 1], paramArrayOfPointProjective[paramInt1 + b]);
      pointAdd(pointProjective, paramArrayOfPointProjective[paramInt1 + b], paramPointTemp);
    } 
  }
  
  private static void pointSetNeutral(PointProjective paramPointProjective) {
    F.zero(paramPointProjective.x);
    F.one(paramPointProjective.y);
    F.one(paramPointProjective.z);
  }
  
  public static void precompute() {
    synchronized (PRECOMP_LOCK) {
      if (PRECOMP_BASE_COMB != null)
        return; 
      byte b1 = 32;
      byte b2 = 80;
      int i = b1 * 2 + b2;
      PointProjective[] arrayOfPointProjective1 = new PointProjective[i];
      PointTemp pointTemp = new PointTemp();
      PointAffine pointAffine1 = new PointAffine();
      F.copy(B_x, 0, pointAffine1.x, 0);
      F.copy(B_y, 0, pointAffine1.y, 0);
      pointPrecompute(pointAffine1, arrayOfPointProjective1, 0, b1, pointTemp);
      PointAffine pointAffine2 = new PointAffine();
      F.copy(B225_x, 0, pointAffine2.x, 0);
      F.copy(B225_y, 0, pointAffine2.y, 0);
      pointPrecompute(pointAffine2, arrayOfPointProjective1, b1, b1, pointTemp);
      PointProjective pointProjective = new PointProjective();
      pointCopy(pointAffine1, pointProjective);
      int j = b1 * 2;
      PointProjective[] arrayOfPointProjective2 = new PointProjective[5];
      byte b3;
      for (b3 = 0; b3 < 5; b3++)
        arrayOfPointProjective2[b3] = new PointProjective(); 
      for (b3 = 0; b3 < 5; b3++) {
        PointProjective pointProjective1 = arrayOfPointProjective1[j++] = new PointProjective();
        byte b;
        for (b = 0; b < 5; b++) {
          if (b == 0) {
            pointCopy(pointProjective, pointProjective1);
          } else {
            pointAdd(pointProjective, pointProjective1, pointTemp);
          } 
          pointDouble(pointProjective, pointTemp);
          pointCopy(pointProjective, arrayOfPointProjective2[b]);
          if (b3 + b != 8)
            for (byte b4 = 1; b4 < 18; b4++)
              pointDouble(pointProjective, pointTemp);  
        } 
        F.negate(pointProjective1.x, pointProjective1.x);
        for (b = 0; b < 4; b++) {
          int m = 1 << b;
          byte b4 = 0;
          while (b4 < m) {
            arrayOfPointProjective1[j] = new PointProjective();
            pointCopy(arrayOfPointProjective1[j - m], arrayOfPointProjective1[j]);
            pointAdd(arrayOfPointProjective2[b], arrayOfPointProjective1[j], pointTemp);
            b4++;
            j++;
          } 
        } 
      } 
      invertZs(arrayOfPointProjective1);
      PRECOMP_BASE_WNAF = new PointAffine[b1];
      for (b3 = 0; b3 < b1; b3++) {
        PointProjective pointProjective1 = arrayOfPointProjective1[b3];
        PointAffine pointAffine = PRECOMP_BASE_WNAF[b3] = new PointAffine();
        F.mul(pointProjective1.x, pointProjective1.z, pointAffine.x);
        F.normalize(pointAffine.x);
        F.mul(pointProjective1.y, pointProjective1.z, pointAffine.y);
        F.normalize(pointAffine.y);
      } 
      PRECOMP_BASE225_WNAF = new PointAffine[b1];
      for (b3 = 0; b3 < b1; b3++) {
        PointProjective pointProjective1 = arrayOfPointProjective1[b1 + b3];
        PointAffine pointAffine = PRECOMP_BASE225_WNAF[b3] = new PointAffine();
        F.mul(pointProjective1.x, pointProjective1.z, pointAffine.x);
        F.normalize(pointAffine.x);
        F.mul(pointProjective1.y, pointProjective1.z, pointAffine.y);
        F.normalize(pointAffine.y);
      } 
      PRECOMP_BASE_COMB = F.createTable(b2 * 2);
      b3 = 0;
      for (int k = b1 * 2; k < i; k++) {
        PointProjective pointProjective1 = arrayOfPointProjective1[k];
        F.mul(pointProjective1.x, pointProjective1.z, pointProjective1.x);
        F.normalize(pointProjective1.x);
        F.mul(pointProjective1.y, pointProjective1.z, pointProjective1.y);
        F.normalize(pointProjective1.y);
        F.copy(pointProjective1.x, 0, PRECOMP_BASE_COMB, b3);
        b3 += 16;
        F.copy(pointProjective1.y, 0, PRECOMP_BASE_COMB, b3);
        b3 += 16;
      } 
    } 
  }
  
  private static void pruneScalar(byte[] paramArrayOfbyte1, int paramInt, byte[] paramArrayOfbyte2) {
    System.arraycopy(paramArrayOfbyte1, paramInt, paramArrayOfbyte2, 0, 56);
    paramArrayOfbyte2[0] = (byte)(paramArrayOfbyte2[0] & 0xFC);
    paramArrayOfbyte2[55] = (byte)(paramArrayOfbyte2[55] | 0x80);
    paramArrayOfbyte2[56] = 0;
  }
  
  private static void scalarMult(byte[] paramArrayOfbyte, PointProjective paramPointProjective1, PointProjective paramPointProjective2) {
    int[] arrayOfInt1 = new int[15];
    Scalar448.decode(paramArrayOfbyte, arrayOfInt1);
    Scalar448.toSignedDigits(449, arrayOfInt1, arrayOfInt1);
    PointProjective pointProjective = new PointProjective();
    PointTemp pointTemp = new PointTemp();
    int[] arrayOfInt2 = pointPrecompute(paramPointProjective1, 8, pointTemp);
    pointLookup15(arrayOfInt2, paramPointProjective2);
    pointAdd(paramPointProjective1, paramPointProjective2, pointTemp);
    byte b = 111;
    while (true) {
      pointLookup(arrayOfInt1, b, arrayOfInt2, pointProjective);
      pointAdd(pointProjective, paramPointProjective2, pointTemp);
      if (--b < 0)
        break; 
      for (byte b1 = 0; b1 < 4; b1++)
        pointDouble(paramPointProjective2, pointTemp); 
    } 
  }
  
  private static void scalarMultBase(byte[] paramArrayOfbyte, PointProjective paramPointProjective) {
    precompute();
    int[] arrayOfInt = new int[15];
    Scalar448.decode(paramArrayOfbyte, arrayOfInt);
    Scalar448.toSignedDigits(450, arrayOfInt, arrayOfInt);
    PointAffine pointAffine = new PointAffine();
    PointTemp pointTemp = new PointTemp();
    pointSetNeutral(paramPointProjective);
    byte b = 17;
    while (true) {
      byte b1 = b;
      for (byte b2 = 0; b2 < 5; b2++) {
        int i = 0;
        int j;
        for (j = 0; j < 5; j++) {
          int m = arrayOfInt[b1 >>> 5] >>> (b1 & 0x1F);
          i &= 1 << j ^ 0xFFFFFFFF;
          i ^= m << j;
          b1 += 18;
        } 
        j = i >>> 4 & 0x1;
        int k = (i ^ -j) & 0xF;
        pointLookup(b2, k, pointAffine);
        F.cnegate(j, pointAffine.x);
        pointAdd(pointAffine, paramPointProjective, pointTemp);
      } 
      if (--b < 0)
        break; 
      pointDouble(paramPointProjective, pointTemp);
    } 
  }
  
  private static void scalarMultBaseEncoded(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    PointProjective pointProjective = new PointProjective();
    scalarMultBase(paramArrayOfbyte1, pointProjective);
    if (0 == encodeResult(pointProjective, paramArrayOfbyte2, paramInt))
      throw new IllegalStateException(); 
  }
  
  public static void scalarMultBaseXY(X448.Friend paramFriend, byte[] paramArrayOfbyte, int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    if (null == paramFriend)
      throw new NullPointerException("This method is only for use by X448"); 
    byte[] arrayOfByte = new byte[57];
    pruneScalar(paramArrayOfbyte, paramInt, arrayOfByte);
    PointProjective pointProjective = new PointProjective();
    scalarMultBase(arrayOfByte, pointProjective);
    if (0 == checkPoint(pointProjective))
      throw new IllegalStateException(); 
    F.copy(pointProjective.x, 0, paramArrayOfint1, 0);
    F.copy(pointProjective.y, 0, paramArrayOfint2, 0);
  }
  
  private static void scalarMultOrderVar(PointAffine paramPointAffine, PointProjective paramPointProjective) {
    byte[] arrayOfByte = new byte[447];
    Scalar448.getOrderWnafVar(5, arrayOfByte);
    byte b = 8;
    PointProjective[] arrayOfPointProjective = new PointProjective[b];
    PointTemp pointTemp = new PointTemp();
    pointPrecompute(paramPointAffine, arrayOfPointProjective, 0, b, pointTemp);
    pointSetNeutral(paramPointProjective);
    char c = 'ƾ';
    while (true) {
      byte b1 = arrayOfByte[c];
      if (b1 != 0) {
        int i = b1 >> 1 ^ b1 >> 31;
        pointAddVar((b1 < 0), arrayOfPointProjective[i], paramPointProjective, pointTemp);
      } 
      if (--c < '\000')
        break; 
      pointDouble(paramPointProjective, pointTemp);
    } 
  }
  
  private static void scalarMultStraus225Var(int[] paramArrayOfint1, int[] paramArrayOfint2, PointAffine paramPointAffine1, int[] paramArrayOfint3, PointAffine paramPointAffine2, PointProjective paramPointProjective) {
    precompute();
    byte[] arrayOfByte1 = new byte[450];
    byte[] arrayOfByte2 = new byte[225];
    byte[] arrayOfByte3 = new byte[225];
    Wnaf.getSignedVar(paramArrayOfint1, 7, arrayOfByte1);
    Wnaf.getSignedVar(paramArrayOfint2, 5, arrayOfByte2);
    Wnaf.getSignedVar(paramArrayOfint3, 5, arrayOfByte3);
    byte b = 8;
    PointProjective[] arrayOfPointProjective1 = new PointProjective[b];
    PointProjective[] arrayOfPointProjective2 = new PointProjective[b];
    PointTemp pointTemp = new PointTemp();
    pointPrecompute(paramPointAffine1, arrayOfPointProjective1, 0, b, pointTemp);
    pointPrecompute(paramPointAffine2, arrayOfPointProjective2, 0, b, pointTemp);
    pointSetNeutral(paramPointProjective);
    char c = 'á';
    do {
    
    } while (--c >= '\000' && (arrayOfByte1[c] | arrayOfByte1[225 + c] | arrayOfByte2[c] | arrayOfByte3[c]) == 0);
    while (c >= '\000') {
      byte b1 = arrayOfByte1[c];
      if (b1 != 0) {
        int i = b1 >> 1 ^ b1 >> 31;
        pointAddVar((b1 < 0), PRECOMP_BASE_WNAF[i], paramPointProjective, pointTemp);
      } 
      byte b2 = arrayOfByte1[225 + c];
      if (b2 != 0) {
        int i = b2 >> 1 ^ b2 >> 31;
        pointAddVar((b2 < 0), PRECOMP_BASE225_WNAF[i], paramPointProjective, pointTemp);
      } 
      byte b3 = arrayOfByte2[c];
      if (b3 != 0) {
        int i = b3 >> 1 ^ b3 >> 31;
        pointAddVar((b3 < 0), arrayOfPointProjective1[i], paramPointProjective, pointTemp);
      } 
      byte b4 = arrayOfByte3[c];
      if (b4 != 0) {
        int i = b4 >> 1 ^ b4 >> 31;
        pointAddVar((b4 < 0), arrayOfPointProjective2[i], paramPointProjective, pointTemp);
      } 
      pointDouble(paramPointProjective, pointTemp);
      c--;
    } 
    pointDouble(paramPointProjective, pointTemp);
  }
  
  public static void sign(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, int paramInt2, int paramInt3, byte[] paramArrayOfbyte4, int paramInt4) {
    boolean bool = false;
    implSign(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, bool, paramArrayOfbyte3, paramInt2, paramInt3, paramArrayOfbyte4, paramInt4);
  }
  
  public static void sign(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, int paramInt3, int paramInt4, byte[] paramArrayOfbyte5, int paramInt5) {
    boolean bool = false;
    implSign(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt2, paramArrayOfbyte3, bool, paramArrayOfbyte4, paramInt3, paramInt4, paramArrayOfbyte5, paramInt5);
  }
  
  public static void signPrehash(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, int paramInt2, byte[] paramArrayOfbyte4, int paramInt3) {
    boolean bool = true;
    implSign(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, bool, paramArrayOfbyte3, paramInt2, 64, paramArrayOfbyte4, paramInt3);
  }
  
  public static void signPrehash(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, int paramInt3, byte[] paramArrayOfbyte5, int paramInt4) {
    boolean bool = true;
    implSign(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt2, paramArrayOfbyte3, bool, paramArrayOfbyte4, paramInt3, 64, paramArrayOfbyte5, paramInt4);
  }
  
  public static void signPrehash(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, Xof paramXof, byte[] paramArrayOfbyte3, int paramInt2) {
    byte[] arrayOfByte = new byte[64];
    if (64 != paramXof.doFinal(arrayOfByte, 0, 64))
      throw new IllegalArgumentException("ph"); 
    boolean bool = true;
    implSign(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, bool, arrayOfByte, 0, arrayOfByte.length, paramArrayOfbyte3, paramInt2);
  }
  
  public static void signPrehash(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, byte[] paramArrayOfbyte3, Xof paramXof, byte[] paramArrayOfbyte4, int paramInt3) {
    byte[] arrayOfByte = new byte[64];
    if (64 != paramXof.doFinal(arrayOfByte, 0, 64))
      throw new IllegalArgumentException("ph"); 
    boolean bool = true;
    implSign(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt2, paramArrayOfbyte3, bool, arrayOfByte, 0, arrayOfByte.length, paramArrayOfbyte4, paramInt3);
  }
  
  public static boolean validatePublicKeyFull(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = copy(paramArrayOfbyte, paramInt, 57);
    if (!checkPointFullVar(arrayOfByte))
      return false; 
    PointAffine pointAffine = new PointAffine();
    return !decodePointVar(arrayOfByte, false, pointAffine) ? false : checkPointOrderVar(pointAffine);
  }
  
  public static PublicPoint validatePublicKeyFullExport(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = copy(paramArrayOfbyte, paramInt, 57);
    if (!checkPointFullVar(arrayOfByte))
      return null; 
    PointAffine pointAffine = new PointAffine();
    return !decodePointVar(arrayOfByte, false, pointAffine) ? null : (!checkPointOrderVar(pointAffine) ? null : exportPoint(pointAffine));
  }
  
  public static boolean validatePublicKeyPartial(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = copy(paramArrayOfbyte, paramInt, 57);
    if (!checkPointFullVar(arrayOfByte))
      return false; 
    PointAffine pointAffine = new PointAffine();
    return decodePointVar(arrayOfByte, false, pointAffine);
  }
  
  public static PublicPoint validatePublicKeyPartialExport(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = copy(paramArrayOfbyte, paramInt, 57);
    if (!checkPointFullVar(arrayOfByte))
      return null; 
    PointAffine pointAffine = new PointAffine();
    return !decodePointVar(arrayOfByte, false, pointAffine) ? null : exportPoint(pointAffine);
  }
  
  public static boolean verify(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, int paramInt3, int paramInt4) {
    boolean bool = false;
    return implVerify(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt2, paramArrayOfbyte3, bool, paramArrayOfbyte4, paramInt3, paramInt4);
  }
  
  public static boolean verify(byte[] paramArrayOfbyte1, int paramInt1, PublicPoint paramPublicPoint, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, int paramInt2, int paramInt3) {
    boolean bool = false;
    return implVerify(paramArrayOfbyte1, paramInt1, paramPublicPoint, paramArrayOfbyte2, bool, paramArrayOfbyte3, paramInt2, paramInt3);
  }
  
  public static boolean verifyPrehash(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, int paramInt3) {
    boolean bool = true;
    return implVerify(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt2, paramArrayOfbyte3, bool, paramArrayOfbyte4, paramInt3, 64);
  }
  
  public static boolean verifyPrehash(byte[] paramArrayOfbyte1, int paramInt1, PublicPoint paramPublicPoint, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, int paramInt2) {
    boolean bool = true;
    return implVerify(paramArrayOfbyte1, paramInt1, paramPublicPoint, paramArrayOfbyte2, bool, paramArrayOfbyte3, paramInt2, 64);
  }
  
  public static boolean verifyPrehash(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, byte[] paramArrayOfbyte3, Xof paramXof) {
    byte[] arrayOfByte = new byte[64];
    if (64 != paramXof.doFinal(arrayOfByte, 0, 64))
      throw new IllegalArgumentException("ph"); 
    boolean bool = true;
    return implVerify(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt2, paramArrayOfbyte3, bool, arrayOfByte, 0, arrayOfByte.length);
  }
  
  public static boolean verifyPrehash(byte[] paramArrayOfbyte1, int paramInt, PublicPoint paramPublicPoint, byte[] paramArrayOfbyte2, Xof paramXof) {
    byte[] arrayOfByte = new byte[64];
    if (64 != paramXof.doFinal(arrayOfByte, 0, 64))
      throw new IllegalArgumentException("ph"); 
    boolean bool = true;
    return implVerify(paramArrayOfbyte1, paramInt, paramPublicPoint, paramArrayOfbyte2, bool, arrayOfByte, 0, arrayOfByte.length);
  }
  
  public static final class Algorithm {
    public static final int Ed448 = 0;
    
    public static final int Ed448ph = 1;
  }
  
  private static class F extends X448Field {}
  
  private static class PointAffine {
    int[] x = Ed448.F.create();
    
    int[] y = Ed448.F.create();
    
    private PointAffine() {}
  }
  
  private static class PointProjective {
    int[] x = Ed448.F.create();
    
    int[] y = Ed448.F.create();
    
    int[] z = Ed448.F.create();
    
    private PointProjective() {}
  }
  
  private static class PointTemp {
    int[] r0 = Ed448.F.create();
    
    int[] r1 = Ed448.F.create();
    
    int[] r2 = Ed448.F.create();
    
    int[] r3 = Ed448.F.create();
    
    int[] r4 = Ed448.F.create();
    
    int[] r5 = Ed448.F.create();
    
    int[] r6 = Ed448.F.create();
    
    int[] r7 = Ed448.F.create();
    
    private PointTemp() {}
  }
  
  public static final class PublicPoint {
    final int[] data;
    
    PublicPoint(int[] param1ArrayOfint) {
      this.data = param1ArrayOfint;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\ec\rfc8032\Ed448.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */