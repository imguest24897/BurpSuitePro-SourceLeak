package META-INF.versions.21.org.bouncycastle.pqc.jcajce.provider.ntruprime;

import java.security.InvalidKeyException;
import java.util.Objects;
import javax.crypto.DecapsulateException;
import javax.crypto.KEMSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeKEMExtractor;
import org.bouncycastle.pqc.jcajce.provider.Util;
import org.bouncycastle.pqc.jcajce.provider.ntruprime.BCSNTRUPrimePrivateKey;
import org.bouncycastle.util.Arrays;

class SNTRUPrimeDecapsulatorSpi implements KEMSpi.DecapsulatorSpi {
  BCSNTRUPrimePrivateKey privateKey;
  
  KTSParameterSpec parameterSpec;
  
  SNTRUPrimeKEMExtractor kemExt;
  
  public SNTRUPrimeDecapsulatorSpi(BCSNTRUPrimePrivateKey paramBCSNTRUPrimePrivateKey, KTSParameterSpec paramKTSParameterSpec) {
    this.privateKey = paramBCSNTRUPrimePrivateKey;
    this.parameterSpec = paramKTSParameterSpec;
    this.kemExt = new SNTRUPrimeKEMExtractor(paramBCSNTRUPrimePrivateKey.getKeyParams());
  }
  
  public SecretKey engineDecapsulate(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, String paramString) throws DecapsulateException {
    Objects.checkFromToIndex(paramInt1, paramInt2, engineSecretSize());
    Objects.requireNonNull(paramString, "null algorithm");
    Objects.requireNonNull(paramArrayOfbyte, "null encapsulation");
    if (paramArrayOfbyte.length != engineEncapsulationSize())
      throw new DecapsulateException("incorrect encapsulation size"); 
    if (!this.parameterSpec.getKeyAlgorithmName().equals("Generic") && paramString.equals("Generic"))
      paramString = this.parameterSpec.getKeyAlgorithmName(); 
    if (!this.parameterSpec.getKeyAlgorithmName().equals("Generic") && !this.parameterSpec.getKeyAlgorithmName().equals(paramString))
      throw new UnsupportedOperationException(this.parameterSpec.getKeyAlgorithmName() + " does not match " + this.parameterSpec.getKeyAlgorithmName()); 
    boolean bool = (this.parameterSpec.getKdfAlgorithm() != null) ? true : false;
    byte[] arrayOfByte1 = this.kemExt.extractSecret(paramArrayOfbyte);
    if (bool)
      try {
        arrayOfByte1 = Util.makeKeyBytes(this.parameterSpec, arrayOfByte1);
      } catch (InvalidKeyException invalidKeyException) {
        throw new IllegalStateException(invalidKeyException);
      }  
    byte[] arrayOfByte2 = Arrays.copyOfRange(arrayOfByte1, paramInt1, paramInt2);
    return new SecretKeySpec(arrayOfByte2, paramString);
  }
  
  public int engineSecretSize() {
    return this.parameterSpec.getKeySize() / 8;
  }
  
  public int engineEncapsulationSize() {
    return this.kemExt.getEncapsulationLength();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\21\org\bouncycastle\pqc\jcajce\provider\ntruprime\SNTRUPrimeDecapsulatorSpi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */