package org.bouncycastle.pqc.crypto.gemss;

import org.bouncycastle.util.Arrays;

public class GeMSSPublicKeyParameters extends GeMSSKeyParameters {
  private final byte[] pk;
  
  public GeMSSPublicKeyParameters(GeMSSParameters paramGeMSSParameters, byte[] paramArrayOfbyte) {
    super(false, paramGeMSSParameters);
    this.pk = new byte[paramArrayOfbyte.length];
    System.arraycopy(paramArrayOfbyte, 0, this.pk, 0, this.pk.length);
  }
  
  public byte[] getPK() {
    return this.pk;
  }
  
  public byte[] getEncoded() {
    return Arrays.clone(this.pk);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\gemss\GeMSSPublicKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */