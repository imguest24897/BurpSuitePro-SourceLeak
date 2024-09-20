package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.util.Arrays;

class PolyVec {
  Poly[] vec;
  
  private KyberEngine engine;
  
  private int kyberK;
  
  private int polyVecBytes;
  
  public PolyVec(KyberEngine paramKyberEngine) {
    this.engine = paramKyberEngine;
    this.kyberK = paramKyberEngine.getKyberK();
    this.polyVecBytes = paramKyberEngine.getKyberPolyVecBytes();
    this.vec = new Poly[this.kyberK];
    for (byte b = 0; b < this.kyberK; b++)
      this.vec[b] = new Poly(paramKyberEngine); 
  }
  
  public PolyVec() throws Exception {
    throw new Exception("Requires Parameter");
  }
  
  public Poly getVectorIndex(int paramInt) {
    return this.vec[paramInt];
  }
  
  public void polyVecNtt() {
    for (byte b = 0; b < this.kyberK; b++)
      getVectorIndex(b).polyNtt(); 
  }
  
  public void polyVecInverseNttToMont() {
    for (byte b = 0; b < this.kyberK; b++)
      getVectorIndex(b).polyInverseNttToMont(); 
  }
  
  public byte[] compressPolyVec() {
    conditionalSubQ();
    byte[] arrayOfByte = new byte[this.engine.getKyberPolyVecCompressedBytes()];
    byte b = 0;
    if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * 320) {
      short[] arrayOfShort = new short[4];
      for (byte b1 = 0; b1 < this.kyberK; b1++) {
        for (byte b2 = 0; b2 < 64; b2++) {
          for (byte b3 = 0; b3 < 4; b3++) {
            long l = getVectorIndex(b1).getCoeffIndex(4 * b2 + b3);
            l <<= 10L;
            l += 1665L;
            l *= 1290167L;
            l >>= 32L;
            l &= 0x3FFL;
            arrayOfShort[b3] = (short)(int)l;
          } 
          arrayOfByte[b + 0] = (byte)(arrayOfShort[0] >> 0);
          arrayOfByte[b + 1] = (byte)(arrayOfShort[0] >> 8 | arrayOfShort[1] << 2);
          arrayOfByte[b + 2] = (byte)(arrayOfShort[1] >> 6 | arrayOfShort[2] << 4);
          arrayOfByte[b + 3] = (byte)(arrayOfShort[2] >> 4 | arrayOfShort[3] << 6);
          arrayOfByte[b + 4] = (byte)(arrayOfShort[3] >> 2);
          b += 5;
        } 
      } 
    } else if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * 352) {
      short[] arrayOfShort = new short[8];
      for (byte b1 = 0; b1 < this.kyberK; b1++) {
        for (byte b2 = 0; b2 < 32; b2++) {
          for (byte b3 = 0; b3 < 8; b3++) {
            long l = getVectorIndex(b1).getCoeffIndex(8 * b2 + b3);
            l <<= 11L;
            l += 1664L;
            l *= 645084L;
            l >>= 31L;
            l &= 0x7FFL;
            arrayOfShort[b3] = (short)(int)l;
          } 
          arrayOfByte[b + 0] = (byte)(arrayOfShort[0] >> 0);
          arrayOfByte[b + 1] = (byte)(arrayOfShort[0] >> 8 | arrayOfShort[1] << 3);
          arrayOfByte[b + 2] = (byte)(arrayOfShort[1] >> 5 | arrayOfShort[2] << 6);
          arrayOfByte[b + 3] = (byte)(arrayOfShort[2] >> 2);
          arrayOfByte[b + 4] = (byte)(arrayOfShort[2] >> 10 | arrayOfShort[3] << 1);
          arrayOfByte[b + 5] = (byte)(arrayOfShort[3] >> 7 | arrayOfShort[4] << 4);
          arrayOfByte[b + 6] = (byte)(arrayOfShort[4] >> 4 | arrayOfShort[5] << 7);
          arrayOfByte[b + 7] = (byte)(arrayOfShort[5] >> 1);
          arrayOfByte[b + 8] = (byte)(arrayOfShort[5] >> 9 | arrayOfShort[6] << 2);
          arrayOfByte[b + 9] = (byte)(arrayOfShort[6] >> 6 | arrayOfShort[7] << 5);
          arrayOfByte[b + 10] = (byte)(arrayOfShort[7] >> 3);
          b += 11;
        } 
      } 
    } else {
      throw new RuntimeException("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
    } 
    return arrayOfByte;
  }
  
  public void decompressPolyVec(byte[] paramArrayOfbyte) {
    byte b = 0;
    if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * 320) {
      short[] arrayOfShort = new short[4];
      for (byte b1 = 0; b1 < this.kyberK; b1++) {
        for (byte b2 = 0; b2 < 64; b2++) {
          arrayOfShort[0] = (short)((paramArrayOfbyte[b] & 0xFF) >> 0 | (short)((paramArrayOfbyte[b + 1] & 0xFF) << 8));
          arrayOfShort[1] = (short)((paramArrayOfbyte[b + 1] & 0xFF) >> 2 | (short)((paramArrayOfbyte[b + 2] & 0xFF) << 6));
          arrayOfShort[2] = (short)((paramArrayOfbyte[b + 2] & 0xFF) >> 4 | (short)((paramArrayOfbyte[b + 3] & 0xFF) << 4));
          arrayOfShort[3] = (short)((paramArrayOfbyte[b + 3] & 0xFF) >> 6 | (short)((paramArrayOfbyte[b + 4] & 0xFF) << 2));
          b += 5;
          for (byte b3 = 0; b3 < 4; b3++)
            this.vec[b1].setCoeffIndex(4 * b2 + b3, (short)((arrayOfShort[b3] & 0x3FF) * 3329 + 512 >> 10)); 
        } 
      } 
    } else if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * 352) {
      short[] arrayOfShort = new short[8];
      for (byte b1 = 0; b1 < this.kyberK; b1++) {
        for (byte b2 = 0; b2 < 32; b2++) {
          arrayOfShort[0] = (short)((paramArrayOfbyte[b] & 0xFF) >> 0 | (short)(paramArrayOfbyte[b + 1] & 0xFF) << 8);
          arrayOfShort[1] = (short)((paramArrayOfbyte[b + 1] & 0xFF) >> 3 | (short)(paramArrayOfbyte[b + 2] & 0xFF) << 5);
          arrayOfShort[2] = (short)((paramArrayOfbyte[b + 2] & 0xFF) >> 6 | (short)(paramArrayOfbyte[b + 3] & 0xFF) << 2 | (short)((paramArrayOfbyte[b + 4] & 0xFF) << 10));
          arrayOfShort[3] = (short)((paramArrayOfbyte[b + 4] & 0xFF) >> 1 | (short)(paramArrayOfbyte[b + 5] & 0xFF) << 7);
          arrayOfShort[4] = (short)((paramArrayOfbyte[b + 5] & 0xFF) >> 4 | (short)(paramArrayOfbyte[b + 6] & 0xFF) << 4);
          arrayOfShort[5] = (short)((paramArrayOfbyte[b + 6] & 0xFF) >> 7 | (short)(paramArrayOfbyte[b + 7] & 0xFF) << 1 | (short)((paramArrayOfbyte[b + 8] & 0xFF) << 9));
          arrayOfShort[6] = (short)((paramArrayOfbyte[b + 8] & 0xFF) >> 2 | (short)(paramArrayOfbyte[b + 9] & 0xFF) << 6);
          arrayOfShort[7] = (short)((paramArrayOfbyte[b + 9] & 0xFF) >> 5 | (short)(paramArrayOfbyte[b + 10] & 0xFF) << 3);
          b += 11;
          for (byte b3 = 0; b3 < 8; b3++)
            this.vec[b1].setCoeffIndex(8 * b2 + b3, (short)((arrayOfShort[b3] & 0x7FF) * 3329 + 1024 >> 11)); 
        } 
      } 
    } else {
      throw new RuntimeException("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
    } 
  }
  
  public static void pointwiseAccountMontgomery(Poly paramPoly, PolyVec paramPolyVec1, PolyVec paramPolyVec2, KyberEngine paramKyberEngine) {
    Poly poly = new Poly(paramKyberEngine);
    Poly.baseMultMontgomery(paramPoly, paramPolyVec1.getVectorIndex(0), paramPolyVec2.getVectorIndex(0));
    for (byte b = 1; b < paramKyberEngine.getKyberK(); b++) {
      Poly.baseMultMontgomery(poly, paramPolyVec1.getVectorIndex(b), paramPolyVec2.getVectorIndex(b));
      paramPoly.addCoeffs(poly);
    } 
    paramPoly.reduce();
  }
  
  public void reducePoly() {
    for (byte b = 0; b < this.kyberK; b++)
      getVectorIndex(b).reduce(); 
  }
  
  public void addPoly(PolyVec paramPolyVec) {
    for (byte b = 0; b < this.kyberK; b++)
      getVectorIndex(b).addCoeffs(paramPolyVec.getVectorIndex(b)); 
  }
  
  public byte[] toBytes() {
    byte[] arrayOfByte = new byte[this.polyVecBytes];
    for (byte b = 0; b < this.kyberK; b++)
      System.arraycopy(this.vec[b].toBytes(), 0, arrayOfByte, b * 384, 384); 
    return arrayOfByte;
  }
  
  public void fromBytes(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < this.kyberK; b++)
      getVectorIndex(b).fromBytes(Arrays.copyOfRange(paramArrayOfbyte, b * 384, (b + 1) * 384)); 
  }
  
  public void conditionalSubQ() {
    for (byte b = 0; b < this.kyberK; b++)
      getVectorIndex(b).conditionalSubQ(); 
  }
  
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("[");
    for (byte b = 0; b < this.kyberK; b++) {
      stringBuffer.append(this.vec[b].toString());
      if (b != this.kyberK - 1)
        stringBuffer.append(", "); 
    } 
    stringBuffer.append("]");
    return stringBuffer.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\kyber\PolyVec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */