package org.bouncycastle.tls;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

public final class SessionID implements Comparable {
  private final byte[] id;
  
  public SessionID(byte[] paramArrayOfbyte) {
    this.id = Arrays.clone(paramArrayOfbyte);
  }
  
  public int compareTo(Object paramObject) {
    return Arrays.compareUnsigned(this.id, ((SessionID)paramObject).id);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof SessionID))
      return false; 
    SessionID sessionID = (SessionID)paramObject;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\SessionID.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */