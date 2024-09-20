package burp;

import burp.api.montoya.http.HttpMode;
import burp.api.montoya.http.RedirectionMode;
import burp.api.montoya.http.RequestOptions;

public class Ze5z implements RequestOptions, Zgj0 {
  private final HttpMode Zx;
  
  private final String ZP;
  
  private final boolean Zj;
  
  private final RedirectionMode Zz;
  
  private Ze5z(HttpMode paramHttpMode, String paramString, boolean paramBoolean, RedirectionMode paramRedirectionMode) {
    this.Zj = paramBoolean;
    this.ZP = paramString;
    this.Zx = paramHttpMode;
    this.Zz = paramRedirectionMode;
  }
  
  public RequestOptions withHttpMode(HttpMode paramHttpMode) {
    return new Ze5z(paramHttpMode, this.ZP, this.Zj, this.Zz);
  }
  
  public RequestOptions withConnectionId(String paramString) {
    return new Ze5z(this.Zx, paramString, this.Zj, this.Zz);
  }
  
  public RequestOptions withUpstreamTLSVerification() {
    return new Ze5z(this.Zx, this.ZP, true, this.Zz);
  }
  
  public RequestOptions withRedirectionMode(RedirectionMode paramRedirectionMode) {
    return new Ze5z(this.Zx, this.ZP, this.Zj, paramRedirectionMode);
  }
  
  public HttpMode Zb() {
    return this.Zx;
  }
  
  public String ZL() {
    return this.ZP;
  }
  
  public boolean Ze() {
    return this.Zj;
  }
  
  public RedirectionMode ZW() {
    return this.Zz;
  }
  
  public static RequestOptions Zt() {
    return new Ze5z(HttpMode.AUTO, null, false, RedirectionMode.NEVER);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze5z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */