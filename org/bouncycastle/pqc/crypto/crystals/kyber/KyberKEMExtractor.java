package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public class KyberKEMExtractor implements EncapsulatedSecretExtractor {
  private KyberEngine engine;
  
  private KyberPrivateKeyParameters key;
  
  public KyberKEMExtractor(KyberPrivateKeyParameters paramKyberPrivateKeyParameters) {
    this.key = paramKyberPrivateKeyParameters;
    initCipher(paramKyberPrivateKeyParameters);
  }
  
  private void initCipher(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    KyberPrivateKeyParameters kyberPrivateKeyParameters = (KyberPrivateKeyParameters)paramAsymmetricKeyParameter;
    this.engine = kyberPrivateKeyParameters.getParameters().getEngine();
  }
  
  public byte[] extractSecret(byte[] paramArrayOfbyte) {
    return this.engine.kemDecrypt(paramArrayOfbyte, this.key.getEncoded());
  }
  
  public int getEncapsulationLength() {
    return this.engine.getCryptoCipherTextBytes();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\kyber\KyberKEMExtractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */