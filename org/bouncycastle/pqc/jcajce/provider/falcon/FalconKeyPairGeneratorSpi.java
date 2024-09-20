package org.bouncycastle.pqc.jcajce.provider.falcon;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconKeyPairGenerator;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.FalconParameterSpec;
import org.bouncycastle.util.Strings;

public class FalconKeyPairGeneratorSpi extends KeyPairGenerator {
  private static Map parameters = new HashMap<>();
  
  private final FalconParameters falconParameters = null;
  
  FalconKeyGenerationParameters param;
  
  FalconKeyPairGenerator engine = new FalconKeyPairGenerator();
  
  SecureRandom random = CryptoServicesRegistrar.getSecureRandom();
  
  boolean initialised = false;
  
  public FalconKeyPairGeneratorSpi() {
    super("FALCON");
  }
  
  protected FalconKeyPairGeneratorSpi(FalconParameters paramFalconParameters) {
    super(paramFalconParameters.getName());
  }
  
  public void initialize(int paramInt, SecureRandom paramSecureRandom) {
    throw new IllegalArgumentException("use AlgorithmParameterSpec");
  }
  
  public void initialize(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidAlgorithmParameterException {
    String str = getNameFromParams(paramAlgorithmParameterSpec);
    if (str != null && parameters.containsKey(str)) {
      FalconParameters falconParameters = (FalconParameters)parameters.get(str);
      this.param = new FalconKeyGenerationParameters(paramSecureRandom, falconParameters);
      if (this.falconParameters != null && !falconParameters.getName().equals(this.falconParameters.getName()))
        throw new InvalidAlgorithmParameterException("key pair generator locked to " + Strings.toUpperCase(this.falconParameters.getName())); 
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } else {
      throw new InvalidAlgorithmParameterException("invalid ParameterSpec: " + paramAlgorithmParameterSpec);
    } 
  }
  
  private static String getNameFromParams(AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    if (paramAlgorithmParameterSpec instanceof FalconParameterSpec) {
      FalconParameterSpec falconParameterSpec = (FalconParameterSpec)paramAlgorithmParameterSpec;
      return falconParameterSpec.getName();
    } 
    return Strings.toLowerCase(SpecUtil.getNameFrom(paramAlgorithmParameterSpec));
  }
  
  public KeyPair generateKeyPair() {
    if (!this.initialised) {
      if (this.falconParameters != null) {
        this.param = new FalconKeyGenerationParameters(this.random, this.falconParameters);
      } else {
        this.param = new FalconKeyGenerationParameters(this.random, FalconParameters.falcon_512);
      } 
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } 
    AsymmetricCipherKeyPair asymmetricCipherKeyPair = this.engine.generateKeyPair();
    FalconPublicKeyParameters falconPublicKeyParameters = (FalconPublicKeyParameters)asymmetricCipherKeyPair.getPublic();
    FalconPrivateKeyParameters falconPrivateKeyParameters = (FalconPrivateKeyParameters)asymmetricCipherKeyPair.getPrivate();
    return new KeyPair((PublicKey)new BCFalconPublicKey(falconPublicKeyParameters), (PrivateKey)new BCFalconPrivateKey(falconPrivateKeyParameters));
  }
  
  static {
    parameters.put(FalconParameterSpec.falcon_512.getName(), FalconParameters.falcon_512);
    parameters.put(FalconParameterSpec.falcon_1024.getName(), FalconParameters.falcon_1024);
  }
  
  public static class Falcon1024 extends FalconKeyPairGeneratorSpi {
    public Falcon1024() {
      super(FalconParameters.falcon_1024);
    }
  }
  
  public static class Falcon512 extends FalconKeyPairGeneratorSpi {
    public Falcon512() {
      super(FalconParameters.falcon_512);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\falcon\FalconKeyPairGeneratorSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */