package org.bouncycastle.pqc.crypto.frodo;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

abstract class FrodoMatrixGenerator {
  int n;
  
  int q;
  
  public FrodoMatrixGenerator(int paramInt1, int paramInt2) {
    this.n = paramInt1;
    this.q = paramInt2;
  }
  
  abstract short[] genMatrix(byte[] paramArrayOfbyte);
  
  static class Aes128MatrixGenerator extends FrodoMatrixGenerator {
    public Aes128MatrixGenerator(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    short[] genMatrix(byte[] param1ArrayOfbyte) {
      short[] arrayOfShort = new short[this.n * this.n];
      byte[] arrayOfByte1 = new byte[16];
      byte[] arrayOfByte2 = new byte[16];
      AESEngine aESEngine = new AESEngine();
      aESEngine.init(true, (CipherParameters)new KeyParameter(param1ArrayOfbyte));
      for (byte b = 0; b < this.n; b++) {
        Pack.shortToLittleEndian((short)b, arrayOfByte1, 0);
        for (byte b1 = 0; b1 < this.n; b1 += 8) {
          Pack.shortToLittleEndian((short)b1, arrayOfByte1, 2);
          aESEngine.processBlock(arrayOfByte1, 0, arrayOfByte2, 0);
          for (byte b2 = 0; b2 < 8; b2++)
            arrayOfShort[b * this.n + b1 + b2] = (short)(Pack.littleEndianToShort(arrayOfByte2, 2 * b2) & this.q - 1); 
        } 
      } 
      return arrayOfShort;
    }
  }
  
  static class Shake128MatrixGenerator extends FrodoMatrixGenerator {
    public Shake128MatrixGenerator(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    short[] genMatrix(byte[] param1ArrayOfbyte) {
      short[] arrayOfShort = new short[this.n * this.n];
      byte[] arrayOfByte1 = new byte[16 * this.n / 8];
      byte[] arrayOfByte2 = new byte[2 + param1ArrayOfbyte.length];
      System.arraycopy(param1ArrayOfbyte, 0, arrayOfByte2, 2, param1ArrayOfbyte.length);
      SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
      for (short s = 0; s < this.n; s = (short)(s + 1)) {
        Pack.shortToLittleEndian(s, arrayOfByte2, 0);
        sHAKEDigest.update(arrayOfByte2, 0, arrayOfByte2.length);
        sHAKEDigest.doFinal(arrayOfByte1, 0, arrayOfByte1.length);
        short s1;
        for (s1 = 0; s1 < this.n; s1 = (short)(s1 + 1))
          arrayOfShort[s * this.n + s1] = (short)(Pack.littleEndianToShort(arrayOfByte1, 2 * s1) & this.q - 1); 
      } 
      return arrayOfShort;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\frodo\FrodoMatrixGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */