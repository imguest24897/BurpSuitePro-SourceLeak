package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.Principal;
import java.util.List;
import org.bouncycastle.jsse.provider.NamedGroupInfo;
import org.bouncycastle.jsse.provider.SignatureSchemeInfo;

class JsseSecurityParameters {
  NamedGroupInfo.PerConnection namedGroups;
  
  SignatureSchemeInfo.PerConnection signatureSchemes;
  
  List<byte[]> statusResponses;
  
  Principal[] trustedIssuers;
  
  void clear() {
    this.namedGroups = null;
    this.signatureSchemes = null;
    this.statusResponses = null;
    this.trustedIssuers = null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\JsseSecurityParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */