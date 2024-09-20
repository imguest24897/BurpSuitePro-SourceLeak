package burp;

public class Znd extends Zni implements Zszw {
  @Zzvo(1)
  private final int Zy;
  
  private static String[] Zb;
  
  private static final String a;
  
  Znd(int paramInt) {
    this.Zy = paramInt;
  }
  
  public int ZD() {
    return this.Zy;
  }
  
  public String toString() {
    String[] arrayOfString = Zo();
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[5]); 
    return String.format(a, new Object[] { Integer.valueOf(this.Zy) });
  }
  
  public boolean equals(Object paramObject) {
    String[] arrayOfString = Zo();
    if (ZF(paramObject))
      return true; 
    if (paramObject instanceof Zszw) {
      Zszw zszw = (Zszw)paramObject;
      if (arrayOfString != null)
        return (this.Zy == zszw.ZD()); 
    } 
    return false;
  }
  
  public int hashCode() {
    return this.Zy;
  }
  
  public Zeu4<? extends Zszw> ZF() {
    return Zi;
  }
  
  public static void ZT(String[] paramArrayOfString) {
    Zb = paramArrayOfString;
  }
  
  public static String[] Zo() {
    return Zb;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zo : ()[Ljava/lang/String;
    //   3: ifnonnull -> 13
    //   6: iconst_5
    //   7: anewarray java/lang/String
    //   10: invokestatic ZT : ([Ljava/lang/String;)V
    //   13: bipush #42
    //   15: ldc 'JB~NZ<R'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Znd.a : Ljava/lang/String;
    //   24: goto -> 165
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
    //   42: if_icmpgt -> 139
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 121, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 116
    //   92: bipush #51
    //   94: goto -> 123
    //   97: bipush #28
    //   99: goto -> 123
    //   102: bipush #53
    //   104: goto -> 123
    //   107: bipush #68
    //   109: goto -> 123
    //   112: iconst_1
    //   113: goto -> 123
    //   116: bipush #31
    //   118: goto -> 123
    //   121: bipush #83
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 48
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 45
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
    //   162: goto -> 21
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Znd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */