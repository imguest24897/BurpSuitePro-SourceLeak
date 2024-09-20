package org.bouncycastle.pqc.crypto.gemss;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;

public class GeMSSSigner implements MessageSigner {
  private GeMSSPrivateKeyParameters privKey;
  
  private GeMSSPublicKeyParameters pubKey;
  
  private SecureRandom random;
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    if (paramBoolean) {
      if (paramCipherParameters instanceof ParametersWithRandom) {
        this.privKey = (GeMSSPrivateKeyParameters)((ParametersWithRandom)paramCipherParameters).getParameters();
        this.random = ((ParametersWithRandom)paramCipherParameters).getRandom();
      } else {
        this.privKey = (GeMSSPrivateKeyParameters)paramCipherParameters;
        this.random = CryptoServicesRegistrar.getSecureRandom();
      } 
    } else {
      this.pubKey = (GeMSSPublicKeyParameters)paramCipherParameters;
    } 
  }
  
  public byte[] generateSignature(byte[] paramArrayOfbyte) {
    GeMSSEngine geMSSEngine = this.privKey.getParameters().getEngine();
    int i = geMSSEngine.HFEnv + (geMSSEngine.NB_ITE - 1) * (geMSSEngine.HFEnv - geMSSEngine.HFEm) + 7 >>> 3;
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length + i];
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, i, paramArrayOfbyte.length);
    geMSSEngine.signHFE_FeistelPatarin(this.random, arrayOfByte, paramArrayOfbyte, 0, paramArrayOfbyte.length, this.privKey.sk);
    return arrayOfByte;
  }
  
  public boolean verifySignature(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    GeMSSEngine geMSSEngine = this.pubKey.getParameters().getEngine();
    int i = geMSSEngine.crypto_sign_open(this.pubKey.getPK(), paramArrayOfbyte1, paramArrayOfbyte2);
    return (i != 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\gemss\GeMSSSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */