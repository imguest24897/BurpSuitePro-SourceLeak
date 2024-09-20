package burp;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Window;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.function.Consumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zm9b extends Zm99 {
  private static final String c;
  
  public Zm9b() {
    ZE(Zt00.UNDERLINE_FONT);
    Ze(Zlkk.HTML_LINK_FOREGROUND);
    setCursor(Cursor.getPredefinedCursor(12));
  }
  
  private Zm9b(String paramString1, String paramString2) {
    this();
    setText(paramString1);
    ZP(paramString2);
  }
  
  public void ZP(String paramString) {
    try {
      if (paramString != null)
        try {
          if (!paramString.isBlank()) {
            ZP(paramString::lambda$setUrl$0);
            return;
          } 
          return;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void ZP(Consumer<Component> paramConsumer) {
    addMouseListener(new Zz8i(this, paramConsumer));
  }
  
  private static void ZK(Component paramComponent, String paramString) {
    ZJ(paramString);
    Window window = Zt2m.ZF(paramComponent);
    Zke4.Zt(window, paramString, true);
  }
  
  private static void ZJ(String paramString) {
    try {
      new URL(paramString);
    } catch (MalformedURLException malformedURLException) {
      Zah.Zl(malformedURLException, Zk_.RETHROWN);
      throw new RuntimeException(c, malformedURLException);
    } 
  }
  
  private static void lambda$setUrl$0(String paramString, Component paramComponent) {
    ZK(paramComponent, paramString);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  static {
    // Byte code:
    //   0: bipush #104
    //   2: ldc 'J#HMn{4n'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zm9b.c : Ljava/lang/String;
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
    //   80: bipush #51
    //   82: goto -> 112
    //   85: bipush #9
    //   87: goto -> 112
    //   90: bipush #84
    //   92: goto -> 112
    //   95: bipush #42
    //   97: goto -> 112
    //   100: bipush #76
    //   102: goto -> 112
    //   105: bipush #76
    //   107: goto -> 112
    //   110: bipush #98
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm9b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */