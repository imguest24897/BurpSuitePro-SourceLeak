package org.bouncycastle.pqc.jcajce.provider.dilithium;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumKeyPairGenerator;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.DilithiumParameterSpec;
import org.bouncycastle.util.Strings;

public class DilithiumKeyPairGeneratorSpi extends KeyPairGenerator {
  private static Map parameters = new HashMap<>();
  
  private final DilithiumParameters dilithiumParameters = null;
  
  DilithiumKeyGenerationParameters param;
  
  DilithiumKeyPairGenerator engine = new DilithiumKeyPairGenerator();
  
  SecureRandom random = CryptoServicesRegistrar.getSecureRandom();
  
  boolean initialised = false;
  
  public DilithiumKeyPairGeneratorSpi() {
    super("DILITHIUM");
  }
  
  protected DilithiumKeyPairGeneratorSpi(DilithiumParameters paramDilithiumParameters) {
    super(Strings.toUpperCase(paramDilithiumParameters.getName()));
  }
  
  public void initialize(int paramInt, SecureRandom paramSecureRandom) {
    throw new IllegalArgumentException("use AlgorithmParameterSpec");
  }
  
  public void initialize(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidAlgorithmParameterException {
    String str = getNameFromParams(paramAlgorithmParameterSpec);
    if (str != null && parameters.containsKey(str)) {
      DilithiumParameters dilithiumParameters = (DilithiumParameters)parameters.get(str);
      this.param = new DilithiumKeyGenerationParameters(paramSecureRandom, dilithiumParameters);
      if (this.dilithiumParameters != null && !dilithiumParameters.getName().equals(this.dilithiumParameters.getName()))
        throw new InvalidAlgorithmParameterException("key pair generator locked to " + Strings.toUpperCase(this.dilithiumParameters.getName())); 
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } else {
      throw new InvalidAlgorithmParameterException("invalid ParameterSpec: " + paramAlgorithmParameterSpec);
    } 
  }
  
  private static String getNameFromParams(AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    if (paramAlgorithmParameterSpec instanceof DilithiumParameterSpec) {
      DilithiumParameterSpec dilithiumParameterSpec = (DilithiumParameterSpec)paramAlgorithmParameterSpec;
      return dilithiumParameterSpec.getName();
    } 
    return Strings.toLowerCase(SpecUtil.getNameFrom(paramAlgorithmParameterSpec));
  }
  
  public KeyPair generateKeyPair() {
    if (!this.initialised) {
      if (this.dilithiumParameters != null) {
        this.param = new DilithiumKeyGenerationParameters(this.random, this.dilithiumParameters);
      } else {
        this.param = new DilithiumKeyGenerationParameters(this.random, DilithiumParameters.dilithium3);
      } 
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } 
    AsymmetricCipherKeyPair asymmetricCipherKeyPair = this.engine.generateKeyPair();
    DilithiumPublicKeyParameters dilithiumPublicKeyParameters = (DilithiumPublicKeyParameters)asymmetricCipherKeyPair.getPublic();
    DilithiumPrivateKeyParameters dilithiumPrivateKeyParameters = (DilithiumPrivateKeyParameters)asymmetricCipherKeyPair.getPrivate();
    return new KeyPair((PublicKey)new BCDilithiumPublicKey(dilithiumPublicKeyParameters), (PrivateKey)new BCDilithiumPrivateKey(dilithiumPrivateKeyParameters));
  }
  
  static {
    parameters.put(DilithiumParameterSpec.dilithium2.getName(), DilithiumParameters.dilithium2);
    parameters.put(DilithiumParameterSpec.dilithium3.getName(), DilithiumParameters.dilithium3);
    parameters.put(DilithiumParameterSpec.dilithium5.getName(), DilithiumParameters.dilithium5);
  }
  
  public static class Base2 extends DilithiumKeyPairGeneratorSpi {
    public Base2() throws NoSuchAlgorithmException {
      super(DilithiumParameters.dilithium2);
    }
  }
  
  public static class Base3 extends DilithiumKeyPairGeneratorSpi {
    public Base3() throws NoSuchAlgorithmException {
      super(DilithiumParameters.dilithium3);
    }
  }
  
  public static class Base5 extends DilithiumKeyPairGeneratorSpi {
    public Base5() throws NoSuchAlgorithmException {
      super(DilithiumParameters.dilithium5);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\dilithium\DilithiumKeyPairGeneratorSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */