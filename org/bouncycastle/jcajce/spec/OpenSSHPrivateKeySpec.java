package org.bouncycastle.jcajce.spec;

import java.security.spec.EncodedKeySpec;

public class OpenSSHPrivateKeySpec extends EncodedKeySpec {
  private final String format;
  
  public OpenSSHPrivateKeySpec(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
    if (paramArrayOfbyte[0] == 48) {
      this.format = "ASN.1";
    } else if (paramArrayOfbyte[0] == 111) {
      this.format = "OpenSSH";
    } else {
      throw new IllegalArgumentException("unknown byte encoding");
    } 
  }
  
  public String getFormat() {
    return this.format;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\spec\OpenSSHPrivateKeySpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */