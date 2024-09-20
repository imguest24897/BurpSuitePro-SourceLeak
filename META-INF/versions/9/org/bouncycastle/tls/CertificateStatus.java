package META-INF.versions.9.org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ocsp.OCSPResponse;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.TlsContext;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;

public class CertificateStatus {
  protected short statusType;
  
  protected Object response;
  
  public CertificateStatus(short paramShort, Object paramObject) {
    if (!isCorrectType(paramShort, paramObject))
      throw new IllegalArgumentException("'response' is not an instance of the correct type"); 
    this.statusType = paramShort;
    this.response = paramObject;
  }
  
  public short getStatusType() {
    return this.statusType;
  }
  
  public Object getResponse() {
    return this.response;
  }
  
  public OCSPResponse getOCSPResponse() {
    if (!isCorrectType((short)1, this.response))
      throw new IllegalStateException("'response' is not an OCSPResponse"); 
    return (OCSPResponse)this.response;
  }
  
  public Vector getOCSPResponseList() {
    if (!isCorrectType((short)2, this.response))
      throw new IllegalStateException("'response' is not an OCSPResponseList"); 
    return (Vector)this.response;
  }
  
  public void encode(OutputStream paramOutputStream) throws IOException {
    OCSPResponse oCSPResponse;
    Vector<OCSPResponse> vector;
    byte[] arrayOfByte;
    int i;
    Vector<byte[]> vector1;
    long l;
    byte b;
    TlsUtils.writeUint8(this.statusType, paramOutputStream);
    switch (this.statusType) {
      case 1:
        oCSPResponse = (OCSPResponse)this.response;
        arrayOfByte = oCSPResponse.getEncoded("DER");
        TlsUtils.writeOpaque24(arrayOfByte, paramOutputStream);
        return;
      case 2:
        vector = (Vector)this.response;
        i = vector.size();
        vector1 = new Vector(i);
        l = 0L;
        for (b = 0; b < i; b++) {
          OCSPResponse oCSPResponse1 = vector.elementAt(b);
          if (oCSPResponse1 == null) {
            vector1.addElement(TlsUtils.EMPTY_BYTES);
          } else {
            byte[] arrayOfByte1 = oCSPResponse1.getEncoded("DER");
            vector1.addElement(arrayOfByte1);
            l += arrayOfByte1.length;
          } 
          l += 3L;
        } 
        TlsUtils.checkUint24(l);
        TlsUtils.writeUint24((int)l, paramOutputStream);
        for (b = 0; b < i; b++) {
          byte[] arrayOfByte1 = vector1.elementAt(b);
          TlsUtils.writeOpaque24(arrayOfByte1, paramOutputStream);
        } 
        return;
    } 
    throw new TlsFatalAlert((short)80);
  }
  
  public static org.bouncycastle.tls.CertificateStatus parse(TlsContext paramTlsContext, InputStream paramInputStream) throws IOException {
    OCSPResponse oCSPResponse;
    Vector<OCSPResponse> vector1;
    byte[] arrayOfByte;
    ByteArrayInputStream byteArrayInputStream;
    Vector<OCSPResponse> vector2;
    SecurityParameters securityParameters = paramTlsContext.getSecurityParametersHandshake();
    Certificate certificate = securityParameters.getPeerCertificate();
    if (null == certificate || certificate.isEmpty() || 0 != certificate.getCertificateType())
      throw new TlsFatalAlert((short)80); 
    int i = certificate.getLength();
    int j = securityParameters.getStatusRequestVersion();
    short s = TlsUtils.readUint8(paramInputStream);
    switch (s) {
      case 1:
        requireStatusRequestVersion(1, j);
        arrayOfByte = TlsUtils.readOpaque24(paramInputStream, 1);
        oCSPResponse = parseOCSPResponse(arrayOfByte);
        return new org.bouncycastle.tls.CertificateStatus(s, oCSPResponse);
      case 2:
        requireStatusRequestVersion(2, j);
        arrayOfByte = TlsUtils.readOpaque24(paramInputStream, 1);
        byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
        vector2 = new Vector();
        while (byteArrayInputStream.available() > 0) {
          if (vector2.size() >= i)
            throw new TlsFatalAlert((short)47); 
          int k = TlsUtils.readUint24(byteArrayInputStream);
          if (k < 1) {
            vector2.addElement(null);
            continue;
          } 
          byte[] arrayOfByte1 = TlsUtils.readFully(k, byteArrayInputStream);
          vector2.addElement(parseOCSPResponse(arrayOfByte1));
        } 
        vector2.trimToSize();
        vector1 = vector2;
        return new org.bouncycastle.tls.CertificateStatus(s, vector1);
    } 
    throw new TlsFatalAlert((short)50);
  }
  
  protected static boolean isCorrectType(short paramShort, Object paramObject) {
    switch (paramShort) {
      case 1:
        return paramObject instanceof OCSPResponse;
      case 2:
        return isOCSPResponseList(paramObject);
    } 
    throw new IllegalArgumentException("'statusType' is an unsupported CertificateStatusType");
  }
  
  protected static boolean isOCSPResponseList(Object paramObject) {
    if (!(paramObject instanceof Vector))
      return false; 
    Vector<Object> vector = (Vector)paramObject;
    int i = vector.size();
    if (i < 1)
      return false; 
    for (byte b = 0; b < i; b++) {
      Object object = vector.elementAt(b);
      if (null != object && !(object instanceof OCSPResponse))
        return false; 
    } 
    return true;
  }
  
  protected static OCSPResponse parseOCSPResponse(byte[] paramArrayOfbyte) throws IOException {
    ASN1Primitive aSN1Primitive = TlsUtils.readASN1Object(paramArrayOfbyte);
    OCSPResponse oCSPResponse = OCSPResponse.getInstance(aSN1Primitive);
    TlsUtils.requireDEREncoding((ASN1Object)oCSPResponse, paramArrayOfbyte);
    return oCSPResponse;
  }
  
  protected static void requireStatusRequestVersion(int paramInt1, int paramInt2) throws IOException {
    if (paramInt2 < paramInt1)
      throw new TlsFatalAlert((short)50); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\CertificateStatus.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */