package org.bouncycastle.pqc.crypto.gemss;

import org.bouncycastle.util.Arrays;

public class GeMSSPrivateKeyParameters extends GeMSSKeyParameters {
  final byte[] sk;
  
  public GeMSSPrivateKeyParameters(GeMSSParameters paramGeMSSParameters, byte[] paramArrayOfbyte) {
    super(false, paramGeMSSParameters);
    this.sk = new byte[paramArrayOfbyte.length];
    System.arraycopy(paramArrayOfbyte, 0, this.sk, 0, this.sk.length);
  }
  
  public byte[] getEncoded() {
    return Arrays.clone(this.sk);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\gemss\GeMSSPrivateKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */