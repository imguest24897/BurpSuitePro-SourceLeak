package org.yaml;

public abstract class Zlv {
  private final Zt1 ZF;
  
  private final Zt1 ZM;
  
  private static int ZH;
  
  private static final String a;
  
  public Zlv(Zt1 paramZt11, Zt1 paramZt12) {
    this.ZF = paramZt11;
    this.ZM = paramZt12;
  }
  
  public String toString() {
    return "<" + getClass().getName() + "(" + Zo() + a;
  }
  
  public Zt1 ZO() {
    return this.ZF;
  }
  
  public Zt1 ZB() {
    return this.ZM;
  }
  
  protected String Zo() {
    return "";
  }
  
  public boolean Zz(Zj7 paramZj7) {
    return (Zt() == paramZj7);
  }
  
  public abstract Zj7 Zt();
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof Zlv) ? toString().equals(paramObject.toString()) : false;
  }
  
  public int hashCode() {
    return toString().hashCode();
  }
  
  public static void Zk(int paramInt) {
    ZH = paramInt;
  }
  
  public static int Zr() {
    return ZH;
  }
  
  public static int Zh() {
    int i = Zr();
    return (i == 0) ? 84 : 0;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zr : ()I
    //   3: ifeq -> 11
    //   6: bipush #77
    //   8: invokestatic Zk : (I)V
    //   11: bipush #85
    //   13: ldc 'r'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic org/yaml/Zlv.a : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #14
    //   94: goto -> 124
    //   97: bipush #123
    //   99: goto -> 124
    //   102: bipush #106
    //   104: goto -> 124
    //   107: bipush #34
    //   109: goto -> 124
    //   112: bipush #119
    //   114: goto -> 124
    //   117: bipush #46
    //   119: goto -> 124
    //   122: bipush #95
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 43
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
    //   163: goto -> 19
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zlv.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */