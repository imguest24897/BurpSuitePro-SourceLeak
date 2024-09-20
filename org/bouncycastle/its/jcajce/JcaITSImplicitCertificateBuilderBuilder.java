package org.bouncycastle.its.jcajce;

import java.security.Provider;
import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.its.ITSImplicitCertificateBuilder;
import org.bouncycastle.oer.its.ieee1609dot2.ToBeSignedCertificate;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;

public class JcaITSImplicitCertificateBuilderBuilder {
  private final JcaDigestCalculatorProviderBuilder digestCalculatorProviderBuilder = new JcaDigestCalculatorProviderBuilder();
  
  public JcaITSImplicitCertificateBuilderBuilder setProvider(Provider paramProvider) {
    this.digestCalculatorProviderBuilder.setProvider(paramProvider);
    return this;
  }
  
  public JcaITSImplicitCertificateBuilderBuilder setProvider(String paramString) {
    this.digestCalculatorProviderBuilder.setProvider(paramString);
    return this;
  }
  
  public ITSImplicitCertificateBuilder build(ITSCertificate paramITSCertificate, ToBeSignedCertificate.Builder paramBuilder) throws OperatorCreationException {
    return new ITSImplicitCertificateBuilder(paramITSCertificate, this.digestCalculatorProviderBuilder.build(), paramBuilder);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\jcajce\JcaITSImplicitCertificateBuilderBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */