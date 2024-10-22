package org.bouncycastle.openssl;

import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

public class PEMKeyPair {
  private final SubjectPublicKeyInfo publicKeyInfo;
  
  private final PrivateKeyInfo privateKeyInfo;
  
  public PEMKeyPair(SubjectPublicKeyInfo paramSubjectPublicKeyInfo, PrivateKeyInfo paramPrivateKeyInfo) {
    this.publicKeyInfo = paramSubjectPublicKeyInfo;
    this.privateKeyInfo = paramPrivateKeyInfo;
  }
  
  public PrivateKeyInfo getPrivateKeyInfo() {
    return this.privateKeyInfo;
  }
  
  public SubjectPublicKeyInfo getPublicKeyInfo() {
    return this.publicKeyInfo;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\openssl\PEMKeyPair.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */