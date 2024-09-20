package com.nimbusds.jwt.proc;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.proc.BadJOSEException;
import com.nimbusds.jwt.EncryptedJWT;
import com.nimbusds.jwt.JWT;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.PlainJWT;
import com.nimbusds.jwt.SignedJWT;
import java.text.ParseException;

public interface JWTProcessor<C extends com.nimbusds.jose.proc.SecurityContext> {
  JWTClaimsSet process(String paramString, C paramC) throws ParseException, BadJOSEException, JOSEException;
  
  JWTClaimsSet process(JWT paramJWT, C paramC) throws BadJOSEException, JOSEException;
  
  JWTClaimsSet process(PlainJWT paramPlainJWT, C paramC) throws BadJOSEException, JOSEException;
  
  JWTClaimsSet process(SignedJWT paramSignedJWT, C paramC) throws BadJOSEException, JOSEException;
  
  JWTClaimsSet process(EncryptedJWT paramEncryptedJWT, C paramC) throws BadJOSEException, JOSEException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jwt\proc\JWTProcessor.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */