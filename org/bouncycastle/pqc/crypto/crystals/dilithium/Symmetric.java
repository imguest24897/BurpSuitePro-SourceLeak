package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

abstract class Symmetric {
  final int stream128BlockBytes;
  
  final int stream256BlockBytes;
  
  Symmetric(int paramInt1, int paramInt2) {
    this.stream128BlockBytes = paramInt1;
    this.stream256BlockBytes = paramInt2;
  }
  
  abstract void stream128init(byte[] paramArrayOfbyte, short paramShort);
  
  abstract void stream256init(byte[] paramArrayOfbyte, short paramShort);
  
  abstract void stream128squeezeBlocks(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  abstract void stream256squeezeBlocks(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  @Deprecated
  static class AesSymmetric extends Symmetric {
    private final StreamCipher cipher = (StreamCipher)SICBlockCipher.newInstance((BlockCipher)AESEngine.newInstance());
    
    AesSymmetric() {
      super(64, 64);
    }
    
    private void aes128(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      byte[] arrayOfByte = new byte[param1Int2];
      this.cipher.processBytes(arrayOfByte, 0, param1Int2, param1ArrayOfbyte, param1Int1);
    }
    
    private void streamInit(byte[] param1ArrayOfbyte, short param1Short) {
      byte[] arrayOfByte = new byte[12];
      arrayOfByte[0] = (byte)param1Short;
      arrayOfByte[1] = (byte)(param1Short >> 8);
      ParametersWithIV parametersWithIV = new ParametersWithIV((CipherParameters)new KeyParameter(param1ArrayOfbyte, 0, 32), arrayOfByte);
      this.cipher.init(true, (CipherParameters)parametersWithIV);
    }
    
    void stream128init(byte[] param1ArrayOfbyte, short param1Short) {
      streamInit(param1ArrayOfbyte, param1Short);
    }
    
    void stream256init(byte[] param1ArrayOfbyte, short param1Short) {
      streamInit(param1ArrayOfbyte, param1Short);
    }
    
    void stream128squeezeBlocks(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      aes128(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    void stream256squeezeBlocks(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      aes128(param1ArrayOfbyte, param1Int1, param1Int2);
    }
  }
  
  static class ShakeSymmetric extends Symmetric {
    private final SHAKEDigest digest128 = new SHAKEDigest(128);
    
    private final SHAKEDigest digest256 = new SHAKEDigest(256);
    
    ShakeSymmetric() {
      super(168, 136);
    }
    
    private void streamInit(SHAKEDigest param1SHAKEDigest, byte[] param1ArrayOfbyte, short param1Short) {
      param1SHAKEDigest.reset();
      byte[] arrayOfByte = new byte[2];
      arrayOfByte[0] = (byte)param1Short;
      arrayOfByte[1] = (byte)(param1Short >> 8);
      param1SHAKEDigest.update(param1ArrayOfbyte, 0, param1ArrayOfbyte.length);
      param1SHAKEDigest.update(arrayOfByte, 0, arrayOfByte.length);
    }
    
    void stream128init(byte[] param1ArrayOfbyte, short param1Short) {
      streamInit(this.digest128, param1ArrayOfbyte, param1Short);
    }
    
    void stream256init(byte[] param1ArrayOfbyte, short param1Short) {
      streamInit(this.digest256, param1ArrayOfbyte, param1Short);
    }
    
    void stream128squeezeBlocks(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      this.digest128.doOutput(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    void stream256squeezeBlocks(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      this.digest256.doOutput(param1ArrayOfbyte, param1Int1, param1Int2);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\dilithium\Symmetric.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */