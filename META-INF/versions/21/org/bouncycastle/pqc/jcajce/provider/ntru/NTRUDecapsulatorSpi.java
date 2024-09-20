package META-INF.versions.21.org.bouncycastle.pqc.jcajce.provider.ntru;

import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.DecapsulateException;
import javax.crypto.KEMSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.pqc.crypto.ntru.NTRUKEMExtractor;
import org.bouncycastle.pqc.jcajce.provider.Util;
import org.bouncycastle.pqc.jcajce.provider.ntru.BCNTRUPrivateKey;

public class NTRUDecapsulatorSpi implements KEMSpi.DecapsulatorSpi {
  BCNTRUPrivateKey privateKey;
  
  KTSParameterSpec parameterSpec;
  
  NTRUKEMExtractor kemExt;
  
  public NTRUDecapsulatorSpi(BCNTRUPrivateKey paramBCNTRUPrivateKey, KTSParameterSpec paramKTSParameterSpec) {
    this.privateKey = paramBCNTRUPrivateKey;
    this.parameterSpec = paramKTSParameterSpec;
    this.kemExt = new NTRUKEMExtractor(paramBCNTRUPrivateKey.getKeyParams());
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\21\org\bouncycastle\pqc\jcajce\provider\ntru\NTRUDecapsulatorSpi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */