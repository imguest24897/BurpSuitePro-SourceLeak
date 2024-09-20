package org.bouncycastle.pqc.crypto.bike;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;
import org.bouncycastle.util.Arrays;

public class BIKEKEMGenerator implements EncapsulatedSecretGenerator {
  private final SecureRandom sr;
  
  public BIKEKEMGenerator(SecureRandom paramSecureRandom) {
    this.sr = paramSecureRandom;
  }
  
  public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    BIKEPublicKeyParameters bIKEPublicKeyParameters = (BIKEPublicKeyParameters)paramAsymmetricKeyParameter;
    BIKEEngine bIKEEngine = bIKEPublicKeyParameters.getParameters().getEngine();
    byte[] arrayOfByte1 = new byte[bIKEPublicKeyParameters.getParameters().getLByte()];
    byte[] arrayOfByte2 = new byte[bIKEPublicKeyParameters.getParameters().getRByte()];
    byte[] arrayOfByte3 = new byte[bIKEPublicKeyParameters.getParameters().getLByte()];
    byte[] arrayOfByte4 = bIKEPublicKeyParameters.publicKey;
    bIKEEngine.encaps(arrayOfByte2, arrayOfByte3, arrayOfByte1, arrayOfByte4, this.sr);
    byte[] arrayOfByte5 = Arrays.concatenate(arrayOfByte2, arrayOfByte3);
    return (SecretWithEncapsulation)new SecretWithEncapsulationImpl(Arrays.copyOfRange(arrayOfByte1, 0, bIKEPublicKeyParameters.getParameters().getSessionKeySize() / 8), arrayOfByte5);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\bike\BIKEKEMGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */