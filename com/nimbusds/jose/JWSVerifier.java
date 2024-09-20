package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;

public interface JWSVerifier extends JWSProvider {
  boolean verify(JWSHeader paramJWSHeader, byte[] paramArrayOfbyte, Base64URL paramBase64URL) throws JOSEException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\JWSVerifier.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */