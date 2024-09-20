package org.bouncycastle.math.ec.rfc8032;

import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.math.ec.rfc7748.X25519;
import org.bouncycastle.math.ec.rfc7748.X25519Field;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat256;

public abstract class Ed25519 {
  private static final int COORD_INTS = 8;
  
  private static final int POINT_BYTES = 32;
  
  private static final int SCALAR_INTS = 8;
  
  private static final int SCALAR_BYTES = 32;
  
  public static final int PREHASH_SIZE = 64;
  
  public static final int PUBLIC_KEY_SIZE = 32;
  
  public static final int SECRET_KEY_SIZE = 32;
  
  public static final int SIGNATURE_SIZE = 64;
  
  private static final byte[] DOM2_PREFIX = new byte[] { 
      83, 105, 103, 69, 100, 50, 53, 53, 49, 57, 
      32, 110, 111, 32, 69, 100, 50, 53, 53, 49, 
      57, 32, 99, 111, 108, 108, 105, 115, 105, 111, 
      110, 115 };
  
  private static final int[] P = new int[] { -19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE };
  
  private static final int[] ORDER8_y1 = new int[] { 1886001095, 1339575613, 1980447930, 258412557, -95215574, -959694548, 2013120334, 2047061138 };
  
  private static final int[] ORDER8_y2 = new int[] { -1886001114, -1339575614, -1980447931, -258412558, 95215573, 959694547, -2013120335, 100422509 };
  
  private static final int[] B_x = new int[] { 52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245 };
  
  private static final int[] B_y = new int[] { 40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772 };
  
  private static final int[] B128_x = new int[] { 12052516, 1174424, 4087752, 38672185, 20040971, 21899680, 55468344, 20105554, 66708015, 9981791 };
  
  private static final int[] B128_y = new int[] { 66430571, 45040722, 4842939, 15895846, 18981244, 46308410, 4697481, 8903007, 53646190, 12474675 };
  
  private static final int[] C_d = new int[] { 56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657 };
  
  private static final int[] C_d2 = new int[] { 45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099 };
  
  private static final int[] C_d4 = new int[] { 23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199 };
  
  private static final int WNAF_WIDTH_128 = 4;
  
  private static final int WNAF_WIDTH_BASE = 6;
  
  private static final int PRECOMP_BLOCKS = 8;
  
  private static final int PRECOMP_TEETH = 4;
  
  private static final int PRECOMP_SPACING = 8;
  
  private static final int PRECOMP_RANGE = 256;
  
  private static final int PRECOMP_POINTS = 8;
  
  private static final int PRECOMP_MASK = 7;
  
  private static final Object PRECOMP_LOCK = new Object();
  
  private static PointPrecomp[] PRECOMP_BASE_WNAF = null;
  
  private static PointPrecomp[] PRECOMP_BASE128_WNAF = null;
  
  private static int[] PRECOMP_BASE_COMB = null;
  
  private static byte[] calculateS(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    int[] arrayOfInt1 = new int[16];
    Scalar25519.decode(paramArrayOfbyte1, arrayOfInt1);
    int[] arrayOfInt2 = new int[8];
    Scalar25519.decode(paramArrayOfbyte2, arrayOfInt2);
    int[] arrayOfInt3 = new int[8];
    Scalar25519.decode(paramArrayOfbyte3, arrayOfInt3);
    Nat256.mulAddTo(arrayOfInt2, arrayOfInt3, arrayOfInt1);
    byte[] arrayOfByte = new byte[64];
    Codec.encode32(arrayOfInt1, 0, arrayOfInt1.length, arrayOfByte, 0);
    return Scalar25519.reduce512(arrayOfByte);
  }
  
  private static boolean checkContextVar(byte[] paramArrayOfbyte, byte paramByte) {
    return ((paramArrayOfbyte == null && paramByte == 0) || (paramArrayOfbyte != null && paramArrayOfbyte.length < 256));
  }
  
  private static int checkPoint(PointAffine paramPointAffine) {
    int[] arrayOfInt1 = F.create();
    int[] arrayOfInt2 = F.create();
    int[] arrayOfInt3 = F.create();
    F.sqr(paramPointAffine.x, arrayOfInt2);
    F.sqr(paramPointAffine.y, arrayOfInt3);
    F.mul(arrayOfInt2, arrayOfInt3, arrayOfInt1);
    F.sub(arrayOfInt2, arrayOfInt3, arrayOfInt2);
    F.mul(arrayOfInt1, C_d, arrayOfInt1);
    F.addOne(arrayOfInt1);
    F.add(arrayOfInt1, arrayOfInt2, arrayOfInt1);
    F.normalize(arrayOfInt1);
    F.normalize(arrayOfInt3);
    return F.isZero(arrayOfInt1) & (F.isZero(arrayOfInt3) ^ 0xFFFFFFFF);
  }
  
  private static int checkPoint(PointAccum paramPointAccum) {
    int[] arrayOfInt1 = F.create();
    int[] arrayOfInt2 = F.create();
    int[] arrayOfInt3 = F.create();
    int[] arrayOfInt4 = F.create();
    F.sqr(paramPointAccum.x, arrayOfInt2);
    F.sqr(paramPointAccum.y, arrayOfInt3);
    F.sqr(paramPointAccum.z, arrayOfInt4);
    F.mul(arrayOfInt2, arrayOfInt3, arrayOfInt1);
    F.sub(arrayOfInt2, arrayOfInt3, arrayOfInt2);
    F.mul(arrayOfInt2, arrayOfInt4, arrayOfInt2);
    F.sqr(arrayOfInt4, arrayOfInt4);
    F.mul(arrayOfInt1, C_d, arrayOfInt1);
    F.add(arrayOfInt1, arrayOfInt4, arrayOfInt1);
    F.add(arrayOfInt1, arrayOfInt2, arrayOfInt1);
    F.normalize(arrayOfInt1);
    F.normalize(arrayOfInt3);
    F.normalize(arrayOfInt4);
    return F.isZero(arrayOfInt1) & (F.isZero(arrayOfInt3) ^ 0xFFFFFFFF) & (F.isZero(arrayOfInt4) ^ 0xFFFFFFFF);
  }
  
  private static boolean checkPointFullVar(byte[] paramArrayOfbyte) {
    int i = Codec.decode32(paramArrayOfbyte, 28) & Integer.MAX_VALUE;
    int j = i;
    int k = i ^ P[7];
    int m = i ^ ORDER8_y1[7];
    int n = i ^ ORDER8_y2[7];
    int i1;
    for (i1 = 6; i1 > 0; i1--) {
      int i2 = Codec.decode32(paramArrayOfbyte, i1 * 4);
      j |= i2;
      k |= i2 ^ P[i1];
      m |= i2 ^ ORDER8_y1[i1];
      n |= i2 ^ ORDER8_y2[i1];
    } 
    i1 = Codec.decode32(paramArrayOfbyte, 0);
    if (j == 0 && i1 + Integer.MIN_VALUE <= -2147483647)
      return false; 
    if (k == 0 && i1 + Integer.MIN_VALUE >= P[0] - 1 + Integer.MIN_VALUE)
      return false; 
    m |= i1 ^ ORDER8_y1[0];
    n |= i1 ^ ORDER8_y2[0];
    return ((m != 0)) & ((n != 0));
  }
  
  private static boolean checkPointOrderVar(PointAffine paramPointAffine) {
    PointAccum pointAccum = new PointAccum();
    scalarMultOrderVar(paramPointAffine, pointAccum);
    return normalizeToNeutralElementVar(pointAccum);
  }
  
  private static boolean checkPointVar(byte[] paramArrayOfbyte) {
    if ((Codec.decode32(paramArrayOfbyte, 28) & Integer.MAX_VALUE) < P[7])
      return true; 
    int[] arrayOfInt = new int[8];
    Codec.decode32(paramArrayOfbyte, 0, arrayOfInt, 0, 8);
    arrayOfInt[7] = arrayOfInt[7] & Integer.MAX_VALUE;
    return !Nat256.gte(arrayOfInt, P);
  }
  
  private static byte[] copy(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte, 0, paramInt2);
    return arrayOfByte;
  }
  
  private static Digest createDigest() {
    SHA512Digest sHA512Digest = new SHA512Digest();
    if (sHA512Digest.getDigestSize() != 64)
      throw new IllegalStateException(); 
    return (Digest)sHA512Digest;
  }
  
  public static Digest createPrehash() {
    return createDigest();
  }
  
  private static boolean decodePointVar(byte[] paramArrayOfbyte, boolean paramBoolean, PointAffine paramPointAffine) {
    int i = (paramArrayOfbyte[31] & 0x80) >>> 7;
    F.decode(paramArrayOfbyte, paramPointAffine.y);
    int[] arrayOfInt1 = F.create();
    int[] arrayOfInt2 = F.create();
    F.sqr(paramPointAffine.y, arrayOfInt1);
    F.mul(C_d, arrayOfInt1, arrayOfInt2);
    F.subOne(arrayOfInt1);
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
  
  private static void dom2(Digest paramDigest, byte paramByte, byte[] paramArrayOfbyte) {
    int i = DOM2_PREFIX.length;
    byte[] arrayOfByte = new byte[i + 2 + paramArrayOfbyte.length];
    System.arraycopy(DOM2_PREFIX, 0, arrayOfByte, 0, i);
    arrayOfByte[i] = paramByte;
    arrayOfByte[i + 1] = (byte)paramArrayOfbyte.length;
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, i + 2, paramArrayOfbyte.length);
    paramDigest.update(arrayOfByte, 0, arrayOfByte.length);
  }
  
  private static void encodePoint(PointAffine paramPointAffine, byte[] paramArrayOfbyte, int paramInt) {
    F.encode(paramPointAffine.y, paramArrayOfbyte, paramInt);
    paramArrayOfbyte[paramInt + 32 - 1] = (byte)(paramArrayOfbyte[paramInt + 32 - 1] | (paramPointAffine.x[0] & 0x1) << 7);
  }
  
  public static void encodePublicPoint(PublicPoint paramPublicPoint, byte[] paramArrayOfbyte, int paramInt) {
    F.encode(paramPublicPoint.data, 10, paramArrayOfbyte, paramInt);
    paramArrayOfbyte[paramInt + 32 - 1] = (byte)(paramArrayOfbyte[paramInt + 32 - 1] | (paramPublicPoint.data[0] & 0x1) << 7);
  }
  
  private static int encodeResult(PointAccum paramPointAccum, byte[] paramArrayOfbyte, int paramInt) {
    PointAffine pointAffine = new PointAffine();
    normalizeToAffine(paramPointAccum, pointAffine);
    int i = checkPoint(pointAffine);
    encodePoint(pointAffine, paramArrayOfbyte, paramInt);
    return i;
  }
  
  private static PublicPoint exportPoint(PointAffine paramPointAffine) {
    int[] arrayOfInt = new int[20];
    F.copy(paramPointAffine.x, 0, arrayOfInt, 0);
    F.copy(paramPointAffine.y, 0, arrayOfInt, 10);
    return new PublicPoint(arrayOfInt);
  }
  
  public static void generatePrivateKey(SecureRandom paramSecureRandom, byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != 32)
      throw new IllegalArgumentException("k"); 
    paramSecureRandom.nextBytes(paramArrayOfbyte);
  }
  
  public static void generatePublicKey(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2) {
    Digest digest = createDigest();
    byte[] arrayOfByte1 = new byte[64];
    digest.update(paramArrayOfbyte1, paramInt1, 32);
    digest.doFinal(arrayOfByte1, 0);
    byte[] arrayOfByte2 = new byte[32];
    pruneScalar(arrayOfByte1, 0, arrayOfByte2);
    scalarMultBaseEncoded(arrayOfByte2, paramArrayOfbyte2, paramInt2);
  }
  
  public static PublicPoint generatePublicKey(byte[] paramArrayOfbyte, int paramInt) {
    Digest digest = createDigest();
    byte[] arrayOfByte1 = new byte[64];
    digest.update(paramArrayOfbyte, paramInt, 32);
    digest.doFinal(arrayOfByte1, 0);
    byte[] arrayOfByte2 = new byte[32];
    pruneScalar(arrayOfByte1, 0, arrayOfByte2);
    PointAccum pointAccum = new PointAccum();
    scalarMultBase(arrayOfByte2, pointAccum);
    PointAffine pointAffine = new PointAffine();
    normalizeToAffine(pointAccum, pointAffine);
    if (0 == checkPoint(pointAffine))
      throw new IllegalStateException(); 
    return exportPoint(pointAffine);
  }
  
  private static int getWindow4(int[] paramArrayOfint, int paramInt) {
    int i = paramInt >>> 3;
    int j = (paramInt & 0x7) << 2;
    return paramArrayOfint[i] >>> j & 0xF;
  }
  
  private static void groupCombBits(int[] paramArrayOfint) {
    for (byte b = 0; b < paramArrayOfint.length; b++)
      paramArrayOfint[b] = Interleave.shuffle2(paramArrayOfint[b]); 
  }
  
  private static void implSign(Digest paramDigest, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, int paramInt1, byte[] paramArrayOfbyte4, byte paramByte, byte[] paramArrayOfbyte5, int paramInt2, int paramInt3, byte[] paramArrayOfbyte6, int paramInt4) {
    if (paramArrayOfbyte4 != null)
      dom2(paramDigest, paramByte, paramArrayOfbyte4); 
    paramDigest.update(paramArrayOfbyte1, 32, 32);
    paramDigest.update(paramArrayOfbyte5, paramInt2, paramInt3);
    paramDigest.doFinal(paramArrayOfbyte1, 0);
    byte[] arrayOfByte1 = Scalar25519.reduce512(paramArrayOfbyte1);
    byte[] arrayOfByte2 = new byte[32];
    scalarMultBaseEncoded(arrayOfByte1, arrayOfByte2, 0);
    if (paramArrayOfbyte4 != null)
      dom2(paramDigest, paramByte, paramArrayOfbyte4); 
    paramDigest.update(arrayOfByte2, 0, 32);
    paramDigest.update(paramArrayOfbyte3, paramInt1, 32);
    paramDigest.update(paramArrayOfbyte5, paramInt2, paramInt3);
    paramDigest.doFinal(paramArrayOfbyte1, 0);
    byte[] arrayOfByte3 = Scalar25519.reduce512(paramArrayOfbyte1);
    byte[] arrayOfByte4 = calculateS(arrayOfByte1, arrayOfByte3, paramArrayOfbyte2);
    System.arraycopy(arrayOfByte2, 0, paramArrayOfbyte6, paramInt4, 32);
    System.arraycopy(arrayOfByte4, 0, paramArrayOfbyte6, paramInt4 + 32, 32);
  }
  
  private static void implSign(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, byte paramByte, byte[] paramArrayOfbyte3, int paramInt2, int paramInt3, byte[] paramArrayOfbyte4, int paramInt4) {
    if (!checkContextVar(paramArrayOfbyte2, paramByte))
      throw new IllegalArgumentException("ctx"); 
    Digest digest = createDigest();
    byte[] arrayOfByte1 = new byte[64];
    digest.update(paramArrayOfbyte1, paramInt1, 32);
    digest.doFinal(arrayOfByte1, 0);
    byte[] arrayOfByte2 = new byte[32];
    pruneScalar(arrayOfByte1, 0, arrayOfByte2);
    byte[] arrayOfByte3 = new byte[32];
    scalarMultBaseEncoded(arrayOfByte2, arrayOfByte3, 0);
    implSign(digest, arrayOfByte1, arrayOfByte2, arrayOfByte3, 0, paramArrayOfbyte2, paramByte, paramArrayOfbyte3, paramInt2, paramInt3, paramArrayOfbyte4, paramInt4);
  }
  
  private static void implSign(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, byte[] paramArrayOfbyte3, byte paramByte, byte[] paramArrayOfbyte4, int paramInt3, int paramInt4, byte[] paramArrayOfbyte5, int paramInt5) {
    if (!checkContextVar(paramArrayOfbyte3, paramByte))
      throw new IllegalArgumentException("ctx"); 
    Digest digest = createDigest();
    byte[] arrayOfByte1 = new byte[64];
    digest.update(paramArrayOfbyte1, paramInt1, 32);
    digest.doFinal(arrayOfByte1, 0);
    byte[] arrayOfByte2 = new byte[32];
    pruneScalar(arrayOfByte1, 0, arrayOfByte2);
    implSign(digest, arrayOfByte1, arrayOfByte2, paramArrayOfbyte2, paramInt2, paramArrayOfbyte3, paramByte, paramArrayOfbyte4, paramInt3, paramInt4, paramArrayOfbyte5, paramInt5);
  }
  
  private static boolean implVerify(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, byte[] paramArrayOfbyte3, byte paramByte, byte[] paramArrayOfbyte4, int paramInt3, int paramInt4) {
    if (!checkContextVar(paramArrayOfbyte3, paramByte))
      throw new IllegalArgumentException("ctx"); 
    byte[] arrayOfByte1 = copy(paramArrayOfbyte1, paramInt1, 32);
    byte[] arrayOfByte2 = copy(paramArrayOfbyte1, paramInt1 + 32, 32);
    byte[] arrayOfByte3 = copy(paramArrayOfbyte2, paramInt2, 32);
    if (!checkPointVar(arrayOfByte1))
      return false; 
    int[] arrayOfInt1 = new int[8];
    if (!Scalar25519.checkVar(arrayOfByte2, arrayOfInt1))
      return false; 
    if (!checkPointFullVar(arrayOfByte3))
      return false; 
    PointAffine pointAffine1 = new PointAffine();
    if (!decodePointVar(arrayOfByte1, true, pointAffine1))
      return false; 
    PointAffine pointAffine2 = new PointAffine();
    if (!decodePointVar(arrayOfByte3, true, pointAffine2))
      return false; 
    Digest digest = createDigest();
    byte[] arrayOfByte4 = new byte[64];
    if (paramArrayOfbyte3 != null)
      dom2(digest, paramByte, paramArrayOfbyte3); 
    digest.update(arrayOfByte1, 0, 32);
    digest.update(arrayOfByte3, 0, 32);
    digest.update(paramArrayOfbyte4, paramInt3, paramInt4);
    digest.doFinal(arrayOfByte4, 0);
    byte[] arrayOfByte5 = Scalar25519.reduce512(arrayOfByte4);
    int[] arrayOfInt2 = new int[8];
    Scalar25519.decode(arrayOfByte5, arrayOfInt2);
    int[] arrayOfInt3 = new int[4];
    int[] arrayOfInt4 = new int[4];
    if (!Scalar25519.reduceBasisVar(arrayOfInt2, arrayOfInt3, arrayOfInt4))
      throw new IllegalStateException(); 
    Scalar25519.multiply128Var(arrayOfInt1, arrayOfInt4, arrayOfInt1);
    PointAccum pointAccum = new PointAccum();
    scalarMultStraus128Var(arrayOfInt1, arrayOfInt3, pointAffine2, arrayOfInt4, pointAffine1, pointAccum);
    return normalizeToNeutralElementVar(pointAccum);
  }
  
  private static boolean implVerify(byte[] paramArrayOfbyte1, int paramInt1, PublicPoint paramPublicPoint, byte[] paramArrayOfbyte2, byte paramByte, byte[] paramArrayOfbyte3, int paramInt2, int paramInt3) {
    if (!checkContextVar(paramArrayOfbyte2, paramByte))
      throw new IllegalArgumentException("ctx"); 
    byte[] arrayOfByte1 = copy(paramArrayOfbyte1, paramInt1, 32);
    byte[] arrayOfByte2 = copy(paramArrayOfbyte1, paramInt1 + 32, 32);
    if (!checkPointVar(arrayOfByte1))
      return false; 
    int[] arrayOfInt1 = new int[8];
    if (!Scalar25519.checkVar(arrayOfByte2, arrayOfInt1))
      return false; 
    PointAffine pointAffine1 = new PointAffine();
    if (!decodePointVar(arrayOfByte1, true, pointAffine1))
      return false; 
    PointAffine pointAffine2 = new PointAffine();
    F.negate(paramPublicPoint.data, pointAffine2.x);
    F.copy(paramPublicPoint.data, 10, pointAffine2.y, 0);
    byte[] arrayOfByte3 = new byte[32];
    encodePublicPoint(paramPublicPoint, arrayOfByte3, 0);
    Digest digest = createDigest();
    byte[] arrayOfByte4 = new byte[64];
    if (paramArrayOfbyte2 != null)
      dom2(digest, paramByte, paramArrayOfbyte2); 
    digest.update(arrayOfByte1, 0, 32);
    digest.update(arrayOfByte3, 0, 32);
    digest.update(paramArrayOfbyte3, paramInt2, paramInt3);
    digest.doFinal(arrayOfByte4, 0);
    byte[] arrayOfByte5 = Scalar25519.reduce512(arrayOfByte4);
    int[] arrayOfInt2 = new int[8];
    Scalar25519.decode(arrayOfByte5, arrayOfInt2);
    int[] arrayOfInt3 = new int[4];
    int[] arrayOfInt4 = new int[4];
    if (!Scalar25519.reduceBasisVar(arrayOfInt2, arrayOfInt3, arrayOfInt4))
      throw new IllegalStateException(); 
    Scalar25519.multiply128Var(arrayOfInt1, arrayOfInt4, arrayOfInt1);
    PointAccum pointAccum = new PointAccum();
    scalarMultStraus128Var(arrayOfInt1, arrayOfInt3, pointAffine2, arrayOfInt4, pointAffine1, pointAccum);
    return normalizeToNeutralElementVar(pointAccum);
  }
  
  private static void invertDoubleZs(PointExtended[] paramArrayOfPointExtended) {
    int i = paramArrayOfPointExtended.length;
    int[] arrayOfInt1 = F.createTable(i);
    int[] arrayOfInt2 = F.create();
    F.copy((paramArrayOfPointExtended[0]).z, 0, arrayOfInt2, 0);
    F.copy(arrayOfInt2, 0, arrayOfInt1, 0);
    byte b = 0;
    while (++b < i) {
      F.mul(arrayOfInt2, (paramArrayOfPointExtended[b]).z, arrayOfInt2);
      F.copy(arrayOfInt2, 0, arrayOfInt1, b * 10);
    } 
    F.add(arrayOfInt2, arrayOfInt2, arrayOfInt2);
    F.invVar(arrayOfInt2, arrayOfInt2);
    b--;
    int[] arrayOfInt3 = F.create();
    while (b > 0) {
      byte b1 = b--;
      F.copy(arrayOfInt1, b * 10, arrayOfInt3, 0);
      F.mul(arrayOfInt3, arrayOfInt2, arrayOfInt3);
      F.mul(arrayOfInt2, (paramArrayOfPointExtended[b1]).z, arrayOfInt2);
      F.copy(arrayOfInt3, 0, (paramArrayOfPointExtended[b1]).z, 0);
    } 
    F.copy(arrayOfInt2, 0, (paramArrayOfPointExtended[0]).z, 0);
  }
  
  private static void normalizeToAffine(PointAccum paramPointAccum, PointAffine paramPointAffine) {
    F.inv(paramPointAccum.z, paramPointAffine.y);
    F.mul(paramPointAffine.y, paramPointAccum.x, paramPointAffine.x);
    F.mul(paramPointAffine.y, paramPointAccum.y, paramPointAffine.y);
    F.normalize(paramPointAffine.x);
    F.normalize(paramPointAffine.y);
  }
  
  private static boolean normalizeToNeutralElementVar(PointAccum paramPointAccum) {
    F.normalize(paramPointAccum.x);
    F.normalize(paramPointAccum.y);
    F.normalize(paramPointAccum.z);
    return (F.isZeroVar(paramPointAccum.x) && !F.isZeroVar(paramPointAccum.y) && F.areEqualVar(paramPointAccum.y, paramPointAccum.z));
  }
  
  private static void pointAdd(PointExtended paramPointExtended1, PointExtended paramPointExtended2, PointExtended paramPointExtended3, PointTemp paramPointTemp) {
    int[] arrayOfInt1 = paramPointExtended3.x;
    int[] arrayOfInt2 = paramPointExtended3.y;
    int[] arrayOfInt3 = paramPointTemp.r0;
    int[] arrayOfInt4 = paramPointTemp.r1;
    int[] arrayOfInt5 = arrayOfInt1;
    int[] arrayOfInt6 = arrayOfInt3;
    int[] arrayOfInt7 = arrayOfInt4;
    int[] arrayOfInt8 = arrayOfInt2;
    F.apm(paramPointExtended1.y, paramPointExtended1.x, arrayOfInt2, arrayOfInt1);
    F.apm(paramPointExtended2.y, paramPointExtended2.x, arrayOfInt4, arrayOfInt3);
    F.mul(arrayOfInt1, arrayOfInt3, arrayOfInt1);
    F.mul(arrayOfInt2, arrayOfInt4, arrayOfInt2);
    F.mul(paramPointExtended1.t, paramPointExtended2.t, arrayOfInt3);
    F.mul(arrayOfInt3, C_d2, arrayOfInt3);
    F.add(paramPointExtended1.z, paramPointExtended1.z, arrayOfInt4);
    F.mul(arrayOfInt4, paramPointExtended2.z, arrayOfInt4);
    F.apm(arrayOfInt2, arrayOfInt1, arrayOfInt8, arrayOfInt5);
    F.apm(arrayOfInt4, arrayOfInt3, arrayOfInt7, arrayOfInt6);
    F.mul(arrayOfInt5, arrayOfInt8, paramPointExtended3.t);
    F.mul(arrayOfInt6, arrayOfInt7, paramPointExtended3.z);
    F.mul(arrayOfInt5, arrayOfInt6, paramPointExtended3.x);
    F.mul(arrayOfInt8, arrayOfInt7, paramPointExtended3.y);
  }
  
  private static void pointAdd(PointPrecomp paramPointPrecomp, PointAccum paramPointAccum, PointTemp paramPointTemp) {
    int[] arrayOfInt1 = paramPointAccum.x;
    int[] arrayOfInt2 = paramPointAccum.y;
    int[] arrayOfInt3 = paramPointTemp.r0;
    int[] arrayOfInt4 = paramPointAccum.u;
    int[] arrayOfInt5 = arrayOfInt1;
    int[] arrayOfInt6 = arrayOfInt2;
    int[] arrayOfInt7 = paramPointAccum.v;
    F.apm(paramPointAccum.y, paramPointAccum.x, arrayOfInt2, arrayOfInt1);
    F.mul(arrayOfInt1, paramPointPrecomp.ymx_h, arrayOfInt1);
    F.mul(arrayOfInt2, paramPointPrecomp.ypx_h, arrayOfInt2);
    F.mul(paramPointAccum.u, paramPointAccum.v, arrayOfInt3);
    F.mul(arrayOfInt3, paramPointPrecomp.xyd, arrayOfInt3);
    F.apm(arrayOfInt2, arrayOfInt1, arrayOfInt7, arrayOfInt4);
    F.apm(paramPointAccum.z, arrayOfInt3, arrayOfInt6, arrayOfInt5);
    F.mul(arrayOfInt5, arrayOfInt6, paramPointAccum.z);
    F.mul(arrayOfInt5, arrayOfInt4, paramPointAccum.x);
    F.mul(arrayOfInt6, arrayOfInt7, paramPointAccum.y);
  }
  
  private static void pointAdd(PointPrecompZ paramPointPrecompZ, PointAccum paramPointAccum, PointTemp paramPointTemp) {
    int[] arrayOfInt1 = paramPointAccum.x;
    int[] arrayOfInt2 = paramPointAccum.y;
    int[] arrayOfInt3 = paramPointTemp.r0;
    int[] arrayOfInt4 = paramPointAccum.z;
    int[] arrayOfInt5 = paramPointAccum.u;
    int[] arrayOfInt6 = arrayOfInt1;
    int[] arrayOfInt7 = arrayOfInt2;
    int[] arrayOfInt8 = paramPointAccum.v;
    F.apm(paramPointAccum.y, paramPointAccum.x, arrayOfInt2, arrayOfInt1);
    F.mul(arrayOfInt1, paramPointPrecompZ.ymx_h, arrayOfInt1);
    F.mul(arrayOfInt2, paramPointPrecompZ.ypx_h, arrayOfInt2);
    F.mul(paramPointAccum.u, paramPointAccum.v, arrayOfInt3);
    F.mul(arrayOfInt3, paramPointPrecompZ.xyd, arrayOfInt3);
    F.mul(paramPointAccum.z, paramPointPrecompZ.z, arrayOfInt4);
    F.apm(arrayOfInt2, arrayOfInt1, arrayOfInt8, arrayOfInt5);
    F.apm(arrayOfInt4, arrayOfInt3, arrayOfInt7, arrayOfInt6);
    F.mul(arrayOfInt6, arrayOfInt7, paramPointAccum.z);
    F.mul(arrayOfInt6, arrayOfInt5, paramPointAccum.x);
    F.mul(arrayOfInt7, arrayOfInt8, paramPointAccum.y);
  }
  
  private static void pointAddVar(boolean paramBoolean, PointPrecomp paramPointPrecomp, PointAccum paramPointAccum, PointTemp paramPointTemp) {
    int[] arrayOfInt8;
    int[] arrayOfInt9;
    int[] arrayOfInt1 = paramPointAccum.x;
    int[] arrayOfInt2 = paramPointAccum.y;
    int[] arrayOfInt3 = paramPointTemp.r0;
    int[] arrayOfInt4 = paramPointAccum.u;
    int[] arrayOfInt5 = arrayOfInt1;
    int[] arrayOfInt6 = arrayOfInt2;
    int[] arrayOfInt7 = paramPointAccum.v;
    if (paramBoolean) {
      arrayOfInt8 = arrayOfInt2;
      arrayOfInt9 = arrayOfInt1;
    } else {
      arrayOfInt8 = arrayOfInt1;
      arrayOfInt9 = arrayOfInt2;
    } 
    int[] arrayOfInt10 = arrayOfInt8;
    int[] arrayOfInt11 = arrayOfInt9;
    F.apm(paramPointAccum.y, paramPointAccum.x, arrayOfInt2, arrayOfInt1);
    F.mul(arrayOfInt8, paramPointPrecomp.ymx_h, arrayOfInt8);
    F.mul(arrayOfInt9, paramPointPrecomp.ypx_h, arrayOfInt9);
    F.mul(paramPointAccum.u, paramPointAccum.v, arrayOfInt3);
    F.mul(arrayOfInt3, paramPointPrecomp.xyd, arrayOfInt3);
    F.apm(arrayOfInt2, arrayOfInt1, arrayOfInt7, arrayOfInt4);
    F.apm(paramPointAccum.z, arrayOfInt3, arrayOfInt11, arrayOfInt10);
    F.mul(arrayOfInt5, arrayOfInt6, paramPointAccum.z);
    F.mul(arrayOfInt5, arrayOfInt4, paramPointAccum.x);
    F.mul(arrayOfInt6, arrayOfInt7, paramPointAccum.y);
  }
  
  private static void pointAddVar(boolean paramBoolean, PointPrecompZ paramPointPrecompZ, PointAccum paramPointAccum, PointTemp paramPointTemp) {
    int[] arrayOfInt9;
    int[] arrayOfInt10;
    int[] arrayOfInt1 = paramPointAccum.x;
    int[] arrayOfInt2 = paramPointAccum.y;
    int[] arrayOfInt3 = paramPointTemp.r0;
    int[] arrayOfInt4 = paramPointAccum.z;
    int[] arrayOfInt5 = paramPointAccum.u;
    int[] arrayOfInt6 = arrayOfInt1;
    int[] arrayOfInt7 = arrayOfInt2;
    int[] arrayOfInt8 = paramPointAccum.v;
    if (paramBoolean) {
      arrayOfInt9 = arrayOfInt2;
      arrayOfInt10 = arrayOfInt1;
    } else {
      arrayOfInt9 = arrayOfInt1;
      arrayOfInt10 = arrayOfInt2;
    } 
    int[] arrayOfInt11 = arrayOfInt9;
    int[] arrayOfInt12 = arrayOfInt10;
    F.apm(paramPointAccum.y, paramPointAccum.x, arrayOfInt2, arrayOfInt1);
    F.mul(arrayOfInt9, paramPointPrecompZ.ymx_h, arrayOfInt9);
    F.mul(arrayOfInt10, paramPointPrecompZ.ypx_h, arrayOfInt10);
    F.mul(paramPointAccum.u, paramPointAccum.v, arrayOfInt3);
    F.mul(arrayOfInt3, paramPointPrecompZ.xyd, arrayOfInt3);
    F.mul(paramPointAccum.z, paramPointPrecompZ.z, arrayOfInt4);
    F.apm(arrayOfInt2, arrayOfInt1, arrayOfInt8, arrayOfInt5);
    F.apm(arrayOfInt4, arrayOfInt3, arrayOfInt12, arrayOfInt11);
    F.mul(arrayOfInt6, arrayOfInt7, paramPointAccum.z);
    F.mul(arrayOfInt6, arrayOfInt5, paramPointAccum.x);
    F.mul(arrayOfInt7, arrayOfInt8, paramPointAccum.y);
  }
  
  private static void pointCopy(PointAccum paramPointAccum, PointExtended paramPointExtended) {
    F.copy(paramPointAccum.x, 0, paramPointExtended.x, 0);
    F.copy(paramPointAccum.y, 0, paramPointExtended.y, 0);
    F.copy(paramPointAccum.z, 0, paramPointExtended.z, 0);
    F.mul(paramPointAccum.u, paramPointAccum.v, paramPointExtended.t);
  }
  
  private static void pointCopy(PointAffine paramPointAffine, PointExtended paramPointExtended) {
    F.copy(paramPointAffine.x, 0, paramPointExtended.x, 0);
    F.copy(paramPointAffine.y, 0, paramPointExtended.y, 0);
    F.one(paramPointExtended.z);
    F.mul(paramPointAffine.x, paramPointAffine.y, paramPointExtended.t);
  }
  
  private static void pointCopy(PointExtended paramPointExtended, PointPrecompZ paramPointPrecompZ) {
    F.apm(paramPointExtended.y, paramPointExtended.x, paramPointPrecompZ.ypx_h, paramPointPrecompZ.ymx_h);
    F.mul(paramPointExtended.t, C_d2, paramPointPrecompZ.xyd);
    F.add(paramPointExtended.z, paramPointExtended.z, paramPointPrecompZ.z);
  }
  
  private static void pointDouble(PointAccum paramPointAccum) {
    int[] arrayOfInt1 = paramPointAccum.x;
    int[] arrayOfInt2 = paramPointAccum.y;
    int[] arrayOfInt3 = paramPointAccum.z;
    int[] arrayOfInt4 = paramPointAccum.u;
    int[] arrayOfInt5 = arrayOfInt1;
    int[] arrayOfInt6 = arrayOfInt2;
    int[] arrayOfInt7 = paramPointAccum.v;
    F.add(paramPointAccum.x, paramPointAccum.y, arrayOfInt4);
    F.sqr(paramPointAccum.x, arrayOfInt1);
    F.sqr(paramPointAccum.y, arrayOfInt2);
    F.sqr(paramPointAccum.z, arrayOfInt3);
    F.add(arrayOfInt3, arrayOfInt3, arrayOfInt3);
    F.apm(arrayOfInt1, arrayOfInt2, arrayOfInt7, arrayOfInt6);
    F.sqr(arrayOfInt4, arrayOfInt4);
    F.sub(arrayOfInt7, arrayOfInt4, arrayOfInt4);
    F.add(arrayOfInt3, arrayOfInt6, arrayOfInt5);
    F.carry(arrayOfInt5);
    F.mul(arrayOfInt5, arrayOfInt6, paramPointAccum.z);
    F.mul(arrayOfInt5, arrayOfInt4, paramPointAccum.x);
    F.mul(arrayOfInt6, arrayOfInt7, paramPointAccum.y);
  }
  
  private static void pointLookup(int paramInt1, int paramInt2, PointPrecomp paramPointPrecomp) {
    int i = paramInt1 * 8 * 3 * 10;
    for (byte b = 0; b < 8; b++) {
      int j = (b ^ paramInt2) - 1 >> 31;
      F.cmov(j, PRECOMP_BASE_COMB, i, paramPointPrecomp.ymx_h, 0);
      i += 10;
      F.cmov(j, PRECOMP_BASE_COMB, i, paramPointPrecomp.ypx_h, 0);
      i += 10;
      F.cmov(j, PRECOMP_BASE_COMB, i, paramPointPrecomp.xyd, 0);
      i += 10;
    } 
  }
  
  private static void pointLookupZ(int[] paramArrayOfint1, int paramInt, int[] paramArrayOfint2, PointPrecompZ paramPointPrecompZ) {
    int i = getWindow4(paramArrayOfint1, paramInt);
    int j = i >>> 3 ^ 0x1;
    int k = (i ^ -j) & 0x7;
    byte b = 0;
    boolean bool = false;
    while (b < 8) {
      int m = (b ^ k) - 1 >> 31;
      F.cmov(m, paramArrayOfint2, bool, paramPointPrecompZ.ymx_h, 0);
      bool += true;
      F.cmov(m, paramArrayOfint2, bool, paramPointPrecompZ.ypx_h, 0);
      bool += true;
      F.cmov(m, paramArrayOfint2, bool, paramPointPrecompZ.xyd, 0);
      bool += true;
      F.cmov(m, paramArrayOfint2, bool, paramPointPrecompZ.z, 0);
      bool += true;
      b++;
    } 
    F.cswap(j, paramPointPrecompZ.ymx_h, paramPointPrecompZ.ypx_h);
    F.cnegate(j, paramPointPrecompZ.xyd);
  }
  
  private static void pointPrecompute(PointAffine paramPointAffine, PointExtended[] paramArrayOfPointExtended, int paramInt1, int paramInt2, PointTemp paramPointTemp) {
    pointCopy(paramPointAffine, paramArrayOfPointExtended[paramInt1] = new PointExtended());
    PointExtended pointExtended = new PointExtended();
    pointAdd(paramArrayOfPointExtended[paramInt1], paramArrayOfPointExtended[paramInt1], pointExtended, paramPointTemp);
    for (byte b = 1; b < paramInt2; b++)
      pointAdd(paramArrayOfPointExtended[paramInt1 + b - 1], pointExtended, paramArrayOfPointExtended[paramInt1 + b] = new PointExtended(), paramPointTemp); 
  }
  
  private static int[] pointPrecomputeZ(PointAffine paramPointAffine, int paramInt, PointTemp paramPointTemp) {
    PointExtended pointExtended1 = new PointExtended();
    pointCopy(paramPointAffine, pointExtended1);
    PointExtended pointExtended2 = new PointExtended();
    pointAdd(pointExtended1, pointExtended1, pointExtended2, paramPointTemp);
    PointPrecompZ pointPrecompZ = new PointPrecompZ();
    int[] arrayOfInt = F.createTable(paramInt * 4);
    boolean bool = false;
    byte b = 0;
    while (true) {
      pointCopy(pointExtended1, pointPrecompZ);
      F.copy(pointPrecompZ.ymx_h, 0, arrayOfInt, bool);
      bool += true;
      F.copy(pointPrecompZ.ypx_h, 0, arrayOfInt, bool);
      bool += true;
      F.copy(pointPrecompZ.xyd, 0, arrayOfInt, bool);
      bool += true;
      F.copy(pointPrecompZ.z, 0, arrayOfInt, bool);
      bool += true;
      if (++b == paramInt)
        return arrayOfInt; 
      pointAdd(pointExtended1, pointExtended2, pointExtended1, paramPointTemp);
    } 
  }
  
  private static void pointPrecomputeZ(PointAffine paramPointAffine, PointPrecompZ[] paramArrayOfPointPrecompZ, int paramInt, PointTemp paramPointTemp) {
    PointExtended pointExtended1 = new PointExtended();
    pointCopy(paramPointAffine, pointExtended1);
    PointExtended pointExtended2 = new PointExtended();
    pointAdd(pointExtended1, pointExtended1, pointExtended2, paramPointTemp);
    byte b = 0;
    while (true) {
      PointPrecompZ pointPrecompZ = paramArrayOfPointPrecompZ[b] = new PointPrecompZ();
      pointCopy(pointExtended1, pointPrecompZ);
      if (++b == paramInt)
        break; 
      pointAdd(pointExtended1, pointExtended2, pointExtended1, paramPointTemp);
    } 
  }
  
  private static void pointSetNeutral(PointAccum paramPointAccum) {
    F.zero(paramPointAccum.x);
    F.one(paramPointAccum.y);
    F.one(paramPointAccum.z);
    F.zero(paramPointAccum.u);
    F.one(paramPointAccum.v);
  }
  
  public static void precompute() {
    synchronized (PRECOMP_LOCK) {
      if (PRECOMP_BASE_COMB != null)
        return; 
      byte b1 = 16;
      byte b2 = 64;
      int i = b1 * 2 + b2;
      PointExtended[] arrayOfPointExtended1 = new PointExtended[i];
      PointTemp pointTemp = new PointTemp();
      PointAffine pointAffine1 = new PointAffine();
      F.copy(B_x, 0, pointAffine1.x, 0);
      F.copy(B_y, 0, pointAffine1.y, 0);
      pointPrecompute(pointAffine1, arrayOfPointExtended1, 0, b1, pointTemp);
      PointAffine pointAffine2 = new PointAffine();
      F.copy(B128_x, 0, pointAffine2.x, 0);
      F.copy(B128_y, 0, pointAffine2.y, 0);
      pointPrecompute(pointAffine2, arrayOfPointExtended1, b1, b1, pointTemp);
      PointAccum pointAccum = new PointAccum();
      F.copy(B_x, 0, pointAccum.x, 0);
      F.copy(B_y, 0, pointAccum.y, 0);
      F.one(pointAccum.z);
      F.copy(pointAccum.x, 0, pointAccum.u, 0);
      F.copy(pointAccum.y, 0, pointAccum.v, 0);
      int j = b1 * 2;
      PointExtended[] arrayOfPointExtended2 = new PointExtended[4];
      for (byte b3 = 0; b3 < 4; b3++)
        arrayOfPointExtended2[b3] = new PointExtended(); 
      PointExtended pointExtended = new PointExtended();
      byte b4;
      for (b4 = 0; b4 < 8; b4++) {
        PointExtended pointExtended1 = arrayOfPointExtended1[j++] = new PointExtended();
        byte b;
        for (b = 0; b < 4; b++) {
          if (b == 0) {
            pointCopy(pointAccum, pointExtended1);
          } else {
            pointCopy(pointAccum, pointExtended);
            pointAdd(pointExtended1, pointExtended, pointExtended1, pointTemp);
          } 
          pointDouble(pointAccum);
          pointCopy(pointAccum, arrayOfPointExtended2[b]);
          if (b4 + b != 10)
            for (byte b5 = 1; b5 < 8; b5++)
              pointDouble(pointAccum);  
        } 
        F.negate(pointExtended1.x, pointExtended1.x);
        F.negate(pointExtended1.t, pointExtended1.t);
        for (b = 0; b < 3; b++) {
          int m = 1 << b;
          byte b5 = 0;
          while (b5 < m) {
            arrayOfPointExtended1[j] = new PointExtended();
            pointAdd(arrayOfPointExtended1[j - m], arrayOfPointExtended2[b], arrayOfPointExtended1[j], pointTemp);
            b5++;
            j++;
          } 
        } 
      } 
      invertDoubleZs(arrayOfPointExtended1);
      PRECOMP_BASE_WNAF = new PointPrecomp[b1];
      for (b4 = 0; b4 < b1; b4++) {
        PointExtended pointExtended1 = arrayOfPointExtended1[b4];
        PointPrecomp pointPrecomp1 = PRECOMP_BASE_WNAF[b4] = new PointPrecomp();
        F.mul(pointExtended1.x, pointExtended1.z, pointExtended1.x);
        F.mul(pointExtended1.y, pointExtended1.z, pointExtended1.y);
        F.apm(pointExtended1.y, pointExtended1.x, pointPrecomp1.ypx_h, pointPrecomp1.ymx_h);
        F.mul(pointExtended1.x, pointExtended1.y, pointPrecomp1.xyd);
        F.mul(pointPrecomp1.xyd, C_d4, pointPrecomp1.xyd);
        F.normalize(pointPrecomp1.ymx_h);
        F.normalize(pointPrecomp1.ypx_h);
        F.normalize(pointPrecomp1.xyd);
      } 
      PRECOMP_BASE128_WNAF = new PointPrecomp[b1];
      for (b4 = 0; b4 < b1; b4++) {
        PointExtended pointExtended1 = arrayOfPointExtended1[b1 + b4];
        PointPrecomp pointPrecomp1 = PRECOMP_BASE128_WNAF[b4] = new PointPrecomp();
        F.mul(pointExtended1.x, pointExtended1.z, pointExtended1.x);
        F.mul(pointExtended1.y, pointExtended1.z, pointExtended1.y);
        F.apm(pointExtended1.y, pointExtended1.x, pointPrecomp1.ypx_h, pointPrecomp1.ymx_h);
        F.mul(pointExtended1.x, pointExtended1.y, pointPrecomp1.xyd);
        F.mul(pointPrecomp1.xyd, C_d4, pointPrecomp1.xyd);
        F.normalize(pointPrecomp1.ymx_h);
        F.normalize(pointPrecomp1.ypx_h);
        F.normalize(pointPrecomp1.xyd);
      } 
      PRECOMP_BASE_COMB = F.createTable(b2 * 3);
      PointPrecomp pointPrecomp = new PointPrecomp();
      boolean bool = false;
      for (int k = b1 * 2; k < i; k++) {
        PointExtended pointExtended1 = arrayOfPointExtended1[k];
        F.mul(pointExtended1.x, pointExtended1.z, pointExtended1.x);
        F.mul(pointExtended1.y, pointExtended1.z, pointExtended1.y);
        F.apm(pointExtended1.y, pointExtended1.x, pointPrecomp.ypx_h, pointPrecomp.ymx_h);
        F.mul(pointExtended1.x, pointExtended1.y, pointPrecomp.xyd);
        F.mul(pointPrecomp.xyd, C_d4, pointPrecomp.xyd);
        F.normalize(pointPrecomp.ymx_h);
        F.normalize(pointPrecomp.ypx_h);
        F.normalize(pointPrecomp.xyd);
        F.copy(pointPrecomp.ymx_h, 0, PRECOMP_BASE_COMB, bool);
        bool += true;
        F.copy(pointPrecomp.ypx_h, 0, PRECOMP_BASE_COMB, bool);
        bool += true;
        F.copy(pointPrecomp.xyd, 0, PRECOMP_BASE_COMB, bool);
        bool += true;
      } 
    } 
  }
  
  private static void pruneScalar(byte[] paramArrayOfbyte1, int paramInt, byte[] paramArrayOfbyte2) {
    System.arraycopy(paramArrayOfbyte1, paramInt, paramArrayOfbyte2, 0, 32);
    paramArrayOfbyte2[0] = (byte)(paramArrayOfbyte2[0] & 0xF8);
    paramArrayOfbyte2[31] = (byte)(paramArrayOfbyte2[31] & Byte.MAX_VALUE);
    paramArrayOfbyte2[31] = (byte)(paramArrayOfbyte2[31] | 0x40);
  }
  
  private static void scalarMult(byte[] paramArrayOfbyte, PointAffine paramPointAffine, PointAccum paramPointAccum) {
    int[] arrayOfInt1 = new int[8];
    Scalar25519.decode(paramArrayOfbyte, arrayOfInt1);
    Scalar25519.toSignedDigits(256, arrayOfInt1);
    PointPrecompZ pointPrecompZ = new PointPrecompZ();
    PointTemp pointTemp = new PointTemp();
    int[] arrayOfInt2 = pointPrecomputeZ(paramPointAffine, 8, pointTemp);
    pointSetNeutral(paramPointAccum);
    byte b = 63;
    while (true) {
      pointLookupZ(arrayOfInt1, b, arrayOfInt2, pointPrecompZ);
      pointAdd(pointPrecompZ, paramPointAccum, pointTemp);
      if (--b < 0)
        break; 
      for (byte b1 = 0; b1 < 4; b1++)
        pointDouble(paramPointAccum); 
    } 
  }
  
  private static void scalarMultBase(byte[] paramArrayOfbyte, PointAccum paramPointAccum) {
    precompute();
    int[] arrayOfInt = new int[8];
    Scalar25519.decode(paramArrayOfbyte, arrayOfInt);
    Scalar25519.toSignedDigits(256, arrayOfInt);
    groupCombBits(arrayOfInt);
    PointPrecomp pointPrecomp = new PointPrecomp();
    PointTemp pointTemp = new PointTemp();
    pointSetNeutral(paramPointAccum);
    int i = 0;
    byte b = 28;
    while (true) {
      for (byte b1 = 0; b1 < 8; b1++) {
        int j = arrayOfInt[b1] >>> b;
        int k = j >>> 3 & 0x1;
        int m = (j ^ -k) & 0x7;
        pointLookup(b1, m, pointPrecomp);
        F.cnegate(i ^ k, paramPointAccum.x);
        F.cnegate(i ^ k, paramPointAccum.u);
        i = k;
        pointAdd(pointPrecomp, paramPointAccum, pointTemp);
      } 
      b -= 4;
      if (b < 0) {
        F.cnegate(i, paramPointAccum.x);
        F.cnegate(i, paramPointAccum.u);
        return;
      } 
      pointDouble(paramPointAccum);
    } 
  }
  
  private static void scalarMultBaseEncoded(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    PointAccum pointAccum = new PointAccum();
    scalarMultBase(paramArrayOfbyte1, pointAccum);
    if (0 == encodeResult(pointAccum, paramArrayOfbyte2, paramInt))
      throw new IllegalStateException(); 
  }
  
  public static void scalarMultBaseYZ(X25519.Friend paramFriend, byte[] paramArrayOfbyte, int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    if (null == paramFriend)
      throw new NullPointerException("This method is only for use by X25519"); 
    byte[] arrayOfByte = new byte[32];
    pruneScalar(paramArrayOfbyte, paramInt, arrayOfByte);
    PointAccum pointAccum = new PointAccum();
    scalarMultBase(arrayOfByte, pointAccum);
    if (0 == checkPoint(pointAccum))
      throw new IllegalStateException(); 
    F.copy(pointAccum.y, 0, paramArrayOfint1, 0);
    F.copy(pointAccum.z, 0, paramArrayOfint2, 0);
  }
  
  private static void scalarMultOrderVar(PointAffine paramPointAffine, PointAccum paramPointAccum) {
    byte[] arrayOfByte = new byte[253];
    Scalar25519.getOrderWnafVar(4, arrayOfByte);
    byte b = 4;
    PointPrecompZ[] arrayOfPointPrecompZ = new PointPrecompZ[b];
    PointTemp pointTemp = new PointTemp();
    pointPrecomputeZ(paramPointAffine, arrayOfPointPrecompZ, b, pointTemp);
    pointSetNeutral(paramPointAccum);
    char c = 'ü';
    while (true) {
      byte b1 = arrayOfByte[c];
      if (b1 != 0) {
        int i = b1 >> 1 ^ b1 >> 31;
        pointAddVar((b1 < 0), arrayOfPointPrecompZ[i], paramPointAccum, pointTemp);
      } 
      if (--c < '\000')
        break; 
      pointDouble(paramPointAccum);
    } 
  }
  
  private static void scalarMultStraus128Var(int[] paramArrayOfint1, int[] paramArrayOfint2, PointAffine paramPointAffine1, int[] paramArrayOfint3, PointAffine paramPointAffine2, PointAccum paramPointAccum) {
    precompute();
    byte[] arrayOfByte1 = new byte[256];
    byte[] arrayOfByte2 = new byte[128];
    byte[] arrayOfByte3 = new byte[128];
    Wnaf.getSignedVar(paramArrayOfint1, 6, arrayOfByte1);
    Wnaf.getSignedVar(paramArrayOfint2, 4, arrayOfByte2);
    Wnaf.getSignedVar(paramArrayOfint3, 4, arrayOfByte3);
    byte b = 4;
    PointPrecompZ[] arrayOfPointPrecompZ1 = new PointPrecompZ[b];
    PointPrecompZ[] arrayOfPointPrecompZ2 = new PointPrecompZ[b];
    PointTemp pointTemp = new PointTemp();
    pointPrecomputeZ(paramPointAffine1, arrayOfPointPrecompZ1, b, pointTemp);
    pointPrecomputeZ(paramPointAffine2, arrayOfPointPrecompZ2, b, pointTemp);
    pointSetNeutral(paramPointAccum);
    char c = '';
    do {
    
    } while (--c >= '\000' && (arrayOfByte1[c] | arrayOfByte1[128 + c] | arrayOfByte2[c] | arrayOfByte3[c]) == 0);
    while (c >= '\000') {
      byte b1 = arrayOfByte1[c];
      if (b1 != 0) {
        int i = b1 >> 1 ^ b1 >> 31;
        pointAddVar((b1 < 0), PRECOMP_BASE_WNAF[i], paramPointAccum, pointTemp);
      } 
      byte b2 = arrayOfByte1[128 + c];
      if (b2 != 0) {
        int i = b2 >> 1 ^ b2 >> 31;
        pointAddVar((b2 < 0), PRECOMP_BASE128_WNAF[i], paramPointAccum, pointTemp);
      } 
      byte b3 = arrayOfByte2[c];
      if (b3 != 0) {
        int i = b3 >> 1 ^ b3 >> 31;
        pointAddVar((b3 < 0), arrayOfPointPrecompZ1[i], paramPointAccum, pointTemp);
      } 
      byte b4 = arrayOfByte3[c];
      if (b4 != 0) {
        int i = b4 >> 1 ^ b4 >> 31;
        pointAddVar((b4 < 0), arrayOfPointPrecompZ2[i], paramPointAccum, pointTemp);
      } 
      pointDouble(paramPointAccum);
      c--;
    } 
    pointDouble(paramPointAccum);
    pointDouble(paramPointAccum);
  }
  
  public static void sign(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, int paramInt3, byte[] paramArrayOfbyte3, int paramInt4) {
    byte[] arrayOfByte = null;
    boolean bool = false;
    implSign(paramArrayOfbyte1, paramInt1, arrayOfByte, bool, paramArrayOfbyte2, paramInt2, paramInt3, paramArrayOfbyte3, paramInt4);
  }
  
  public static void sign(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, byte[] paramArrayOfbyte3, int paramInt3, int paramInt4, byte[] paramArrayOfbyte4, int paramInt5) {
    byte[] arrayOfByte = null;
    boolean bool = false;
    implSign(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt2, arrayOfByte, bool, paramArrayOfbyte3, paramInt3, paramInt4, paramArrayOfbyte4, paramInt5);
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
  
  public static void signPrehash(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, Digest paramDigest, byte[] paramArrayOfbyte3, int paramInt2) {
    byte[] arrayOfByte = new byte[64];
    if (64 != paramDigest.doFinal(arrayOfByte, 0))
      throw new IllegalArgumentException("ph"); 
    boolean bool = true;
    implSign(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, bool, arrayOfByte, 0, arrayOfByte.length, paramArrayOfbyte3, paramInt2);
  }
  
  public static void signPrehash(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, byte[] paramArrayOfbyte3, Digest paramDigest, byte[] paramArrayOfbyte4, int paramInt3) {
    byte[] arrayOfByte = new byte[64];
    if (64 != paramDigest.doFinal(arrayOfByte, 0))
      throw new IllegalArgumentException("ph"); 
    boolean bool = true;
    implSign(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt2, paramArrayOfbyte3, bool, arrayOfByte, 0, arrayOfByte.length, paramArrayOfbyte4, paramInt3);
  }
  
  public static boolean validatePublicKeyFull(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = copy(paramArrayOfbyte, paramInt, 32);
    if (!checkPointFullVar(arrayOfByte))
      return false; 
    PointAffine pointAffine = new PointAffine();
    return !decodePointVar(arrayOfByte, false, pointAffine) ? false : checkPointOrderVar(pointAffine);
  }
  
  public static PublicPoint validatePublicKeyFullExport(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = copy(paramArrayOfbyte, paramInt, 32);
    if (!checkPointFullVar(arrayOfByte))
      return null; 
    PointAffine pointAffine = new PointAffine();
    return !decodePointVar(arrayOfByte, false, pointAffine) ? null : (!checkPointOrderVar(pointAffine) ? null : exportPoint(pointAffine));
  }
  
  public static boolean validatePublicKeyPartial(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = copy(paramArrayOfbyte, paramInt, 32);
    if (!checkPointFullVar(arrayOfByte))
      return false; 
    PointAffine pointAffine = new PointAffine();
    return decodePointVar(arrayOfByte, false, pointAffine);
  }
  
  public static PublicPoint validatePublicKeyPartialExport(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = copy(paramArrayOfbyte, paramInt, 32);
    if (!checkPointFullVar(arrayOfByte))
      return null; 
    PointAffine pointAffine = new PointAffine();
    return !decodePointVar(arrayOfByte, false, pointAffine) ? null : exportPoint(pointAffine);
  }
  
  public static boolean verify(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, byte[] paramArrayOfbyte3, int paramInt3, int paramInt4) {
    byte[] arrayOfByte = null;
    boolean bool = false;
    return implVerify(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt2, arrayOfByte, bool, paramArrayOfbyte3, paramInt3, paramInt4);
  }
  
  public static boolean verify(byte[] paramArrayOfbyte1, int paramInt1, PublicPoint paramPublicPoint, byte[] paramArrayOfbyte2, int paramInt2, int paramInt3) {
    byte[] arrayOfByte = null;
    boolean bool = false;
    return implVerify(paramArrayOfbyte1, paramInt1, paramPublicPoint, arrayOfByte, bool, paramArrayOfbyte2, paramInt2, paramInt3);
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
  
  public static boolean verifyPrehash(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, byte[] paramArrayOfbyte3, Digest paramDigest) {
    byte[] arrayOfByte = new byte[64];
    if (64 != paramDigest.doFinal(arrayOfByte, 0))
      throw new IllegalArgumentException("ph"); 
    boolean bool = true;
    return implVerify(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt2, paramArrayOfbyte3, bool, arrayOfByte, 0, arrayOfByte.length);
  }
  
  public static boolean verifyPrehash(byte[] paramArrayOfbyte1, int paramInt, PublicPoint paramPublicPoint, byte[] paramArrayOfbyte2, Digest paramDigest) {
    byte[] arrayOfByte = new byte[64];
    if (64 != paramDigest.doFinal(arrayOfByte, 0))
      throw new IllegalArgumentException("ph"); 
    boolean bool = true;
    return implVerify(paramArrayOfbyte1, paramInt, paramPublicPoint, paramArrayOfbyte2, bool, arrayOfByte, 0, arrayOfByte.length);
  }
  
  public static final class Algorithm {
    public static final int Ed25519 = 0;
    
    public static final int Ed25519ctx = 1;
    
    public static final int Ed25519ph = 2;
  }
  
  private static class F extends X25519Field {}
  
  private static class PointAccum {
    int[] x = Ed25519.F.create();
    
    int[] y = Ed25519.F.create();
    
    int[] z = Ed25519.F.create();
    
    int[] u = Ed25519.F.create();
    
    int[] v = Ed25519.F.create();
    
    private PointAccum() {}
  }
  
  private static class PointAffine {
    int[] x = Ed25519.F.create();
    
    int[] y = Ed25519.F.create();
    
    private PointAffine() {}
  }
  
  private static class PointExtended {
    int[] x = Ed25519.F.create();
    
    int[] y = Ed25519.F.create();
    
    int[] z = Ed25519.F.create();
    
    int[] t = Ed25519.F.create();
    
    private PointExtended() {}
  }
  
  private static class PointPrecomp {
    int[] ymx_h = Ed25519.F.create();
    
    int[] ypx_h = Ed25519.F.create();
    
    int[] xyd = Ed25519.F.create();
    
    private PointPrecomp() {}
  }
  
  private static class PointPrecompZ {
    int[] ymx_h = Ed25519.F.create();
    
    int[] ypx_h = Ed25519.F.create();
    
    int[] xyd = Ed25519.F.create();
    
    int[] z = Ed25519.F.create();
    
    private PointPrecompZ() {}
  }
  
  private static class PointTemp {
    int[] r0 = Ed25519.F.create();
    
    int[] r1 = Ed25519.F.create();
    
    private PointTemp() {}
  }
  
  public static final class PublicPoint {
    final int[] data;
    
    PublicPoint(int[] param1ArrayOfint) {
      this.data = param1ArrayOfint;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\ec\rfc8032\Ed25519.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */