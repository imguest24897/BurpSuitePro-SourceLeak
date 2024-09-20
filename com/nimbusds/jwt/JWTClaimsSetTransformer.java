package com.nimbusds.jwt;

public interface JWTClaimsSetTransformer<T> {
  T transform(JWTClaimsSet paramJWTClaimsSet);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jwt\JWTClaimsSetTransformer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */