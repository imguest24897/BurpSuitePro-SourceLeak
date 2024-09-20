package net.portswigger.swagger.v1.parser.util;

import java.util.regex.Pattern;

public class HostAuthorizationValue$RxHostMatcher implements HostAuthorizationValue$HostMatcher {
  private final Pattern rx;
  
  public HostAuthorizationValue$RxHostMatcher(Pattern paramPattern) {
    this.rx = paramPattern;
  }
  
  public boolean match(String paramString) {
    return this.rx.matcher(paramString).matches();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parse\\util\HostAuthorizationValue$RxHostMatcher.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */