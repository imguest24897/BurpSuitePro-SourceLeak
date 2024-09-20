package com.nimbusds.jose;

public interface JWEEncrypter extends JWEProvider {
  JWECryptoParts encrypt(JWEHeader paramJWEHeader, byte[] paramArrayOfbyte) throws JOSEException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\JWEEncrypter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */