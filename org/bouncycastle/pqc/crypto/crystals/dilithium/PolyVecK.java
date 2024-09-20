package org.bouncycastle.pqc.crypto.crystals.dilithium;

class PolyVecK {
  Poly[] vec;
  
  private DilithiumEngine engine;
  
  private int mode;
  
  private int polyVecBytes;
  
  private int dilithiumK;
  
  private int dilithiumL;
  
  public PolyVecK(DilithiumEngine paramDilithiumEngine) {
    this.engine = paramDilithiumEngine;
    this.mode = paramDilithiumEngine.getDilithiumMode();
    this.dilithiumK = paramDilithiumEngine.getDilithiumK();
    this.dilithiumL = paramDilithiumEngine.getDilithiumL();
    this.vec = new Poly[this.dilithiumK];
    for (byte b = 0; b < this.dilithiumK; b++)
      this.vec[b] = new Poly(paramDilithiumEngine); 
  }
  
  public PolyVecK() throws Exception {
    throw new Exception("Requires Parameter");
  }
  
  public Poly getVectorIndex(int paramInt) {
    return this.vec[paramInt];
  }
  
  public void setVectorIndex(int paramInt, Poly paramPoly) {
    this.vec[paramInt] = paramPoly;
  }
  
  public void uniformEta(byte[] paramArrayOfbyte, short paramShort) {
    short s = paramShort;
    for (byte b = 0; b < this.dilithiumK; b++) {
      s = (short)(s + 1);
      getVectorIndex(b).uniformEta(paramArrayOfbyte, s);
    } 
  }
  
  public void reduce() {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).reduce(); 
  }
  
  public void invNttToMont() {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).invNttToMont(); 
  }
  
  public void addPolyVecK(PolyVecK paramPolyVecK) {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).addPoly(paramPolyVecK.getVectorIndex(b)); 
  }
  
  public void conditionalAddQ() {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).conditionalAddQ(); 
  }
  
  public void power2Round(PolyVecK paramPolyVecK) {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).power2Round(paramPolyVecK.getVectorIndex(b)); 
  }
  
  public void polyVecNtt() {
    for (byte b = 0; b < this.dilithiumK; b++)
      this.vec[b].polyNtt(); 
  }
  
  public void decompose(PolyVecK paramPolyVecK) {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).decompose(paramPolyVecK.getVectorIndex(b)); 
  }
  
  public byte[] packW1() {
    byte[] arrayOfByte = new byte[this.dilithiumK * this.engine.getDilithiumPolyW1PackedBytes()];
    for (byte b = 0; b < this.dilithiumK; b++)
      System.arraycopy(getVectorIndex(b).w1Pack(), 0, arrayOfByte, b * this.engine.getDilithiumPolyW1PackedBytes(), this.engine.getDilithiumPolyW1PackedBytes()); 
    return arrayOfByte;
  }
  
  public void pointwisePolyMontgomery(Poly paramPoly, PolyVecK paramPolyVecK) {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).pointwiseMontgomery(paramPoly, paramPolyVecK.getVectorIndex(b)); 
  }
  
  public void subtract(PolyVecK paramPolyVecK) {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).subtract(paramPolyVecK.getVectorIndex(b)); 
  }
  
  public boolean checkNorm(int paramInt) {
    for (byte b = 0; b < this.dilithiumK; b++) {
      if (getVectorIndex(b).checkNorm(paramInt))
        return true; 
    } 
    return false;
  }
  
  public int makeHint(PolyVecK paramPolyVecK1, PolyVecK paramPolyVecK2) {
    int i = 0;
    for (byte b = 0; b < this.dilithiumK; b++)
      i += getVectorIndex(b).polyMakeHint(paramPolyVecK1.getVectorIndex(b), paramPolyVecK2.getVectorIndex(b)); 
    return i;
  }
  
  public void useHint(PolyVecK paramPolyVecK1, PolyVecK paramPolyVecK2) {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).polyUseHint(paramPolyVecK1.getVectorIndex(b), paramPolyVecK2.getVectorIndex(b)); 
  }
  
  public void shiftLeft() {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).shiftLeft(); 
  }
  
  public String toString() {
    null = "[";
    for (byte b = 0; b < this.dilithiumK; b++) {
      null = null + b + " " + getVectorIndex(b).toString();
      if (b != this.dilithiumK - 1)
        null = null + ",\n"; 
    } 
    return null + "]";
  }
  
  public String toString(String paramString) {
    return paramString + ": " + toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\dilithium\PolyVecK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */