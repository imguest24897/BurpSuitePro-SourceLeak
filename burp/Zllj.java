package burp;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.swing.AbstractButton;
import javax.swing.JSeparator;

class Zllj {
  private final List<Component> Zi = new ArrayList<>();
  
  private static final String a;
  
  void Zp(String paramString, List<Component> paramList) {
    Zbqc[] arrayOfZbqc = Zgso.ZA();
    if (paramList.isEmpty())
      return; 
    if (Zp(paramList, paramString)) {
      this.Zi.add(paramList.getFirst());
      if (arrayOfZbqc == null) {
        Zztv zztv1 = new Zztv(paramString);
        Objects.requireNonNull(zztv1);
        paramList.forEach(zztv1::add);
        this.Zi.add(zztv1);
        return;
      } 
      return;
    } 
    Zztv zztv = new Zztv(paramString);
    Objects.requireNonNull(zztv);
    paramList.forEach(zztv::add);
    this.Zi.add(zztv);
  }
  
  List<Component> Zd() {
    if (this.Zi.isEmpty())
      return Collections.emptyList(); 
    Zztv zztv = new Zztv(a);
    Objects.requireNonNull(zztv);
    this.Zi.forEach(zztv::add);
    return List.of(new JSeparator(), zztv);
  }
  
  private static boolean Zp(List<Component> paramList, String paramString) {
    if (paramList.size() != 1)
      return false; 
    Component component = paramList.getFirst();
    String str = (component instanceof AbstractButton) ? ((AbstractButton)component).getText() : "";
    return paramString.equalsIgnoreCase(str);
  }
  
  static {
    // Byte code:
    //   0: bipush #36
    //   2: ldc 'U6xZ>r '
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zllj.a : Ljava/lang/String;
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
    //   80: bipush #52
    //   82: goto -> 112
    //   85: bipush #106
    //   87: goto -> 112
    //   90: bipush #40
    //   92: goto -> 112
    //   95: bipush #27
    //   97: goto -> 112
    //   100: bipush #116
    //   102: goto -> 112
    //   105: bipush #80
    //   107: goto -> 112
    //   110: bipush #63
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zllj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */