package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ocsp.ResponderID;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.util.io.Streams;

public class OCSPStatusRequest {
  protected Vector responderIDList;
  
  protected Extensions requestExtensions;
  
  public OCSPStatusRequest(Vector paramVector, Extensions paramExtensions) {
    this.responderIDList = paramVector;
    this.requestExtensions = paramExtensions;
  }
  
  public Vector getResponderIDList() {
    return this.responderIDList;
  }
  
  public Extensions getRequestExtensions() {
    return this.requestExtensions;
  }
  
  public void encode(OutputStream paramOutputStream) throws IOException {
    if (this.responderIDList == null || this.responderIDList.isEmpty()) {
      TlsUtils.writeUint16(0, paramOutputStream);
    } else {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      for (byte b = 0; b < this.responderIDList.size(); b++) {
        ResponderID responderID = this.responderIDList.elementAt(b);
        byte[] arrayOfByte = responderID.getEncoded("DER");
        TlsUtils.writeOpaque16(arrayOfByte, byteArrayOutputStream);
      } 
      TlsUtils.checkUint16(byteArrayOutputStream.size());
      TlsUtils.writeUint16(byteArrayOutputStream.size(), paramOutputStream);
      Streams.writeBufTo(byteArrayOutputStream, paramOutputStream);
    } 
    if (this.requestExtensions == null) {
      TlsUtils.writeUint16(0, paramOutputStream);
    } else {
      byte[] arrayOfByte = this.requestExtensions.getEncoded("DER");
      TlsUtils.checkUint16(arrayOfByte.length);
      TlsUtils.writeUint16(arrayOfByte.length, paramOutputStream);
      paramOutputStream.write(arrayOfByte);
    } 
  }
  
  public static OCSPStatusRequest parse(InputStream paramInputStream) throws IOException {
    Extensions extensions;
    Vector<ResponderID> vector = new Vector();
    byte[] arrayOfByte1 = TlsUtils.readOpaque16(paramInputStream);
    if (arrayOfByte1.length > 0) {
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte1);
      do {
        byte[] arrayOfByte = TlsUtils.readOpaque16(byteArrayInputStream, 1);
        ASN1Primitive aSN1Primitive = TlsUtils.readASN1Object(arrayOfByte);
        ResponderID responderID = ResponderID.getInstance(aSN1Primitive);
        TlsUtils.requireDEREncoding((ASN1Object)responderID, arrayOfByte);
        vector.addElement(responderID);
      } while (byteArrayInputStream.available() > 0);
    } 
    arrayOfByte1 = null;
    byte[] arrayOfByte2 = TlsUtils.readOpaque16(paramInputStream);
    if (arrayOfByte2.length > 0) {
      ASN1Primitive aSN1Primitive = TlsUtils.readASN1Object(arrayOfByte2);
      Extensions extensions1 = Extensions.getInstance(aSN1Primitive);
      TlsUtils.requireDEREncoding((ASN1Object)extensions1, arrayOfByte2);
      extensions = extensions1;
    } 
    return new OCSPStatusRequest(vector, extensions);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\OCSPStatusRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */