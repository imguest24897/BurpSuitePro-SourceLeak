package net.portswigger;

import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Zix {
  private final Map<Type, Zcy> Zs = new HashMap<>();
  
  private final Map<Type, Zm1> ZP = new HashMap<>();
  
  private final Map<String, Zm1> ZH = new HashMap<>();
  
  private final Consumer<Throwable> Zo;
  
  private boolean ZA = true;
  
  private boolean Zf = false;
  
  private static final String a;
  
  public Zix(Consumer<Throwable> paramConsumer) {
    this.Zo = paramConsumer;
  }
  
  public boolean ZC(Type paramType) {
    return this.ZP.containsKey(paramType);
  }
  
  public boolean ZF(Type paramType) {
    return this.Zs.containsKey(paramType);
  }
  
  public Zix Zs(boolean paramBoolean) {
    this.ZA = paramBoolean;
    return this;
  }
  
  public Zix ZX(boolean paramBoolean) {
    this.Zf = paramBoolean;
    return this;
  }
  
  public Zix Zm(Zm1 paramZm1) {
    try {
      if (ZC(paramZm1.Zo()))
        throw new Zks(paramZm1.Zo().toString()); 
    } catch (Zks zks) {
      throw a(null);
    } 
    Zm1 zm1 = this.ZH.get(paramZm1.Za());
    try {
      if (zm1 != null)
        throw new UnsupportedOperationException(String.format(a, new Object[] { zm1.Za(), zm1.Zo(), paramZm1.Zo() })); 
    } catch (Zks zks) {
      throw a(null);
    } 
    paramZm1.Zu(new Zty(this));
    return this;
  }
  
  public Zix ZK(Zcy paramZcy) {
    try {
      if (ZF(paramZcy.Zj))
        throw new Zks(paramZcy.Zj.toString()); 
    } catch (Zks zks) {
      throw a(null);
    } 
    this.Zs.put(paramZcy.Zj, paramZcy);
    return this;
  }
  
  public Ztj ZN() {
    TreeSet<Zm1> treeSet = new TreeSet(Comparator.comparing(Zm1::Za));
    treeSet.addAll(this.ZP.values());
    return new Ztj(this.Zo, treeSet, this.ZH, this.ZP, this.Zs);
  }
  
  private static Zks a(Zks paramZks) {
    return paramZks;
  }
  
  static {
    // Byte code:
    //   0: bipush #43
    //   2: ldc 'b'sqAf@&w"51H82c^4t@/k"G5tEkp{%}@8a"5=)gv/b)wk\!1S.?pW!xR?wpW"1C22a^'bRk7q'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zix.a : Ljava/lang/String;
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
    //   80: bipush #10
    //   82: goto -> 112
    //   85: bipush #96
    //   87: goto -> 112
    //   90: bipush #57
    //   92: goto -> 112
    //   95: bipush #41
    //   97: goto -> 112
    //   100: bipush #25
    //   102: goto -> 112
    //   105: bipush #109
    //   107: goto -> 112
    //   110: bipush #58
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zix.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */