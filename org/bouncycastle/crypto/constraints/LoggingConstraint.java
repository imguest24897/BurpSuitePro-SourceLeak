package org.bouncycastle.crypto.constraints;

import java.util.Set;
import java.util.logging.Level;
import org.bouncycastle.crypto.CryptoServiceProperties;

public class LoggingConstraint extends ServicesConstraint {
  protected LoggingConstraint(Set<String> paramSet) {
    super(paramSet);
  }
  
  public void check(CryptoServiceProperties paramCryptoServiceProperties) {
    if (isException(paramCryptoServiceProperties.getServiceName()))
      return; 
    if (LOG.isLoggable(Level.INFO))
      LOG.info("service " + paramCryptoServiceProperties.getServiceName() + " referenced [" + paramCryptoServiceProperties.getServiceName() + ", " + paramCryptoServiceProperties.bitsOfSecurity() + ", " + paramCryptoServiceProperties.getPurpose()); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\constraints\LoggingConstraint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */