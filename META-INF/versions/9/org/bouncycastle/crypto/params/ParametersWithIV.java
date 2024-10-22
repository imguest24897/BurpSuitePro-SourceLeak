package META-INF.versions.9.org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class ParametersWithIV implements CipherParameters {
  private byte[] iv;
  
  private CipherParameters parameters;
  
  public ParametersWithIV(CipherParameters paramCipherParameters, byte[] paramArrayOfbyte) {
    this(paramCipherParameters, paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public ParametersWithIV(CipherParameters paramCipherParameters, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.iv = new byte[paramInt2];
    this.parameters = paramCipherParameters;
    System.arraycopy(paramArrayOfbyte, paramInt1, this.iv, 0, paramInt2);
  }
  
  public byte[] getIV() {
    return this.iv;
  }
  
  public CipherParameters getParameters() {
    return this.parameters;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\crypto\params\ParametersWithIV.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */