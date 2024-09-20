package org.bouncycastle.pqc.jcajce.provider.hqc;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCKeyPairGenerator;
import org.bouncycastle.pqc.crypto.hqc.HQCParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.HQCParameterSpec;
import org.bouncycastle.util.Strings;

public class HQCKeyPairGeneratorSpi extends KeyPairGenerator {
  private static Map parameters = new HashMap<>();
  
  HQCKeyGenerationParameters param;
  
  HQCKeyPairGenerator engine = new HQCKeyPairGenerator();
  
  SecureRandom random = CryptoServicesRegistrar.getSecureRandom();
  
  boolean initialised = false;
  
  public HQCKeyPairGeneratorSpi() {
    super("HQC");
  }
  
  public void initialize(int paramInt, SecureRandom paramSecureRandom) {
    throw new IllegalArgumentException("use AlgorithmParameterSpec");
  }
  
  public void initialize(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidAlgorithmParameterException {
    String str = getNameFromParams(paramAlgorithmParameterSpec);
    if (str != null) {
      this.param = new HQCKeyGenerationParameters(paramSecureRandom, (HQCParameters)parameters.get(str));
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } else {
      throw new InvalidAlgorithmParameterException("invalid ParameterSpec: " + paramAlgorithmParameterSpec);
    } 
  }
  
  private static String getNameFromParams(AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    if (paramAlgorithmParameterSpec instanceof HQCParameterSpec) {
      HQCParameterSpec hQCParameterSpec = (HQCParameterSpec)paramAlgorithmParameterSpec;
      return hQCParameterSpec.getName();
    } 
    return Strings.toLowerCase(SpecUtil.getNameFrom(paramAlgorithmParameterSpec));
  }
  
  public KeyPair generateKeyPair() {
    if (!this.initialised) {
      this.param = new HQCKeyGenerationParameters(this.random, HQCParameters.hqc128);
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } 
    AsymmetricCipherKeyPair asymmetricCipherKeyPair = this.engine.generateKeyPair();
    HQCPublicKeyParameters hQCPublicKeyParameters = (HQCPublicKeyParameters)asymmetricCipherKeyPair.getPublic();
    HQCPrivateKeyParameters hQCPrivateKeyParameters = (HQCPrivateKeyParameters)asymmetricCipherKeyPair.getPrivate();
    return new KeyPair(new BCHQCPublicKey(hQCPublicKeyParameters), new BCHQCPrivateKey(hQCPrivateKeyParameters));
  }
  
  static {
    parameters.put("hqc-128", HQCParameters.hqc128);
    parameters.put("hqc-192", HQCParameters.hqc192);
    parameters.put("hqc-256", HQCParameters.hqc256);
    parameters.put(HQCParameterSpec.hqc128.getName(), HQCParameters.hqc128);
    parameters.put(HQCParameterSpec.hqc192.getName(), HQCParameters.hqc192);
    parameters.put(HQCParameterSpec.hqc256.getName(), HQCParameters.hqc256);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\hqc\HQCKeyPairGeneratorSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */