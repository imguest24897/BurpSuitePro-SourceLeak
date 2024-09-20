package org.bouncycastle.tls;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class BasicTlsSRPIdentity implements TlsSRPIdentity {
  protected byte[] identity;
  
  protected byte[] password;
  
  public BasicTlsSRPIdentity(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.identity = Arrays.clone(paramArrayOfbyte1);
    this.password = Arrays.clone(paramArrayOfbyte2);
  }
  
  public BasicTlsSRPIdentity(String paramString1, String paramString2) {
    this.identity = Strings.toUTF8ByteArray(paramString1);
    this.password = Strings.toUTF8ByteArray(paramString2);
  }
  
  public byte[] getSRPIdentity() {
    return this.identity;
  }
  
  public byte[] getSRPPassword() {
    return this.password;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\BasicTlsSRPIdentity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */