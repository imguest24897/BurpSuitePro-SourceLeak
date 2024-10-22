package org.bouncycastle.eac.operator.jcajce;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;

class NamedEACHelper extends EACHelper {
  private final String providerName;
  
  NamedEACHelper(String paramString) {
    this.providerName = paramString;
  }
  
  protected Signature createSignature(String paramString) throws NoSuchProviderException, NoSuchAlgorithmException {
    return Signature.getInstance(paramString, this.providerName);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\eac\operator\jcajce\NamedEACHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */