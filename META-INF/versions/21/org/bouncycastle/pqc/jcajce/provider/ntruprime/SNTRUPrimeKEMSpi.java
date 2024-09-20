package META-INF.versions.21.org.bouncycastle.pqc.jcajce.provider.ntruprime;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KEMSpi;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.pqc.jcajce.provider.ntruprime.BCSNTRUPrimePrivateKey;
import org.bouncycastle.pqc.jcajce.provider.ntruprime.BCSNTRUPrimePublicKey;
import org.bouncycastle.pqc.jcajce.provider.ntruprime.SNTRUPrimeDecapsulatorSpi;
import org.bouncycastle.pqc.jcajce.provider.ntruprime.SNTRUPrimeEncapsulatorSpi;

public class SNTRUPrimeKEMSpi implements KEMSpi {
  public KEMSpi.EncapsulatorSpi engineNewEncapsulator(PublicKey paramPublicKey, AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidAlgorithmParameterException, InvalidKeyException {
    KTSParameterSpec kTSParameterSpec;
    if (!(paramPublicKey instanceof BCSNTRUPrimePublicKey))
      throw new InvalidKeyException("unsupported key"); 
    if (paramAlgorithmParameterSpec == null)
      kTSParameterSpec = (new KTSParameterSpec.Builder("Generic", 256)).withNoKdf().build(); 
    if (!(kTSParameterSpec instanceof KTSParameterSpec))
      throw new InvalidAlgorithmParameterException("SNTRUPrime can only accept KTSParameterSpec"); 
    if (paramSecureRandom == null)
      paramSecureRandom = new SecureRandom(); 
    return (KEMSpi.EncapsulatorSpi)new SNTRUPrimeEncapsulatorSpi((BCSNTRUPrimePublicKey)paramPublicKey, kTSParameterSpec, paramSecureRandom);
  }
  
  public KEMSpi.DecapsulatorSpi engineNewDecapsulator(PrivateKey paramPrivateKey, AlgorithmParameterSpec paramAlgorithmParameterSpec) throws InvalidAlgorithmParameterException, InvalidKeyException {
    KTSParameterSpec kTSParameterSpec;
    if (!(paramPrivateKey instanceof BCSNTRUPrimePrivateKey))
      throw new InvalidKeyException("unsupported key"); 
    if (paramAlgorithmParameterSpec == null)
      kTSParameterSpec = (new KTSParameterSpec.Builder("Generic", 256)).withNoKdf().build(); 
    if (!(kTSParameterSpec instanceof KTSParameterSpec))
      throw new InvalidAlgorithmParameterException("SNTRUPrime can only accept KTSParameterSpec"); 
    return (KEMSpi.DecapsulatorSpi)new SNTRUPrimeDecapsulatorSpi((BCSNTRUPrimePrivateKey)paramPrivateKey, kTSParameterSpec);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\21\org\bouncycastle\pqc\jcajce\provider\ntruprime\SNTRUPrimeKEMSpi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */