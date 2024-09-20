package org.bouncycastle.jsse;

import org.bouncycastle.tls.NameType;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

public abstract class BCSNIServerName {
  private final int nameType;
  
  private final byte[] encoded;
  
  protected BCSNIServerName(int paramInt, byte[] paramArrayOfbyte) {
    if (!TlsUtils.isValidUint8(paramInt))
      throw new IllegalArgumentException("'nameType' should be between 0 and 255"); 
    if (paramArrayOfbyte == null)
      throw new NullPointerException("'encoded' cannot be null"); 
    this.nameType = paramInt;
    this.encoded = TlsUtils.clone(paramArrayOfbyte);
  }
  
  public final int getType() {
    return this.nameType;
  }
  
  public final byte[] getEncoded() {
    return TlsUtils.clone(this.encoded);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof BCSNIServerName))
      return false; 
    BCSNIServerName bCSNIServerName = (BCSNIServerName)paramObject;
    return (this.nameType == bCSNIServerName.nameType && Arrays.areEqual(this.encoded, bCSNIServerName.encoded));
  }
  
  public int hashCode() {
    return this.nameType ^ Arrays.hashCode(this.encoded);
  }
  
  public String toString() {
    return "{type=" + NameType.getText((short)this.nameType) + ", value=" + Hex.toHexString(this.encoded) + "}";
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\BCSNIServerName.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */