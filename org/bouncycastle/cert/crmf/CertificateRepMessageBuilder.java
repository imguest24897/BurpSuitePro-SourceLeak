package org.bouncycastle.cert.crmf;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmp.CMPCertificate;
import org.bouncycastle.asn1.cmp.CertRepMessage;
import org.bouncycastle.asn1.cmp.CertResponse;
import org.bouncycastle.cert.X509CertificateHolder;

public class CertificateRepMessageBuilder {
  private final List<CertResponse> responses = new ArrayList<>();
  
  private final CMPCertificate[] caCerts;
  
  public CertificateRepMessageBuilder(X509CertificateHolder... paramVarArgs) {
    this.caCerts = new CMPCertificate[paramVarArgs.length];
    for (byte b = 0; b != paramVarArgs.length; b++)
      this.caCerts[b] = new CMPCertificate(paramVarArgs[b].toASN1Structure()); 
  }
  
  public CertificateRepMessageBuilder addCertificateResponse(CertificateResponse paramCertificateResponse) {
    this.responses.add(paramCertificateResponse.toASN1Structure());
    return this;
  }
  
  public CertificateRepMessage build() {
    CertRepMessage certRepMessage;
    if (this.caCerts.length != 0) {
      certRepMessage = new CertRepMessage(this.caCerts, this.responses.<CertResponse>toArray(new CertResponse[0]));
    } else {
      certRepMessage = new CertRepMessage(null, this.responses.<CertResponse>toArray(new CertResponse[0]));
    } 
    this.responses.clear();
    return new CertificateRepMessage(certRepMessage);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\CertificateRepMessageBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */