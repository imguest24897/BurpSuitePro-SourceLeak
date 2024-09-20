package org.bouncycastle.cert.crmf;

import java.util.ArrayList;
import org.bouncycastle.asn1.cmp.CMPCertificate;
import org.bouncycastle.asn1.cmp.CertRepMessage;
import org.bouncycastle.asn1.cmp.CertResponse;
import org.bouncycastle.asn1.cmp.PKIBody;
import org.bouncycastle.cert.X509CertificateHolder;

public class CertificateRepMessage {
  private final CertResponse[] resps;
  
  private final CMPCertificate[] caCerts;
  
  public CertificateRepMessage(CertRepMessage paramCertRepMessage) {
    this.resps = paramCertRepMessage.getResponse();
    this.caCerts = paramCertRepMessage.getCaPubs();
  }
  
  public static CertificateRepMessage fromPKIBody(PKIBody paramPKIBody) {
    if (!isCertificateRepMessage(paramPKIBody.getType()))
      throw new IllegalArgumentException("content of PKIBody wrong type: " + paramPKIBody.getType()); 
    return new CertificateRepMessage(CertRepMessage.getInstance(paramPKIBody.getContent()));
  }
  
  public static boolean isCertificateRepMessage(int paramInt) {
    switch (paramInt) {
      case 1:
      case 3:
      case 8:
      case 14:
        return true;
    } 
    return false;
  }
  
  public CertificateResponse[] getResponses() {
    CertificateResponse[] arrayOfCertificateResponse = new CertificateResponse[this.resps.length];
    for (byte b = 0; b != arrayOfCertificateResponse.length; b++)
      arrayOfCertificateResponse[b] = new CertificateResponse(this.resps[b]); 
    return arrayOfCertificateResponse;
  }
  
  public X509CertificateHolder[] getX509Certificates() {
    ArrayList<X509CertificateHolder> arrayList = new ArrayList();
    for (byte b = 0; b != this.caCerts.length; b++) {
      if (this.caCerts[b].isX509v3PKCert())
        arrayList.add(new X509CertificateHolder(this.caCerts[b].getX509v3PKCert())); 
    } 
    return arrayList.<X509CertificateHolder>toArray(new X509CertificateHolder[0]);
  }
  
  public boolean isOnlyX509PKCertificates() {
    boolean bool = true;
    for (byte b = 0; b != this.caCerts.length; b++)
      bool &= this.caCerts[b].isX509v3PKCert(); 
    return bool;
  }
  
  public CMPCertificate[] getCMPCertificates() {
    CMPCertificate[] arrayOfCMPCertificate = new CMPCertificate[this.caCerts.length];
    System.arraycopy(this.caCerts, 0, arrayOfCMPCertificate, 0, arrayOfCMPCertificate.length);
    return arrayOfCMPCertificate;
  }
  
  public CertRepMessage toASN1Structure() {
    return new CertRepMessage(this.caCerts, this.resps);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\CertificateRepMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */