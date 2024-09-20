package META-INF.versions.9.org.bouncycastle.pqc.crypto.crystals.dilithium;

import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.crystals.dilithium.Packing;
import org.bouncycastle.pqc.crypto.crystals.dilithium.Poly;
import org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecK;
import org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecL;
import org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecMatrix;
import org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric;
import org.bouncycastle.util.Arrays;

class DilithiumEngine {
  private final SecureRandom random;
  
  private final SHAKEDigest shake128Digest = new SHAKEDigest(128);
  
  private final SHAKEDigest shake256Digest = new SHAKEDigest(256);
  
  public static final int DilithiumN = 256;
  
  public static final int DilithiumQ = 8380417;
  
  public static final int DilithiumQinv = 58728449;
  
  public static final int DilithiumD = 13;
  
  public static final int DilithiumRootOfUnity = 1753;
  
  public static final int SeedBytes = 32;
  
  public static final int CrhBytes = 64;
  
  public static final int RndBytes = 32;
  
  public static final int TrBytes = 64;
  
  public static final int DilithiumPolyT1PackedBytes = 320;
  
  public static final int DilithiumPolyT0PackedBytes = 416;
  
  private final int DilithiumPolyVecHPackedBytes;
  
  private final int DilithiumPolyZPackedBytes;
  
  private final int DilithiumPolyW1PackedBytes;
  
  private final int DilithiumPolyEtaPackedBytes;
  
  private final int DilithiumMode;
  
  private final int DilithiumK;
  
  private final int DilithiumL;
  
  private final int DilithiumEta;
  
  private final int DilithiumTau;
  
  private final int DilithiumBeta;
  
  private final int DilithiumGamma1;
  
  private final int DilithiumGamma2;
  
  private final int DilithiumOmega;
  
  private final int DilithiumCTilde;
  
  private final int CryptoPublicKeyBytes;
  
  private final int CryptoSecretKeyBytes;
  
  private final int CryptoBytes;
  
  private final int PolyUniformGamma1NBlocks;
  
  private final Symmetric symmetric;
  
  protected Symmetric GetSymmetric() {
    return this.symmetric;
  }
  
  int getDilithiumPolyVecHPackedBytes() {
    return this.DilithiumPolyVecHPackedBytes;
  }
  
  int getDilithiumPolyZPackedBytes() {
    return this.DilithiumPolyZPackedBytes;
  }
  
  int getDilithiumPolyW1PackedBytes() {
    return this.DilithiumPolyW1PackedBytes;
  }
  
  int getDilithiumPolyEtaPackedBytes() {
    return this.DilithiumPolyEtaPackedBytes;
  }
  
  int getDilithiumMode() {
    return this.DilithiumMode;
  }
  
  int getDilithiumK() {
    return this.DilithiumK;
  }
  
  int getDilithiumL() {
    return this.DilithiumL;
  }
  
  int getDilithiumEta() {
    return this.DilithiumEta;
  }
  
  int getDilithiumTau() {
    return this.DilithiumTau;
  }
  
  int getDilithiumBeta() {
    return this.DilithiumBeta;
  }
  
  int getDilithiumGamma1() {
    return this.DilithiumGamma1;
  }
  
  int getDilithiumGamma2() {
    return this.DilithiumGamma2;
  }
  
  int getDilithiumOmega() {
    return this.DilithiumOmega;
  }
  
  int getDilithiumCTilde() {
    return this.DilithiumCTilde;
  }
  
  int getCryptoPublicKeyBytes() {
    return this.CryptoPublicKeyBytes;
  }
  
  int getCryptoSecretKeyBytes() {
    return this.CryptoSecretKeyBytes;
  }
  
  int getCryptoBytes() {
    return this.CryptoBytes;
  }
  
  int getPolyUniformGamma1NBlocks() {
    return this.PolyUniformGamma1NBlocks;
  }
  
  SHAKEDigest getShake256Digest() {
    return this.shake256Digest;
  }
  
  SHAKEDigest getShake128Digest() {
    return this.shake128Digest;
  }
  
  DilithiumEngine(int paramInt, SecureRandom paramSecureRandom, boolean paramBoolean) {
    this.DilithiumMode = paramInt;
    switch (paramInt) {
      case 2:
        this.DilithiumK = 4;
        this.DilithiumL = 4;
        this.DilithiumEta = 2;
        this.DilithiumTau = 39;
        this.DilithiumBeta = 78;
        this.DilithiumGamma1 = 131072;
        this.DilithiumGamma2 = 95232;
        this.DilithiumOmega = 80;
        this.DilithiumPolyZPackedBytes = 576;
        this.DilithiumPolyW1PackedBytes = 192;
        this.DilithiumPolyEtaPackedBytes = 96;
        this.DilithiumCTilde = 32;
        break;
      case 3:
        this.DilithiumK = 6;
        this.DilithiumL = 5;
        this.DilithiumEta = 4;
        this.DilithiumTau = 49;
        this.DilithiumBeta = 196;
        this.DilithiumGamma1 = 524288;
        this.DilithiumGamma2 = 261888;
        this.DilithiumOmega = 55;
        this.DilithiumPolyZPackedBytes = 640;
        this.DilithiumPolyW1PackedBytes = 128;
        this.DilithiumPolyEtaPackedBytes = 128;
        this.DilithiumCTilde = 48;
        break;
      case 5:
        this.DilithiumK = 8;
        this.DilithiumL = 7;
        this.DilithiumEta = 2;
        this.DilithiumTau = 60;
        this.DilithiumBeta = 120;
        this.DilithiumGamma1 = 524288;
        this.DilithiumGamma2 = 261888;
        this.DilithiumOmega = 75;
        this.DilithiumPolyZPackedBytes = 640;
        this.DilithiumPolyW1PackedBytes = 128;
        this.DilithiumPolyEtaPackedBytes = 96;
        this.DilithiumCTilde = 64;
        break;
      default:
        throw new IllegalArgumentException("The mode " + paramInt + "is not supported by Crystals Dilithium!");
    } 
    if (paramBoolean) {
      this.symmetric = (Symmetric)new Symmetric.AesSymmetric();
    } else {
      this.symmetric = (Symmetric)new Symmetric.ShakeSymmetric();
    } 
    this.random = paramSecureRandom;
    this.DilithiumPolyVecHPackedBytes = this.DilithiumOmega + this.DilithiumK;
    this.CryptoPublicKeyBytes = 32 + this.DilithiumK * 320;
    this.CryptoSecretKeyBytes = 96 + this.DilithiumL * this.DilithiumPolyEtaPackedBytes + this.DilithiumK * this.DilithiumPolyEtaPackedBytes + this.DilithiumK * 416;
    this.CryptoBytes = this.DilithiumCTilde + this.DilithiumL * this.DilithiumPolyZPackedBytes + this.DilithiumPolyVecHPackedBytes;
    if (this.DilithiumGamma1 == 131072) {
      this.PolyUniformGamma1NBlocks = (576 + this.symmetric.stream256BlockBytes - 1) / this.symmetric.stream256BlockBytes;
    } else if (this.DilithiumGamma1 == 524288) {
      this.PolyUniformGamma1NBlocks = (640 + this.symmetric.stream256BlockBytes - 1) / this.symmetric.stream256BlockBytes;
    } else {
      throw new RuntimeException("Wrong Dilithium Gamma1!");
    } 
  }
  
  public byte[][] generateKeyPair() {
    byte[] arrayOfByte1 = new byte[32];
    byte[] arrayOfByte2 = new byte[128];
    byte[] arrayOfByte3 = new byte[64];
    byte[] arrayOfByte4 = new byte[32];
    byte[] arrayOfByte5 = new byte[64];
    byte[] arrayOfByte6 = new byte[32];
    PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
    PolyVecL polyVecL1 = new PolyVecL(this);
    PolyVecK polyVecK1 = new PolyVecK(this);
    PolyVecK polyVecK2 = new PolyVecK(this);
    PolyVecK polyVecK3 = new PolyVecK(this);
    this.random.nextBytes(arrayOfByte1);
    this.shake256Digest.update(arrayOfByte1, 0, 32);
    this.shake256Digest.doFinal(arrayOfByte2, 0, 128);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte4, 0, 32);
    System.arraycopy(arrayOfByte2, 32, arrayOfByte5, 0, 64);
    System.arraycopy(arrayOfByte2, 96, arrayOfByte6, 0, 32);
    polyVecMatrix.expandMatrix(arrayOfByte4);
    polyVecL1.uniformEta(arrayOfByte5, (short)0);
    polyVecK1.uniformEta(arrayOfByte5, (short)this.DilithiumL);
    PolyVecL polyVecL2 = new PolyVecL(this);
    polyVecL1.copyPolyVecL(polyVecL2);
    polyVecL2.polyVecNtt();
    polyVecMatrix.pointwiseMontgomery(polyVecK2, polyVecL2);
    polyVecK2.reduce();
    polyVecK2.invNttToMont();
    polyVecK2.addPolyVecK(polyVecK1);
    polyVecK2.conditionalAddQ();
    polyVecK2.power2Round(polyVecK3);
    byte[] arrayOfByte7 = Packing.packPublicKey(polyVecK2, this);
    this.shake256Digest.update(arrayOfByte4, 0, arrayOfByte4.length);
    this.shake256Digest.update(arrayOfByte7, 0, arrayOfByte7.length);
    this.shake256Digest.doFinal(arrayOfByte3, 0, 64);
    byte[][] arrayOfByte = Packing.packSecretKey(arrayOfByte4, arrayOfByte3, arrayOfByte6, polyVecK3, polyVecL1, polyVecK1, this);
    return new byte[][] { arrayOfByte[0], arrayOfByte[1], arrayOfByte[2], arrayOfByte[3], arrayOfByte[4], arrayOfByte[5], arrayOfByte7 };
  }
  
  public byte[] signSignature(byte[] paramArrayOfbyte1, int paramInt, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5, byte[] paramArrayOfbyte6, byte[] paramArrayOfbyte7) {
    byte[] arrayOfByte1 = new byte[this.CryptoBytes + paramInt];
    byte[] arrayOfByte2 = new byte[64];
    byte[] arrayOfByte3 = new byte[64];
    short s = 0;
    PolyVecL polyVecL1 = new PolyVecL(this);
    PolyVecL polyVecL2 = new PolyVecL(this);
    PolyVecL polyVecL3 = new PolyVecL(this);
    PolyVecK polyVecK1 = new PolyVecK(this);
    PolyVecK polyVecK2 = new PolyVecK(this);
    PolyVecK polyVecK3 = new PolyVecK(this);
    PolyVecK polyVecK4 = new PolyVecK(this);
    PolyVecK polyVecK5 = new PolyVecK(this);
    Poly poly = new Poly(this);
    PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
    Packing.unpackSecretKey(polyVecK1, polyVecL1, polyVecK2, paramArrayOfbyte5, paramArrayOfbyte6, paramArrayOfbyte7, this);
    this.shake256Digest.update(paramArrayOfbyte4, 0, 64);
    this.shake256Digest.update(paramArrayOfbyte1, 0, paramInt);
    this.shake256Digest.doFinal(arrayOfByte2, 0, 64);
    byte[] arrayOfByte4 = new byte[32];
    if (this.random != null)
      this.random.nextBytes(arrayOfByte4); 
    byte[] arrayOfByte5 = Arrays.copyOf(paramArrayOfbyte3, 128);
    System.arraycopy(arrayOfByte4, 0, arrayOfByte5, 32, 32);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte5, 64, 64);
    this.shake256Digest.update(arrayOfByte5, 0, 128);
    this.shake256Digest.doFinal(arrayOfByte3, 0, 64);
    polyVecMatrix.expandMatrix(paramArrayOfbyte2);
    polyVecL1.polyVecNtt();
    polyVecK2.polyVecNtt();
    polyVecK1.polyVecNtt();
    byte b = 0;
    while (b < 'Ϩ') {
      b++;
      s = (short)(s + 1);
      polyVecL2.uniformGamma1(arrayOfByte3, s);
      polyVecL2.copyPolyVecL(polyVecL3);
      polyVecL3.polyVecNtt();
      polyVecMatrix.pointwiseMontgomery(polyVecK3, polyVecL3);
      polyVecK3.reduce();
      polyVecK3.invNttToMont();
      polyVecK3.conditionalAddQ();
      polyVecK3.decompose(polyVecK4);
      System.arraycopy(polyVecK3.packW1(), 0, arrayOfByte1, 0, this.DilithiumK * this.DilithiumPolyW1PackedBytes);
      this.shake256Digest.update(arrayOfByte2, 0, 64);
      this.shake256Digest.update(arrayOfByte1, 0, this.DilithiumK * this.DilithiumPolyW1PackedBytes);
      this.shake256Digest.doFinal(arrayOfByte1, 0, this.DilithiumCTilde);
      poly.challenge(Arrays.copyOfRange(arrayOfByte1, 0, 32));
      poly.polyNtt();
      polyVecL3.pointwisePolyMontgomery(poly, polyVecL1);
      polyVecL3.invNttToMont();
      polyVecL3.addPolyVecL(polyVecL2);
      polyVecL3.reduce();
      if (polyVecL3.checkNorm(this.DilithiumGamma1 - this.DilithiumBeta))
        continue; 
      polyVecK5.pointwisePolyMontgomery(poly, polyVecK2);
      polyVecK5.invNttToMont();
      polyVecK4.subtract(polyVecK5);
      polyVecK4.reduce();
      if (polyVecK4.checkNorm(this.DilithiumGamma2 - this.DilithiumBeta))
        continue; 
      polyVecK5.pointwisePolyMontgomery(poly, polyVecK1);
      polyVecK5.invNttToMont();
      polyVecK5.reduce();
      if (polyVecK5.checkNorm(this.DilithiumGamma2))
        continue; 
      polyVecK4.addPolyVecK(polyVecK5);
      polyVecK4.conditionalAddQ();
      int i = polyVecK5.makeHint(polyVecK4, polyVecK3);
      if (i > this.DilithiumOmega)
        continue; 
      return Packing.packSignature(arrayOfByte1, polyVecL3, polyVecK5, this);
    } 
    return null;
  }
  
  public byte[] sign(byte[] paramArrayOfbyte1, int paramInt, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5, byte[] paramArrayOfbyte6, byte[] paramArrayOfbyte7) {
    return signSignature(paramArrayOfbyte1, paramInt, paramArrayOfbyte2, paramArrayOfbyte3, paramArrayOfbyte4, paramArrayOfbyte5, paramArrayOfbyte6, paramArrayOfbyte7);
  }
  
  public boolean signVerify(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4) {
    byte[] arrayOfByte2 = new byte[64];
    byte[] arrayOfByte4 = new byte[this.DilithiumCTilde];
    Poly poly = new Poly(this);
    PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
    PolyVecL polyVecL = new PolyVecL(this);
    PolyVecK polyVecK1 = new PolyVecK(this);
    PolyVecK polyVecK2 = new PolyVecK(this);
    PolyVecK polyVecK3 = new PolyVecK(this);
    if (paramInt1 != this.CryptoBytes)
      return false; 
    polyVecK1 = Packing.unpackPublicKey(polyVecK1, paramArrayOfbyte4, this);
    if (!Packing.unpackSignature(polyVecL, polyVecK3, paramArrayOfbyte1, this))
      return false; 
    byte[] arrayOfByte3 = Arrays.copyOfRange(paramArrayOfbyte1, 0, this.DilithiumCTilde);
    if (polyVecL.checkNorm(getDilithiumGamma1() - getDilithiumBeta()))
      return false; 
    this.shake256Digest.update(paramArrayOfbyte3, 0, paramArrayOfbyte3.length);
    this.shake256Digest.update(paramArrayOfbyte4, 0, paramArrayOfbyte4.length);
    this.shake256Digest.doFinal(arrayOfByte2, 0, 64);
    this.shake256Digest.update(arrayOfByte2, 0, 64);
    this.shake256Digest.update(paramArrayOfbyte2, 0, paramInt2);
    this.shake256Digest.doFinal(arrayOfByte2, 0);
    poly.challenge(Arrays.copyOfRange(arrayOfByte3, 0, 32));
    polyVecMatrix.expandMatrix(paramArrayOfbyte3);
    polyVecL.polyVecNtt();
    polyVecMatrix.pointwiseMontgomery(polyVecK2, polyVecL);
    poly.polyNtt();
    polyVecK1.shiftLeft();
    polyVecK1.polyVecNtt();
    polyVecK1.pointwisePolyMontgomery(poly, polyVecK1);
    polyVecK2.subtract(polyVecK1);
    polyVecK2.reduce();
    polyVecK2.invNttToMont();
    polyVecK2.conditionalAddQ();
    polyVecK2.useHint(polyVecK2, polyVecK3);
    byte[] arrayOfByte1 = polyVecK2.packW1();
    SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
    sHAKEDigest.update(arrayOfByte2, 0, 64);
    sHAKEDigest.update(arrayOfByte1, 0, this.DilithiumK * this.DilithiumPolyW1PackedBytes);
    sHAKEDigest.doFinal(arrayOfByte4, 0, this.DilithiumCTilde);
    for (byte b = 0; b < this.DilithiumCTilde; b++) {
      if (arrayOfByte3[b] != arrayOfByte4[b])
        return false; 
    } 
    return true;
  }
  
  public boolean signOpen(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4) {
    return signVerify(paramArrayOfbyte2, paramInt, paramArrayOfbyte1, paramArrayOfbyte1.length, paramArrayOfbyte3, paramArrayOfbyte4);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\crystals\dilithium\DilithiumEngine.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */