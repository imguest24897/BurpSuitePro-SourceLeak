package org.bouncycastle.cms;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public class CMSConfig {
  public static void setSigningEncryptionAlgorithmMapping(String paramString1, String paramString2) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(paramString1);
    CMSSignedHelper.INSTANCE.setSigningEncryptionAlgorithmMapping(aSN1ObjectIdentifier, paramString2);
  }
  
  public static void setSigningDigestAlgorithmMapping(String paramString1, String paramString2) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(paramString1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */