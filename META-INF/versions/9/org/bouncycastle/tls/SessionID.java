package META-INF.versions.9.org.bouncycastle.tls;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

public final class SessionID implements Comparable {
  private final byte[] id;
  
  public SessionID(byte[] paramArrayOfbyte) {
    this.id = Arrays.clone(paramArrayOfbyte);
  }
  
  public int compareTo(Object paramObject) {
    return Arrays.compareUnsigned(this.id, ((org.bouncycastle.tls.SessionID)paramObject).id);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof org.bouncycastle.tls.SessionID))
      return false; 
    org.bouncycastle.tls.SessionID sessionID = (org.bouncycastle.tls.SessionID)paramObject;
    return Arrays.areEqual(this.id, sessionID.id);
  }
  
  public byte[] getBytes() {
    return Arrays.clone(this.id);
  }
  
  public int hashCode() {
    return Arrays.hashCode(this.id);
  }
  
  public String toString() {
    return Hex.toHexString(this.id);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\SessionID.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */