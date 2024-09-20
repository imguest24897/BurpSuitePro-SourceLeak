package org.bouncycastle.pqc.jcajce.provider.lms;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.pqc.crypto.lms.HSSKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.lms.HSSKeyPairGenerator;
import org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.pqc.crypto.lms.LMSKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.lms.LMSKeyPairGenerator;
import org.bouncycastle.pqc.crypto.lms.LMSKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;
import org.bouncycastle.pqc.jcajce.spec.LMSHSSKeyGenParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.LMSHSSParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.LMSKeyGenParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.LMSParameterSpec;

public class LMSKeyPairGeneratorSpi extends KeyPairGenerator {
  private KeyGenerationParameters param;
  
  private ASN1ObjectIdentifier treeDigest;
  
  private AsymmetricCipherKeyPairGenerator engine = (AsymmetricCipherKeyPairGenerator)new LMSKeyPairGenerator();
  
  private SecureRandom random = CryptoServicesRegistrar.getSecureRandom();
  
  private boolean initialised = false;
  
  public LMSKeyPairGeneratorSpi() {
    super("LMS");
  }
  
  public void initialize(int paramInt, SecureRandom paramSecureRandom) {
    throw new IllegalArgumentException("use AlgorithmParameterSpec");
  }
  
  public void initialize(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidAlgorithmParameterException {
    if (paramAlgorithmParameterSpec instanceof LMSKeyGenParameterSpec) {
      LMSKeyGenParameterSpec lMSKeyGenParameterSpec = (LMSKeyGenParameterSpec)paramAlgorithmParameterSpec;
      this.param = (KeyGenerationParameters)new LMSKeyGenerationParameters(new LMSParameters(lMSKeyGenParameterSpec.getSigParams(), lMSKeyGenParameterSpec.getOtsParams()), paramSecureRandom);
      this.engine = (AsymmetricCipherKeyPairGenerator)new LMSKeyPairGenerator();
      this.engine.init(this.param);
    } else if (paramAlgorithmParameterSpec instanceof LMSHSSKeyGenParameterSpec) {
      LMSKeyGenParameterSpec[] arrayOfLMSKeyGenParameterSpec = ((LMSHSSKeyGenParameterSpec)paramAlgorithmParameterSpec).getLMSSpecs();
      LMSParameters[] arrayOfLMSParameters = new LMSParameters[arrayOfLMSKeyGenParameterSpec.length];
      for (byte b = 0; b != arrayOfLMSKeyGenParameterSpec.length; b++)
        arrayOfLMSParameters[b] = new LMSParameters(arrayOfLMSKeyGenParameterSpec[b].getSigParams(), arrayOfLMSKeyGenParameterSpec[b].getOtsParams()); 
      this.param = (KeyGenerationParameters)new HSSKeyGenerationParameters(arrayOfLMSParameters, paramSecureRandom);
      this.engine = (AsymmetricCipherKeyPairGenerator)new HSSKeyPairGenerator();
      this.engine.init(this.param);
    } else if (paramAlgorithmParameterSpec instanceof LMSParameterSpec) {
      LMSParameterSpec lMSParameterSpec = (LMSParameterSpec)paramAlgorithmParameterSpec;
      this.param = (KeyGenerationParameters)new LMSKeyGenerationParameters(new LMSParameters(lMSParameterSpec.getSigParams(), lMSParameterSpec.getOtsParams()), paramSecureRandom);
      this.engine = (AsymmetricCipherKeyPairGenerator)new LMSKeyPairGenerator();
      this.engine.init(this.param);
    } else if (paramAlgorithmParameterSpec instanceof LMSHSSParameterSpec) {
      LMSParameterSpec[] arrayOfLMSParameterSpec = ((LMSHSSParameterSpec)paramAlgorithmParameterSpec).getLMSSpecs();
      LMSParameters[] arrayOfLMSParameters = new LMSParameters[arrayOfLMSParameterSpec.length];
      for (byte b = 0; b != arrayOfLMSParameterSpec.length; b++)
        arrayOfLMSParameters[b] = new LMSParameters(arrayOfLMSParameterSpec[b].getSigParams(), arrayOfLMSParameterSpec[b].getOtsParams()); 
      this.param = (KeyGenerationParameters)new HSSKeyGenerationParameters(arrayOfLMSParameters, paramSecureRandom);
      this.engine = (AsymmetricCipherKeyPairGenerator)new HSSKeyPairGenerator();
      this.engine.init(this.param);
    } else {
      throw new InvalidAlgorithmParameterException("parameter object not a LMSParameterSpec/LMSHSSParameterSpec");
    } 
    this.initialised = true;
  }
  
  public KeyPair generateKeyPair() {
    if (!this.initialised) {
      this.param = (KeyGenerationParameters)new LMSKeyGenerationParameters(new LMSParameters(LMSigParameters.lms_sha256_n32_h10, LMOtsParameters.sha256_n32_w2), this.random);
      this.engine.init(this.param);
      this.initialised = true;
    } 
    AsymmetricCipherKeyPair asymmetricCipherKeyPair = this.engine.generateKeyPair();
    if (this.engine instanceof LMSKeyPairGenerator) {
      LMSPublicKeyParameters lMSPublicKeyParameters = (LMSPublicKeyParameters)asymmetricCipherKeyPair.getPublic();
      LMSPrivateKeyParameters lMSPrivateKeyParameters = (LMSPrivateKeyParameters)asymmetricCipherKeyPair.getPrivate();
      return new KeyPair(new BCLMSPublicKey((LMSKeyParameters)lMSPublicKeyParameters), new BCLMSPrivateKey((LMSKeyParameters)lMSPrivateKeyParameters));
    } 
    HSSPublicKeyParameters hSSPublicKeyParameters = (HSSPublicKeyParameters)asymmetricCipherKeyPair.getPublic();
    HSSPrivateKeyParameters hSSPrivateKeyParameters = (HSSPrivateKeyParameters)asymmetricCipherKeyPair.getPrivate();
    return new KeyPair(new BCLMSPublicKey((LMSKeyParameters)hSSPublicKeyParameters), new BCLMSPrivateKey((LMSKeyParameters)hSSPrivateKeyParameters));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\lms\LMSKeyPairGeneratorSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */