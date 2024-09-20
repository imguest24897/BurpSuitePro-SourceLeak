package org.bouncycastle.cert.crmf.jcajce;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.crmf.CertificateRepMessageBuilder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;

public class JcaCertificateRepMessageBuilder extends CertificateRepMessageBuilder {
  public JcaCertificateRepMessageBuilder(X509Certificate... paramVarArgs) throws CertificateEncodingException {
    super(convert(paramVarArgs));
  }
  
  private static X509CertificateHolder[] convert(X509Certificate... paramVarArgs) throws CertificateEncodingException {
    X509CertificateHolder[] arrayOfX509CertificateHolder = new X509CertificateHolder[paramVarArgs.length];
    for (byte b = 0; b != arrayOfX509CertificateHolder.length; b++)
      arrayOfX509CertificateHolder[b] = (X509CertificateHolder)new JcaX509CertificateHolder(paramVarArgs[b]); 
    return arrayOfX509CertificateHolder;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\jcajce\JcaCertificateRepMessageBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */