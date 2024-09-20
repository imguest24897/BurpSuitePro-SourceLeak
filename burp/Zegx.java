package burp;

import java.util.Set;

public class Zegx implements Zsmb {
  private static final Set<Character> Zj = Zb99.ZR(Zb99.Zn(new Character[] { 
          Character.valueOf('='), Character.valueOf('/'), Character.valueOf(':'), Character.valueOf('<'), Character.valueOf('>'), Character.valueOf('|'), Character.valueOf('^'), Character.valueOf('"'), Character.valueOf('`'), Character.valueOf('{'), 
          Character.valueOf('}'), Character.valueOf('\\') }));
  
  private final Zsmb ZX;
  
  private static boolean Zw;
  
  public Zegx(Zsmb paramZsmb) {
    this.ZX = paramZsmb;
  }
  
  public Zsov ZK(Zxs7 paramZxs7, int paramInt, String paramString, Zsjk paramZsjk, byte paramByte, Ztpk paramZtpk, boolean paramBoolean, Zgk_ paramZgk_) {
    boolean bool = Zi();
    if (!Zx(paramString))
      return null; 
    Ztr2 ztr2 = paramZxs7.ZN();
    if (!(ztr2 instanceof Zr21))
      return null; 
    Zr21 zr21 = (Zr21)ztr2;
    for (Character character : Zj) {
      zr21.ZA(character.charValue());
      if (!bool)
        break; 
    } 
    try {
      return this.ZX.ZK(paramZxs7, paramInt, paramString, paramZsjk, paramByte, paramZtpk, paramBoolean, paramZgk_);
    } finally {
      for (Character character : Zj) {
        zr21.Zq(character.charValue());
        if (!bool)
          break; 
      } 
    } 
  }
  
  private boolean Zx(String paramString) {
    boolean bool = Zi();
    byte b = 0;
    while (b < paramString.length()) {
      if (Zj.contains(Character.valueOf(paramString.charAt(b))))
        return true; 
      b++;
      if (!bool)
        break; 
    } 
    return false;
  }
  
  public static void ZJ(boolean paramBoolean) {
    Zw = paramBoolean;
  }
  
  public static boolean Zx() {
    return Zw;
  }
  
  public static boolean Zi() {
    boolean bool = Zx();
    return !bool;
  }
  
  static {
    if (Zx())
      ZJ(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zegx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */