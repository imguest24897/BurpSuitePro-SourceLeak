package org.bouncycastle.tls;

import java.util.Hashtable;
import org.bouncycastle.tls.crypto.TlsCertificate;

public class CertificateEntry {
  protected final TlsCertificate certificate;
  
  protected final Hashtable extensions;
  
  public CertificateEntry(TlsCertificate paramTlsCertificate, Hashtable paramHashtable) {
    if (null == paramTlsCertificate)
      throw new NullPointerException("'certificate' cannot be null"); 
    this.certificate = paramTlsCertificate;
    this.extensions = paramHashtable;
  }
  
  public TlsCertificate getCertificate() {
    return this.certificate;
  }
  
  public Hashtable getExtensions() {
    return this.extensions;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\CertificateEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */