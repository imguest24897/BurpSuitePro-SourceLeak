package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

abstract class Symmetric {
  final int xofBlockBytes;
  
  abstract void hash_h(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt);
  
  abstract void hash_g(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2);
  
  abstract void xofAbsorb(byte[] paramArrayOfbyte, byte paramByte1, byte paramByte2);
  
  abstract void xofSqueezeBlocks(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  abstract void prf(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte paramByte);
  
  abstract void kdf(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2);
  
  Symmetric(int paramInt) {
    this.xofBlockBytes = paramInt;
  }
  
  @Deprecated
  static class AesSymmetric extends Symmetric {
    private final SHA256Digest sha256Digest = new SHA256Digest();
    
    private final SHA512Digest sha512Digest = new SHA512Digest();
    
    private final StreamCipher cipher = (StreamCipher)SICBlockCipher.newInstance((BlockCipher)AESEngine.newInstance());
    
    AesSymmetric() {
      super(64);
    }
    
    private void doDigest(ExtendedDigest param1ExtendedDigest, byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, int param1Int) {
      param1ExtendedDigest.update(param1ArrayOfbyte2, 0, param1ArrayOfbyte2.length);
      param1ExtendedDigest.doFinal(param1ArrayOfbyte1, param1Int);
    }
    
    private void aes128(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      byte[] arrayOfByte = new byte[param1Int2];
      this.cipher.processBytes(arrayOfByte, 0, param1Int2, param1ArrayOfbyte, param1Int1);
    }
    
    void hash_h(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, int param1Int) {
      doDigest((ExtendedDigest)this.sha256Digest, param1ArrayOfbyte1, param1ArrayOfbyte2, param1Int);
    }
    
    void hash_g(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2) {
      doDigest((ExtendedDigest)this.sha512Digest, param1ArrayOfbyte1, param1ArrayOfbyte2, 0);
    }
    
    void xofAbsorb(byte[] param1ArrayOfbyte, byte param1Byte1, byte param1Byte2) {
      byte[] arrayOfByte = new byte[12];
      arrayOfByte[0] = param1Byte1;
      arrayOfByte[1] = param1Byte2;
      ParametersWithIV parametersWithIV = new ParametersWithIV((CipherParameters)new KeyParameter(param1ArrayOfbyte, 0, 32), arrayOfByte);
      this.cipher.init(true, (CipherParameters)parametersWithIV);
    }
    
    void xofSqueezeBlocks(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      aes128(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    void prf(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, byte param1Byte) {
      byte[] arrayOfByte = new byte[12];
      arrayOfByte[0] = param1Byte;
      ParametersWithIV parametersWithIV = new ParametersWithIV((CipherParameters)new KeyParameter(param1ArrayOfbyte2, 0, 32), arrayOfByte);
      this.cipher.init(true, (CipherParameters)parametersWithIV);
      aes128(param1ArrayOfbyte1, 0, param1ArrayOfbyte1.length);
    }
    
    void kdf(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2) {
      byte[] arrayOfByte = new byte[32];
      doDigest((ExtendedDigest)this.sha256Digest, arrayOfByte, param1ArrayOfbyte2, 0);
      System.arraycopy(arrayOfByte, 0, param1ArrayOfbyte1, 0, param1ArrayOfbyte1.length);
    }
  }
  
  static class ShakeSymmetric extends Symmetric {
    private final SHAKEDigest xof = new SHAKEDigest(128);
    
    private final SHA3Digest sha3Digest512 = new SHA3Digest(512);
    
    private final SHA3Digest sha3Digest256 = new SHA3Digest(256);
    
    private final SHAKEDigest shakeDigest = new SHAKEDigest(256);
    
    ShakeSymmetric() {
      super(168);
    }
    
    void hash_h(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, int param1Int) {
      this.sha3Digest256.update(param1ArrayOfbyte2, 0, param1ArrayOfbyte2.length);
      this.sha3Digest256.doFinal(param1ArrayOfbyte1, param1Int);
    }
    
    void hash_g(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2) {
      this.sha3Digest512.update(param1ArrayOfbyte2, 0, param1ArrayOfbyte2.length);
      this.sha3Digest512.doFinal(param1ArrayOfbyte1, 0);
    }
    
    void xofAbsorb(byte[] param1ArrayOfbyte, byte param1Byte1, byte param1Byte2) {
      this.xof.reset();
      byte[] arrayOfByte = new byte[param1ArrayOfbyte.length + 2];
      System.arraycopy(param1ArrayOfbyte, 0, arrayOfByte, 0, param1ArrayOfbyte.length);
      arrayOfByte[param1ArrayOfbyte.length] = param1Byte1;
      arrayOfByte[param1ArrayOfbyte.length + 1] = param1Byte2;
      this.xof.update(arrayOfByte, 0, param1ArrayOfbyte.length + 2);
    }
    
    void xofSqueezeBlocks(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      this.xof.doOutput(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    void prf(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, byte param1Byte) {
      byte[] arrayOfByte = new byte[param1ArrayOfbyte2.length + 1];
      System.arraycopy(param1ArrayOfbyte2, 0, arrayOfByte, 0, param1ArrayOfbyte2.length);
      arrayOfByte[param1ArrayOfbyte2.length] = param1Byte;
      this.shakeDigest.update(arrayOfByte, 0, arrayOfByte.length);
      this.shakeDigest.doFinal(param1ArrayOfbyte1, 0, param1ArrayOfbyte1.length);
    }
    
    void kdf(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2) {
      this.shakeDigest.update(param1ArrayOfbyte2, 0, param1ArrayOfbyte2.length);
      this.shakeDigest.doFinal(param1ArrayOfbyte1, 0, param1ArrayOfbyte1.length);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\kyber\Symmetric.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */