package com.nimbusds.jose.proc;

public interface JOSEProcessorConfiguration<C extends SecurityContext> {
  JOSEObjectTypeVerifier<C> getJWSTypeVerifier();
  
  void setJWSTypeVerifier(JOSEObjectTypeVerifier<C> paramJOSEObjectTypeVerifier);
  
  JWSKeySelector<C> getJWSKeySelector();
  
  void setJWSKeySelector(JWSKeySelector<C> paramJWSKeySelector);
  
  JOSEObjectTypeVerifier<C> getJWETypeVerifier();
  
  void setJWETypeVerifier(JOSEObjectTypeVerifier<C> paramJOSEObjectTypeVerifier);
  
  JWEKeySelector<C> getJWEKeySelector();
  
  void setJWEKeySelector(JWEKeySelector<C> paramJWEKeySelector);
  
  JWSVerifierFactory getJWSVerifierFactory();
  
  void setJWSVerifierFactory(JWSVerifierFactory paramJWSVerifierFactory);
  
  JWEDecrypterFactory getJWEDecrypterFactory();
  
  void setJWEDecrypterFactory(JWEDecrypterFactory paramJWEDecrypterFactory);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\proc\JOSEProcessorConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */