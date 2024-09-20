package com.nimbusds.jwt;

import com.nimbusds.jose.Header;
import com.nimbusds.jose.util.Base64URL;
import java.io.Serializable;
import java.text.ParseException;

public interface JWT extends Serializable {
  Header getHeader();
  
  JWTClaimsSet getJWTClaimsSet() throws ParseException;
  
  Base64URL[] getParsedParts();
  
  String getParsedString();
  
  String serialize();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jwt\JWT.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */