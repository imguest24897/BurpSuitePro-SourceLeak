package META-INF.versions.9.org.bouncycastle.crypto;

import org.bouncycastle.crypto.CryptoServicePurpose;

public interface CryptoServiceProperties {
  int bitsOfSecurity();
  
  String getServiceName();
  
  CryptoServicePurpose getPurpose();
  
  Object getParams();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\crypto\CryptoServiceProperties.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */