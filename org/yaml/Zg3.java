package org.yaml;

import burp.Zbqc;

public abstract class Zg3 implements Comparable<Zg3> {
  private final String Zv;
  
  private final Class<?> ZQ;
  
  private static Zbqc[] ZJ;
  
  private static final String a;
  
  public Zg3(String paramString, Class<?> paramClass) {
    this.Zv = paramString;
    this.ZQ = paramClass;
  }
  
  public Class<?> Zg() {
    return this.ZQ;
  }
  
  public abstract Class<?>[] Zk();
  
  public String ZB() {
    return this.Zv;
  }
  
  public String toString() {
    return ZB() + a + Zg();
  }
  
  public int Zw(Zg3 paramZg3) {
    return ZB().compareTo(paramZg3.ZB());
  }
  
  public boolean Zm() {
    return true;
  }
  
  public abstract void ZO(Object paramObject1, Object paramObject2) throws Exception;
  
  public int hashCode() {
    return ZB().hashCode() + Zg().hashCode();
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof Zg3) {
      Zg3 zg3 = (Zg3)paramObject;
      return (ZB().equals(zg3.ZB()) && Zg().equals(zg3.Zg()));
    } 
    return false;
  }
  
  public static void Zu(Zbqc[] paramArrayOfZbqc) {
    ZJ = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Z_() {
    return ZJ;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Z_ : ()[Lburp/Zbqc;
    //   3: ifnonnull -> 13
    //   6: iconst_5
    //   7: anewarray burp/Zbqc
    //   10: invokestatic Zu : ([Lburp/Zbqc;)V
    //   13: bipush #123
    //   15: ldc 'T)TD'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic org/yaml/Zg3.a : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #15
    //   94: goto -> 124
    //   97: bipush #61
    //   99: goto -> 124
    //   102: bipush #73
    //   104: goto -> 124
    //   107: bipush #31
    //   109: goto -> 124
    //   112: bipush #57
    //   114: goto -> 124
    //   117: bipush #46
    //   119: goto -> 124
    //   122: bipush #38
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 21
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zg3.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */