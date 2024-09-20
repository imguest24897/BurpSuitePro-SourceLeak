package org.bouncycastle.pqc.jcajce.provider.rainbow;

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
import org.bouncycastle.pqc.crypto.rainbow.RainbowKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowKeyPairGenerator;
import org.bouncycastle.pqc.crypto.rainbow.RainbowParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.RainbowParameterSpec;
import org.bouncycastle.util.Strings;

public class RainbowKeyPairGeneratorSpi extends KeyPairGenerator {
  private static Map parameters = new HashMap<>();
  
  private final RainbowParameters rainbowParameters = null;
  
  RainbowKeyGenerationParameters param;
  
  RainbowKeyPairGenerator engine = new RainbowKeyPairGenerator();
  
  SecureRandom random = CryptoServicesRegistrar.getSecureRandom();
  
  boolean initialised = false;
  
  public RainbowKeyPairGeneratorSpi() {
    super("RAINBOW");
  }
  
  protected RainbowKeyPairGeneratorSpi(RainbowParameters paramRainbowParameters) {
    super(paramRainbowParameters.getName());
  }
  
  public void initialize(int paramInt, SecureRandom paramSecureRandom) {
    throw new IllegalArgumentException("use AlgorithmParameterSpec");
  }
  
  public void initialize(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidAlgorithmParameterException {
    String str = getNameFromParams(paramAlgorithmParameterSpec);
    if (str != null && parameters.containsKey(str)) {
      RainbowParameters rainbowParameters = (RainbowParameters)parameters.get(str);
      this.param = new RainbowKeyGenerationParameters(paramSecureRandom, rainbowParameters);
      if (this.rainbowParameters != null && !rainbowParameters.getName().equals(this.rainbowParameters.getName()))
        throw new InvalidAlgorithmParameterException("key pair generator locked to " + Strings.toUpperCase(this.rainbowParameters.getName())); 
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } else {
      throw new InvalidAlgorithmParameterException("invalid ParameterSpec: " + paramAlgorithmParameterSpec);
    } 
  }
  
  private static String getNameFromParams(AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    if (paramAlgorithmParameterSpec instanceof RainbowParameterSpec) {
      RainbowParameterSpec rainbowParameterSpec = (RainbowParameterSpec)paramAlgorithmParameterSpec;
      return rainbowParameterSpec.getName();
    } 
    return Strings.toLowerCase(SpecUtil.getNameFrom(paramAlgorithmParameterSpec));
  }
  
  public KeyPair generateKeyPair() {
    if (!this.initialised) {
      if (this.rainbowParameters != null) {
        this.param = new RainbowKeyGenerationParameters(this.random, this.rainbowParameters);
      } else {
        this.param = new RainbowKeyGenerationParameters(this.random, RainbowParameters.rainbowIIIclassic);
      } 
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } 
    AsymmetricCipherKeyPair asymmetricCipherKeyPair = this.engine.generateKeyPair();
    RainbowPublicKeyParameters rainbowPublicKeyParameters = (RainbowPublicKeyParameters)asymmetricCipherKeyPair.getPublic();
    RainbowPrivateKeyParameters rainbowPrivateKeyParameters = (RainbowPrivateKeyParameters)asymmetricCipherKeyPair.getPrivate();
    return new KeyPair((PublicKey)new BCRainbowPublicKey(rainbowPublicKeyParameters), (PrivateKey)new BCRainbowPrivateKey(rainbowPrivateKeyParameters));
  }
  
  static {
    parameters.put(RainbowParameterSpec.rainbowIIIclassic.getName(), RainbowParameters.rainbowIIIclassic);
    parameters.put(RainbowParameterSpec.rainbowIIIcircumzenithal.getName(), RainbowParameters.rainbowIIIcircumzenithal);
    parameters.put(RainbowParameterSpec.rainbowIIIcompressed.getName(), RainbowParameters.rainbowIIIcompressed);
    parameters.put(RainbowParameterSpec.rainbowVclassic.getName(), RainbowParameters.rainbowVclassic);
    parameters.put(RainbowParameterSpec.rainbowVcircumzenithal.getName(), RainbowParameters.rainbowVcircumzenithal);
    parameters.put(RainbowParameterSpec.rainbowVcompressed.getName(), RainbowParameters.rainbowVcompressed);
  }
  
  public static class RainbowIIIcircum extends RainbowKeyPairGeneratorSpi {
    public RainbowIIIcircum() {
      super(RainbowParameters.rainbowIIIcircumzenithal);
    }
  }
  
  public static class RainbowIIIclassic extends RainbowKeyPairGeneratorSpi {
    public RainbowIIIclassic() {
      super(RainbowParameters.rainbowIIIclassic);
    }
  }
  
  public static class RainbowIIIcomp extends RainbowKeyPairGeneratorSpi {
    public RainbowIIIcomp() {
      super(RainbowParameters.rainbowIIIcompressed);
    }
  }
  
  public static class RainbowVcircum extends RainbowKeyPairGeneratorSpi {
    public RainbowVcircum() {
      super(RainbowParameters.rainbowVcircumzenithal);
    }
  }
  
  public static class RainbowVclassic extends RainbowKeyPairGeneratorSpi {
    public RainbowVclassic() {
      super(RainbowParameters.rainbowVclassic);
    }
  }
  
  public static class RainbowVcomp extends RainbowKeyPairGeneratorSpi {
    public RainbowVcomp() {
      super(RainbowParameters.rainbowVcompressed);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\rainbow\RainbowKeyPairGeneratorSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */