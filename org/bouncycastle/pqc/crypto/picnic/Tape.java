package org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.util.Pack;

class Tape {
  byte[][] tapes;
  
  int pos;
  
  int nTapes;
  
  private PicnicEngine engine;
  
  public Tape(PicnicEngine paramPicnicEngine) {
    this.engine = paramPicnicEngine;
    this.tapes = new byte[paramPicnicEngine.numMPCParties][2 * paramPicnicEngine.andSizeBytes];
    this.pos = 0;
    this.nTapes = paramPicnicEngine.numMPCParties;
  }
  
  protected void setAuxBits(byte[] paramArrayOfbyte) {
    int i = this.engine.numMPCParties - 1;
    byte b1 = 0;
    int j = this.engine.stateSizeBits;
    for (byte b2 = 0; b2 < this.engine.numRounds; b2++) {
      for (byte b = 0; b < j; b++)
        Utils.setBit(this.tapes[i], j + j * 2 * b2 + b, Utils.getBit(paramArrayOfbyte, b1++)); 
    } 
  }
  
  protected void computeAuxTape(byte[] paramArrayOfbyte) {
    int[] arrayOfInt1 = new int[16];
    int[] arrayOfInt2 = new int[16];
    int[] arrayOfInt3 = new int[16];
    int[] arrayOfInt4 = new int[16];
    int[] arrayOfInt5 = new int[16];
    arrayOfInt5[this.engine.stateSizeWords - 1] = 0;
    tapesToParityBits(arrayOfInt5, this.engine.stateSizeBits);
    KMatricesWithPointer kMatricesWithPointer = this.engine.lowmcConstants.KMatrixInv(this.engine);
    this.engine.matrix_mul(arrayOfInt4, arrayOfInt5, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer());
    if (paramArrayOfbyte != null)
      Pack.intToLittleEndian(arrayOfInt4, 0, this.engine.stateSizeWords, paramArrayOfbyte, 0); 
    for (int i = this.engine.numRounds; i > 0; i--) {
      kMatricesWithPointer = this.engine.lowmcConstants.KMatrix(this.engine, i);
      this.engine.matrix_mul(arrayOfInt1, arrayOfInt4, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer());
      this.engine.xor_array(arrayOfInt2, arrayOfInt2, arrayOfInt1, 0);
      kMatricesWithPointer = this.engine.lowmcConstants.LMatrixInv(this.engine, i - 1);
      this.engine.matrix_mul(arrayOfInt3, arrayOfInt2, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer());
      if (i == 1) {
        System.arraycopy(arrayOfInt5, 0, arrayOfInt2, 0, arrayOfInt5.length);
      } else {
        this.pos = this.engine.stateSizeBits * 2 * (i - 1);
        tapesToParityBits(arrayOfInt2, this.engine.stateSizeBits);
      } 
      this.pos = this.engine.stateSizeBits * 2 * (i - 1) + this.engine.stateSizeBits;
      this.engine.aux_mpc_sbox(arrayOfInt2, arrayOfInt3, this);
    } 
    this.pos = 0;
  }
  
  private void tapesToParityBits(int[] paramArrayOfint, int paramInt) {
    for (byte b = 0; b < paramInt; b++)
      Utils.setBitInWordArray(paramArrayOfint, b, Utils.parity16(tapesToWord())); 
  }
  
  protected int tapesToWord() {
    int i = 0;
    int j = this.pos >>> 3;
    int k = this.pos & 0x7 ^ 0x7;
    int m = 1 << k;
    i |= (this.tapes[0][j] & m) << 7;
    i |= (this.tapes[1][j] & m) << 6;
    i |= (this.tapes[2][j] & m) << 5;
    i |= (this.tapes[3][j] & m) << 4;
    i |= (this.tapes[4][j] & m) << 3;
    i |= (this.tapes[5][j] & m) << 2;
    i |= (this.tapes[6][j] & m) << 1;
    i |= (this.tapes[7][j] & m) << 0;
    i |= (this.tapes[8][j] & m) << 15;
    i |= (this.tapes[9][j] & m) << 14;
    i |= (this.tapes[10][j] & m) << 13;
    i |= (this.tapes[11][j] & m) << 12;
    i |= (this.tapes[12][j] & m) << 11;
    i |= (this.tapes[13][j] & m) << 10;
    i |= (this.tapes[14][j] & m) << 9;
    i |= (this.tapes[15][j] & m) << 8;
    this.pos++;
    return i >>> k;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\picnic\Tape.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */