package org.bouncycastle.pqc.jcajce.provider.ntruprime;

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
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeKeyPairGenerator;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimePrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimePublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.NTRULPRimeParameterSpec;
import org.bouncycastle.util.Strings;

public class NTRULPRimeKeyPairGeneratorSpi extends KeyPairGenerator {
  private static Map parameters = new HashMap<>();
  
  NTRULPRimeKeyGenerationParameters param;
  
  NTRULPRimeKeyPairGenerator engine = new NTRULPRimeKeyPairGenerator();
  
  SecureRandom random = CryptoServicesRegistrar.getSecureRandom();
  
  boolean initialised = false;
  
  public NTRULPRimeKeyPairGeneratorSpi() {
    super("NTRULPRime");
  }
  
  public void initialize(int paramInt, SecureRandom paramSecureRandom) {
    throw new IllegalArgumentException("use AlgorithmParameterSpec");
  }
  
  public void initialize(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidAlgorithmParameterException {
    String str = getNameFromParams(paramAlgorithmParameterSpec);
    if (str != null) {
      this.param = new NTRULPRimeKeyGenerationParameters(paramSecureRandom, (NTRULPRimeParameters)parameters.get(str));
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } else {
      throw new InvalidAlgorithmParameterException("invalid ParameterSpec: " + paramAlgorithmParameterSpec);
    } 
  }
  
  private static String getNameFromParams(AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    if (paramAlgorithmParameterSpec instanceof NTRULPRimeParameterSpec) {
      NTRULPRimeParameterSpec nTRULPRimeParameterSpec = (NTRULPRimeParameterSpec)paramAlgorithmParameterSpec;
      return nTRULPRimeParameterSpec.getName();
    } 
    return Strings.toLowerCase(SpecUtil.getNameFrom(paramAlgorithmParameterSpec));
  }
  
  public KeyPair generateKeyPair() {
    if (!this.initialised) {
      this.param = new NTRULPRimeKeyGenerationParameters(this.random, NTRULPRimeParameters.ntrulpr953);
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } 
    AsymmetricCipherKeyPair asymmetricCipherKeyPair = this.engine.generateKeyPair();
    NTRULPRimePublicKeyParameters nTRULPRimePublicKeyParameters = (NTRULPRimePublicKeyParameters)asymmetricCipherKeyPair.getPublic();
    NTRULPRimePrivateKeyParameters nTRULPRimePrivateKeyParameters = (NTRULPRimePrivateKeyParameters)asymmetricCipherKeyPair.getPrivate();
    return new KeyPair(new BCNTRULPRimePublicKey(nTRULPRimePublicKeyParameters), new BCNTRULPRimePrivateKey(nTRULPRimePrivateKeyParameters));
  }
  
  static {
    parameters.put(NTRULPRimeParameterSpec.ntrulpr653.getName(), NTRULPRimeParameters.ntrulpr653);
    parameters.put(NTRULPRimeParameterSpec.ntrulpr761.getName(), NTRULPRimeParameters.ntrulpr761);
    parameters.put(NTRULPRimeParameterSpec.ntrulpr857.getName(), NTRULPRimeParameters.ntrulpr857);
    parameters.put(NTRULPRimeParameterSpec.ntrulpr953.getName(), NTRULPRimeParameters.ntrulpr953);
    parameters.put(NTRULPRimeParameterSpec.ntrulpr1013.getName(), NTRULPRimeParameters.ntrulpr1013);
    parameters.put(NTRULPRimeParameterSpec.ntrulpr1277.getName(), NTRULPRimeParameters.ntrulpr1277);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\ntruprime\NTRULPRimeKeyPairGeneratorSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */