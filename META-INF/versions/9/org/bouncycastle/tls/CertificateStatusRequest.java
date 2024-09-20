package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.OCSPStatusRequest;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;

public class CertificateStatusRequest {
  protected short statusType;
  
  protected Object request;
  
  public CertificateStatusRequest(short paramShort, Object paramObject) {
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
    if (!isCorrectType((short)1, this.request))
      throw new IllegalStateException("'request' is not an OCSPStatusRequest"); 
    return (OCSPStatusRequest)this.request;
  }
  
  public void encode(OutputStream paramOutputStream) throws IOException {
    TlsUtils.writeUint8(this.statusType, paramOutputStream);
    switch (this.statusType) {
      case 1:
        ((OCSPStatusRequest)this.request).encode(paramOutputStream);
        return;
    } 
    throw new TlsFatalAlert((short)80);
  }
  
  public static org.bouncycastle.tls.CertificateStatusRequest parse(InputStream paramInputStream) throws IOException {
    OCSPStatusRequest oCSPStatusRequest;
    short s = TlsUtils.readUint8(paramInputStream);
    switch (s) {
      case 1:
        oCSPStatusRequest = OCSPStatusRequest.parse(paramInputStream);
        return new org.bouncycastle.tls.CertificateStatusRequest(s, oCSPStatusRequest);
    } 
    throw new TlsFatalAlert((short)50);
  }
  
  protected static boolean isCorrectType(short paramShort, Object paramObject) {
    switch (paramShort) {
      case 1:
        return paramObject instanceof OCSPStatusRequest;
    } 
    throw new IllegalArgumentException("'statusType' is an unsupported CertificateStatusType");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\CertificateStatusRequest.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */