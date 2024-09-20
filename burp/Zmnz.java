package burp;

import burp.api.montoya.collaborator.SecretKey;
import java.util.Arrays;
import java.util.Base64;

public class Zmnz implements SecretKey {
  private final byte[] Zh;
  
  public Zmnz(byte[] paramArrayOfbyte) {
    this.Zh = paramArrayOfbyte;
  }
  
  public String toString() {
    return Base64.getEncoder().encodeToString(this.Zh);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zmnz zmnz = (Zmnz)paramObject;
    return Arrays.equals(this.Zh, zmnz.Zh);
  }
  
  public int hashCode() {
    return Arrays.hashCode(this.Zh);
  }
  
  static Zmnz ZA(String paramString) {
    byte[] arrayOfByte = Base64.getDecoder().decode(paramString);
    return new Zmnz(arrayOfByte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmnz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */