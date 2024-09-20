package org.bouncycastle.its.jcajce;

import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.its.ITSExplicitCertificateBuilder;
import org.bouncycastle.its.operator.ITSContentSigner;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateId;
import org.bouncycastle.oer.its.ieee1609dot2.ToBeSignedCertificate;

public class JcaITSExplicitCertificateBuilder extends ITSExplicitCertificateBuilder {
  private JcaJceHelper helper;
  
  public JcaITSExplicitCertificateBuilder(ITSContentSigner paramITSContentSigner, ToBeSignedCertificate.Builder paramBuilder) {
    this(paramITSContentSigner, paramBuilder, (JcaJceHelper)new DefaultJcaJceHelper());
  }
  
  private JcaITSExplicitCertificateBuilder(ITSContentSigner paramITSContentSigner, ToBeSignedCertificate.Builder paramBuilder, JcaJceHelper paramJcaJceHelper) {
    super(paramITSContentSigner, paramBuilder);
    this.helper = paramJcaJceHelper;
  }
  
  public JcaITSExplicitCertificateBuilder setProvider(Provider paramProvider) {
    this.helper = (JcaJceHelper)new ProviderJcaJceHelper(paramProvider);
    return this;
  }
  
  public JcaITSExplicitCertificateBuilder setProvider(String paramString) {
    this.helper = (JcaJceHelper)new NamedJcaJceHelper(paramString);
    return this;
  }
  
  public ITSCertificate build(CertificateId paramCertificateId, ECPublicKey paramECPublicKey) {
    return build(paramCertificateId, paramECPublicKey, null);
  }
  
  public ITSCertificate build(CertificateId paramCertificateId, ECPublicKey paramECPublicKey1, ECPublicKey paramECPublicKey2) {
    JceITSPublicEncryptionKey jceITSPublicEncryptionKey = null;
    if (paramECPublicKey2 != null)
      jceITSPublicEncryptionKey = new JceITSPublicEncryptionKey(paramECPublicKey2, this.helper); 
    return build(paramCertificateId, new JcaITSPublicVerificationKey(paramECPublicKey1, this.helper), jceITSPublicEncryptionKey);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\jcajce\JcaITSExplicitCertificateBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */