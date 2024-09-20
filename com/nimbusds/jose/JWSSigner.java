package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;

public interface JWSSigner extends JWSProvider {
  Base64URL sign(JWSHeader paramJWSHeader, byte[] paramArrayOfbyte) throws JOSEException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\JWSSigner.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */