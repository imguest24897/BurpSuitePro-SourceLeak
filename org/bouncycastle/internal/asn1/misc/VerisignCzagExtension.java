package org.bouncycastle.internal.asn1.misc;

import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.DERIA5String;

public class VerisignCzagExtension extends DERIA5String {
  public VerisignCzagExtension(ASN1IA5String paramASN1IA5String) {
    super(paramASN1IA5String.getString());
  }
  
  public String toString() {
    return "VerisignCzagExtension: " + getString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\internal\asn1\misc\VerisignCzagExtension.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */