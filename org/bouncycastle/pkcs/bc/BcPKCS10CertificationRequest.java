package org.bouncycastle.pkcs.bc;

import java.io.IOException;
import org.bouncycastle.asn1.pkcs.CertificationRequest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCSException;

public class BcPKCS10CertificationRequest extends PKCS10CertificationRequest {
  public BcPKCS10CertificationRequest(CertificationRequest paramCertificationRequest) {
    super(paramCertificationRequest);
  }
  
  public BcPKCS10CertificationRequest(byte[] paramArrayOfbyte) throws IOException {
    super(paramArrayOfbyte);
  }
  
  public BcPKCS10CertificationRequest(PKCS10CertificationRequest paramPKCS10CertificationRequest) {
    super(paramPKCS10CertificationRequest.toASN1Structure());
  }
  
  public AsymmetricKeyParameter getPublicKey() throws PKCSException {
    try {
      return PublicKeyFactory.createKey(getSubjectPublicKeyInfo());
    } catch (IOException iOException) {
      throw new PKCSException("error extracting key encoding: " + iOException.getMessage(), iOException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkcs\bc\BcPKCS10CertificationRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */