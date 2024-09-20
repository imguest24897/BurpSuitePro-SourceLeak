package org.bouncycastle.jsse;

import java.util.Locale;
import java.util.regex.Pattern;
import org.bouncycastle.jsse.provider.IDNUtil;
import org.bouncycastle.tls.NameType;
import org.bouncycastle.util.Strings;

public final class BCSNIHostName extends BCSNIServerName {
  private final String hostName;
  
  public static BCSNIMatcher createSNIMatcher(String paramString) {
    if (paramString == null)
      throw new NullPointerException("'regex' cannot be null"); 
    return new BCSNIHostNameMatcher(paramString);
  }
  
  public BCSNIHostName(String paramString) {
    super(0, Strings.toByteArray(paramString = normalizeHostName(paramString)));
    this.hostName = paramString;
  }
  
  public BCSNIHostName(byte[] paramArrayOfbyte) {
    super(0, paramArrayOfbyte);
    this.hostName = normalizeHostName(Strings.fromUTF8ByteArray(paramArrayOfbyte));
  }
  
  public String getAsciiName() {
    return this.hostName;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof BCSNIHostName))
      return false; 
    BCSNIHostName bCSNIHostName = (BCSNIHostName)paramObject;
    return this.hostName.equalsIgnoreCase(bCSNIHostName.hostName);
  }
  
  public int hashCode() {
    return this.hostName.toUpperCase(Locale.ENGLISH).hashCode();
  }
  
  public String toString() {
    return "{type=" + NameType.getText((short)0) + ", value=" + this.hostName + "}";
  }
  
  private static String normalizeHostName(String paramString) {
    if (null == paramString)
      throw new NullPointerException("'hostName' cannot be null"); 
    paramString = IDNUtil.toASCII(paramString, IDNUtil.USE_STD3_ASCII_RULES);
    if (paramString.length() < 1)
      throw new IllegalArgumentException("SNI host_name cannot be empty"); 
    if (paramString.endsWith("."))
      throw new IllegalArgumentException("SNI host_name cannot end with a separator"); 
    return paramString;
  }
  
  private static final class BCSNIHostNameMatcher extends BCSNIMatcher {
    private final Pattern pattern;
    
    BCSNIHostNameMatcher(String param1String) {
      super(0);
      this.pattern = Pattern.compile(param1String, 2);
    }
    
    public boolean matches(BCSNIServerName param1BCSNIServerName) {
      String str1;
      if (null == param1BCSNIServerName)
        throw new NullPointerException("'serverName' cannot be null"); 
      if (0 != param1BCSNIServerName.getType())
        return false; 
      try {
        str1 = getAsciiHostName(param1BCSNIServerName);
      } catch (RuntimeException runtimeException) {
        return false;
      } 
      if (this.pattern.matcher(str1).matches())
        return true; 
      String str2 = IDNUtil.toUnicode(str1, 0);
      return (!str1.equals(str2) && this.pattern.matcher(str2).matches());
    }
    
    private String getAsciiHostName(BCSNIServerName param1BCSNIServerName) {
      return (param1BCSNIServerName instanceof BCSNIHostName) ? ((BCSNIHostName)param1BCSNIServerName).getAsciiName() : BCSNIHostName.normalizeHostName(Strings.fromUTF8ByteArray(param1BCSNIServerName.getEncoded()));
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\BCSNIHostName.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */