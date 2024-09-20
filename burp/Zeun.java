package burp;

import java.util.zip.CRC32;

public class Zeun {
  final CRC32 ZM = new CRC32();
  
  private static String[] Zk;
  
  public void Zk(String paramString) {
    String[] arrayOfString = ZG();
    if (paramString != null) {
      byte b = 0;
      while (b < paramString.length()) {
        this.ZM.update(paramString.charAt(b));
        b++;
        if (arrayOfString != null)
          break; 
      } 
    } 
  }
  
  public Zeun ZT(String paramString) {
    Zk(paramString);
    return this;
  }
  
  public void Zh(int paramInt) {
    this.ZM.update(paramInt);
  }
  
  void Zv(Zt82 paramZt82, Zlug paramZlug) {
    paramZt82.Ze(paramZlug, ZS());
  }
  
  public int ZS() {
    return (int)this.ZM.getValue();
  }
  
  public static void ZZ(String[] paramArrayOfString) {
    Zk = paramArrayOfString;
  }
  
  public static String[] ZG() {
    return Zk;
  }
  
  static {
    if (ZG() != null)
      ZZ(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeun.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */