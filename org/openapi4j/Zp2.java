package org.openapi4j;

import com.fasterxml.Zyx;
import java.util.HashMap;
import java.util.Map;

public class Zp2 extends Zc<Zp2> {
  private String authorizationUrl;
  
  private String tokenUrl;
  
  private String refreshUrl;
  
  private Map<String, String> scopes;
  
  @Zyx
  private String configuration;
  
  public String getAuthorizationUrl() {
    return this.authorizationUrl;
  }
  
  public Zp2 setAuthorizationUrl(String paramString) {
    this.authorizationUrl = paramString;
    return this;
  }
  
  public String getTokenUrl() {
    return this.tokenUrl;
  }
  
  public Zp2 setTokenUrl(String paramString) {
    this.tokenUrl = paramString;
    return this;
  }
  
  public String getRefreshUrl() {
    return this.refreshUrl;
  }
  
  public Zp2 setRefreshUrl(String paramString) {
    this.refreshUrl = paramString;
    return this;
  }
  
  public String getConfiguration() {
    return this.configuration;
  }
  
  public Zp2 setConfiguration(String paramString) {
    this.configuration = paramString;
    return this;
  }
  
  public Map<String, String> getScopes() {
    return this.scopes;
  }
  
  public Zp2 setScopes(Map<String, String> paramMap) {
    this.scopes = paramMap;
    return this;
  }
  
  public boolean hasScope(String paramString) {
    return mapHas(this.scopes, paramString);
  }
  
  public String getScope(String paramString) {
    return (String)mapGet(this.scopes, paramString);
  }
  
  public Zp2 setScope(String paramString1, String paramString2) {
    if (this.scopes == null)
      this.scopes = new HashMap<>(); 
    this.scopes.put(paramString1, paramString2);
    return this;
  }
  
  public Zp2 removeScope(String paramString) {
    mapRemove(this.scopes, paramString);
    return this;
  }
  
  public Zp2 copy() {
    Zp2 zp2 = new Zp2();
    zp2.setAuthorizationUrl(getAuthorizationUrl());
    zp2.setTokenUrl(getTokenUrl());
    zp2.setRefreshUrl(getRefreshUrl());
    zp2.setScopes(copySimpleMap(getScopes()));
    zp2.setConfiguration(getConfiguration());
    zp2.setExtensions(copySimpleMap(getExtensions()));
    return zp2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zp2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */