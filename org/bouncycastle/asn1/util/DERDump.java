package org.bouncycastle.asn1.util;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Primitive;

public class DERDump extends ASN1Dump {
  public static String dumpAsString(ASN1Primitive paramASN1Primitive) {
    StringBuffer stringBuffer = new StringBuffer();
    _dumpAsString("", false, paramASN1Primitive, stringBuffer);
    return stringBuffer.toString();
  }
  
  public static String dumpAsString(ASN1Encodable paramASN1Encodable) {
    return dumpAsString(paramASN1Encodable.toASN1Primitive());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn\\util\DERDump.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */