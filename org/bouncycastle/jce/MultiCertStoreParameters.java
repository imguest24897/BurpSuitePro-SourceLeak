package org.bouncycastle.jce;

import java.security.cert.CertStoreParameters;
import java.util.Collection;

public class MultiCertStoreParameters implements CertStoreParameters {
  private Collection certStores;
  
  private boolean searchAllStores;
  
  public MultiCertStoreParameters(Collection paramCollection) {
    this(paramCollection, true);
  }
  
  public MultiCertStoreParameters(Collection paramCollection, boolean paramBoolean) {
    this.certStores = paramCollection;
    this.searchAllStores = paramBoolean;
  }
  
  public Collection getCertStores() {
    return this.certStores;
  }
  
  public boolean getSearchAllStores() {
    return this.searchAllStores;
  }
  
  public Object clone() {
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jce\MultiCertStoreParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */