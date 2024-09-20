package org.bouncycastle.pqc.jcajce.provider.kyber;

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
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKeyPairGenerator;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.KyberParameterSpec;
import org.bouncycastle.util.Strings;

public class KyberKeyPairGeneratorSpi extends KeyPairGenerator {
  private static Map parameters = new HashMap<>();
  
  KyberKeyGenerationParameters param;
  
  KyberKeyPairGenerator engine = new KyberKeyPairGenerator();
  
  SecureRandom random = CryptoServicesRegistrar.getSecureRandom();
  
  boolean initialised = false;
  
  private KyberParameters kyberParameters = null;
  
  public KyberKeyPairGeneratorSpi() {
    super("KYBER");
  }
  
  protected KyberKeyPairGeneratorSpi(KyberParameters paramKyberParameters) {
    super(Strings.toUpperCase(paramKyberParameters.getName()));
  }
  
  public void initialize(int paramInt, SecureRandom paramSecureRandom) {
    throw new IllegalArgumentException("use AlgorithmParameterSpec");
  }
  
  public void initialize(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidAlgorithmParameterException {
    String str = getNameFromParams(paramAlgorithmParameterSpec);
    if (str != null && parameters.containsKey(str)) {
      KyberParameters kyberParameters = (KyberParameters)parameters.get(str);
      this.param = new KyberKeyGenerationParameters(paramSecureRandom, kyberParameters);
      if (this.kyberParameters != null && !kyberParameters.getName().equals(this.kyberParameters.getName()))
        throw new InvalidAlgorithmParameterException("key pair generator locked to " + Strings.toUpperCase(this.kyberParameters.getName())); 
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } else {
      throw new InvalidAlgorithmParameterException("invalid ParameterSpec: " + paramAlgorithmParameterSpec);
    } 
  }
  
  private static String getNameFromParams(AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    if (paramAlgorithmParameterSpec instanceof KyberParameterSpec) {
      KyberParameterSpec kyberParameterSpec = (KyberParameterSpec)paramAlgorithmParameterSpec;
      return kyberParameterSpec.getName();
    } 
    return Strings.toLowerCase(SpecUtil.getNameFrom(paramAlgorithmParameterSpec));
  }
  
  public KeyPair generateKeyPair() {
    if (!this.initialised) {
      if (this.kyberParameters != null) {
        this.param = new KyberKeyGenerationParameters(this.random, this.kyberParameters);
      } else {
        this.param = new KyberKeyGenerationParameters(this.random, KyberParameters.kyber1024);
      } 
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } 
    AsymmetricCipherKeyPair asymmetricCipherKeyPair = this.engine.generateKeyPair();
    KyberPublicKeyParameters kyberPublicKeyParameters = (KyberPublicKeyParameters)asymmetricCipherKeyPair.getPublic();
    KyberPrivateKeyParameters kyberPrivateKeyParameters = (KyberPrivateKeyParameters)asymmetricCipherKeyPair.getPrivate();
    return new KeyPair((PublicKey)new BCKyberPublicKey(kyberPublicKeyParameters), (PrivateKey)new BCKyberPrivateKey(kyberPrivateKeyParameters));
  }
  
  static {
    parameters.put(KyberParameterSpec.kyber512.getName(), KyberParameters.kyber512);
    parameters.put(KyberParameterSpec.kyber768.getName(), KyberParameters.kyber768);
    parameters.put(KyberParameterSpec.kyber1024.getName(), KyberParameters.kyber1024);
  }
  
  public static class Kyber1024 extends KyberKeyPairGeneratorSpi {
    public Kyber1024() {
      super(KyberParameters.kyber1024);
    }
  }
  
  public static class Kyber512 extends KyberKeyPairGeneratorSpi {
    public Kyber512() {
      super(KyberParameters.kyber512);
    }
  }
  
  public static class Kyber768 extends KyberKeyPairGeneratorSpi {
    public Kyber768() {
      super(KyberParameters.kyber768);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\kyber\KyberKeyPairGeneratorSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */