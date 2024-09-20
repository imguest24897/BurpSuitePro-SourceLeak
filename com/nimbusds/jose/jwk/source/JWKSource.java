package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.KeySourceException;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKSelector;
import java.util.List;

public interface JWKSource<C extends com.nimbusds.jose.proc.SecurityContext> {
  List<JWK> get(JWKSelector paramJWKSelector, C paramC) throws KeySourceException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\source\JWKSource.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */