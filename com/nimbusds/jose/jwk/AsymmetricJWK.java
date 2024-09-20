package com.nimbusds.jose.jwk;

import com.nimbusds.jose.JOSEException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;

public interface AsymmetricJWK {
  PublicKey toPublicKey() throws JOSEException;
  
  PrivateKey toPrivateKey() throws JOSEException;
  
  KeyPair toKeyPair() throws JOSEException;
  
  boolean matches(X509Certificate paramX509Certificate);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jwk\AsymmetricJWK.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */