package com.nimbusds.jose.proc;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEDecrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWEProvider;
import java.security.Key;

public interface JWEDecrypterFactory extends JWEProvider {
  JWEDecrypter createJWEDecrypter(JWEHeader paramJWEHeader, Key paramKey) throws JOSEException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\proc\JWEDecrypterFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */