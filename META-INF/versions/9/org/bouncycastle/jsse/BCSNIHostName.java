package META-INF.versions.9.org.bouncycastle.jsse;

import java.util.Locale;
import org.bouncycastle.jsse.BCSNIMatcher;
import org.bouncycastle.jsse.BCSNIServerName;
import org.bouncycastle.jsse.provider.IDNUtil;
import org.bouncycastle.tls.NameType;
import org.bouncycastle.util.Strings;

public final class BCSNIHostName extends BCSNIServerName {
  private final String hostName;
  
  public static BCSNIMatcher createSNIMatcher(String paramString) {
    if (paramString == null)
      throw new NullPointerException("'regex' cannot be null"); 
    return (BCSNIMatcher)new BCSNIHostNameMatcher(paramString);
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
    if (!(paramObject instanceof org.bouncycastle.jsse.BCSNIHostName))
      return false; 
    org.bouncycastle.jsse.BCSNIHostName bCSNIHostName = (org.bouncycastle.jsse.BCSNIHostName)paramObject;
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
    paramString = IDNUtil.toASCII(paramString, 2);
    if (paramString.length() < 1)
      throw new IllegalArgumentException("SNI host_name cannot be empty"); 
    if (paramString.endsWith("."))
      throw new IllegalArgumentException("SNI host_name cannot end with a separator"); 
    return paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\BCSNIHostName.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */