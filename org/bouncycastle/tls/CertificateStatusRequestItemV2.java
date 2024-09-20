package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CertificateStatusRequestItemV2 {
  protected short statusType;
  
  protected Object request;
  
  public CertificateStatusRequestItemV2(short paramShort, Object paramObject) {
    if (!isCorrectType(paramShort, paramObject))
      throw new IllegalArgumentException("'request' is not an instance of the correct type"); 
    this.statusType = paramShort;
    this.request = paramObject;
  }
  
  public short getStatusType() {
    return this.statusType;
  }
  
  public Object getRequest() {
    return this.request;
  }
  
  public OCSPStatusRequest getOCSPStatusRequest() {
    if (!(this.request instanceof OCSPStatusRequest))
      throw new IllegalStateException("'request' is not an OCSPStatusRequest"); 
    return (OCSPStatusRequest)this.request;
  }
  
  public void encode(OutputStream paramOutputStream) throws IOException {
    TlsUtils.writeUint8(this.statusType, paramOutputStream);
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    switch (this.statusType) {
      case 1:
      case 2:
        ((OCSPStatusRequest)this.request).encode(byteArrayOutputStream);
        break;
      default:
        throw new TlsFatalAlert((short)80);
    } 
    byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
    TlsUtils.writeOpaque16(arrayOfByte, paramOutputStream);
  }
  
  public static CertificateStatusRequestItemV2 parse(InputStream paramInputStream) throws IOException {
    OCSPStatusRequest oCSPStatusRequest;
    short s = TlsUtils.readUint8(paramInputStream);
    byte[] arrayOfByte = TlsUtils.readOpaque16(paramInputStream);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
    switch (s) {
      case 1:
      case 2:
        oCSPStatusRequest = OCSPStatusRequest.parse(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        return new CertificateStatusRequestItemV2(s, oCSPStatusRequest);
    } 
    throw new TlsFatalAlert((short)50);
  }
  
  protected static boolean isCorrectType(short paramShort, Object paramObject) {
    switch (paramShort) {
      case 1:
      case 2:
        return paramObject instanceof OCSPStatusRequest;
    } 
    throw new IllegalArgumentException("'statusType' is an unsupported CertificateStatusType");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\CertificateStatusRequestItemV2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */