package org.bouncycastle.pqc.crypto.saber;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;

public class SABERKEMExtractor implements EncapsulatedSecretExtractor {
  private SABEREngine engine;
  
  private SABERKeyParameters key;
  
  public SABERKEMExtractor(SABERKeyParameters paramSABERKeyParameters) {
    this.key = paramSABERKeyParameters;
    initCipher(this.key.getParameters());
  }
  
  private void initCipher(SABERParameters paramSABERParameters) {
    this.engine = paramSABERParameters.getEngine();
  }
  
  public byte[] extractSecret(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[this.engine.getSessionKeySize()];
    this.engine.crypto_kem_dec(arrayOfByte, paramArrayOfbyte, ((SABERPrivateKeyParameters)this.key).getPrivateKey());
    return arrayOfByte;
  }
  
  public int getEncapsulationLength() {
    return this.engine.getCipherTextSize();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\saber\SABERKEMExtractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */