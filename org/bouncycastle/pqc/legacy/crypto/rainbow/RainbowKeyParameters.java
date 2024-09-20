package org.bouncycastle.pqc.legacy.crypto.rainbow;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public class RainbowKeyParameters extends AsymmetricKeyParameter {
  private int docLength;
  
  public RainbowKeyParameters(boolean paramBoolean, int paramInt) {
    super(paramBoolean);
    this.docLength = paramInt;
  }
  
  public int getDocLength() {
    return this.docLength;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\rainbow\RainbowKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */