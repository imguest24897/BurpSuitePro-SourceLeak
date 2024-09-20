package META-INF.versions.9.org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeParameters;
import org.bouncycastle.util.Arrays;

public class NTRULPRimePrivateKeyParameters extends NTRULPRimeKeyParameters {
  private final byte[] enca;
  
  private final byte[] pk;
  
  private final byte[] rho;
  
  private final byte[] hash;
  
  public NTRULPRimePrivateKeyParameters(NTRULPRimeParameters paramNTRULPRimeParameters, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4) {
    super(true, paramNTRULPRimeParameters);
    this.enca = Arrays.clone(paramArrayOfbyte1);
    this.pk = Arrays.clone(paramArrayOfbyte2);
    this.rho = Arrays.clone(paramArrayOfbyte3);
    this.hash = Arrays.clone(paramArrayOfbyte4);
  }
  
  public byte[] getEnca() {
    return Arrays.clone(this.enca);
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
    System.arraycopy(this.enca, 0, arrayOfByte, 0, this.enca.length);
    System.arraycopy(this.pk, 0, arrayOfByte, this.enca.length, this.pk.length);
    System.arraycopy(this.rho, 0, arrayOfByte, this.enca.length + this.pk.length, this.rho.length);
    System.arraycopy(this.hash, 0, arrayOfByte, this.enca.length + this.pk.length + this.rho.length, this.hash.length);
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\ntruprime\NTRULPRimePrivateKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */