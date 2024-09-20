package net.portswigger.devtools.protocol.types.fetch;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.fetch.AuthChallengeResponse")
public class AuthChallengeResponse {
  @Zvd(Zp = "response")
  public final AuthChallengeResponseResponse response;
  
  @Zvd(Zp = "username")
  @Zj
  public final String username;
  
  @Zvd(Zp = "password")
  @Zj
  public final String password;
  
  @Zox
  public AuthChallengeResponse(@Zc5(Ze = "response") AuthChallengeResponseResponse paramAuthChallengeResponseResponse, @Zc5(Ze = "username", ZS = "null") String paramString1, @Zc5(Ze = "password", ZS = "null") String paramString2) {
    this.response = paramAuthChallengeResponseResponse;
    this.username = paramString1;
    this.password = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\fetch\AuthChallengeResponse.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */