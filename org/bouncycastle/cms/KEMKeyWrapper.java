package org.bouncycastle.cms;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.AsymmetricKeyWrapper;

public abstract class KEMKeyWrapper extends AsymmetricKeyWrapper {
  protected KEMKeyWrapper(AlgorithmIdentifier paramAlgorithmIdentifier) {
    super(paramAlgorithmIdentifier);
  }
  
  public abstract byte[] getEncapsulation();
  
  public abstract AlgorithmIdentifier getKdfAlgorithmIdentifier();
  
  public abstract int getKekLength();
  
  public abstract AlgorithmIdentifier getWrapAlgorithmIdentifier();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\KEMKeyWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */