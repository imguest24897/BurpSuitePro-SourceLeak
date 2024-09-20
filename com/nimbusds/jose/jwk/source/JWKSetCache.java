package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.jwk.JWKSet;

public interface JWKSetCache {
  void put(JWKSet paramJWKSet);
  
  JWKSet get();
  
  boolean requiresRefresh();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\source\JWKSetCache.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */