package org.bouncycastle.pqc.jcajce.provider.picnic;

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
import org.bouncycastle.pqc.crypto.picnic.PicnicKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicKeyPairGenerator;
import org.bouncycastle.pqc.crypto.picnic.PicnicParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec;
import org.bouncycastle.util.Strings;

public class PicnicKeyPairGeneratorSpi extends KeyPairGenerator {
  private static Map parameters = new HashMap<>();
  
  PicnicKeyGenerationParameters param;
  
  PicnicKeyPairGenerator engine = new PicnicKeyPairGenerator();
  
  SecureRandom random = CryptoServicesRegistrar.getSecureRandom();
  
  boolean initialised = false;
  
  public PicnicKeyPairGeneratorSpi() {
    super("Picnic");
  }
  
  public void initialize(int paramInt, SecureRandom paramSecureRandom) {
    throw new IllegalArgumentException("use AlgorithmParameterSpec");
  }
  
  public void initialize(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidAlgorithmParameterException {
    String str = getNameFromParams(paramAlgorithmParameterSpec);
    if (str != null) {
      this.param = new PicnicKeyGenerationParameters(paramSecureRandom, (PicnicParameters)parameters.get(str));
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } else {
      throw new InvalidAlgorithmParameterException("invalid ParameterSpec: " + paramAlgorithmParameterSpec);
    } 
  }
  
  private static String getNameFromParams(AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    if (paramAlgorithmParameterSpec instanceof PicnicParameterSpec) {
      PicnicParameterSpec picnicParameterSpec = (PicnicParameterSpec)paramAlgorithmParameterSpec;
      return picnicParameterSpec.getName();
    } 
    return Strings.toLowerCase(SpecUtil.getNameFrom(paramAlgorithmParameterSpec));
  }
  
  public KeyPair generateKeyPair() {
    if (!this.initialised) {
      this.param = new PicnicKeyGenerationParameters(this.random, PicnicParameters.picnicl3ur);
      this.engine.init((KeyGenerationParameters)this.param);
      this.initialised = true;
    } 
    AsymmetricCipherKeyPair asymmetricCipherKeyPair = this.engine.generateKeyPair();
    PicnicPublicKeyParameters picnicPublicKeyParameters = (PicnicPublicKeyParameters)asymmetricCipherKeyPair.getPublic();
    PicnicPrivateKeyParameters picnicPrivateKeyParameters = (PicnicPrivateKeyParameters)asymmetricCipherKeyPair.getPrivate();
    return new KeyPair(new BCPicnicPublicKey(picnicPublicKeyParameters), new BCPicnicPrivateKey(picnicPrivateKeyParameters));
  }
  
  static {
    parameters.put(PicnicParameterSpec.picnicl1fs.getName(), PicnicParameters.picnicl1fs);
    parameters.put(PicnicParameterSpec.picnicl1ur.getName(), PicnicParameters.picnicl1ur);
    parameters.put(PicnicParameterSpec.picnicl3fs.getName(), PicnicParameters.picnicl3fs);
    parameters.put(PicnicParameterSpec.picnicl3ur.getName(), PicnicParameters.picnicl3ur);
    parameters.put(PicnicParameterSpec.picnicl5fs.getName(), PicnicParameters.picnicl5fs);
    parameters.put(PicnicParameterSpec.picnicl5ur.getName(), PicnicParameters.picnicl5ur);
    parameters.put(PicnicParameterSpec.picnic3l1.getName(), PicnicParameters.picnic3l1);
    parameters.put(PicnicParameterSpec.picnic3l3.getName(), PicnicParameters.picnic3l3);
    parameters.put(PicnicParameterSpec.picnic3l5.getName(), PicnicParameters.picnic3l5);
    parameters.put(PicnicParameterSpec.picnicl1full.getName(), PicnicParameters.picnicl1full);
    parameters.put(PicnicParameterSpec.picnicl3full.getName(), PicnicParameters.picnicl3full);
    parameters.put(PicnicParameterSpec.picnicl5full.getName(), PicnicParameters.picnicl5full);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\picnic\PicnicKeyPairGeneratorSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */