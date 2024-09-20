package META-INF.versions.9.org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters;
import org.bouncycastle.util.Arrays;

public class SNTRUPrimePrivateKeyParameters extends SNTRUPrimeKeyParameters {
  private final byte[] f;
  
  private final byte[] ginv;
  
  private final byte[] pk;
  
  private final byte[] rho;
  
  private final byte[] hash;
  
  public SNTRUPrimePrivateKeyParameters(SNTRUPrimeParameters paramSNTRUPrimeParameters, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5) {
    super(true, paramSNTRUPrimeParameters);
    this.f = Arrays.clone(paramArrayOfbyte1);
    this.ginv = Arrays.clone(paramArrayOfbyte2);
    this.pk = Arrays.clone(paramArrayOfbyte3);
    this.rho = Arrays.clone(paramArrayOfbyte4);
    this.hash = Arrays.clone(paramArrayOfbyte5);
  }
  
  public byte[] getF() {
    return Arrays.clone(this.f);
  }
  
  public byte[] getGinv() {
    return Arrays.clone(this.ginv);
  }
  
  public byte[] getPk() {
    return Arrays.clone(this.pk);
  }
  
  public byte[] getRho() {
    return Arrays.clone(this.rho);
  }
  
  public byte[] getHash() {
    return Arrays.clone(this.hash);
  }
  
  public byte[] getEncoded() {
    byte[] arrayOfByte = new byte[getParameters().getPrivateKeyBytes()];
    System.arraycopy(this.f, 0, arrayOfByte, 0, this.f.length);
    System.arraycopy(this.ginv, 0, arrayOfByte, this.f.length, this.ginv.length);
    System.arraycopy(this.pk, 0, arrayOfByte, this.f.length + this.ginv.length, this.pk.length);
    System.arraycopy(this.rho, 0, arrayOfByte, this.f.length + this.ginv.length + this.pk.length, this.rho.length);
    System.arraycopy(this.hash, 0, arrayOfByte, this.f.length + this.ginv.length + this.pk.length + this.rho.length, this.hash.length);
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\ntruprime\SNTRUPrimePrivateKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */