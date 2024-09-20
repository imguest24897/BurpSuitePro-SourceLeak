package com.nimbusds.jose.produce;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSProvider;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.jwk.JWK;

public interface JWSSignerFactory extends JWSProvider {
  JWSSigner createJWSSigner(JWK paramJWK) throws JOSEException;
  
  JWSSigner createJWSSigner(JWK paramJWK, JWSAlgorithm paramJWSAlgorithm) throws JOSEException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\produce\JWSSignerFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */