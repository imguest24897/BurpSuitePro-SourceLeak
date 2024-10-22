package org.bouncycastle.cert.path;

import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.cert.X509CertificateHolder;

class CertPathUtils {
  static Set getCriticalExtensionsOIDs(X509CertificateHolder[] paramArrayOfX509CertificateHolder) {
    HashSet hashSet = new HashSet();
    for (byte b = 0; b != paramArrayOfX509CertificateHolder.length; b++)
      hashSet.addAll(paramArrayOfX509CertificateHolder[b].getCriticalExtensionOIDs()); 
    return hashSet;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\path\CertPathUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */