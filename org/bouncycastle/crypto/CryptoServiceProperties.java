package org.bouncycastle.crypto;

public interface CryptoServiceProperties {
  int bitsOfSecurity();
  
  String getServiceName();
  
  CryptoServicePurpose getPurpose();
  
  Object getParams();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\CryptoServiceProperties.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */