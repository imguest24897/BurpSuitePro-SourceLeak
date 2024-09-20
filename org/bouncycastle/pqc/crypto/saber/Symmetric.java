package org.bouncycastle.pqc.crypto.saber;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

abstract class Symmetric {
  abstract void hash_h(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt);
  
  abstract void hash_g(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2);
  
  abstract void prf(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2);
  
  static class AesSymmetric extends Symmetric {
    private final SHA256Digest sha256Digest = new SHA256Digest();
    
    private final SHA512Digest sha512Digest = new SHA512Digest();
    
    private final StreamCipher cipher = (StreamCipher)SICBlockCipher.newInstance((BlockCipher)AESEngine.newInstance());
    
    void hash_h(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, int param1Int) {
      this.sha256Digest.update(param1ArrayOfbyte2, 0, param1ArrayOfbyte2.length);
      this.sha256Digest.doFinal(param1ArrayOfbyte1, param1Int);
    }
    
    void hash_g(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2) {
      this.sha512Digest.update(param1ArrayOfbyte2, 0, param1ArrayOfbyte2.length);
      this.sha512Digest.doFinal(param1ArrayOfbyte1, 0);
    }
    
    void prf(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, int param1Int1, int param1Int2) {
      ParametersWithIV parametersWithIV = new ParametersWithIV((CipherParameters)new KeyParameter(param1ArrayOfbyte2, 0, param1Int1), new byte[16]);
      this.cipher.init(true, (CipherParameters)parametersWithIV);
      byte[] arrayOfByte = new byte[param1Int2];
      this.cipher.processBytes(arrayOfByte, 0, param1Int2, param1ArrayOfbyte1, 0);
    }
  }
  
  static class ShakeSymmetric extends Symmetric {
    private final SHA3Digest sha3Digest256 = new SHA3Digest(256);
    
    private final SHA3Digest sha3Digest512 = new SHA3Digest(512);
    
    private final Xof shakeDigest = (Xof)new SHAKEDigest(128);
    
    void hash_h(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, int param1Int) {
      this.sha3Digest256.update(param1ArrayOfbyte2, 0, param1ArrayOfbyte2.length);
      this.sha3Digest256.doFinal(param1ArrayOfbyte1, param1Int);
    }
    
    void hash_g(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2) {
      this.sha3Digest512.update(param1ArrayOfbyte2, 0, param1ArrayOfbyte2.length);
      this.sha3Digest512.doFinal(param1ArrayOfbyte1, 0);
    }
    
    void prf(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, int param1Int1, int param1Int2) {
      this.shakeDigest.reset();
      this.shakeDigest.update(param1ArrayOfbyte2, 0, param1Int1);
      this.shakeDigest.doFinal(param1ArrayOfbyte1, 0, param1Int2);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\saber\Symmetric.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */