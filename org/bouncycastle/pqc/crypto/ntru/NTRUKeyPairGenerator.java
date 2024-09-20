package org.bouncycastle.pqc.crypto.ntru;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;

public class NTRUKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private NTRUKeyGenerationParameters params;
  
  private SecureRandom random;
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    this.params = (NTRUKeyGenerationParameters)paramKeyGenerationParameters;
    this.random = paramKeyGenerationParameters.getRandom();
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    NTRUParameterSet nTRUParameterSet = (this.params.getParameters()).parameterSet;
    byte[] arrayOfByte1 = new byte[nTRUParameterSet.sampleFgBytes()];
    this.random.nextBytes(arrayOfByte1);
    NTRUOWCPA nTRUOWCPA = new NTRUOWCPA(nTRUParameterSet);
    OWCPAKeyPair oWCPAKeyPair = nTRUOWCPA.keypair(arrayOfByte1);
    byte[] arrayOfByte2 = oWCPAKeyPair.publicKey;
    byte[] arrayOfByte3 = new byte[nTRUParameterSet.ntruSecretKeyBytes()];
    byte[] arrayOfByte4 = oWCPAKeyPair.privateKey;
    System.arraycopy(arrayOfByte4, 0, arrayOfByte3, 0, arrayOfByte4.length);
    byte[] arrayOfByte5 = new byte[nTRUParameterSet.prfKeyBytes()];
    this.random.nextBytes(arrayOfByte5);
    System.arraycopy(arrayOfByte5, 0, arrayOfByte3, nTRUParameterSet.owcpaSecretKeyBytes(), arrayOfByte5.length);
    return new AsymmetricCipherKeyPair(new NTRUPublicKeyParameters(this.params.getParameters(), arrayOfByte2), new NTRUPrivateKeyParameters(this.params.getParameters(), arrayOfByte3));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntru\NTRUKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */