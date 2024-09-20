package com.nimbusds.jose.mint;

import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.produce.JWSSignerFactory;

public interface JWSMinterConfiguration<C extends com.nimbusds.jose.proc.SecurityContext> {
  JWKSource<C> getJWKSource();
  
  void setJWKSource(JWKSource<C> paramJWKSource);
  
  JWSSignerFactory getJWSSignerFactory();
  
  void setJWSSignerFactory(JWSSignerFactory paramJWSSignerFactory);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\mint\JWSMinterConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */