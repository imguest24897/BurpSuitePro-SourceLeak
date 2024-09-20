package org.bouncycastle.cert.crmf;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.crmf.CertReqMessages;
import org.bouncycastle.asn1.crmf.CertReqMsg;

public class CertificateReqMessagesBuilder {
  private final List<CertReqMsg> requests = new ArrayList<>();
  
  public void addRequest(CertificateRequestMessage paramCertificateRequestMessage) {
    this.requests.add(paramCertificateRequestMessage.toASN1Structure());
  }
  
  public CertificateReqMessages build() {
    CertificateReqMessages certificateReqMessages = new CertificateReqMessages(new CertReqMessages(this.requests.<CertReqMsg>toArray(new CertReqMsg[0])));
    this.requests.clear();
    return certificateReqMessages;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\CertificateReqMessagesBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */