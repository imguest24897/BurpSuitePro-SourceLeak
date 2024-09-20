package META-INF.versions.9.org.bouncycastle.pqc.crypto.saber;

import org.bouncycastle.pqc.crypto.saber.SABEREngine;

class Utils {
  private final int SABER_N;
  
  private final int SABER_L;
  
  private final int SABER_ET;
  
  private final int SABER_POLYBYTES;
  
  private final int SABER_EP;
  
  private final int SABER_KEYBYTES;
  
  private final boolean usingEffectiveMasking;
  
  public Utils(SABEREngine paramSABEREngine) {
    this.SABER_N = paramSABEREngine.getSABER_N();
    this.SABER_L = paramSABEREngine.getSABER_L();
    this.SABER_ET = paramSABEREngine.getSABER_ET();
    this.SABER_POLYBYTES = paramSABEREngine.getSABER_POLYBYTES();
    this.SABER_EP = paramSABEREngine.getSABER_EP();
    this.SABER_KEYBYTES = paramSABEREngine.getSABER_KEYBYTES();
    this.usingEffectiveMasking = paramSABEREngine.usingEffectiveMasking;
  }
  
  public void POLT2BS(byte[] paramArrayOfbyte, int paramInt, short[] paramArrayOfshort) {
    if (this.SABER_ET == 3) {
      short s;
      for (s = 0; s < this.SABER_N / 8; s = (short)(s + 1)) {
        short s1 = (short)(3 * s);
        short s2 = (short)(8 * s);
        paramArrayOfbyte[paramInt + s1 + 0] = (byte)(paramArrayOfshort[s2 + 0] & 0x7 | (paramArrayOfshort[s2 + 1] & 0x7) << 3 | (paramArrayOfshort[s2 + 2] & 0x3) << 6);
        paramArrayOfbyte[paramInt + s1 + 1] = (byte)(paramArrayOfshort[s2 + 2] >> 2 & 0x1 | (paramArrayOfshort[s2 + 3] & 0x7) << 1 | (paramArrayOfshort[s2 + 4] & 0x7) << 4 | (paramArrayOfshort[s2 + 5] & 0x1) << 7);
        paramArrayOfbyte[paramInt + s1 + 2] = (byte)(paramArrayOfshort[s2 + 5] >> 1 & 0x3 | (paramArrayOfshort[s2 + 6] & 0x7) << 2 | (paramArrayOfshort[s2 + 7] & 0x7) << 5);
      } 
    } else if (this.SABER_ET == 4) {
      short s;
      for (s = 0; s < this.SABER_N / 2; s = (short)(s + 1)) {
        short s1 = s;
        short s2 = (short)(2 * s);
        paramArrayOfbyte[paramInt + s1] = (byte)(paramArrayOfshort[s2] & 0xF | (paramArrayOfshort[s2 + 1] & 0xF) << 4);
      } 
    } else if (this.SABER_ET == 6) {
      short s;
      for (s = 0; s < this.SABER_N / 4; s = (short)(s + 1)) {
        short s1 = (short)(3 * s);
        short s2 = (short)(4 * s);
        paramArrayOfbyte[paramInt + s1 + 0] = (byte)(paramArrayOfshort[s2 + 0] & 0x3F | (paramArrayOfshort[s2 + 1] & 0x3) << 6);
        paramArrayOfbyte[paramInt + s1 + 1] = (byte)(paramArrayOfshort[s2 + 1] >> 2 & 0xF | (paramArrayOfshort[s2 + 2] & 0xF) << 4);
        paramArrayOfbyte[paramInt + s1 + 2] = (byte)(paramArrayOfshort[s2 + 2] >> 4 & 0x3 | (paramArrayOfshort[s2 + 3] & 0x3F) << 2);
      } 
    } 
  }
  
  public void BS2POLT(byte[] paramArrayOfbyte, int paramInt, short[] paramArrayOfshort) {
    if (this.SABER_ET == 3) {
      short s;
      for (s = 0; s < this.SABER_N / 8; s = (short)(s + 1)) {
        short s1 = (short)(3 * s);
        short s2 = (short)(8 * s);
        paramArrayOfshort[s2 + 0] = (short)(paramArrayOfbyte[paramInt + s1 + 0] & 0x7);
        paramArrayOfshort[s2 + 1] = (short)(paramArrayOfbyte[paramInt + s1 + 0] >> 3 & 0x7);
        paramArrayOfshort[s2 + 2] = (short)(paramArrayOfbyte[paramInt + s1 + 0] >> 6 & 0x3 | (paramArrayOfbyte[paramInt + s1 + 1] & 0x1) << 2);
        paramArrayOfshort[s2 + 3] = (short)(paramArrayOfbyte[paramInt + s1 + 1] >> 1 & 0x7);
        paramArrayOfshort[s2 + 4] = (short)(paramArrayOfbyte[paramInt + s1 + 1] >> 4 & 0x7);
        paramArrayOfshort[s2 + 5] = (short)(paramArrayOfbyte[paramInt + s1 + 1] >> 7 & 0x1 | (paramArrayOfbyte[paramInt + s1 + 2] & 0x3) << 1);
        paramArrayOfshort[s2 + 6] = (short)(paramArrayOfbyte[paramInt + s1 + 2] >> 2 & 0x7);
        paramArrayOfshort[s2 + 7] = (short)(paramArrayOfbyte[paramInt + s1 + 2] >> 5 & 0x7);
      } 
    } else if (this.SABER_ET == 4) {
      short s;
      for (s = 0; s < this.SABER_N / 2; s = (short)(s + 1)) {
        short s1 = s;
        short s2 = (short)(2 * s);
        paramArrayOfshort[s2] = (short)(paramArrayOfbyte[paramInt + s1] & 0xF);
        paramArrayOfshort[s2 + 1] = (short)(paramArrayOfbyte[paramInt + s1] >> 4 & 0xF);
      } 
    } else if (this.SABER_ET == 6) {
      short s;
      for (s = 0; s < this.SABER_N / 4; s = (short)(s + 1)) {
        short s1 = (short)(3 * s);
        short s2 = (short)(4 * s);
        paramArrayOfshort[s2 + 0] = (short)(paramArrayOfbyte[paramInt + s1 + 0] & 0x3F);
        paramArrayOfshort[s2 + 1] = (short)(paramArrayOfbyte[paramInt + s1 + 0] >> 6 & 0x3 | (paramArrayOfbyte[paramInt + s1 + 1] & 0xF) << 2);
        paramArrayOfshort[s2 + 2] = (short)((paramArrayOfbyte[paramInt + s1 + 1] & 0xFF) >> 4 | (paramArrayOfbyte[paramInt + s1 + 2] & 0x3) << 4);
        paramArrayOfshort[s2 + 3] = (short)((paramArrayOfbyte[paramInt + s1 + 2] & 0xFF) >> 2);
      } 
    } 
  }
  
  private void POLq2BS(byte[] paramArrayOfbyte, int paramInt, short[] paramArrayOfshort) {
    if (!this.usingEffectiveMasking) {
      short s;
      for (s = 0; s < this.SABER_N / 8; s = (short)(s + 1)) {
        short s1 = (short)(13 * s);
        short s2 = (short)(8 * s);
        paramArrayOfbyte[paramInt + s1 + 0] = (byte)(paramArrayOfshort[s2 + 0] & 0xFF);
        paramArrayOfbyte[paramInt + s1 + 1] = (byte)(paramArrayOfshort[s2 + 0] >> 8 & 0x1F | (paramArrayOfshort[s2 + 1] & 0x7) << 5);
        paramArrayOfbyte[paramInt + s1 + 2] = (byte)(paramArrayOfshort[s2 + 1] >> 3 & 0xFF);
        paramArrayOfbyte[paramInt + s1 + 3] = (byte)(paramArrayOfshort[s2 + 1] >> 11 & 0x3 | (paramArrayOfshort[s2 + 2] & 0x3F) << 2);
        paramArrayOfbyte[paramInt + s1 + 4] = (byte)(paramArrayOfshort[s2 + 2] >> 6 & 0x7F | (paramArrayOfshort[s2 + 3] & 0x1) << 7);
        paramArrayOfbyte[paramInt + s1 + 5] = (byte)(paramArrayOfshort[s2 + 3] >> 1 & 0xFF);
        paramArrayOfbyte[paramInt + s1 + 6] = (byte)(paramArrayOfshort[s2 + 3] >> 9 & 0xF | (paramArrayOfshort[s2 + 4] & 0xF) << 4);
        paramArrayOfbyte[paramInt + s1 + 7] = (byte)(paramArrayOfshort[s2 + 4] >> 4 & 0xFF);
        paramArrayOfbyte[paramInt + s1 + 8] = (byte)(paramArrayOfshort[s2 + 4] >> 12 & 0x1 | (paramArrayOfshort[s2 + 5] & 0x7F) << 1);
        paramArrayOfbyte[paramInt + s1 + 9] = (byte)(paramArrayOfshort[s2 + 5] >> 7 & 0x3F | (paramArrayOfshort[s2 + 6] & 0x3) << 6);
        paramArrayOfbyte[paramInt + s1 + 10] = (byte)(paramArrayOfshort[s2 + 6] >> 2 & 0xFF);
        paramArrayOfbyte[paramInt + s1 + 11] = (byte)(paramArrayOfshort[s2 + 6] >> 10 & 0x7 | (paramArrayOfshort[s2 + 7] & 0x1F) << 3);
        paramArrayOfbyte[paramInt + s1 + 12] = (byte)(paramArrayOfshort[s2 + 7] >> 5 & 0xFF);
      } 
    } else {
      short s;
      for (s = 0; s < this.SABER_N / 2; s = (short)(s + 1)) {
        short s1 = (short)(3 * s);
        short s2 = (short)(2 * s);
        paramArrayOfbyte[paramInt + s1 + 0] = (byte)(paramArrayOfshort[s2 + 0] & 0xFF);
        paramArrayOfbyte[paramInt + s1 + 1] = (byte)(paramArrayOfshort[s2 + 0] >> 8 & 0xF | (paramArrayOfshort[s2 + 1] & 0xF) << 4);
        paramArrayOfbyte[paramInt + s1 + 2] = (byte)(paramArrayOfshort[s2 + 1] >> 4 & 0xFF);
      } 
    } 
  }
  
  private void BS2POLq(byte[] paramArrayOfbyte, int paramInt, short[] paramArrayOfshort) {
    if (!this.usingEffectiveMasking) {
      short s;
      for (s = 0; s < this.SABER_N / 8; s = (short)(s + 1)) {
        short s1 = (short)(13 * s);
        short s2 = (short)(8 * s);
        paramArrayOfshort[s2 + 0] = (short)(paramArrayOfbyte[paramInt + s1 + 0] & 0xFF | (paramArrayOfbyte[paramInt + s1 + 1] & 0x1F) << 8);
        paramArrayOfshort[s2 + 1] = (short)(paramArrayOfbyte[paramInt + s1 + 1] >> 5 & 0x7 | (paramArrayOfbyte[paramInt + s1 + 2] & 0xFF) << 3 | (paramArrayOfbyte[paramInt + s1 + 3] & 0x3) << 11);
        paramArrayOfshort[s2 + 2] = (short)(paramArrayOfbyte[paramInt + s1 + 3] >> 2 & 0x3F | (paramArrayOfbyte[paramInt + s1 + 4] & Byte.MAX_VALUE) << 6);
        paramArrayOfshort[s2 + 3] = (short)(paramArrayOfbyte[paramInt + s1 + 4] >> 7 & 0x1 | (paramArrayOfbyte[paramInt + s1 + 5] & 0xFF) << 1 | (paramArrayOfbyte[paramInt + s1 + 6] & 0xF) << 9);
        paramArrayOfshort[s2 + 4] = (short)(paramArrayOfbyte[paramInt + s1 + 6] >> 4 & 0xF | (paramArrayOfbyte[paramInt + s1 + 7] & 0xFF) << 4 | (paramArrayOfbyte[paramInt + s1 + 8] & 0x1) << 12);
        paramArrayOfshort[s2 + 5] = (short)(paramArrayOfbyte[paramInt + s1 + 8] >> 1 & 0x7F | (paramArrayOfbyte[paramInt + s1 + 9] & 0x3F) << 7);
        paramArrayOfshort[s2 + 6] = (short)(paramArrayOfbyte[paramInt + s1 + 9] >> 6 & 0x3 | (paramArrayOfbyte[paramInt + s1 + 10] & 0xFF) << 2 | (paramArrayOfbyte[paramInt + s1 + 11] & 0x7) << 10);
        paramArrayOfshort[s2 + 7] = (short)(paramArrayOfbyte[paramInt + s1 + 11] >> 3 & 0x1F | (paramArrayOfbyte[paramInt + s1 + 12] & 0xFF) << 5);
      } 
    } else {
      short s;
      for (s = 0; s < this.SABER_N / 2; s = (short)(s + 1)) {
        short s1 = (short)(3 * s);
        short s2 = (short)(2 * s);
        paramArrayOfshort[s2 + 0] = (short)(paramArrayOfbyte[paramInt + s1 + 0] & 0xFF | (paramArrayOfbyte[paramInt + s1 + 1] & 0xF) << 8);
        paramArrayOfshort[s2 + 1] = (short)(paramArrayOfbyte[paramInt + s1 + 1] >> 4 & 0xF | (paramArrayOfbyte[paramInt + s1 + 2] & 0xFF) << 4);
      } 
    } 
  }
  
  private void POLp2BS(byte[] paramArrayOfbyte, int paramInt, short[] paramArrayOfshort) {
    short s;
    for (s = 0; s < this.SABER_N / 4; s = (short)(s + 1)) {
      short s1 = (short)(5 * s);
      short s2 = (short)(4 * s);
      paramArrayOfbyte[paramInt + s1 + 0] = (byte)(paramArrayOfshort[s2 + 0] & 0xFF);
      paramArrayOfbyte[paramInt + s1 + 1] = (byte)(paramArrayOfshort[s2 + 0] >> 8 & 0x3 | (paramArrayOfshort[s2 + 1] & 0x3F) << 2);
      paramArrayOfbyte[paramInt + s1 + 2] = (byte)(paramArrayOfshort[s2 + 1] >> 6 & 0xF | (paramArrayOfshort[s2 + 2] & 0xF) << 4);
      paramArrayOfbyte[paramInt + s1 + 3] = (byte)(paramArrayOfshort[s2 + 2] >> 4 & 0x3F | (paramArrayOfshort[s2 + 3] & 0x3) << 6);
      paramArrayOfbyte[paramInt + s1 + 4] = (byte)(paramArrayOfshort[s2 + 3] >> 2 & 0xFF);
    } 
  }
  
  public void BS2POLp(byte[] paramArrayOfbyte, int paramInt, short[] paramArrayOfshort) {
    short s;
    for (s = 0; s < this.SABER_N / 4; s = (short)(s + 1)) {
      short s1 = (short)(5 * s);
      short s2 = (short)(4 * s);
      paramArrayOfshort[s2 + 0] = (short)(paramArrayOfbyte[paramInt + s1 + 0] & 0xFF | (paramArrayOfbyte[paramInt + s1 + 1] & 0x3) << 8);
      paramArrayOfshort[s2 + 1] = (short)(paramArrayOfbyte[paramInt + s1 + 1] >> 2 & 0x3F | (paramArrayOfbyte[paramInt + s1 + 2] & 0xF) << 6);
      paramArrayOfshort[s2 + 2] = (short)(paramArrayOfbyte[paramInt + s1 + 2] >> 4 & 0xF | (paramArrayOfbyte[paramInt + s1 + 3] & 0x3F) << 4);
      paramArrayOfshort[s2 + 3] = (short)(paramArrayOfbyte[paramInt + s1 + 3] >> 6 & 0x3 | (paramArrayOfbyte[paramInt + s1 + 4] & 0xFF) << 2);
    } 
  }
  
  public void POLVECq2BS(byte[] paramArrayOfbyte, short[][] paramArrayOfshort) {
    for (byte b = 0; b < this.SABER_L; b = (byte)(b + 1))
      POLq2BS(paramArrayOfbyte, b * this.SABER_POLYBYTES, paramArrayOfshort[b]); 
  }
  
  public void BS2POLVECq(byte[] paramArrayOfbyte, int paramInt, short[][] paramArrayOfshort) {
    byte b;
    for (b = 0; b < this.SABER_L; b = (byte)(b + 1))
      BS2POLq(paramArrayOfbyte, paramInt + b * this.SABER_POLYBYTES, paramArrayOfshort[b]); 
  }
  
  public void POLVECp2BS(byte[] paramArrayOfbyte, short[][] paramArrayOfshort) {
    for (byte b = 0; b < this.SABER_L; b = (byte)(b + 1))
      POLp2BS(paramArrayOfbyte, b * this.SABER_EP * this.SABER_N / 8, paramArrayOfshort[b]); 
  }
  
  public void BS2POLVECp(byte[] paramArrayOfbyte, short[][] paramArrayOfshort) {
    for (byte b = 0; b < this.SABER_L; b = (byte)(b + 1))
      BS2POLp(paramArrayOfbyte, b * this.SABER_EP * this.SABER_N / 8, paramArrayOfshort[b]); 
  }
  
  public void BS2POLmsg(byte[] paramArrayOfbyte, short[] paramArrayOfshort) {
    byte b;
    for (b = 0; b < this.SABER_KEYBYTES; b = (byte)(b + 1)) {
      for (byte b1 = 0; b1 < 8; b1 = (byte)(b1 + 1))
        paramArrayOfshort[b * 8 + b1] = (short)(paramArrayOfbyte[b] >> b1 & 0x1); 
    } 
  }
  
  public void POLmsg2BS(byte[] paramArrayOfbyte, short[] paramArrayOfshort) {
    byte b;
    for (b = 0; b < this.SABER_KEYBYTES; b = (byte)(b + 1)) {
      for (byte b1 = 0; b1 < 8; b1 = (byte)(b1 + 1))
        paramArrayOfbyte[b] = (byte)(paramArrayOfbyte[b] | (paramArrayOfshort[b * 8 + b1] & 0x1) << b1); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\saber\Utils.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */