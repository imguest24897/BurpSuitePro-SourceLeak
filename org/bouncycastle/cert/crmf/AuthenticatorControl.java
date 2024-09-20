package org.bouncycastle.cert.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.crmf.CRMFObjectIdentifiers;

public class AuthenticatorControl implements Control {
  private static final ASN1ObjectIdentifier type = CRMFObjectIdentifiers.id_regCtrl_authenticator;
  
  private final ASN1UTF8String token;
  
  public AuthenticatorControl(ASN1UTF8String paramASN1UTF8String) {
    this.token = paramASN1UTF8String;
  }
  
  public AuthenticatorControl(String paramString) {
    this.token = (ASN1UTF8String)new DERUTF8String(paramString);
  }
  
  public ASN1ObjectIdentifier getType() {
    return type;
  }
  
  public ASN1Encodable getValue() {
    return (ASN1Encodable)this.token;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\AuthenticatorControl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */