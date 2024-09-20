package org.bouncycastle.pqc.legacy.crypto.ntru;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public class NTRUEncryptionKeyParameters extends AsymmetricKeyParameter {
  protected final NTRUEncryptionParameters params;
  
  public NTRUEncryptionKeyParameters(boolean paramBoolean, NTRUEncryptionParameters paramNTRUEncryptionParameters) {
    super(paramBoolean);
    this.params = paramNTRUEncryptionParameters;
  }
  
  public NTRUEncryptionParameters getParameters() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\ntru\NTRUEncryptionKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */