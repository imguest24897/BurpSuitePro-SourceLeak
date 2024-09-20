package org.bouncycastle.crypto.constraints;

import java.util.Collections;
import java.util.Set;
import java.util.logging.Level;
import org.bouncycastle.crypto.CryptoServiceConstraintsException;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;

public class LegacyBitsOfSecurityConstraint extends ServicesConstraint {
  private final int requiredBitsOfSecurity;
  
  private final int legacyRequiredBitsOfSecurity;
  
  public LegacyBitsOfSecurityConstraint(int paramInt) {
    this(paramInt, 0);
  }
  
  public LegacyBitsOfSecurityConstraint(int paramInt1, int paramInt2) {
    super(Collections.EMPTY_SET);
    this.requiredBitsOfSecurity = paramInt1;
    this.legacyRequiredBitsOfSecurity = paramInt2;
  }
  
  public LegacyBitsOfSecurityConstraint(int paramInt, Set<String> paramSet) {
    this(paramInt, 0, paramSet);
  }
  
  public LegacyBitsOfSecurityConstraint(int paramInt1, int paramInt2, Set<String> paramSet) {
    super(paramSet);
    this.requiredBitsOfSecurity = paramInt1;
    this.legacyRequiredBitsOfSecurity = paramInt2;
  }
  
  public void check(CryptoServiceProperties paramCryptoServiceProperties) {
    if (isException(paramCryptoServiceProperties.getServiceName()))
      return; 
    CryptoServicePurpose cryptoServicePurpose = paramCryptoServiceProperties.getPurpose();
    switch (cryptoServicePurpose) {
      case ANY:
      case VERIFYING:
      case DECRYPTION:
      case VERIFICATION:
        if (paramCryptoServiceProperties.bitsOfSecurity() < this.legacyRequiredBitsOfSecurity)
          throw new CryptoServiceConstraintsException("service does not provide " + this.legacyRequiredBitsOfSecurity + " bits of security only " + paramCryptoServiceProperties.bitsOfSecurity()); 
        if (cryptoServicePurpose != CryptoServicePurpose.ANY && LOG.isLoggable(Level.FINE))
          LOG.fine("usage of legacy cryptography service for algorithm " + paramCryptoServiceProperties.getServiceName()); 
        return;
    } 
    if (paramCryptoServiceProperties.bitsOfSecurity() < this.requiredBitsOfSecurity)
      throw new CryptoServiceConstraintsException("service does not provide " + this.requiredBitsOfSecurity + " bits of security only " + paramCryptoServiceProperties.bitsOfSecurity()); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\constraints\LegacyBitsOfSecurityConstraint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */