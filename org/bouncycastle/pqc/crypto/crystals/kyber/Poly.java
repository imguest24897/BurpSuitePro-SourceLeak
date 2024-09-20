package org.bouncycastle.pqc.crypto.crystals.kyber;

class Poly {
  private short[] coeffs = new short[256];
  
  private KyberEngine engine;
  
  private int polyCompressedBytes;
  
  private int eta1;
  
  private int eta2;
  
  private Symmetric symmetric;
  
  public Poly(KyberEngine paramKyberEngine) {
    this.engine = paramKyberEngine;
    this.polyCompressedBytes = paramKyberEngine.getKyberPolyCompressedBytes();
    this.eta1 = paramKyberEngine.getKyberEta1();
    this.eta2 = KyberEngine.getKyberEta2();
    this.symmetric = paramKyberEngine.getSymmetric();
  }
  
  public short getCoeffIndex(int paramInt) {
    return this.coeffs[paramInt];
  }
  
  public short[] getCoeffs() {
    return this.coeffs;
  }
  
  public void setCoeffIndex(int paramInt, short paramShort) {
    this.coeffs[paramInt] = paramShort;
  }
  
  public void setCoeffs(short[] paramArrayOfshort) {
    this.coeffs = paramArrayOfshort;
  }
  
  public void polyNtt() {
    setCoeffs(Ntt.ntt(getCoeffs()));
    reduce();
  }
  
  public void polyInverseNttToMont() {
    setCoeffs(Ntt.invNtt(getCoeffs()));
  }
  
  public void reduce() {
    for (byte b = 0; b < 'Ā'; b++)
      setCoeffIndex(b, Reduce.barretReduce(getCoeffIndex(b))); 
  }
  
  public static void baseMultMontgomery(Poly paramPoly1, Poly paramPoly2, Poly paramPoly3) {
    for (byte b = 0; b < 64; b++) {
      Ntt.baseMult(paramPoly1, 4 * b, paramPoly2.getCoeffIndex(4 * b), paramPoly2.getCoeffIndex(4 * b + 1), paramPoly3.getCoeffIndex(4 * b), paramPoly3.getCoeffIndex(4 * b + 1), Ntt.nttZetas[64 + b]);
      Ntt.baseMult(paramPoly1, 4 * b + 2, paramPoly2.getCoeffIndex(4 * b + 2), paramPoly2.getCoeffIndex(4 * b + 3), paramPoly3.getCoeffIndex(4 * b + 2), paramPoly3.getCoeffIndex(4 * b + 3), (short)(-1 * Ntt.nttZetas[64 + b]));
    } 
  }
  
  public void addCoeffs(Poly paramPoly) {
    for (byte b = 0; b < 'Ā'; b++)
      setCoeffIndex(b, (short)(getCoeffIndex(b) + paramPoly.getCoeffIndex(b))); 
  }
  
  public void convertToMont() {
    for (byte b = 0; b < 'Ā'; b++)
      setCoeffIndex(b, Reduce.montgomeryReduce(getCoeffIndex(b) * 1353)); 
  }
  
  public byte[] compressPoly() {
    byte[] arrayOfByte1 = new byte[8];
    byte[] arrayOfByte2 = new byte[this.polyCompressedBytes];
    byte b = 0;
    conditionalSubQ();
    if (this.polyCompressedBytes == 128) {
      for (byte b1 = 0; b1 < 32; b1++) {
        for (byte b2 = 0; b2 < 8; b2++) {
          short s = getCoeffIndex(8 * b1 + b2);
          int i = s << 4;
          i += 1665;
          i *= 80635;
          i >>= 28;
          i &= 0xF;
          arrayOfByte1[b2] = (byte)i;
        } 
        arrayOfByte2[b + 0] = (byte)(arrayOfByte1[0] | arrayOfByte1[1] << 4);
        arrayOfByte2[b + 1] = (byte)(arrayOfByte1[2] | arrayOfByte1[3] << 4);
        arrayOfByte2[b + 2] = (byte)(arrayOfByte1[4] | arrayOfByte1[5] << 4);
        arrayOfByte2[b + 3] = (byte)(arrayOfByte1[6] | arrayOfByte1[7] << 4);
        b += 4;
      } 
    } else if (this.polyCompressedBytes == 160) {
      for (byte b1 = 0; b1 < 32; b1++) {
        for (byte b2 = 0; b2 < 8; b2++) {
          short s = getCoeffIndex(8 * b1 + b2);
          int i = s << 5;
          i += 1664;
          i *= 40318;
          i >>= 27;
          i &= 0x1F;
          arrayOfByte1[b2] = (byte)i;
        } 
        arrayOfByte2[b + 0] = (byte)(arrayOfByte1[0] >> 0 | arrayOfByte1[1] << 5);
        arrayOfByte2[b + 1] = (byte)(arrayOfByte1[1] >> 3 | arrayOfByte1[2] << 2 | arrayOfByte1[3] << 7);
        arrayOfByte2[b + 2] = (byte)(arrayOfByte1[3] >> 1 | arrayOfByte1[4] << 4);
        arrayOfByte2[b + 3] = (byte)(arrayOfByte1[4] >> 4 | arrayOfByte1[5] << 1 | arrayOfByte1[6] << 6);
        arrayOfByte2[b + 4] = (byte)(arrayOfByte1[6] >> 2 | arrayOfByte1[7] << 3);
        b += 5;
      } 
    } else {
      throw new RuntimeException("PolyCompressedBytes is neither 128 or 160!");
    } 
    return arrayOfByte2;
  }
  
  public void decompressPoly(byte[] paramArrayOfbyte) {
    byte b = 0;
    if (this.engine.getKyberPolyCompressedBytes() == 128) {
      for (byte b1 = 0; b1 < ''; b1++) {
        setCoeffIndex(2 * b1 + 0, (short)((short)(paramArrayOfbyte[b] & 0xFF & 0xF) * 3329 + 8 >> 4));
        setCoeffIndex(2 * b1 + 1, (short)((short)((paramArrayOfbyte[b] & 0xFF) >> 4) * 3329 + 8 >> 4));
        b++;
      } 
    } else if (this.engine.getKyberPolyCompressedBytes() == 160) {
      byte[] arrayOfByte = new byte[8];
      for (byte b1 = 0; b1 < 32; b1++) {
        arrayOfByte[0] = (byte)((paramArrayOfbyte[b + 0] & 0xFF) >> 0);
        arrayOfByte[1] = (byte)((paramArrayOfbyte[b + 0] & 0xFF) >> 5 | (paramArrayOfbyte[b + 1] & 0xFF) << 3);
        arrayOfByte[2] = (byte)((paramArrayOfbyte[b + 1] & 0xFF) >> 2);
        arrayOfByte[3] = (byte)((paramArrayOfbyte[b + 1] & 0xFF) >> 7 | (paramArrayOfbyte[b + 2] & 0xFF) << 1);
        arrayOfByte[4] = (byte)((paramArrayOfbyte[b + 2] & 0xFF) >> 4 | (paramArrayOfbyte[b + 3] & 0xFF) << 4);
        arrayOfByte[5] = (byte)((paramArrayOfbyte[b + 3] & 0xFF) >> 1);
        arrayOfByte[6] = (byte)((paramArrayOfbyte[b + 3] & 0xFF) >> 6 | (paramArrayOfbyte[b + 4] & 0xFF) << 2);
        arrayOfByte[7] = (byte)((paramArrayOfbyte[b + 4] & 0xFF) >> 3);
        b += 5;
        for (byte b2 = 0; b2 < 8; b2++)
          setCoeffIndex(8 * b1 + b2, (short)((arrayOfByte[b2] & 0x1F) * 3329 + 16 >> 5)); 
      } 
    } else {
      throw new RuntimeException("PolyCompressedBytes is neither 128 or 160!");
    } 
  }
  
  public byte[] toBytes() {
    byte[] arrayOfByte = new byte[384];
    conditionalSubQ();
    for (byte b = 0; b < ''; b++) {
      short s1 = getCoeffIndex(2 * b);
      short s2 = getCoeffIndex(2 * b + 1);
      arrayOfByte[3 * b] = (byte)(s1 >> 0);
      arrayOfByte[3 * b + 1] = (byte)(s1 >> 8 | s2 << 4);
      arrayOfByte[3 * b + 2] = (byte)(s2 >> 4);
    } 
    return arrayOfByte;
  }
  
  public void fromBytes(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < ''; b++) {
      setCoeffIndex(2 * b, (short)(((paramArrayOfbyte[3 * b + 0] & 0xFF) >> 0 | (paramArrayOfbyte[3 * b + 1] & 0xFF) << 8) & 0xFFF));
      setCoeffIndex(2 * b + 1, (short)(int)((((paramArrayOfbyte[3 * b + 1] & 0xFF) >> 4) | ((paramArrayOfbyte[3 * b + 2] & 0xFF) << 4)) & 0xFFFL));
    } 
  }
  
  public byte[] toMsg() {
    byte[] arrayOfByte = new byte[KyberEngine.getKyberIndCpaMsgBytes()];
    conditionalSubQ();
    for (byte b = 0; b < 32; b++) {
      arrayOfByte[b] = 0;
      for (byte b1 = 0; b1 < 8; b1++) {
        int i = getCoeffIndex(8 * b + b1) & 0xFFFF;
        i <<= 1;
        i += 1665;
        i *= 80635;
        i >>= 28;
        i &= 0x1;
        arrayOfByte[b] = (byte)(arrayOfByte[b] | (byte)(i << b1));
      } 
    } 
    return arrayOfByte;
  }
  
  public void fromMsg(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != 32)
      throw new RuntimeException("KYBER_INDCPA_MSGBYTES must be equal to KYBER_N/8 bytes!"); 
    for (byte b = 0; b < 32; b++) {
      for (byte b1 = 0; b1 < 8; b1++) {
        short s = (short)(-1 * (short)((paramArrayOfbyte[b] & 0xFF) >> b1 & 0x1));
        setCoeffIndex(8 * b + b1, (short)(s & 0x681));
      } 
    } 
  }
  
  public void conditionalSubQ() {
    for (byte b = 0; b < 'Ā'; b++)
      setCoeffIndex(b, Reduce.conditionalSubQ(getCoeffIndex(b))); 
  }
  
  public void getEta1Noise(byte[] paramArrayOfbyte, byte paramByte) {
    byte[] arrayOfByte = new byte[256 * this.eta1 / 4];
    this.symmetric.prf(arrayOfByte, paramArrayOfbyte, paramByte);
    CBD.kyberCBD(this, arrayOfByte, this.eta1);
  }
  
  public void getEta2Noise(byte[] paramArrayOfbyte, byte paramByte) {
    byte[] arrayOfByte = new byte[256 * this.eta2 / 4];
    this.symmetric.prf(arrayOfByte, paramArrayOfbyte, paramByte);
    CBD.kyberCBD(this, arrayOfByte, this.eta2);
  }
  
  public void polySubtract(Poly paramPoly) {
    for (byte b = 0; b < 'Ā'; b++)
      setCoeffIndex(b, (short)(paramPoly.getCoeffIndex(b) - getCoeffIndex(b))); 
  }
  
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("[");
    for (byte b = 0; b < this.coeffs.length; b++) {
      stringBuffer.append(this.coeffs[b]);
      if (b != this.coeffs.length - 1)
        stringBuffer.append(", "); 
    } 
    stringBuffer.append("]");
    return stringBuffer.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\kyber\Poly.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */