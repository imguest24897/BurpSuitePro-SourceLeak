package burp;

import java.util.Objects;

public abstract class Zmip implements Zgi {
  private final Ztbo Ze;
  
  private String ZL;
  
  private boolean ZU;
  
  private static Zbqc[] ZG;
  
  private static final String a;
  
  public Zmip(Ztbo paramZtbo, String paramString, boolean paramBoolean) {
    this.Ze = paramZtbo;
    this.ZL = paramString;
    this.ZU = paramBoolean;
  }
  
  public boolean ZK(Zgi paramZgi) {
    return (ZS() && !paramZgi.ZS() && Zx(paramZgi));
  }
  
  protected boolean Zx(Zgi paramZgi) {
    return (paramZgi.getClass() == getClass() && Objects.equals(Zo(), paramZgi.Zo()));
  }
  
  public Ztcx ZE(Zgi paramZgi) {
    return Objects.equals(Zo(), paramZgi.Zo()) ? Ztcx.Zc(Zmo.SAME_LABEL, paramZgi, new String[0]) : Ztcx.ZL0();
  }
  
  public Ztbo ZF() {
    return this.Ze;
  }
  
  public String Zo() {
    return Objects.toString(this.ZL, "");
  }
  
  public void ZF(String paramString) {
    this.ZL = paramString;
  }
  
  public boolean ZS() {
    return this.ZU;
  }
  
  public void Zi(boolean paramBoolean) {
    this.ZU = paramBoolean;
  }
  
  public String toString() {
    return ZR() + ZR() + a;
  }
  
  public boolean equals(Object paramObject) {
    Zbqc[] arrayOfZbqc = Zv();
    if (this == paramObject)
      return true; 
    if (paramObject instanceof Zmip) {
      Zmip zmip = (Zmip)paramObject;
      if (arrayOfZbqc != null)
        return (this.ZU == zmip.ZU && this.Ze == zmip.Ze && Objects.equals(this.ZL, zmip.ZL)); 
    } 
    return false;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.Ze, Boolean.valueOf(this.ZU), this.ZL });
  }
  
  public static void Zt(Zbqc[] paramArrayOfZbqc) {
    ZG = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zv() {
    return ZG;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: ifnonnull -> 13
    //   6: iconst_4
    //   7: anewarray burp/Zbqc
    //   10: invokestatic Zt : ([Lburp/Zbqc;)V
    //   13: bipush #87
    //   15: ldc 'D'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zmip.a : Ljava/lang/String;
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
    //   92: bipush #41
    //   94: goto -> 124
    //   97: bipush #97
    //   99: goto -> 124
    //   102: bipush #127
    //   104: goto -> 124
    //   107: bipush #99
    //   109: goto -> 124
    //   112: bipush #127
    //   114: goto -> 124
    //   117: bipush #102
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmip.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */