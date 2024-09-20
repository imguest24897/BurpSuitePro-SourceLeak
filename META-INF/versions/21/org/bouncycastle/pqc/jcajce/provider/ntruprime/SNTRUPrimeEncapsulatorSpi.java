package META-INF.versions.21.org.bouncycastle.pqc.jcajce.provider.ntruprime;

import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.Objects;
import javax.crypto.KEM;
import javax.crypto.KEMSpi;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeKEMGenerator;
import org.bouncycastle.pqc.jcajce.provider.Util;
import org.bouncycastle.pqc.jcajce.provider.ntruprime.BCSNTRUPrimePublicKey;
import org.bouncycastle.util.Arrays;

class SNTRUPrimeEncapsulatorSpi implements KEMSpi.EncapsulatorSpi {
  private final BCSNTRUPrimePublicKey publicKey;
  
  private final KTSParameterSpec parameterSpec;
  
  private final SNTRUPrimeKEMGenerator kemGen;
  
  public SNTRUPrimeEncapsulatorSpi(BCSNTRUPrimePublicKey paramBCSNTRUPrimePublicKey, KTSParameterSpec paramKTSParameterSpec, SecureRandom paramSecureRandom) {
    this.publicKey = paramBCSNTRUPrimePublicKey;
    this.parameterSpec = paramKTSParameterSpec;
    this.kemGen = new SNTRUPrimeKEMGenerator(paramSecureRandom);
  }
  
  public KEM.Encapsulated engineEncapsulate(int paramInt1, int paramInt2, String paramString) {
    Objects.checkFromToIndex(paramInt1, paramInt2, engineSecretSize());
    Objects.requireNonNull(paramString, "null algorithm");
    if (!this.parameterSpec.getKeyAlgorithmName().equals("Generic") && paramString.equals("Generic"))
      paramString = this.parameterSpec.getKeyAlgorithmName(); 
    if (!this.parameterSpec.getKeyAlgorithmName().equals("Generic") && !this.parameterSpec.getKeyAlgorithmName().equals(paramString))
      throw new UnsupportedOperationException(this.parameterSpec.getKeyAlgorithmName() + " does not match " + this.parameterSpec.getKeyAlgorithmName()); 
    boolean bool = (this.parameterSpec.getKdfAlgorithm() != null) ? true : false;
    SecretWithEncapsulation secretWithEncapsulation = this.kemGen.generateEncapsulated((AsymmetricKeyParameter)this.publicKey.getKeyParams());
    byte[] arrayOfByte1 = secretWithEncapsulation.getEncapsulation();
    byte[] arrayOfByte2 = secretWithEncapsulation.getSecret();
    if (bool)
      try {
        arrayOfByte2 = Util.makeKeyBytes(this.parameterSpec, arrayOfByte2);
      } catch (InvalidKeyException invalidKeyException) {
        throw new IllegalStateException(invalidKeyException);
      }  
    byte[] arrayOfByte3 = Arrays.copyOfRange(arrayOfByte2, paramInt1, paramInt2);
    return new KEM.Encapsulated(new SecretKeySpec(arrayOfByte3, paramString), arrayOfByte1, null);
  }
  
  public int engineSecretSize() {
    return this.parameterSpec.getKeySize() / 8;
  }
  
  public int engineEncapsulationSize() {
    return this.publicKey.getKeyParams().getParameters().getRoundedPolynomialBytes() + 32;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\21\org\bouncycastle\pqc\jcajce\provider\ntruprime\SNTRUPrimeEncapsulatorSpi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */