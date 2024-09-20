package org.bouncycastle.pqc.crypto.frodo;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;

public class FrodoKEMExtractor implements EncapsulatedSecretExtractor {
  private FrodoEngine engine;
  
  private FrodoKeyParameters key;
  
  public FrodoKEMExtractor(FrodoKeyParameters paramFrodoKeyParameters) {
    this.key = paramFrodoKeyParameters;
    initCipher(this.key.getParameters());
  }
  
  private void initCipher(FrodoParameters paramFrodoParameters) {
    this.engine = paramFrodoParameters.getEngine();
  }
  
  public byte[] extractSecret(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[this.engine.getSessionKeySize()];
    this.engine.kem_dec(arrayOfByte, paramArrayOfbyte, ((FrodoPrivateKeyParameters)this.key).getPrivateKey());
    return arrayOfByte;
  }
  
  public int getEncapsulationLength() {
    return this.engine.getCipherTextSize();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\frodo\FrodoKEMExtractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */