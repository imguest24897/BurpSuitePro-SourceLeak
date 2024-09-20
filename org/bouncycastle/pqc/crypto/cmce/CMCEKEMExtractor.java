package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;

public class CMCEKEMExtractor implements EncapsulatedSecretExtractor {
  private CMCEEngine engine;
  
  private CMCEKeyParameters key;
  
  public CMCEKEMExtractor(CMCEPrivateKeyParameters paramCMCEPrivateKeyParameters) {
    this.key = paramCMCEPrivateKeyParameters;
    initCipher(this.key.getParameters());
  }
  
  private void initCipher(CMCEParameters paramCMCEParameters) {
    this.engine = paramCMCEParameters.getEngine();
    CMCEPrivateKeyParameters cMCEPrivateKeyParameters = (CMCEPrivateKeyParameters)this.key;
    if ((cMCEPrivateKeyParameters.getPrivateKey()).length < this.engine.getPrivateKeySize())
      this.key = new CMCEPrivateKeyParameters(cMCEPrivateKeyParameters.getParameters(), this.engine.decompress_private_key(cMCEPrivateKeyParameters.getPrivateKey())); 
  }
  
  public byte[] extractSecret(byte[] paramArrayOfbyte) {
    return extractSecret(paramArrayOfbyte, this.engine.getDefaultSessionKeySize());
  }
  
  public byte[] extractSecret(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt / 8];
    this.engine.kem_dec(arrayOfByte, paramArrayOfbyte, ((CMCEPrivateKeyParameters)this.key).getPrivateKey());
    return arrayOfByte;
  }
  
  public int getEncapsulationLength() {
    return this.engine.getCipherTextSize();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\cmce\CMCEKEMExtractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */