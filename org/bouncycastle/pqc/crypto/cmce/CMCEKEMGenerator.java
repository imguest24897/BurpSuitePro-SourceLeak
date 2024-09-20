package org.bouncycastle.pqc.crypto.cmce;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;

public class CMCEKEMGenerator implements EncapsulatedSecretGenerator {
  private final SecureRandom sr;
  
  public CMCEKEMGenerator(SecureRandom paramSecureRandom) {
    this.sr = paramSecureRandom;
  }
  
  public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    CMCEPublicKeyParameters cMCEPublicKeyParameters = (CMCEPublicKeyParameters)paramAsymmetricKeyParameter;
    CMCEEngine cMCEEngine = cMCEPublicKeyParameters.getParameters().getEngine();
    return generateEncapsulated(paramAsymmetricKeyParameter, cMCEEngine.getDefaultSessionKeySize());
  }
  
  public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter paramAsymmetricKeyParameter, int paramInt) {
    CMCEPublicKeyParameters cMCEPublicKeyParameters = (CMCEPublicKeyParameters)paramAsymmetricKeyParameter;
    CMCEEngine cMCEEngine = cMCEPublicKeyParameters.getParameters().getEngine();
    byte[] arrayOfByte1 = new byte[cMCEEngine.getCipherTextSize()];
    byte[] arrayOfByte2 = new byte[paramInt / 8];
    cMCEEngine.kem_enc(arrayOfByte1, arrayOfByte2, cMCEPublicKeyParameters.getPublicKey(), this.sr);
    return (SecretWithEncapsulation)new SecretWithEncapsulationImpl(arrayOfByte2, arrayOfByte1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\cmce\CMCEKEMGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */