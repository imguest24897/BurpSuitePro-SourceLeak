package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.AuthChallenge")
public class AuthChallenge {
  @Zvd(Zp = "source")
  @Zj
  public final AuthChallengeSource source;
  
  @Zvd(Zp = "origin")
  public final String origin;
  
  @Zvd(Zp = "scheme")
  public final String scheme;
  
  @Zvd(Zp = "realm")
  public final String realm;
  
  @Zox
  public AuthChallenge(@Zc5(Ze = "source", ZS = "null") AuthChallengeSource paramAuthChallengeSource, @Zc5(Ze = "origin") String paramString1, @Zc5(Ze = "scheme") String paramString2, @Zc5(Ze = "realm") String paramString3) {
    this.source = paramAuthChallengeSource;
    this.origin = paramString1;
    this.scheme = paramString2;
    this.realm = paramString3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\AuthChallenge.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */