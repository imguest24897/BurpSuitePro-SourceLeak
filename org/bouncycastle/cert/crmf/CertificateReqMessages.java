package org.bouncycastle.cert.crmf;

import org.bouncycastle.asn1.cmp.PKIBody;
import org.bouncycastle.asn1.crmf.CertReqMessages;
import org.bouncycastle.asn1.crmf.CertReqMsg;

public class CertificateReqMessages {
  private final CertReqMsg[] reqs;
  
  public CertificateReqMessages(CertReqMessages paramCertReqMessages) {
    this.reqs = paramCertReqMessages.toCertReqMsgArray();
  }
  
  public static CertificateReqMessages fromPKIBody(PKIBody paramPKIBody) {
    if (!isCertificateRequestMessages(paramPKIBody.getType()))
      throw new IllegalArgumentException("content of PKIBody wrong type: " + paramPKIBody.getType()); 
    return new CertificateReqMessages(CertReqMessages.getInstance(paramPKIBody.getContent()));
  }
  
  public static boolean isCertificateRequestMessages(int paramInt) {
    switch (paramInt) {
      case 0:
      case 2:
      case 7:
      case 9:
      case 13:
        return true;
    } 
    return false;
  }
  
  public CertificateRequestMessage[] getRequests() {
    CertificateRequestMessage[] arrayOfCertificateRequestMessage = new CertificateRequestMessage[this.reqs.length];
    for (byte b = 0; b != arrayOfCertificateRequestMessage.length; b++)
      arrayOfCertificateRequestMessage[b] = new CertificateRequestMessage(this.reqs[b]); 
    return arrayOfCertificateRequestMessage;
  }
  
  public CertReqMessages toASN1Structure() {
    return new CertReqMessages(this.reqs);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\CertificateReqMessages.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */