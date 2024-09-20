package org.bouncycastle.pqc.crypto.crystals.kyber;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;

public class KyberKEMGenerator implements EncapsulatedSecretGenerator {
  private final SecureRandom sr;
  
  public KyberKEMGenerator(SecureRandom paramSecureRandom) {
    this.sr = paramSecureRandom;
  }
  
  public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    KyberPublicKeyParameters kyberPublicKeyParameters = (KyberPublicKeyParameters)paramAsymmetricKeyParameter;
    KyberEngine kyberEngine = kyberPublicKeyParameters.getParameters().getEngine();
    kyberEngine.init(this.sr);
    byte[][] arrayOfByte = kyberEngine.kemEncrypt(kyberPublicKeyParameters.getEncoded());
    return (SecretWithEncapsulation)new SecretWithEncapsulationImpl(arrayOfByte[0], arrayOfByte[1]);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\kyber\KyberKEMGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */