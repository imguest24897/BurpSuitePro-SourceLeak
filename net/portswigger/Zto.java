package net.portswigger;

import burp.Zbqc;

public class Zto<L, R> {
  public final L Zq;
  
  public final R Zo;
  
  private static String[] ZX;
  
  private static final String a;
  
  private Zto(L paramL, R paramR) {
    this.Zq = paramL;
    this.Zo = paramR;
  }
  
  public static <L, R> Zto<L, R> ZM(L paramL, R paramR) {
    return new Zto<>(paramL, paramR);
  }
  
  public String toString() {
    "(";
    return "(" + "(" + String.valueOf(this.Zq) + a + String.valueOf(this.Zo);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zto zto = (Zto)paramObject;
    return ((this.Zq != null) ? !this.Zq.equals(zto.Zq) : (zto.Zq != null)) ? false : ((this.Zo != null) ? this.Zo.equals(zto.Zo) : ((zto.Zo == null)));
  }
  
  public int hashCode() {
    String[] arrayOfString = Zh();
    int i = (this.Zq != null) ? this.Zq.hashCode() : 0;
    i = 31 * i + ((this.Zo != null) ? this.Zo.hashCode() : 0);
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[1]); 
    return i;
  }
  
  public static void Zp(String[] paramArrayOfString) {
    ZX = paramArrayOfString;
  }
  
  public static String[] Zh() {
    return ZX;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zh : ()[Ljava/lang/String;
    //   3: ifnull -> 13
    //   6: iconst_3
    //   7: anewarray java/lang/String
    //   10: invokestatic Zp : ([Ljava/lang/String;)V
    //   13: bipush #115
    //   15: ldc '2}'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic net/portswigger/Zto.a : Ljava/lang/String;
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
    //   92: bipush #109
    //   94: goto -> 124
    //   97: bipush #46
    //   99: goto -> 124
    //   102: bipush #21
    //   104: goto -> 124
    //   107: bipush #51
    //   109: goto -> 124
    //   112: bipush #48
    //   114: goto -> 124
    //   117: bipush #49
    //   119: goto -> 124
    //   122: bipush #11
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zto.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */