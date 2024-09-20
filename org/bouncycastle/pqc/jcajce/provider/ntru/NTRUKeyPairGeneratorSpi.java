package org.bouncycastle.pqc.jcajce.provider.ntru;

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
import org.bouncycastle.pqc.crypto.ntru.NTRUKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUKeyPairGenerator;
import org.bouncycastle.pqc.crypto.ntru.NTRUParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.NTRUParameterSpec;
import org.bouncycastle.util.Strings;

public class NTRUKeyPairGeneratorSpi extends KeyPairGenerator {
  private static Map parameters = new HashMap<>();
  
  NTRUKeyGenerationParameters param;
  
  NTRUKeyPairGenerator engine = new NTRUKeyPairGenerator();
  
  SecureRandom random = CryptoServicesRegistrar.getSecureRandom();
  
  boolean initialised = false;
  
  public NTRUKeyPairGeneratorSpi() {
    super("NTRU");
  }
  
  public void initialize(int paramInt, SecureRandom paramSecureRandom) {
    throw new IllegalArgumentException("use AlgorithmParameterSpec");
  }
  
  public void initialize(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidAlgorithmParameterException {
    String str = getNameFromParams(paramAlgorithmParameterSpec);
    if (str != null) {
      this.param = new NTRUKeyGenerationParameters(paramSecureRandom, (NTRUParameters)parameters.get(str));
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } else {
      throw new InvalidAlgorithmParameterException("invalid ParameterSpec: " + paramAlgorithmParameterSpec);
    } 
  }
  
  private static String getNameFromParams(AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    if (paramAlgorithmParameterSpec instanceof NTRUParameterSpec) {
      NTRUParameterSpec nTRUParameterSpec = (NTRUParameterSpec)paramAlgorithmParameterSpec;
      return nTRUParameterSpec.getName();
    } 
    return Strings.toLowerCase(SpecUtil.getNameFrom(paramAlgorithmParameterSpec));
  }
  
  public KeyPair generateKeyPair() {
    if (!this.initialised) {
      this.param = new NTRUKeyGenerationParameters(this.random, NTRUParameters.ntruhps2048509);
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } 
    AsymmetricCipherKeyPair asymmetricCipherKeyPair = this.engine.generateKeyPair();
    NTRUPublicKeyParameters nTRUPublicKeyParameters = (NTRUPublicKeyParameters)asymmetricCipherKeyPair.getPublic();
    NTRUPrivateKeyParameters nTRUPrivateKeyParameters = (NTRUPrivateKeyParameters)asymmetricCipherKeyPair.getPrivate();
    return new KeyPair(new BCNTRUPublicKey(nTRUPublicKeyParameters), new BCNTRUPrivateKey(nTRUPrivateKeyParameters));
  }
  
  static {
    parameters.put(NTRUParameterSpec.ntruhps2048509.getName(), NTRUParameters.ntruhps2048509);
    parameters.put(NTRUParameterSpec.ntruhps2048677.getName(), NTRUParameters.ntruhps2048677);
    parameters.put(NTRUParameterSpec.ntruhps4096821.getName(), NTRUParameters.ntruhps4096821);
    parameters.put(NTRUParameterSpec.ntruhps40961229.getName(), NTRUParameters.ntruhps40961229);
    parameters.put(NTRUParameterSpec.ntruhrss701.getName(), NTRUParameters.ntruhrss701);
    parameters.put(NTRUParameterSpec.ntruhrss1373.getName(), NTRUParameters.ntruhrss1373);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\ntru\NTRUKeyPairGeneratorSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */