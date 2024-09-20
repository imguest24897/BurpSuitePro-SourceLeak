package org.bouncycastle.pqc.crypto.hqc;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;
import org.bouncycastle.util.Arrays;

public class HQCKEMGenerator implements EncapsulatedSecretGenerator {
  private final SecureRandom sr;
  
  public HQCKEMGenerator(SecureRandom paramSecureRandom) {
    this.sr = paramSecureRandom;
  }
  
  public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    HQCPublicKeyParameters hQCPublicKeyParameters = (HQCPublicKeyParameters)paramAsymmetricKeyParameter;
    HQCEngine hQCEngine = hQCPublicKeyParameters.getParameters().getEngine();
    byte[] arrayOfByte1 = new byte[hQCPublicKeyParameters.getParameters().getSHA512_BYTES()];
    byte[] arrayOfByte2 = new byte[hQCPublicKeyParameters.getParameters().getN_BYTES()];
    byte[] arrayOfByte3 = new byte[hQCPublicKeyParameters.getParameters().getN1N2_BYTES()];
    byte[] arrayOfByte4 = new byte[hQCPublicKeyParameters.getParameters().getSHA512_BYTES()];
    byte[] arrayOfByte5 = new byte[hQCPublicKeyParameters.getParameters().getSALT_SIZE_BYTES()];
    byte[] arrayOfByte6 = hQCPublicKeyParameters.getPublicKey();
    byte[] arrayOfByte7 = new byte[48];
    this.sr.nextBytes(arrayOfByte7);
    hQCEngine.encaps(arrayOfByte2, arrayOfByte3, arrayOfByte1, arrayOfByte4, arrayOfByte6, arrayOfByte7, arrayOfByte5);
    byte[] arrayOfByte8 = Arrays.concatenate(arrayOfByte2, arrayOfByte3, arrayOfByte4, arrayOfByte5);
    return (SecretWithEncapsulation)new SecretWithEncapsulationImpl(Arrays.copyOfRange(arrayOfByte1, 0, hQCPublicKeyParameters.getParameters().getK()), arrayOfByte8);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\hqc\HQCKEMGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */