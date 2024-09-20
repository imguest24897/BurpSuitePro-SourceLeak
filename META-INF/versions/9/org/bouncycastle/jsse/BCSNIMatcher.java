package META-INF.versions.9.org.bouncycastle.jsse;

import org.bouncycastle.jsse.BCSNIServerName;
import org.bouncycastle.tls.TlsUtils;

public abstract class BCSNIMatcher {
  private final int nameType;
  
  protected BCSNIMatcher(int paramInt) {
    if (!TlsUtils.isValidUint8(paramInt))
      throw new IllegalArgumentException("'nameType' should be between 0 and 255"); 
    this.nameType = paramInt;
  }
  
  public final int getType() {
    return this.nameType;
  }
  
  public abstract boolean matches(BCSNIServerName paramBCSNIServerName);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\BCSNIMatcher.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */