package org.bouncycastle.oer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Encodable;

public class OERDecoder {
  public static ASN1Encodable decode(byte[] paramArrayOfbyte, Element paramElement) throws IOException {
    return decode(new ByteArrayInputStream(paramArrayOfbyte), paramElement);
  }
  
  public static ASN1Encodable decode(InputStream paramInputStream, Element paramElement) throws IOException {
    OERInputStream oERInputStream = new OERInputStream(paramInputStream);
    return (ASN1Encodable)oERInputStream.parse(paramElement);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\OERDecoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */