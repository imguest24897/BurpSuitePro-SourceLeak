package org.bouncycastle.asn1.x509;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.x500.style.BCStyle;

public class X509DefaultEntryConverter extends X509NameEntryConverter {
  public ASN1Primitive getConvertedValue(ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString) {
    if (paramString.length() != 0 && paramString.charAt(0) == '#')
      try {
        return convertHexEncoded(paramString, 1);
      } catch (IOException iOException) {
        throw new RuntimeException("can't recode value for oid " + paramASN1ObjectIdentifier.getId());
      }  
    if (paramString.length() != 0 && paramString.charAt(0) == '\\')
      paramString = paramString.substring(1); 
    return (ASN1Primitive)((paramASN1ObjectIdentifier.equals((ASN1Primitive)BCStyle.EmailAddress) || paramASN1ObjectIdentifier.equals((ASN1Primitive)BCStyle.DC)) ? new DERIA5String(paramString) : (paramASN1ObjectIdentifier.equals((ASN1Primitive)BCStyle.DATE_OF_BIRTH) ? new DERGeneralizedTime(paramString) : ((paramASN1ObjectIdentifier.equals((ASN1Primitive)BCStyle.C) || paramASN1ObjectIdentifier.equals((ASN1Primitive)BCStyle.SERIALNUMBER) || paramASN1ObjectIdentifier.equals((ASN1Primitive)BCStyle.DN_QUALIFIER) || paramASN1ObjectIdentifier.equals((ASN1Primitive)BCStyle.TELEPHONE_NUMBER)) ? new DERPrintableString(paramString) : new DERUTF8String(paramString))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\x509\X509DefaultEntryConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */