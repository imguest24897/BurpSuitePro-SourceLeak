package net.portswigger.swagger.v1.parser.util;

import java.net.URL;
import java.util.regex.Pattern;
import net.portswigger.swagger.v1.models.auth.AuthorizationValue;

public class HostAuthorizationValue extends AuthorizationValue implements ManagedValue {
  private final HostAuthorizationValue$HostMatcher matcher;
  
  public HostAuthorizationValue(String paramString1, String paramString2, String paramString3, String paramString4) {
    this(new HostAuthorizationValue$ExactHostMatcher(paramString1), paramString2, paramString3, paramString4);
  }
  
  public HostAuthorizationValue(Pattern paramPattern, String paramString1, String paramString2, String paramString3) {
    this(new HostAuthorizationValue$RxHostMatcher(paramPattern), paramString1, paramString2, paramString3);
  }
  
  protected HostAuthorizationValue(HostAuthorizationValue$HostMatcher paramHostAuthorizationValue$HostMatcher, String paramString1, String paramString2, String paramString3) {
    super(paramString1, paramString2, paramString3);
    this.matcher = paramHostAuthorizationValue$HostMatcher;
  }
  
  public boolean process(URL paramURL) {
    return this.matcher.match(paramURL.getHost());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parse\\util\HostAuthorizationValue.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */