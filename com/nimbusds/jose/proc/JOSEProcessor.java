package com.nimbusds.jose.proc;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JOSEObject;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.PlainObject;
import java.text.ParseException;

public interface JOSEProcessor<C extends SecurityContext> {
  Payload process(String paramString, C paramC) throws ParseException, BadJOSEException, JOSEException;
  
  Payload process(JOSEObject paramJOSEObject, C paramC) throws BadJOSEException, JOSEException;
  
  Payload process(PlainObject paramPlainObject, C paramC) throws BadJOSEException, JOSEException;
  
  Payload process(JWSObject paramJWSObject, C paramC) throws BadJOSEException, JOSEException;
  
  Payload process(JWEObject paramJWEObject, C paramC) throws BadJOSEException, JOSEException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\proc\JOSEProcessor.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */