package org.bouncycastle.asn1;

public class DERUniversalString extends ASN1UniversalString {
  public DERUniversalString(byte[] paramArrayOfbyte) {
    this(paramArrayOfbyte, true);
  }
  
  DERUniversalString(byte[] paramArrayOfbyte, boolean paramBoolean) {
    super(paramArrayOfbyte, paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\DERUniversalString.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */