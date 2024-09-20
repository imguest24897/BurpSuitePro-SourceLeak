package org.bouncycastle.pqc.jcajce.provider.bike;

import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.jcajce.SecretKeyWithEncapsulation;
import org.bouncycastle.jcajce.spec.KEMExtractSpec;
import org.bouncycastle.jcajce.spec.KEMGenerateSpec;
import org.bouncycastle.pqc.crypto.bike.BIKEKEMExtractor;
import org.bouncycastle.pqc.crypto.bike.BIKEKEMGenerator;
import org.bouncycastle.util.Arrays;

public class BIKEKeyGeneratorSpi extends KeyGeneratorSpi {
  private KEMGenerateSpec genSpec;
  
  private SecureRandom random;
  
  private KEMExtractSpec extSpec;
  
  protected void engineInit(SecureRandom paramSecureRandom) {
    throw new UnsupportedOperationException("Operation not supported");
  }
  
  protected void engineInit(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidAlgorithmParameterException {
    this.random = paramSecureRandom;
    if (paramAlgorithmParameterSpec instanceof KEMGenerateSpec) {
      this.genSpec = (KEMGenerateSpec)paramAlgorithmParameterSpec;
      this.extSpec = null;
    } else if (paramAlgorithmParameterSpec instanceof KEMExtractSpec) {
      this.genSpec = null;
      this.extSpec = (KEMExtractSpec)paramAlgorithmParameterSpec;
    } else {
      throw new InvalidAlgorithmParameterException("unknown spec");
    } 
  }
  
  protected void engineInit(int paramInt, SecureRandom paramSecureRandom) {
    throw new UnsupportedOperationException("Operation not supported");
  }
  
  protected SecretKey engineGenerateKey() {
    if (this.genSpec != null) {
      BCBIKEPublicKey bCBIKEPublicKey = (BCBIKEPublicKey)this.genSpec.getPublicKey();
      BIKEKEMGenerator bIKEKEMGenerator = new BIKEKEMGenerator(this.random);
      SecretWithEncapsulation secretWithEncapsulation = bIKEKEMGenerator.generateEncapsulated((AsymmetricKeyParameter)bCBIKEPublicKey.getKeyParams());
      SecretKeyWithEncapsulation secretKeyWithEncapsulation1 = new SecretKeyWithEncapsulation(new SecretKeySpec(secretWithEncapsulation.getSecret(), this.genSpec.getKeyAlgorithmName()), secretWithEncapsulation.getEncapsulation());
      try {
        secretWithEncapsulation.destroy();
      } catch (DestroyFailedException destroyFailedException) {
        throw new IllegalStateException("key cleanup failed");
      } 
      return (SecretKey)secretKeyWithEncapsulation1;
    } 
    BCBIKEPrivateKey bCBIKEPrivateKey = (BCBIKEPrivateKey)this.extSpec.getPrivateKey();
    BIKEKEMExtractor bIKEKEMExtractor = new BIKEKEMExtractor(bCBIKEPrivateKey.getKeyParams());
    byte[] arrayOfByte1 = this.extSpec.getEncapsulation();
    byte[] arrayOfByte2 = bIKEKEMExtractor.extractSecret(arrayOfByte1);
    SecretKeyWithEncapsulation secretKeyWithEncapsulation = new SecretKeyWithEncapsulation(new SecretKeySpec(arrayOfByte2, this.extSpec.getKeyAlgorithmName()), arrayOfByte1);
    Arrays.clear(arrayOfByte2);
    return (SecretKey)secretKeyWithEncapsulation;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\bike\BIKEKeyGeneratorSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */