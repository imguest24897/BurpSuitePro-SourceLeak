package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.Digest;

class Utils {
  static CryptoServiceProperties getDefaultProperties(Digest paramDigest, CryptoServicePurpose paramCryptoServicePurpose) {
    return new DefaultProperties(paramDigest.getDigestSize() * 4, paramDigest.getAlgorithmName(), paramCryptoServicePurpose);
  }
  
  static CryptoServiceProperties getDefaultProperties(Digest paramDigest, int paramInt, CryptoServicePurpose paramCryptoServicePurpose) {
    return new DefaultPropertiesWithPRF(paramDigest.getDigestSize() * 4, paramInt, paramDigest.getAlgorithmName(), paramCryptoServicePurpose);
  }
  
  private static class DefaultProperties implements CryptoServiceProperties {
    private final int bitsOfSecurity;
    
    private final String algorithmName;
    
    private final CryptoServicePurpose purpose;
    
    public DefaultProperties(int param1Int, String param1String, CryptoServicePurpose param1CryptoServicePurpose) {
      this.bitsOfSecurity = param1Int;
      this.algorithmName = param1String;
      this.purpose = param1CryptoServicePurpose;
    }
    
    public int bitsOfSecurity() {
      return this.bitsOfSecurity;
    }
    
    public String getServiceName() {
      return this.algorithmName;
    }
    
    public CryptoServicePurpose getPurpose() {
      return this.purpose;
    }
    
    public Object getParams() {
      return null;
    }
  }
  
  private static class DefaultPropertiesWithPRF implements CryptoServiceProperties {
    private final int bitsOfSecurity;
    
    private final int prfBitsOfSecurity;
    
    private final String algorithmName;
    
    private final CryptoServicePurpose purpose;
    
    public DefaultPropertiesWithPRF(int param1Int1, int param1Int2, String param1String, CryptoServicePurpose param1CryptoServicePurpose) {
      this.bitsOfSecurity = param1Int1;
      this.prfBitsOfSecurity = param1Int2;
      this.algorithmName = param1String;
      this.purpose = param1CryptoServicePurpose;
    }
    
    public int bitsOfSecurity() {
      return (this.purpose == CryptoServicePurpose.PRF) ? this.prfBitsOfSecurity : this.bitsOfSecurity;
    }
    
    public String getServiceName() {
      return this.algorithmName;
    }
    
    public CryptoServicePurpose getPurpose() {
      return this.purpose;
    }
    
    public Object getParams() {
      return null;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\digests\Utils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */