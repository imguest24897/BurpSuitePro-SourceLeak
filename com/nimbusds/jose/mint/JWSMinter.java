package com.nimbusds.jose.mint;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.Payload;

public interface JWSMinter<C extends com.nimbusds.jose.proc.SecurityContext> {
  JWSObject mint(JWSHeader paramJWSHeader, Payload paramPayload, C paramC) throws JOSEException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\mint\JWSMinter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */