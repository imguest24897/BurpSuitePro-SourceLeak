package com.nimbusds.jwt.proc;

import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.KeySourceException;
import com.nimbusds.jwt.JWTClaimsSet;
import java.security.Key;
import java.util.List;

public interface JWTClaimsSetAwareJWSKeySelector<C extends com.nimbusds.jose.proc.SecurityContext> {
  List<? extends Key> selectKeys(JWSHeader paramJWSHeader, JWTClaimsSet paramJWTClaimsSet, C paramC) throws KeySourceException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jwt\proc\JWTClaimsSetAwareJWSKeySelector.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */