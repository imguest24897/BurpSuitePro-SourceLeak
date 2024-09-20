package META-INF.versions.9.org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.pqc.crypto.crystals.dilithium.Ntt;
import org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecL;
import org.bouncycastle.pqc.crypto.crystals.dilithium.Reduce;
import org.bouncycastle.pqc.crypto.crystals.dilithium.Rounding;
import org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric;

class Poly {
  private final int polyUniformNBlocks;
  
  private int[] coeffs = new int[this.dilithiumN];
  
  private final DilithiumEngine engine;
  
  private final int dilithiumN = 256;
  
  private final Symmetric symmetric;
  
  public Poly(DilithiumEngine paramDilithiumEngine) {
    this.engine = paramDilithiumEngine;
    this.symmetric = paramDilithiumEngine.GetSymmetric();
    this.polyUniformNBlocks = (768 + this.symmetric.stream128BlockBytes - 1) / this.symmetric.stream128BlockBytes;
  }
  
  public int getCoeffIndex(int paramInt) {
    return this.coeffs[paramInt];
  }
  
  public int[] getCoeffs() {
    return this.coeffs;
  }
  
  public void setCoeffIndex(int paramInt1, int paramInt2) {
    this.coeffs[paramInt1] = paramInt2;
  }
  
  public void setCoeffs(int[] paramArrayOfint) {
    this.coeffs = paramArrayOfint;
  }
  
  public void uniformBlocks(byte[] paramArrayOfbyte, short paramShort) {
    int j = this.polyUniformNBlocks * this.symmetric.stream128BlockBytes;
    byte[] arrayOfByte = new byte[j + 2];
    this.symmetric.stream128init(paramArrayOfbyte, paramShort);
    this.symmetric.stream128squeezeBlocks(arrayOfByte, 0, j);
    int i;
    for (i = rejectUniform(this, 0, this.dilithiumN, arrayOfByte, j); i < this.dilithiumN; i += rejectUniform(this, i, this.dilithiumN - i, arrayOfByte, j)) {
      int k = j % 3;
      for (byte b = 0; b < k; b++)
        arrayOfByte[b] = arrayOfByte[j - k + b]; 
      this.symmetric.stream128squeezeBlocks(arrayOfByte, k, this.symmetric.stream128BlockBytes);
      j = this.symmetric.stream128BlockBytes + k;
    } 
  }
  
  private static int rejectUniform(org.bouncycastle.pqc.crypto.crystals.dilithium.Poly paramPoly, int paramInt1, int paramInt2, byte[] paramArrayOfbyte, int paramInt3) {
    byte b2 = 0;
    byte b1 = b2;
    while (b1 < paramInt2 && b2 + 3 <= paramInt3) {
      int i = paramArrayOfbyte[b2++] & 0xFF;
      i |= (paramArrayOfbyte[b2++] & 0xFF) << 8;
      i |= (paramArrayOfbyte[b2++] & 0xFF) << 16;
      i &= 0x7FFFFF;
      if (i < 8380417) {
        paramPoly.setCoeffIndex(paramInt1 + b1, i);
        b1++;
      } 
    } 
    return b1;
  }
  
  public void uniformEta(byte[] paramArrayOfbyte, short paramShort) {
    int j;
    int k = this.engine.getDilithiumEta();
    if (this.engine.getDilithiumEta() == 2) {
      j = (136 + this.symmetric.stream256BlockBytes - 1) / this.symmetric.stream256BlockBytes;
    } else if (this.engine.getDilithiumEta() == 4) {
      j = (227 + this.symmetric.stream256BlockBytes - 1) / this.symmetric.stream256BlockBytes;
    } else {
      throw new RuntimeException("Wrong Dilithium Eta!");
    } 
    int m = j * this.symmetric.stream256BlockBytes;
    byte[] arrayOfByte = new byte[m];
    this.symmetric.stream256init(paramArrayOfbyte, paramShort);
    this.symmetric.stream256squeezeBlocks(arrayOfByte, 0, m);
    for (int i = rejectEta(this, 0, this.dilithiumN, arrayOfByte, m, k); i < 256; i += rejectEta(this, i, this.dilithiumN - i, arrayOfByte, this.symmetric.stream256BlockBytes, k))
      this.symmetric.stream256squeezeBlocks(arrayOfByte, 0, this.symmetric.stream256BlockBytes); 
  }
  
  private static int rejectEta(org.bouncycastle.pqc.crypto.crystals.dilithium.Poly paramPoly, int paramInt1, int paramInt2, byte[] paramArrayOfbyte, int paramInt3, int paramInt4) {
    byte b2 = 0;
    byte b1 = b2;
    while (b1 < paramInt2 && b2 < paramInt3) {
      int i = paramArrayOfbyte[b2] & 0xFF & 0xF;
      int j = (paramArrayOfbyte[b2++] & 0xFF) >> 4;
      if (paramInt4 == 2) {
        if (i < 15) {
          i -= (205 * i >> 10) * 5;
          paramPoly.setCoeffIndex(paramInt1 + b1, 2 - i);
          b1++;
        } 
        if (j < 15 && b1 < paramInt2) {
          j -= (205 * j >> 10) * 5;
          paramPoly.setCoeffIndex(paramInt1 + b1, 2 - j);
          b1++;
        } 
        continue;
      } 
      if (paramInt4 == 4) {
        if (i < 9) {
          paramPoly.setCoeffIndex(paramInt1 + b1, 4 - i);
          b1++;
        } 
        if (j < 9 && b1 < paramInt2) {
          paramPoly.setCoeffIndex(paramInt1 + b1, 4 - j);
          b1++;
        } 
      } 
    } 
    return b1;
  }
  
  public void polyNtt() {
    setCoeffs(Ntt.ntt(this.coeffs));
  }
  
  public void pointwiseMontgomery(org.bouncycastle.pqc.crypto.crystals.dilithium.Poly paramPoly1, org.bouncycastle.pqc.crypto.crystals.dilithium.Poly paramPoly2) {
    for (byte b = 0; b < this.dilithiumN; b++)
      setCoeffIndex(b, Reduce.montgomeryReduce(paramPoly1.getCoeffIndex(b) * paramPoly2.getCoeffIndex(b))); 
  }
  
  public void pointwiseAccountMontgomery(PolyVecL paramPolyVecL1, PolyVecL paramPolyVecL2) {
    org.bouncycastle.pqc.crypto.crystals.dilithium.Poly poly = new org.bouncycastle.pqc.crypto.crystals.dilithium.Poly(this.engine);
    pointwiseMontgomery(paramPolyVecL1.getVectorIndex(0), paramPolyVecL2.getVectorIndex(0));
    for (byte b = 1; b < this.engine.getDilithiumL(); b++) {
      poly.pointwiseMontgomery(paramPolyVecL1.getVectorIndex(b), paramPolyVecL2.getVectorIndex(b));
      addPoly(poly);
    } 
  }
  
  public void addPoly(org.bouncycastle.pqc.crypto.crystals.dilithium.Poly paramPoly) {
    for (byte b = 0; b < this.dilithiumN; b++)
      setCoeffIndex(b, getCoeffIndex(b) + paramPoly.getCoeffIndex(b)); 
  }
  
  public void reduce() {
    for (byte b = 0; b < this.dilithiumN; b++)
      setCoeffIndex(b, Reduce.reduce32(getCoeffIndex(b))); 
  }
  
  public void invNttToMont() {
    setCoeffs(Ntt.invNttToMont(getCoeffs()));
  }
  
  public void conditionalAddQ() {
    for (byte b = 0; b < this.dilithiumN; b++)
      setCoeffIndex(b, Reduce.conditionalAddQ(getCoeffIndex(b))); 
  }
  
  public void power2Round(org.bouncycastle.pqc.crypto.crystals.dilithium.Poly paramPoly) {
    for (byte b = 0; b < this.dilithiumN; b++) {
      int[] arrayOfInt = Rounding.power2Round(getCoeffIndex(b));
      setCoeffIndex(b, arrayOfInt[0]);
      paramPoly.setCoeffIndex(b, arrayOfInt[1]);
    } 
  }
  
  public byte[] polyt1Pack() {
    byte[] arrayOfByte = new byte[320];
    for (byte b = 0; b < this.dilithiumN / 4; b++) {
      arrayOfByte[5 * b + 0] = (byte)(this.coeffs[4 * b + 0] >> 0);
      arrayOfByte[5 * b + 1] = (byte)(this.coeffs[4 * b + 0] >> 8 | this.coeffs[4 * b + 1] << 2);
      arrayOfByte[5 * b + 2] = (byte)(this.coeffs[4 * b + 1] >> 6 | this.coeffs[4 * b + 2] << 4);
      arrayOfByte[5 * b + 3] = (byte)(this.coeffs[4 * b + 2] >> 4 | this.coeffs[4 * b + 3] << 6);
      arrayOfByte[5 * b + 4] = (byte)(this.coeffs[4 * b + 3] >> 2);
    } 
    return arrayOfByte;
  }
  
  public void polyt1Unpack(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < this.dilithiumN / 4; b++) {
      setCoeffIndex(4 * b + 0, ((paramArrayOfbyte[5 * b + 0] & 0xFF) >> 0 | (paramArrayOfbyte[5 * b + 1] & 0xFF) << 8) & 0x3FF);
      setCoeffIndex(4 * b + 1, ((paramArrayOfbyte[5 * b + 1] & 0xFF) >> 2 | (paramArrayOfbyte[5 * b + 2] & 0xFF) << 6) & 0x3FF);
      setCoeffIndex(4 * b + 2, ((paramArrayOfbyte[5 * b + 2] & 0xFF) >> 4 | (paramArrayOfbyte[5 * b + 3] & 0xFF) << 4) & 0x3FF);
      setCoeffIndex(4 * b + 3, ((paramArrayOfbyte[5 * b + 3] & 0xFF) >> 6 | (paramArrayOfbyte[5 * b + 4] & 0xFF) << 2) & 0x3FF);
    } 
  }
  
  public byte[] polyEtaPack(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = new byte[8];
    if (this.engine.getDilithiumEta() == 2) {
      for (byte b = 0; b < this.dilithiumN / 8; b++) {
        arrayOfByte[0] = (byte)(this.engine.getDilithiumEta() - getCoeffIndex(8 * b + 0));
        arrayOfByte[1] = (byte)(this.engine.getDilithiumEta() - getCoeffIndex(8 * b + 1));
        arrayOfByte[2] = (byte)(this.engine.getDilithiumEta() - getCoeffIndex(8 * b + 2));
        arrayOfByte[3] = (byte)(this.engine.getDilithiumEta() - getCoeffIndex(8 * b + 3));
        arrayOfByte[4] = (byte)(this.engine.getDilithiumEta() - getCoeffIndex(8 * b + 4));
        arrayOfByte[5] = (byte)(this.engine.getDilithiumEta() - getCoeffIndex(8 * b + 5));
        arrayOfByte[6] = (byte)(this.engine.getDilithiumEta() - getCoeffIndex(8 * b + 6));
        arrayOfByte[7] = (byte)(this.engine.getDilithiumEta() - getCoeffIndex(8 * b + 7));
        paramArrayOfbyte[paramInt + 3 * b + 0] = (byte)(arrayOfByte[0] >> 0 | arrayOfByte[1] << 3 | arrayOfByte[2] << 6);
        paramArrayOfbyte[paramInt + 3 * b + 1] = (byte)(arrayOfByte[2] >> 2 | arrayOfByte[3] << 1 | arrayOfByte[4] << 4 | arrayOfByte[5] << 7);
        paramArrayOfbyte[paramInt + 3 * b + 2] = (byte)(arrayOfByte[5] >> 1 | arrayOfByte[6] << 2 | arrayOfByte[7] << 5);
      } 
    } else if (this.engine.getDilithiumEta() == 4) {
      for (byte b = 0; b < this.dilithiumN / 2; b++) {
        arrayOfByte[0] = (byte)(this.engine.getDilithiumEta() - getCoeffIndex(2 * b + 0));
        arrayOfByte[1] = (byte)(this.engine.getDilithiumEta() - getCoeffIndex(2 * b + 1));
        paramArrayOfbyte[paramInt + b] = (byte)(arrayOfByte[0] | arrayOfByte[1] << 4);
      } 
    } else {
      throw new RuntimeException("Eta needs to be 2 or 4!");
    } 
    return paramArrayOfbyte;
  }
  
  public void polyEtaUnpack(byte[] paramArrayOfbyte, int paramInt) {
    int i = this.engine.getDilithiumEta();
    if (this.engine.getDilithiumEta() == 2) {
      for (byte b = 0; b < this.dilithiumN / 8; b++) {
        int j = paramInt + 3 * b;
        setCoeffIndex(8 * b + 0, (paramArrayOfbyte[j + 0] & 0xFF) >> 0 & 0x7);
        setCoeffIndex(8 * b + 1, (paramArrayOfbyte[j + 0] & 0xFF) >> 3 & 0x7);
        setCoeffIndex(8 * b + 2, (paramArrayOfbyte[j + 0] & 0xFF) >> 6 | (paramArrayOfbyte[j + 1] & 0xFF) << 2 & 0x7);
        setCoeffIndex(8 * b + 3, (paramArrayOfbyte[j + 1] & 0xFF) >> 1 & 0x7);
        setCoeffIndex(8 * b + 4, (paramArrayOfbyte[j + 1] & 0xFF) >> 4 & 0x7);
        setCoeffIndex(8 * b + 5, (paramArrayOfbyte[j + 1] & 0xFF) >> 7 | (paramArrayOfbyte[j + 2] & 0xFF) << 1 & 0x7);
        setCoeffIndex(8 * b + 6, (paramArrayOfbyte[j + 2] & 0xFF) >> 2 & 0x7);
        setCoeffIndex(8 * b + 7, (paramArrayOfbyte[j + 2] & 0xFF) >> 5 & 0x7);
        setCoeffIndex(8 * b + 0, i - getCoeffIndex(8 * b + 0));
        setCoeffIndex(8 * b + 1, i - getCoeffIndex(8 * b + 1));
        setCoeffIndex(8 * b + 2, i - getCoeffIndex(8 * b + 2));
        setCoeffIndex(8 * b + 3, i - getCoeffIndex(8 * b + 3));
        setCoeffIndex(8 * b + 4, i - getCoeffIndex(8 * b + 4));
        setCoeffIndex(8 * b + 5, i - getCoeffIndex(8 * b + 5));
        setCoeffIndex(8 * b + 6, i - getCoeffIndex(8 * b + 6));
        setCoeffIndex(8 * b + 7, i - getCoeffIndex(8 * b + 7));
      } 
    } else if (this.engine.getDilithiumEta() == 4) {
      for (byte b = 0; b < this.dilithiumN / 2; b++) {
        setCoeffIndex(2 * b + 0, paramArrayOfbyte[paramInt + b] & 0xF);
        setCoeffIndex(2 * b + 1, (paramArrayOfbyte[paramInt + b] & 0xFF) >> 4);
        setCoeffIndex(2 * b + 0, i - getCoeffIndex(2 * b + 0));
        setCoeffIndex(2 * b + 1, i - getCoeffIndex(2 * b + 1));
      } 
    } 
  }
  
  public byte[] polyt0Pack(byte[] paramArrayOfbyte, int paramInt) {
    int[] arrayOfInt = new int[8];
    for (byte b = 0; b < this.dilithiumN / 8; b++) {
      arrayOfInt[0] = 4096 - getCoeffIndex(8 * b + 0);
      arrayOfInt[1] = 4096 - getCoeffIndex(8 * b + 1);
      arrayOfInt[2] = 4096 - getCoeffIndex(8 * b + 2);
      arrayOfInt[3] = 4096 - getCoeffIndex(8 * b + 3);
      arrayOfInt[4] = 4096 - getCoeffIndex(8 * b + 4);
      arrayOfInt[5] = 4096 - getCoeffIndex(8 * b + 5);
      arrayOfInt[6] = 4096 - getCoeffIndex(8 * b + 6);
      arrayOfInt[7] = 4096 - getCoeffIndex(8 * b + 7);
      int i = paramInt + 13 * b;
      paramArrayOfbyte[i + 0] = (byte)arrayOfInt[0];
      paramArrayOfbyte[i + 1] = (byte)(arrayOfInt[0] >> 8);
      paramArrayOfbyte[i + 1] = (byte)(paramArrayOfbyte[i + 1] | (byte)(arrayOfInt[1] << 5));
      paramArrayOfbyte[i + 2] = (byte)(arrayOfInt[1] >> 3);
      paramArrayOfbyte[i + 3] = (byte)(arrayOfInt[1] >> 11);
      paramArrayOfbyte[i + 3] = (byte)(paramArrayOfbyte[i + 3] | (byte)(arrayOfInt[2] << 2));
      paramArrayOfbyte[i + 4] = (byte)(arrayOfInt[2] >> 6);
      paramArrayOfbyte[i + 4] = (byte)(paramArrayOfbyte[i + 4] | (byte)(arrayOfInt[3] << 7));
      paramArrayOfbyte[i + 5] = (byte)(arrayOfInt[3] >> 1);
      paramArrayOfbyte[i + 6] = (byte)(arrayOfInt[3] >> 9);
      paramArrayOfbyte[i + 6] = (byte)(paramArrayOfbyte[i + 6] | (byte)(arrayOfInt[4] << 4));
      paramArrayOfbyte[i + 7] = (byte)(arrayOfInt[4] >> 4);
      paramArrayOfbyte[i + 8] = (byte)(arrayOfInt[4] >> 12);
      paramArrayOfbyte[i + 8] = (byte)(paramArrayOfbyte[i + 8] | (byte)(arrayOfInt[5] << 1));
      paramArrayOfbyte[i + 9] = (byte)(arrayOfInt[5] >> 7);
      paramArrayOfbyte[i + 9] = (byte)(paramArrayOfbyte[i + 9] | (byte)(arrayOfInt[6] << 6));
      paramArrayOfbyte[i + 10] = (byte)(arrayOfInt[6] >> 2);
      paramArrayOfbyte[i + 11] = (byte)(arrayOfInt[6] >> 10);
      paramArrayOfbyte[i + 11] = (byte)(paramArrayOfbyte[i + 11] | (byte)(arrayOfInt[7] << 3));
      paramArrayOfbyte[i + 12] = (byte)(arrayOfInt[7] >> 5);
    } 
    return paramArrayOfbyte;
  }
  
  public void polyt0Unpack(byte[] paramArrayOfbyte, int paramInt) {
    for (byte b = 0; b < this.dilithiumN / 8; b++) {
      int i = paramInt + 13 * b;
      setCoeffIndex(8 * b + 0, (paramArrayOfbyte[i + 0] & 0xFF | (paramArrayOfbyte[i + 1] & 0xFF) << 8) & 0x1FFF);
      setCoeffIndex(8 * b + 1, ((paramArrayOfbyte[i + 1] & 0xFF) >> 5 | (paramArrayOfbyte[i + 2] & 0xFF) << 3 | (paramArrayOfbyte[i + 3] & 0xFF) << 11) & 0x1FFF);
      setCoeffIndex(8 * b + 2, ((paramArrayOfbyte[i + 3] & 0xFF) >> 2 | (paramArrayOfbyte[i + 4] & 0xFF) << 6) & 0x1FFF);
      setCoeffIndex(8 * b + 3, ((paramArrayOfbyte[i + 4] & 0xFF) >> 7 | (paramArrayOfbyte[i + 5] & 0xFF) << 1 | (paramArrayOfbyte[i + 6] & 0xFF) << 9) & 0x1FFF);
      setCoeffIndex(8 * b + 4, ((paramArrayOfbyte[i + 6] & 0xFF) >> 4 | (paramArrayOfbyte[i + 7] & 0xFF) << 4 | (paramArrayOfbyte[i + 8] & 0xFF) << 12) & 0x1FFF);
      setCoeffIndex(8 * b + 5, ((paramArrayOfbyte[i + 8] & 0xFF) >> 1 | (paramArrayOfbyte[i + 9] & 0xFF) << 7) & 0x1FFF);
      setCoeffIndex(8 * b + 6, ((paramArrayOfbyte[i + 9] & 0xFF) >> 6 | (paramArrayOfbyte[i + 10] & 0xFF) << 2 | (paramArrayOfbyte[i + 11] & 0xFF) << 10) & 0x1FFF);
      setCoeffIndex(8 * b + 7, ((paramArrayOfbyte[i + 11] & 0xFF) >> 3 | (paramArrayOfbyte[i + 12] & 0xFF) << 5) & 0x1FFF);
      setCoeffIndex(8 * b + 0, 4096 - getCoeffIndex(8 * b + 0));
      setCoeffIndex(8 * b + 1, 4096 - getCoeffIndex(8 * b + 1));
      setCoeffIndex(8 * b + 2, 4096 - getCoeffIndex(8 * b + 2));
      setCoeffIndex(8 * b + 3, 4096 - getCoeffIndex(8 * b + 3));
      setCoeffIndex(8 * b + 4, 4096 - getCoeffIndex(8 * b + 4));
      setCoeffIndex(8 * b + 5, 4096 - getCoeffIndex(8 * b + 5));
      setCoeffIndex(8 * b + 6, 4096 - getCoeffIndex(8 * b + 6));
      setCoeffIndex(8 * b + 7, 4096 - getCoeffIndex(8 * b + 7));
    } 
  }
  
  public void uniformGamma1(byte[] paramArrayOfbyte, short paramShort) {
    byte[] arrayOfByte = new byte[this.engine.getPolyUniformGamma1NBlocks() * this.symmetric.stream256BlockBytes];
    this.symmetric.stream256init(paramArrayOfbyte, paramShort);
    this.symmetric.stream256squeezeBlocks(arrayOfByte, 0, this.engine.getPolyUniformGamma1NBlocks() * this.symmetric.stream256BlockBytes);
    unpackZ(arrayOfByte);
  }
  
  private void unpackZ(byte[] paramArrayOfbyte) {
    if (this.engine.getDilithiumGamma1() == 131072) {
      for (byte b = 0; b < this.dilithiumN / 4; b++) {
        setCoeffIndex(4 * b + 0, (paramArrayOfbyte[9 * b + 0] & 0xFF | (paramArrayOfbyte[9 * b + 1] & 0xFF) << 8 | (paramArrayOfbyte[9 * b + 2] & 0xFF) << 16) & 0x3FFFF);
        setCoeffIndex(4 * b + 1, ((paramArrayOfbyte[9 * b + 2] & 0xFF) >> 2 | (paramArrayOfbyte[9 * b + 3] & 0xFF) << 6 | (paramArrayOfbyte[9 * b + 4] & 0xFF) << 14) & 0x3FFFF);
        setCoeffIndex(4 * b + 2, ((paramArrayOfbyte[9 * b + 4] & 0xFF) >> 4 | (paramArrayOfbyte[9 * b + 5] & 0xFF) << 4 | (paramArrayOfbyte[9 * b + 6] & 0xFF) << 12) & 0x3FFFF);
        setCoeffIndex(4 * b + 3, ((paramArrayOfbyte[9 * b + 6] & 0xFF) >> 6 | (paramArrayOfbyte[9 * b + 7] & 0xFF) << 2 | (paramArrayOfbyte[9 * b + 8] & 0xFF) << 10) & 0x3FFFF);
        setCoeffIndex(4 * b + 0, this.engine.getDilithiumGamma1() - getCoeffIndex(4 * b + 0));
        setCoeffIndex(4 * b + 1, this.engine.getDilithiumGamma1() - getCoeffIndex(4 * b + 1));
        setCoeffIndex(4 * b + 2, this.engine.getDilithiumGamma1() - getCoeffIndex(4 * b + 2));
        setCoeffIndex(4 * b + 3, this.engine.getDilithiumGamma1() - getCoeffIndex(4 * b + 3));
      } 
    } else if (this.engine.getDilithiumGamma1() == 524288) {
      for (byte b = 0; b < this.dilithiumN / 2; b++) {
        setCoeffIndex(2 * b + 0, (paramArrayOfbyte[5 * b + 0] & 0xFF | (paramArrayOfbyte[5 * b + 1] & 0xFF) << 8 | (paramArrayOfbyte[5 * b + 2] & 0xFF) << 16) & 0xFFFFF);
        setCoeffIndex(2 * b + 1, ((paramArrayOfbyte[5 * b + 2] & 0xFF) >> 4 | (paramArrayOfbyte[5 * b + 3] & 0xFF) << 4 | (paramArrayOfbyte[5 * b + 4] & 0xFF) << 12) & 0xFFFFF);
        setCoeffIndex(2 * b + 0, this.engine.getDilithiumGamma1() - getCoeffIndex(2 * b + 0));
        setCoeffIndex(2 * b + 1, this.engine.getDilithiumGamma1() - getCoeffIndex(2 * b + 1));
      } 
    } else {
      throw new RuntimeException("Wrong Dilithiumn Gamma1!");
    } 
  }
  
  public void decompose(org.bouncycastle.pqc.crypto.crystals.dilithium.Poly paramPoly) {
    for (byte b = 0; b < this.dilithiumN; b++) {
      int[] arrayOfInt = Rounding.decompose(getCoeffIndex(b), this.engine.getDilithiumGamma2());
      setCoeffIndex(b, arrayOfInt[1]);
      paramPoly.setCoeffIndex(b, arrayOfInt[0]);
    } 
  }
  
  public byte[] w1Pack() {
    byte[] arrayOfByte = new byte[this.engine.getDilithiumPolyW1PackedBytes()];
    if (this.engine.getDilithiumGamma2() == 95232) {
      for (byte b = 0; b < this.dilithiumN / 4; b++) {
        arrayOfByte[3 * b + 0] = (byte)((byte)getCoeffIndex(4 * b + 0) | getCoeffIndex(4 * b + 1) << 6);
        arrayOfByte[3 * b + 1] = (byte)((byte)(getCoeffIndex(4 * b + 1) >> 2) | getCoeffIndex(4 * b + 2) << 4);
        arrayOfByte[3 * b + 2] = (byte)((byte)(getCoeffIndex(4 * b + 2) >> 4) | getCoeffIndex(4 * b + 3) << 2);
      } 
    } else if (this.engine.getDilithiumGamma2() == 261888) {
      for (byte b = 0; b < this.dilithiumN / 2; b++)
        arrayOfByte[b] = (byte)(getCoeffIndex(2 * b + 0) | getCoeffIndex(2 * b + 1) << 4); 
    } 
    return arrayOfByte;
  }
  
  public void challenge(byte[] paramArrayOfbyte) {
    int j = 0;
    byte[] arrayOfByte = new byte[this.symmetric.stream256BlockBytes];
    SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
    sHAKEDigest.update(paramArrayOfbyte, 0, 32);
    sHAKEDigest.doOutput(arrayOfByte, 0, this.symmetric.stream256BlockBytes);
    long l = 0L;
    int i;
    for (i = 0; i < 8; i++)
      l |= (arrayOfByte[i] & 0xFF) << 8 * i; 
    byte b = 8;
    for (i = 0; i < this.dilithiumN; i++)
      setCoeffIndex(i, 0); 
    i = this.dilithiumN - this.engine.getDilithiumTau();
    while (i < this.dilithiumN) {
      while (true) {
        if (b >= this.symmetric.stream256BlockBytes) {
          sHAKEDigest.doOutput(arrayOfByte, 0, this.symmetric.stream256BlockBytes);
          b = 0;
        } 
        j = arrayOfByte[b++] & 0xFF;
        if (j <= i) {
          setCoeffIndex(i, getCoeffIndex(j));
          setCoeffIndex(j, (int)(1L - 2L * (l & 0x1L)));
          l >>= 1L;
          i++;
        } 
      } 
    } 
  }
  
  public boolean checkNorm(int paramInt) {
    if (paramInt > 1047552)
      return true; 
    for (byte b = 0; b < this.dilithiumN; b++) {
      int i = getCoeffIndex(b) >> 31;
      i = getCoeffIndex(b) - (i & 2 * getCoeffIndex(b));
      if (i >= paramInt)
        return true; 
    } 
    return false;
  }
  
  public void subtract(org.bouncycastle.pqc.crypto.crystals.dilithium.Poly paramPoly) {
    for (byte b = 0; b < this.dilithiumN; b++)
      setCoeffIndex(b, getCoeffIndex(b) - paramPoly.getCoeffIndex(b)); 
  }
  
  public int polyMakeHint(org.bouncycastle.pqc.crypto.crystals.dilithium.Poly paramPoly1, org.bouncycastle.pqc.crypto.crystals.dilithium.Poly paramPoly2) {
    int i = 0;
    for (byte b = 0; b < this.dilithiumN; b++) {
      setCoeffIndex(b, Rounding.makeHint(paramPoly1.getCoeffIndex(b), paramPoly2.getCoeffIndex(b), this.engine));
      i += getCoeffIndex(b);
    } 
    return i;
  }
  
  public void polyUseHint(org.bouncycastle.pqc.crypto.crystals.dilithium.Poly paramPoly1, org.bouncycastle.pqc.crypto.crystals.dilithium.Poly paramPoly2) {
    for (byte b = 0; b < this.dilithiumN; b++)
      setCoeffIndex(b, Rounding.useHint(paramPoly1.getCoeffIndex(b), paramPoly2.getCoeffIndex(b), this.engine.getDilithiumGamma2())); 
  }
  
  public byte[] zPack() {
    byte[] arrayOfByte = new byte[this.engine.getDilithiumPolyZPackedBytes()];
    int[] arrayOfInt = new int[4];
    if (this.engine.getDilithiumGamma1() == 131072) {
      for (byte b = 0; b < this.dilithiumN / 4; b++) {
        arrayOfInt[0] = this.engine.getDilithiumGamma1() - getCoeffIndex(4 * b + 0);
        arrayOfInt[1] = this.engine.getDilithiumGamma1() - getCoeffIndex(4 * b + 1);
        arrayOfInt[2] = this.engine.getDilithiumGamma1() - getCoeffIndex(4 * b + 2);
        arrayOfInt[3] = this.engine.getDilithiumGamma1() - getCoeffIndex(4 * b + 3);
        arrayOfByte[9 * b + 0] = (byte)arrayOfInt[0];
        arrayOfByte[9 * b + 1] = (byte)(arrayOfInt[0] >> 8);
        arrayOfByte[9 * b + 2] = (byte)((byte)(arrayOfInt[0] >> 16) | arrayOfInt[1] << 2);
        arrayOfByte[9 * b + 3] = (byte)(arrayOfInt[1] >> 6);
        arrayOfByte[9 * b + 4] = (byte)((byte)(arrayOfInt[1] >> 14) | arrayOfInt[2] << 4);
        arrayOfByte[9 * b + 5] = (byte)(arrayOfInt[2] >> 4);
        arrayOfByte[9 * b + 6] = (byte)((byte)(arrayOfInt[2] >> 12) | arrayOfInt[3] << 6);
        arrayOfByte[9 * b + 7] = (byte)(arrayOfInt[3] >> 2);
        arrayOfByte[9 * b + 8] = (byte)(arrayOfInt[3] >> 10);
      } 
    } else if (this.engine.getDilithiumGamma1() == 524288) {
      for (byte b = 0; b < this.dilithiumN / 2; b++) {
        arrayOfInt[0] = this.engine.getDilithiumGamma1() - getCoeffIndex(2 * b + 0);
        arrayOfInt[1] = this.engine.getDilithiumGamma1() - getCoeffIndex(2 * b + 1);
        arrayOfByte[5 * b + 0] = (byte)arrayOfInt[0];
        arrayOfByte[5 * b + 1] = (byte)(arrayOfInt[0] >> 8);
        arrayOfByte[5 * b + 2] = (byte)((byte)(arrayOfInt[0] >> 16) | arrayOfInt[1] << 4);
        arrayOfByte[5 * b + 3] = (byte)(arrayOfInt[1] >> 4);
        arrayOfByte[5 * b + 4] = (byte)(arrayOfInt[1] >> 12);
      } 
    } else {
      throw new RuntimeException("Wrong Dilithium Gamma1!");
    } 
    return arrayOfByte;
  }
  
  void zUnpack(byte[] paramArrayOfbyte) {
    if (this.engine.getDilithiumGamma1() == 131072) {
      for (byte b = 0; b < this.dilithiumN / 4; b++) {
        setCoeffIndex(4 * b + 0, (paramArrayOfbyte[9 * b + 0] & 0xFF | (paramArrayOfbyte[9 * b + 1] & 0xFF) << 8 | (paramArrayOfbyte[9 * b + 2] & 0xFF) << 16) & 0x3FFFF);
        setCoeffIndex(4 * b + 1, ((paramArrayOfbyte[9 * b + 2] & 0xFF) >>> 2 | (paramArrayOfbyte[9 * b + 3] & 0xFF) << 6 | (paramArrayOfbyte[9 * b + 4] & 0xFF) << 14) & 0x3FFFF);
        setCoeffIndex(4 * b + 2, ((paramArrayOfbyte[9 * b + 4] & 0xFF) >>> 4 | (paramArrayOfbyte[9 * b + 5] & 0xFF) << 4 | (paramArrayOfbyte[9 * b + 6] & 0xFF) << 12) & 0x3FFFF);
        setCoeffIndex(4 * b + 3, ((paramArrayOfbyte[9 * b + 6] & 0xFF) >>> 6 | (paramArrayOfbyte[9 * b + 7] & 0xFF) << 2 | (paramArrayOfbyte[9 * b + 8] & 0xFF) << 10) & 0x3FFFF);
        setCoeffIndex(4 * b + 0, this.engine.getDilithiumGamma1() - getCoeffIndex(4 * b + 0));
        setCoeffIndex(4 * b + 1, this.engine.getDilithiumGamma1() - getCoeffIndex(4 * b + 1));
        setCoeffIndex(4 * b + 2, this.engine.getDilithiumGamma1() - getCoeffIndex(4 * b + 2));
        setCoeffIndex(4 * b + 3, this.engine.getDilithiumGamma1() - getCoeffIndex(4 * b + 3));
      } 
    } else if (this.engine.getDilithiumGamma1() == 524288) {
      for (byte b = 0; b < this.dilithiumN / 2; b++) {
        setCoeffIndex(2 * b + 0, (paramArrayOfbyte[5 * b + 0] & 0xFF | (paramArrayOfbyte[5 * b + 1] & 0xFF) << 8 | (paramArrayOfbyte[5 * b + 2] & 0xFF) << 16) & 0xFFFFF);
        setCoeffIndex(2 * b + 1, ((paramArrayOfbyte[5 * b + 2] & 0xFF) >>> 4 | (paramArrayOfbyte[5 * b + 3] & 0xFF) << 4 | (paramArrayOfbyte[5 * b + 4] & 0xFF) << 12) & 0xFFFFF);
        setCoeffIndex(2 * b + 0, this.engine.getDilithiumGamma1() - getCoeffIndex(2 * b + 0));
        setCoeffIndex(2 * b + 1, this.engine.getDilithiumGamma1() - getCoeffIndex(2 * b + 1));
      } 
    } else {
      throw new RuntimeException("Wrong Dilithium Gamma1!");
    } 
  }
  
  public void shiftLeft() {
    for (byte b = 0; b < this.dilithiumN; b++)
      setCoeffIndex(b, getCoeffIndex(b) << 13); 
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\crystals\dilithium\Poly.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */