package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public class PolicyQualifierId extends ASN1ObjectIdentifier {
  private static final String id_qt = "1.3.6.1.5.5.7.2";
  
  public static final PolicyQualifierId id_qt_cps = new PolicyQualifierId("1.3.6.1.5.5.7.2.1");
  
  public static final PolicyQualifierId id_qt_unotice = new PolicyQualifierId("1.3.6.1.5.5.7.2.2");
  
  private PolicyQualifierId(String paramString) {
    super(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\x509\PolicyQualifierId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */