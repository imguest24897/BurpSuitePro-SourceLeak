package META-INF.versions.9.org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.crystals.kyber.Poly;
import org.bouncycastle.pqc.crypto.crystals.kyber.PolyVec;
import org.bouncycastle.pqc.crypto.crystals.kyber.Symmetric;
import org.bouncycastle.util.Arrays;

class KyberIndCpa {
  private KyberEngine engine;
  
  private int kyberK;
  
  private int eta1;
  
  private int indCpaPublicKeyBytes;
  
  private int polyVecBytes;
  
  private int indCpaBytes;
  
  private int polyVecCompressedBytes;
  
  private int polyCompressedBytes;
  
  private Symmetric symmetric;
  
  public final int KyberGenerateMatrixNBlocks;
  
  public KyberIndCpa(KyberEngine paramKyberEngine) {
    this.engine = paramKyberEngine;
    this.kyberK = paramKyberEngine.getKyberK();
    this.eta1 = paramKyberEngine.getKyberEta1();
    this.indCpaPublicKeyBytes = paramKyberEngine.getKyberPublicKeyBytes();
    this.polyVecBytes = paramKyberEngine.getKyberPolyVecBytes();
    this.indCpaBytes = paramKyberEngine.getKyberIndCpaBytes();
    this.polyVecCompressedBytes = paramKyberEngine.getKyberPolyVecCompressedBytes();
    this.polyCompressedBytes = paramKyberEngine.getKyberPolyCompressedBytes();
    this.symmetric = paramKyberEngine.getSymmetric();
    this.KyberGenerateMatrixNBlocks = (472 + this.symmetric.xofBlockBytes) / this.symmetric.xofBlockBytes;
  }
  
  byte[][] generateKeyPair() {
    PolyVec polyVec1 = new PolyVec(this.engine);
    PolyVec polyVec2 = new PolyVec(this.engine);
    PolyVec polyVec3 = new PolyVec(this.engine);
    byte[] arrayOfByte1 = new byte[32];
    this.engine.getRandomBytes(arrayOfByte1);
    byte[] arrayOfByte2 = new byte[64];
    this.symmetric.hash_g(arrayOfByte2, arrayOfByte1);
    byte[] arrayOfByte3 = new byte[32];
    byte[] arrayOfByte4 = new byte[32];
    System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 0, 32);
    System.arraycopy(arrayOfByte2, 32, arrayOfByte4, 0, 32);
    byte b = 0;
    PolyVec[] arrayOfPolyVec = new PolyVec[this.kyberK];
    byte b1;
    for (b1 = 0; b1 < this.kyberK; b1++)
      arrayOfPolyVec[b1] = new PolyVec(this.engine); 
    generateMatrix(arrayOfPolyVec, arrayOfByte3, false);
    for (b1 = 0; b1 < this.kyberK; b1++) {
      polyVec1.getVectorIndex(b1).getEta1Noise(arrayOfByte4, b);
      b = (byte)(b + 1);
    } 
    for (b1 = 0; b1 < this.kyberK; b1++) {
      polyVec3.getVectorIndex(b1).getEta1Noise(arrayOfByte4, b);
      b = (byte)(b + 1);
    } 
    polyVec1.polyVecNtt();
    polyVec3.polyVecNtt();
    for (b1 = 0; b1 < this.kyberK; b1++) {
      PolyVec.pointwiseAccountMontgomery(polyVec2.getVectorIndex(b1), arrayOfPolyVec[b1], polyVec1, this.engine);
      polyVec2.getVectorIndex(b1).convertToMont();
    } 
    polyVec2.addPoly(polyVec3);
    polyVec2.reducePoly();
    return new byte[][] { packPublicKey(polyVec2, arrayOfByte3), packSecretKey(polyVec1) };
  }
  
  public byte[] encrypt(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    byte b1 = 0;
    PolyVec polyVec1 = new PolyVec(this.engine);
    PolyVec polyVec2 = new PolyVec(this.engine);
    PolyVec polyVec3 = new PolyVec(this.engine);
    PolyVec polyVec4 = new PolyVec(this.engine);
    PolyVec[] arrayOfPolyVec = new PolyVec[this.engine.getKyberK()];
    Poly poly1 = new Poly(this.engine);
    Poly poly2 = new Poly(this.engine);
    Poly poly3 = new Poly(this.engine);
    byte[] arrayOfByte = unpackPublicKey(polyVec2, paramArrayOfbyte2);
    poly3.fromMsg(paramArrayOfbyte1);
    byte b;
    for (b = 0; b < this.kyberK; b++)
      arrayOfPolyVec[b] = new PolyVec(this.engine); 
    generateMatrix(arrayOfPolyVec, arrayOfByte, true);
    for (b = 0; b < this.kyberK; b++) {
      polyVec1.getVectorIndex(b).getEta1Noise(paramArrayOfbyte3, b1);
      b1 = (byte)(b1 + 1);
    } 
    for (b = 0; b < this.kyberK; b++) {
      polyVec3.getVectorIndex(b).getEta2Noise(paramArrayOfbyte3, b1);
      b1 = (byte)(b1 + 1);
    } 
    poly1.getEta2Noise(paramArrayOfbyte3, b1);
    polyVec1.polyVecNtt();
    for (b = 0; b < this.kyberK; b++)
      PolyVec.pointwiseAccountMontgomery(polyVec4.getVectorIndex(b), arrayOfPolyVec[b], polyVec1, this.engine); 
    PolyVec.pointwiseAccountMontgomery(poly2, polyVec2, polyVec1, this.engine);
    polyVec4.polyVecInverseNttToMont();
    poly2.polyInverseNttToMont();
    polyVec4.addPoly(polyVec3);
    poly2.addCoeffs(poly1);
    poly2.addCoeffs(poly3);
    polyVec4.reducePoly();
    poly2.reduce();
    return packCipherText(polyVec4, poly2);
  }
  
  private byte[] packCipherText(PolyVec paramPolyVec, Poly paramPoly) {
    byte[] arrayOfByte = new byte[this.indCpaBytes];
    System.arraycopy(paramPolyVec.compressPolyVec(), 0, arrayOfByte, 0, this.polyVecCompressedBytes);
    System.arraycopy(paramPoly.compressPoly(), 0, arrayOfByte, this.polyVecCompressedBytes, this.polyCompressedBytes);
    return arrayOfByte;
  }
  
  private void unpackCipherText(PolyVec paramPolyVec, Poly paramPoly, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = Arrays.copyOfRange(paramArrayOfbyte, 0, this.engine.getKyberPolyVecCompressedBytes());
    paramPolyVec.decompressPolyVec(arrayOfByte1);
    byte[] arrayOfByte2 = Arrays.copyOfRange(paramArrayOfbyte, this.engine.getKyberPolyVecCompressedBytes(), paramArrayOfbyte.length);
    paramPoly.decompressPoly(arrayOfByte2);
  }
  
  public byte[] packPublicKey(PolyVec paramPolyVec, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[this.indCpaPublicKeyBytes];
    System.arraycopy(paramPolyVec.toBytes(), 0, arrayOfByte, 0, this.polyVecBytes);
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, this.polyVecBytes, 32);
    return arrayOfByte;
  }
  
  public byte[] unpackPublicKey(PolyVec paramPolyVec, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[32];
    paramPolyVec.fromBytes(paramArrayOfbyte);
    System.arraycopy(paramArrayOfbyte, this.polyVecBytes, arrayOfByte, 0, 32);
    return arrayOfByte;
  }
  
  public byte[] packSecretKey(PolyVec paramPolyVec) {
    return paramPolyVec.toBytes();
  }
  
  public void unpackSecretKey(PolyVec paramPolyVec, byte[] paramArrayOfbyte) {
    paramPolyVec.fromBytes(paramArrayOfbyte);
  }
  
  public void generateMatrix(PolyVec[] paramArrayOfPolyVec, byte[] paramArrayOfbyte, boolean paramBoolean) {
    byte[] arrayOfByte = new byte[this.KyberGenerateMatrixNBlocks * this.symmetric.xofBlockBytes + 2];
    for (byte b = 0; b < this.kyberK; b++) {
      for (byte b1 = 0; b1 < this.kyberK; b1++) {
        if (paramBoolean) {
          this.symmetric.xofAbsorb(paramArrayOfbyte, (byte)b, (byte)b1);
        } else {
          this.symmetric.xofAbsorb(paramArrayOfbyte, (byte)b1, (byte)b);
        } 
        this.symmetric.xofSqueezeBlocks(arrayOfByte, 0, this.symmetric.xofBlockBytes * this.KyberGenerateMatrixNBlocks);
        int j = this.KyberGenerateMatrixNBlocks * this.symmetric.xofBlockBytes;
        int i;
        for (i = rejectionSampling(paramArrayOfPolyVec[b].getVectorIndex(b1), 0, 256, arrayOfByte, j); i < 256; i += rejectionSampling(paramArrayOfPolyVec[b].getVectorIndex(b1), i, 256 - i, arrayOfByte, j)) {
          int k = j % 3;
          for (byte b2 = 0; b2 < k; b2++)
            arrayOfByte[b2] = arrayOfByte[j - k + b2]; 
          this.symmetric.xofSqueezeBlocks(arrayOfByte, k, this.symmetric.xofBlockBytes * 2);
          j = k + this.symmetric.xofBlockBytes;
        } 
      } 
    } 
  }
  
  private static int rejectionSampling(Poly paramPoly, int paramInt1, int paramInt2, byte[] paramArrayOfbyte, int paramInt3) {
    int i = 0;
    byte b = i;
    while (b < paramInt2 && i + 3 <= paramInt3) {
      short s1 = (short)(((short)(paramArrayOfbyte[i] & 0xFF) >> 0 | (short)(paramArrayOfbyte[i + 1] & 0xFF) << 8) & 0xFFF);
      short s2 = (short)(((short)(paramArrayOfbyte[i + 1] & 0xFF) >> 4 | (short)(paramArrayOfbyte[i + 2] & 0xFF) << 4) & 0xFFF);
      i += 3;
      if (s1 < 3329) {
        paramPoly.setCoeffIndex(paramInt1 + b, s1);
        b++;
      } 
      if (b < paramInt2 && s2 < 3329) {
        paramPoly.setCoeffIndex(paramInt1 + b, s2);
        b++;
      } 
    } 
    return b;
  }
  
  public byte[] decrypt(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    null = new byte[KyberEngine.getKyberIndCpaMsgBytes()];
    PolyVec polyVec1 = new PolyVec(this.engine);
    PolyVec polyVec2 = new PolyVec(this.engine);
    Poly poly1 = new Poly(this.engine);
    Poly poly2 = new Poly(this.engine);
    unpackCipherText(polyVec1, poly1, paramArrayOfbyte1);
    unpackSecretKey(polyVec2, paramArrayOfbyte2);
    polyVec1.polyVecNtt();
    PolyVec.pointwiseAccountMontgomery(poly2, polyVec2, polyVec1, this.engine);
    poly2.polyInverseNttToMont();
    poly2.polySubtract(poly1);
    poly2.reduce();
    return poly2.toMsg();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\crystals\kyber\KyberIndCpa.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */