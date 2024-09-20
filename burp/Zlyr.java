package burp;

import java.security.SecureRandom;

class Zlyr {
  private final SecureRandom Zw;
  
  Zlyr(SecureRandom paramSecureRandom) {
    this.Zw = paramSecureRandom;
  }
  
  int ZE() {
    int i = 0;
    Zbqc[] arrayOfZbqc = Zxsr.ZXP();
    while (!i) {
      i = ZP();
      if (arrayOfZbqc != null)
        break; 
    } 
    return i;
  }
  
  private int ZP() {
    byte[] arrayOfByte = new byte[4];
    this.Zw.nextBytes(arrayOfByte);
    return (int)Long.parseLong(Zb0y.Zt(arrayOfByte), 16);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlyr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */