package org.bouncycastle.asn1.x500.style;

import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

public class BCStrictStyle extends BCStyle {
  public static final X500NameStyle INSTANCE = new BCStrictStyle();
  
  public boolean areEqual(X500Name paramX500Name1, X500Name paramX500Name2) {
    if (paramX500Name1.size() != paramX500Name2.size())
      return false; 
    RDN[] arrayOfRDN1 = paramX500Name1.getRDNs();
    RDN[] arrayOfRDN2 = paramX500Name2.getRDNs();
    for (byte b = 0; b != arrayOfRDN1.length; b++) {
      if (!rdnAreEqual(arrayOfRDN1[b], arrayOfRDN2[b]))
        return false; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\x500\style\BCStrictStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */