package org.bouncycastle.crypto.constraints;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;

public class DefaultServiceProperties implements CryptoServiceProperties {
  private final String algorithm;
  
  private final int bitsOfSecurity;
  
  private final Object params;
  
  private final CryptoServicePurpose purpose;
  
  public DefaultServiceProperties(String paramString, int paramInt) {
    this(paramString, paramInt, null, CryptoServicePurpose.ANY);
  }
  
  public DefaultServiceProperties(String paramString, int paramInt, Object paramObject) {
    this(paramString, paramInt, paramObject, CryptoServicePurpose.ANY);
  }
  
  public DefaultServiceProperties(String paramString, int paramInt, Object paramObject, CryptoServicePurpose paramCryptoServicePurpose) {
    this.algorithm = paramString;
    this.bitsOfSecurity = paramInt;
    this.params = paramObject;
    if (paramObject instanceof CryptoServicePurpose)
      throw new IllegalArgumentException("params should not be CryptoServicePurpose"); 
    this.purpose = paramCryptoServicePurpose;
  }
  
  public int bitsOfSecurity() {
    return this.bitsOfSecurity;
  }
  
  public String getServiceName() {
    return this.algorithm;
  }
  
  public CryptoServicePurpose getPurpose() {
    return this.purpose;
  }
  
  public Object getParams() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\constraints\DefaultServiceProperties.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */