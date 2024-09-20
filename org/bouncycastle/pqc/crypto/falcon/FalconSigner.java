package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;

public class FalconSigner implements MessageSigner {
  private byte[] encodedkey;
  
  private FalconNIST nist;
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    if (paramBoolean) {
      if (paramCipherParameters instanceof ParametersWithRandom) {
        FalconPrivateKeyParameters falconPrivateKeyParameters = (FalconPrivateKeyParameters)((ParametersWithRandom)paramCipherParameters).getParameters();
        this.encodedkey = falconPrivateKeyParameters.getEncoded();
        this.nist = new FalconNIST(falconPrivateKeyParameters.getParameters().getLogN(), falconPrivateKeyParameters.getParameters().getNonceLength(), ((ParametersWithRandom)paramCipherParameters).getRandom());
      } else {
        FalconPrivateKeyParameters falconPrivateKeyParameters = (FalconPrivateKeyParameters)paramCipherParameters;
        this.encodedkey = ((FalconPrivateKeyParameters)paramCipherParameters).getEncoded();
        this.nist = new FalconNIST(falconPrivateKeyParameters.getParameters().getLogN(), falconPrivateKeyParameters.getParameters().getNonceLength(), CryptoServicesRegistrar.getSecureRandom());
      } 
    } else {
      FalconPublicKeyParameters falconPublicKeyParameters = (FalconPublicKeyParameters)paramCipherParameters;
      this.encodedkey = falconPublicKeyParameters.getH();
      this.nist = new FalconNIST(falconPublicKeyParameters.getParameters().getLogN(), falconPublicKeyParameters.getParameters().getNonceLength(), CryptoServicesRegistrar.getSecureRandom());
    } 
  }
  
  public byte[] generateSignature(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[this.nist.CRYPTO_BYTES];
    return this.nist.crypto_sign(false, arrayOfByte, paramArrayOfbyte, 0, paramArrayOfbyte.length, this.encodedkey, 0);
  }
  
  public boolean verifySignature(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte2[0] != (byte)(48 + this.nist.LOGN))
      return false; 
    byte[] arrayOfByte1 = new byte[this.nist.NONCELEN];
    byte[] arrayOfByte2 = new byte[paramArrayOfbyte2.length - this.nist.NONCELEN - 1];
    System.arraycopy(paramArrayOfbyte2, 1, arrayOfByte1, 0, this.nist.NONCELEN);
    System.arraycopy(paramArrayOfbyte2, this.nist.NONCELEN + 1, arrayOfByte2, 0, paramArrayOfbyte2.length - this.nist.NONCELEN - 1);
    return (this.nist.crypto_sign_open(false, arrayOfByte2, arrayOfByte1, paramArrayOfbyte1, this.encodedkey, 0) == 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\falcon\FalconSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */