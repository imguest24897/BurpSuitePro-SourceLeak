package net.portswigger.swagger.v1.parser.util;

public class HostAuthorizationValue$ExactHostMatcher implements HostAuthorizationValue$HostMatcher {
  private final String host;
  
  public HostAuthorizationValue$ExactHostMatcher(String paramString) {
    this.host = paramString;
  }
  
  public boolean match(String paramString) {
    return this.host.equalsIgnoreCase(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parse\\util\HostAuthorizationValue$ExactHostMatcher.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */