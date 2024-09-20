package org.bouncycastle.pqc.crypto.saber;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;

public class SABERKEMGenerator implements EncapsulatedSecretGenerator {
  private final SecureRandom sr;
  
  public SABERKEMGenerator(SecureRandom paramSecureRandom) {
    this.sr = paramSecureRandom;
  }
  
  public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    SABERPublicKeyParameters sABERPublicKeyParameters = (SABERPublicKeyParameters)paramAsymmetricKeyParameter;
    SABEREngine sABEREngine = sABERPublicKeyParameters.getParameters().getEngine();
    byte[] arrayOfByte1 = new byte[sABEREngine.getCipherTextSize()];
    byte[] arrayOfByte2 = new byte[sABEREngine.getSessionKeySize()];
    sABEREngine.crypto_kem_enc(arrayOfByte1, arrayOfByte2, sABERPublicKeyParameters.getPublicKey(), this.sr);
    return (SecretWithEncapsulation)new SecretWithEncapsulationImpl(arrayOfByte2, arrayOfByte1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\saber\SABERKEMGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */