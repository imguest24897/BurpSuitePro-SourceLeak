package META-INF.versions.9.org.bouncycastle.tls.crypto;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.tls.crypto.Tls13Verifier;
import org.bouncycastle.tls.crypto.TlsEncryptor;
import org.bouncycastle.tls.crypto.TlsVerifier;

public interface TlsCertificate {
  TlsEncryptor createEncryptor(int paramInt) throws IOException;
  
  TlsVerifier createVerifier(short paramShort) throws IOException;
  
  Tls13Verifier createVerifier(int paramInt) throws IOException;
  
  byte[] getEncoded() throws IOException;
  
  byte[] getExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier) throws IOException;
  
  BigInteger getSerialNumber();
  
  String getSigAlgOID();
  
  ASN1Encodable getSigAlgParams() throws IOException;
  
  short getLegacySignatureAlgorithm() throws IOException;
  
  boolean supportsSignatureAlgorithm(short paramShort) throws IOException;
  
  boolean supportsSignatureAlgorithmCA(short paramShort) throws IOException;
  
  org.bouncycastle.tls.crypto.TlsCertificate checkUsageInRole(int paramInt) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\TlsCertificate.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */