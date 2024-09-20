package com.nimbusds.jose.util;

import java.util.List;
import java.util.Map;

public interface RestrictedResourceRetriever extends ResourceRetriever {
  int getConnectTimeout();
  
  void setConnectTimeout(int paramInt);
  
  int getReadTimeout();
  
  void setReadTimeout(int paramInt);
  
  int getSizeLimit();
  
  void setSizeLimit(int paramInt);
  
  Map<String, List<String>> getHeaders();
  
  void setHeaders(Map<String, List<String>> paramMap);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jos\\util\RestrictedResourceRetriever.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */