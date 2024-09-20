package com.fasterxml.Zor;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zm.Zee;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zt.Z_;
import java.io.IOException;
import java.util.Set;

public abstract class Zyd<T> implements Z_ {
  private static boolean Ze;
  
  private static final String a;
  
  public Zyd<T> Zq(Zee paramZee) {
    return this;
  }
  
  public Zyd<?> ZS(Set<String> paramSet) {
    return this;
  }
  
  public abstract void serialize(T paramT, Zf paramZf, Zyi paramZyi) throws IOException;
  
  public void Zo(T paramT, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Class<T> clazz = Zz();
    if (clazz == null)
      clazz = (Class)paramT.getClass(); 
    paramZyi.ZA(clazz, String.format(a, new Object[] { clazz.getName(), getClass().getName() }));
  }
  
  public Class<T> Zz() {
    return null;
  }
  
  public boolean Zt(Zyi paramZyi, T paramT) {
    return (paramT == null);
  }
  
  public boolean ZY() {
    return false;
  }
  
  public boolean ZC() {
    return false;
  }
  
  public static void Zp(boolean paramBoolean) {
    Ze = paramBoolean;
  }
  
  public static boolean Zh() {
    return Ze;
  }
  
  public static boolean Zp() {
    boolean bool = Zh();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zp : ()Z
    //   3: ifne -> 10
    //   6: iconst_1
    //   7: invokestatic Zp : (Z)V
    //   10: bipush #84
    //   12: ldc '@L!\\n^fw4]0czzRq{3}X!bvzA4^i|f%j31FqGv3gP#cznP#Oi3`L!\\n^*`='
    //   14: iconst_m1
    //   15: goto -> 24
    //   18: putstatic com/fasterxml/Zor/Zyd.a : Ljava/lang/String;
    //   21: goto -> 165
    //   24: dup_x2
    //   25: pop
    //   26: invokevirtual toCharArray : ()[C
    //   29: dup_x1
    //   30: arraylength
    //   31: dup_x2
    //   32: pop
    //   33: iconst_0
    //   34: istore_0
    //   35: dup2_x1
    //   36: pop2
    //   37: dup_x2
    //   38: iconst_1
    //   39: if_icmpgt -> 139
    //   42: dup2
    //   43: swap
    //   44: iload_0
    //   45: dup2_x1
    //   46: caload
    //   47: swap
    //   48: iload_0
    //   49: bipush #7
    //   51: irem
    //   52: tableswitch default -> 121, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 106, 4 -> 111, 5 -> 116
    //   92: bipush #64
    //   94: goto -> 123
    //   97: bipush #97
    //   99: goto -> 123
    //   102: iconst_5
    //   103: goto -> 123
    //   106: bipush #59
    //   108: goto -> 123
    //   111: bipush #42
    //   113: goto -> 123
    //   116: bipush #91
    //   118: goto -> 123
    //   121: bipush #71
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 45
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 42
    //   146: pop
    //   147: new java/lang/String
    //   150: dup_x1
    //   151: swap
    //   152: invokespecial <init> : ([C)V
    //   155: invokevirtual intern : ()Ljava/lang/String;
    //   158: swap
    //   159: pop
    //   160: swap
    //   161: pop
    //   162: goto -> 18
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zyd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */