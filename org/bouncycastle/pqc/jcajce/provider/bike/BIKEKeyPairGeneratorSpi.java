package org.bouncycastle.pqc.jcajce.provider.bike;

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
import org.bouncycastle.pqc.crypto.bike.BIKEKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.bike.BIKEKeyPairGenerator;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;
import org.bouncycastle.pqc.crypto.bike.BIKEPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.bike.BIKEPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.BIKEParameterSpec;
import org.bouncycastle.util.Strings;

public class BIKEKeyPairGeneratorSpi extends KeyPairGenerator {
  private static Map parameters = new HashMap<>();
  
  BIKEKeyGenerationParameters param;
  
  BIKEKeyPairGenerator engine = new BIKEKeyPairGenerator();
  
  SecureRandom random = CryptoServicesRegistrar.getSecureRandom();
  
  boolean initialised = false;
  
  public BIKEKeyPairGeneratorSpi() {
    super("BIKE");
  }
  
  public void initialize(int paramInt, SecureRandom paramSecureRandom) {
    throw new IllegalArgumentException("use AlgorithmParameterSpec");
  }
  
  public void initialize(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidAlgorithmParameterException {
    String str = getNameFromParams(paramAlgorithmParameterSpec);
    if (str != null) {
      this.param = new BIKEKeyGenerationParameters(paramSecureRandom, (BIKEParameters)parameters.get(str));
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } else {
      throw new InvalidAlgorithmParameterException("invalid ParameterSpec: " + paramAlgorithmParameterSpec);
    } 
  }
  
  private static String getNameFromParams(AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    if (paramAlgorithmParameterSpec instanceof BIKEParameterSpec) {
      BIKEParameterSpec bIKEParameterSpec = (BIKEParameterSpec)paramAlgorithmParameterSpec;
      return bIKEParameterSpec.getName();
    } 
    return Strings.toLowerCase(SpecUtil.getNameFrom(paramAlgorithmParameterSpec));
  }
  
  public KeyPair generateKeyPair() {
    if (!this.initialised) {
      this.param = new BIKEKeyGenerationParameters(this.random, BIKEParameters.bike128);
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } 
    AsymmetricCipherKeyPair asymmetricCipherKeyPair = this.engine.generateKeyPair();
    BIKEPublicKeyParameters bIKEPublicKeyParameters = (BIKEPublicKeyParameters)asymmetricCipherKeyPair.getPublic();
    BIKEPrivateKeyParameters bIKEPrivateKeyParameters = (BIKEPrivateKeyParameters)asymmetricCipherKeyPair.getPrivate();
    return new KeyPair(new BCBIKEPublicKey(bIKEPublicKeyParameters), new BCBIKEPrivateKey(bIKEPrivateKeyParameters));
  }
  
  static {
    parameters.put("bike128", BIKEParameters.bike128);
    parameters.put("bike192", BIKEParameters.bike192);
    parameters.put("bike256", BIKEParameters.bike256);
    parameters.put(BIKEParameterSpec.bike128.getName(), BIKEParameters.bike128);
    parameters.put(BIKEParameterSpec.bike192.getName(), BIKEParameters.bike192);
    parameters.put(BIKEParameterSpec.bike256.getName(), BIKEParameters.bike256);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\bike\BIKEKeyPairGeneratorSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */