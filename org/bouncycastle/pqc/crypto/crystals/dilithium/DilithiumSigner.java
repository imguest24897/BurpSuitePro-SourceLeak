package org.bouncycastle.pqc.crypto.crystals.dilithium;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;

public class DilithiumSigner implements MessageSigner {
  private DilithiumPrivateKeyParameters privKey;
  
  private DilithiumPublicKeyParameters pubKey;
  
  private SecureRandom random;
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    if (paramBoolean) {
      if (paramCipherParameters instanceof ParametersWithRandom) {
        this.privKey = (DilithiumPrivateKeyParameters)((ParametersWithRandom)paramCipherParameters).getParameters();
        this.random = ((ParametersWithRandom)paramCipherParameters).getRandom();
      } else {
        this.privKey = (DilithiumPrivateKeyParameters)paramCipherParameters;
        this.random = null;
      } 
    } else {
      this.pubKey = (DilithiumPublicKeyParameters)paramCipherParameters;
    } 
  }
  
  public byte[] generateSignature(byte[] paramArrayOfbyte) {
    DilithiumEngine dilithiumEngine = this.privKey.getParameters().getEngine(this.random);
    return dilithiumEngine.sign(paramArrayOfbyte, paramArrayOfbyte.length, this.privKey.rho, this.privKey.k, this.privKey.tr, this.privKey.t0, this.privKey.s1, this.privKey.s2);
  }
  
  public boolean verifySignature(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    DilithiumEngine dilithiumEngine = this.pubKey.getParameters().getEngine(this.random);
    return dilithiumEngine.signOpen(paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte2.length, this.pubKey.rho, this.pubKey.t1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\dilithium\DilithiumSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */