package burp;

import java.util.prefs.Preferences;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm4;
import net.portswigger.Zvy;

public class Zgt4 {
  private static final String a;
  
  public static String ZF(Zra1 paramZra1) {
    return a + a;
  }
  
  private static void Zc(Preferences paramPreferences) {
    try {
      paramPreferences.flush();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public static String Ze(Zra1 paramZra1) {
    Preferences preferences = Preferences.userNodeForPackage(StartBurp.class);
    return preferences.get(ZF(paramZra1), null);
  }
  
  public static void Zr(String paramString, Zra1 paramZra1) {
    Preferences preferences = Preferences.userNodeForPackage(StartBurp.class);
    preferences.put(ZF(paramZra1), paramString.trim());
    Zc(preferences);
  }
  
  public static void Zs(Zra1 paramZra1) {
    Preferences preferences = Preferences.userNodeForPackage(StartBurp.class);
    preferences.remove(ZF(paramZra1));
    Zc(preferences);
  }
  
  public static String ZC(String paramString) {
    Zm4 zm4 = new Zm4();
    byte[] arrayOfByte = paramString.getBytes();
    zm4.Za(arrayOfByte, 0, arrayOfByte.length);
    return new String(Zvy.ZZ(zm4.ZE()));
  }
  
  public static String Zk(String paramString) {
    Preferences preferences = Preferences.userNodeForPackage(StartBurp.class);
    return preferences.get(ZC(paramString), null);
  }
  
  public static void ZP(String paramString1, String paramString2) {
    Preferences preferences = Preferences.userNodeForPackage(StartBurp.class);
    preferences.put(ZC(paramString1), paramString2.trim());
    Zc(preferences);
  }
  
  public static void ZY(String paramString) {
    if (paramString == null)
      return; 
    Preferences preferences = Preferences.userNodeForPackage(StartBurp.class);
    preferences.remove(ZC(paramString));
    Zc(preferences);
  }
  
  static {
    // Byte code:
    //   0: bipush #96
    //   2: ldc 'qI}`ST'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgt4.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #125
    //   82: goto -> 112
    //   85: bipush #64
    //   87: goto -> 112
    //   90: bipush #126
    //   92: goto -> 112
    //   95: bipush #101
    //   97: goto -> 112
    //   100: bipush #93
    //   102: goto -> 112
    //   105: bipush #28
    //   107: goto -> 112
    //   110: bipush #81
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgt4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */