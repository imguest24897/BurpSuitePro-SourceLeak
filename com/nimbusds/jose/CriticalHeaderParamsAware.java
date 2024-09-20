package com.nimbusds.jose;

import java.util.Set;

public interface CriticalHeaderParamsAware {
  Set<String> getProcessedCriticalHeaderParams();
  
  Set<String> getDeferredCriticalHeaderParams();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\CriticalHeaderParamsAware.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */