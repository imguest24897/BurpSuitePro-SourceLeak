package org.bouncycastle.pqc.crypto.frodo;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;

public class FrodoKEMGenerator implements EncapsulatedSecretGenerator {
  private final SecureRandom sr;
  
  public FrodoKEMGenerator(SecureRandom paramSecureRandom) {
    this.sr = paramSecureRandom;
  }
  
  public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    FrodoPublicKeyParameters frodoPublicKeyParameters = (FrodoPublicKeyParameters)paramAsymmetricKeyParameter;
    FrodoEngine frodoEngine = frodoPublicKeyParameters.getParameters().getEngine();
    byte[] arrayOfByte1 = new byte[frodoEngine.getCipherTextSize()];
    byte[] arrayOfByte2 = new byte[frodoEngine.getSessionKeySize()];
    frodoEngine.kem_enc(arrayOfByte1, arrayOfByte2, frodoPublicKeyParameters.getPublicKey(), this.sr);
    return (SecretWithEncapsulation)new SecretWithEncapsulationImpl(arrayOfByte2, arrayOfByte1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\frodo\FrodoKEMGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */