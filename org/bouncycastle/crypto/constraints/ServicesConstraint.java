package org.bouncycastle.crypto.constraints;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;
import org.bouncycastle.crypto.CryptoServicesConstraints;
import org.bouncycastle.util.Strings;

public abstract class ServicesConstraint implements CryptoServicesConstraints {
  protected static final Logger LOG = Logger.getLogger(ServicesConstraint.class.getName());
  
  private final Set<String> exceptions;
  
  protected ServicesConstraint(Set<String> paramSet) {
    if (paramSet.isEmpty()) {
      this.exceptions = Collections.EMPTY_SET;
    } else {
      this.exceptions = new HashSet<>(paramSet.size());
      Iterator<String> iterator = paramSet.iterator();
      while (iterator.hasNext())
        this.exceptions.add(Strings.toUpperCase(iterator.next().toString())); 
      Utils.addAliases(this.exceptions);
    } 
  }
  
  protected boolean isException(String paramString) {
    return this.exceptions.isEmpty() ? false : this.exceptions.contains(Strings.toUpperCase(paramString));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\constraints\ServicesConstraint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */