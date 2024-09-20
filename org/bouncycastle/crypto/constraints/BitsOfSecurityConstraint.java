package org.bouncycastle.crypto.constraints;

import java.util.Collections;
import java.util.Set;
import org.bouncycastle.crypto.CryptoServiceConstraintsException;
import org.bouncycastle.crypto.CryptoServiceProperties;

public class BitsOfSecurityConstraint extends ServicesConstraint {
  private final int requiredBitsOfSecurity;
  
  public BitsOfSecurityConstraint(int paramInt) {
    super(Collections.EMPTY_SET);
    this.requiredBitsOfSecurity = paramInt;
  }
  
  public BitsOfSecurityConstraint(int paramInt, Set<String> paramSet) {
    super(paramSet);
    this.requiredBitsOfSecurity = paramInt;
  }
  
  public void check(CryptoServiceProperties paramCryptoServiceProperties) {
    if (isException(paramCryptoServiceProperties.getServiceName()))
      return; 
    if (paramCryptoServiceProperties.bitsOfSecurity() < this.requiredBitsOfSecurity)
      throw new CryptoServiceConstraintsException("service does not provide " + this.requiredBitsOfSecurity + " bits of security only " + paramCryptoServiceProperties.bitsOfSecurity()); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\constraints\BitsOfSecurityConstraint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */