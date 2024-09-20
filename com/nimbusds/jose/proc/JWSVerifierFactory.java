package com.nimbusds.jose.proc;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSProvider;
import com.nimbusds.jose.JWSVerifier;
import java.security.Key;

public interface JWSVerifierFactory extends JWSProvider {
  JWSVerifier createJWSVerifier(JWSHeader paramJWSHeader, Key paramKey) throws JOSEException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\proc\JWSVerifierFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */