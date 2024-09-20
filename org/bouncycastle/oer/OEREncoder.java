package org.bouncycastle.oer;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.asn1.ASN1Encodable;

public class OEREncoder {
  public static byte[] toByteArray(ASN1Encodable paramASN1Encodable, Element paramElement) {
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      (new OEROutputStream(byteArrayOutputStream)).write(paramASN1Encodable, paramElement);
      byteArrayOutputStream.flush();
      byteArrayOutputStream.close();
      return byteArrayOutputStream.toByteArray();
    } catch (Exception exception) {
      throw new IllegalStateException(exception.getMessage(), exception);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\OEREncoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */