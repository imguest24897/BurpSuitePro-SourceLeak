package burp;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Zk5o {
  private static final Ztt4 ZT;
  
  private final Map<String, Zm3o> Zu = new ConcurrentHashMap<>();
  
  private final Map<String, List<Zm3o>> Zp = new ConcurrentHashMap<>();
  
  private final List<Zm3o> ZH = new CopyOnWriteArrayList<>();
  
  private static final String a;
  
  List<Zm3o> Zl(String paramString) {
    String str = paramString.toLowerCase(Locale.US);
    return this.Zp.getOrDefault(str, Collections.emptyList());
  }
  
  Zm3o Zg(String paramString) {
    String str = paramString.toLowerCase(Locale.US);
    return this.Zu.get(str);
  }
  
  List<Zm3o> Zw() {
    return Collections.unmodifiableList(this.ZH);
  }
  
  boolean Zk() {
    return !this.ZH.isEmpty();
  }
  
  void Zh(Zm3o paramZm3o) {
    String str = paramZm3o.Zu().toLowerCase(Locale.US);
    boolean bool = Zbjt.Zg();
    switch (paramZm3o.Zd()) {
      case 16:
        ((List<Zm3o>)this.Zp.computeIfAbsent(str, Zk5o::lambda$addRecord$0)).add(paramZm3o);
        if (!bool);
        return;
      case 5:
        this.Zu.put(str, paramZm3o);
        if (!bool);
        return;
      case 257:
        this.ZH.add(paramZm3o);
        if (!bool)
          break; 
        return;
    } 
    ZT.Zh(a + a);
  }
  
  private static List lambda$addRecord$0(String paramString) {
    return new LinkedList();
  }
  
  static {
    // Byte code:
    //   0: bipush #44
    //   2: ldc '6l>Eh\\tS+1^nPp^u@\opIoIfpXR\\ropLu\\ne#_jR\\r5N:Dnp'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zk5o.a : Ljava/lang/String;
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
    //   80: bipush #83
    //   82: goto -> 112
    //   85: bipush #39
    //   87: goto -> 112
    //   90: bipush #124
    //   92: goto -> 112
    //   95: bipush #6
    //   97: goto -> 112
    //   100: bipush #54
    //   102: goto -> 112
    //   105: bipush #76
    //   107: goto -> 112
    //   110: bipush #17
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
    //   154: invokestatic Zr : ()Lburp/Ztt4;
    //   157: putstatic burp/Zk5o.ZT : Lburp/Ztt4;
    //   160: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk5o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */