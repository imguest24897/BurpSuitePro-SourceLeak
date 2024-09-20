package com.nimbusds.jwt.proc;

import com.nimbusds.jose.proc.JOSEProcessorConfiguration;

public interface JWTProcessorConfiguration<C extends com.nimbusds.jose.proc.SecurityContext> extends JOSEProcessorConfiguration<C> {
  JWTClaimsSetAwareJWSKeySelector<C> getJWTClaimsSetAwareJWSKeySelector();
  
  void setJWTClaimsSetAwareJWSKeySelector(JWTClaimsSetAwareJWSKeySelector<C> paramJWTClaimsSetAwareJWSKeySelector);
  
  JWTClaimsSetVerifier<C> getJWTClaimsSetVerifier();
  
  void setJWTClaimsSetVerifier(JWTClaimsSetVerifier<C> paramJWTClaimsSetVerifier);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jwt\proc\JWTProcessorConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */