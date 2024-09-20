package org.bouncycastle.jsse.provider;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.security.cert.CertificateEncodingException;
import javax.security.cert.CertificateException;
import javax.security.cert.CertificateExpiredException;
import javax.security.cert.CertificateNotYetValidException;
import javax.security.cert.CertificateParsingException;
import javax.security.cert.X509Certificate;
import org.bouncycastle.jsse.BCExtendedSSLSession;

class OldCertUtil {
  static X509Certificate[] getPeerCertificateChain(BCExtendedSSLSession paramBCExtendedSSLSession) throws SSLPeerUnverifiedException {
    boolean bool = paramBCExtendedSSLSession.isFipsMode();
    Certificate[] arrayOfCertificate = paramBCExtendedSSLSession.getPeerCertificates();
    X509Certificate[] arrayOfX509Certificate1 = new X509Certificate[arrayOfCertificate.length];
    byte b = 0;
    try {
      for (byte b1 = 0; b1 < arrayOfCertificate.length; b1++) {
        Certificate certificate = arrayOfCertificate[b1];
        if (certificate instanceof X509Certificate) {
          X509Certificate x509Certificate = (X509Certificate)certificate;
          if (bool) {
            arrayOfX509Certificate1[b++] = new X509CertificateWrapper(x509Certificate);
          } else {
            arrayOfX509Certificate1[b++] = X509Certificate.getInstance(x509Certificate.getEncoded());
          } 
        } 
      } 
    } catch (Exception exception) {
      throw new SSLPeerUnverifiedException(exception.getMessage());
    } 
    if (b >= arrayOfX509Certificate1.length)
      return arrayOfX509Certificate1; 
    X509Certificate[] arrayOfX509Certificate2 = new X509Certificate[b];
    System.arraycopy(arrayOfX509Certificate1, 0, arrayOfX509Certificate2, 0, b);
    return arrayOfX509Certificate2;
  }
  
  private static class X509CertificateWrapper extends X509Certificate {
    private final X509Certificate c;
    
    private X509CertificateWrapper(X509Certificate param1X509Certificate) {
      this.c = param1X509Certificate;
    }
    
    public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
      try {
        this.c.checkValidity();
      } catch (CertificateExpiredException certificateExpiredException) {
        throw new CertificateExpiredException(certificateExpiredException.getMessage());
      } catch (CertificateNotYetValidException certificateNotYetValidException) {
        throw new CertificateNotYetValidException(certificateNotYetValidException.getMessage());
      } 
    }
    
    public void checkValidity(Date param1Date) throws CertificateExpiredException, CertificateNotYetValidException {
      try {
        this.c.checkValidity(param1Date);
      } catch (CertificateExpiredException certificateExpiredException) {
        throw new CertificateExpiredException(certificateExpiredException.getMessage());
      } catch (CertificateNotYetValidException certificateNotYetValidException) {
        throw new CertificateNotYetValidException(certificateNotYetValidException.getMessage());
      } 
    }
    
    public int getVersion() {
      return this.c.getVersion() - 1;
    }
    
    public BigInteger getSerialNumber() {
      return this.c.getSerialNumber();
    }
    
    public Principal getIssuerDN() {
      return this.c.getIssuerX500Principal();
    }
    
    public Principal getSubjectDN() {
      return this.c.getSubjectX500Principal();
    }
    
    public Date getNotBefore() {
      return this.c.getNotBefore();
    }
    
    public Date getNotAfter() {
      return this.c.getNotAfter();
    }
    
    public String getSigAlgName() {
      return this.c.getSigAlgName();
    }
    
    public String getSigAlgOID() {
      return this.c.getSigAlgOID();
    }
    
    public byte[] getSigAlgParams() {
      return this.c.getSigAlgParams();
    }
    
    public byte[] getEncoded() throws CertificateEncodingException {
      try {
        return this.c.getEncoded();
      } catch (CertificateEncodingException certificateEncodingException) {
        throw new CertificateEncodingException(certificateEncodingException.getMessage());
      } 
    }
    
    public void verify(PublicKey param1PublicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
      try {
        this.c.verify(param1PublicKey);
      } catch (CertificateEncodingException certificateEncodingException) {
        throw new CertificateEncodingException(certificateEncodingException.getMessage());
      } catch (CertificateExpiredException certificateExpiredException) {
        throw new CertificateExpiredException(certificateExpiredException.getMessage());
      } catch (CertificateNotYetValidException certificateNotYetValidException) {
        throw new CertificateNotYetValidException(certificateNotYetValidException.getMessage());
      } catch (CertificateParsingException certificateParsingException) {
        throw new CertificateParsingException(certificateParsingException.getMessage());
      } catch (CertificateException certificateException) {
        throw new CertificateException(certificateException.getMessage());
      } 
    }
    
    public void verify(PublicKey param1PublicKey, String param1String) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
      try {
        this.c.verify(param1PublicKey, param1String);
      } catch (CertificateEncodingException certificateEncodingException) {
        throw new CertificateEncodingException(certificateEncodingException.getMessage());
      } catch (CertificateExpiredException certificateExpiredException) {
        throw new CertificateExpiredException(certificateExpiredException.getMessage());
      } catch (CertificateNotYetValidException certificateNotYetValidException) {
        throw new CertificateNotYetValidException(certificateNotYetValidException.getMessage());
      } catch (CertificateParsingException certificateParsingException) {
        throw new CertificateParsingException(certificateParsingException.getMessage());
      } catch (CertificateException certificateException) {
        throw new CertificateException(certificateException.getMessage());
      } 
    }
    
    public String toString() {
      return this.c.toString();
    }
    
    public PublicKey getPublicKey() {
      return this.c.getPublicKey();
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\OldCertUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */