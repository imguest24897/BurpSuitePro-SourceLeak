package com.fasterxml.Zi;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zm5;
import com.fasterxml.Zb.Zmt;
import com.fasterxml.Zc.Zh;

public abstract class Za extends Zmt {
  static final long serialVersionUID = 2L;
  
  protected transient Zg Zp;
  
  protected Zh Zv;
  
  private static String[] ZJ;
  
  private static final String c;
  
  protected Za(Zg paramZg, String paramString) {
    this(paramZg, paramString, ZY(paramZg), null);
  }
  
  protected Za(Zg paramZg, String paramString, Zm5 paramZm5, Throwable paramThrowable) {
    super(paramString, paramZm5, paramThrowable);
    this.Zp = paramZg;
  }
  
  public Zg Zi() {
    return this.Zp;
  }
  
  public String getMessage() {
    String str = super.getMessage();
    if (this.Zv != null)
      str = str + c + this.Zv.toString(); 
    return str;
  }
  
  protected static Zm5 ZY(Zg paramZg) {
    return (paramZg == null) ? null : paramZg.Zz();
  }
  
  public static void Zt(String[] paramArrayOfString) {
    ZJ = paramArrayOfString;
  }
  
  public static String[] Ze() {
    return ZJ;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Ze : ()[Ljava/lang/String;
    //   3: ifnull -> 13
    //   6: iconst_2
    //   7: anewarray java/lang/String
    //   10: invokestatic Zt : ([Ljava/lang/String;)V
    //   13: bipush #87
    //   15: ldc 'BZY(|.J<(L8p'V)lc)'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic com/fasterxml/Zi/Za.c : Ljava/lang/String;
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
    //   92: bipush #31
    //   94: goto -> 124
    //   97: bipush #95
    //   99: goto -> 124
    //   102: bipush #107
    //   104: goto -> 124
    //   107: bipush #14
    //   109: goto -> 124
    //   112: bipush #94
    //   114: goto -> 124
    //   117: bipush #28
    //   119: goto -> 124
    //   122: bipush #110
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zi\Za.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */