package org.yaml;

import burp.Zbqc;
import java.util.List;

public abstract class Zi {
  private Zj9 ZA;
  
  private final Zt1 Zq;
  
  protected Zt1 Zs;
  
  private Class<? extends Object> ZX;
  
  private boolean Zr;
  
  private String ZZ;
  
  private List<Zl2> Zl;
  
  private List<Zl2> ZC;
  
  private List<Zl2> Zk;
  
  protected boolean Zp;
  
  protected Boolean ZM;
  
  private static String ZJ;
  
  private static final String b;
  
  public Zi(Zj9 paramZj9, Zt1 paramZt11, Zt1 paramZt12) {
    Za(paramZj9);
    this.Zq = paramZt11;
    this.Zs = paramZt12;
    this.ZX = Object.class;
    this.Zr = false;
    this.Zp = true;
    this.ZM = null;
    this.Zl = null;
    this.ZC = null;
    String str = ZG();
    try {
      this.Zk = null;
      if (str == null)
        Zbqc.Zr(new Zbqc[4]); 
    } catch (NullPointerException nullPointerException) {
      throw c(null);
    } 
  }
  
  public Zj9 ZO() {
    return this.ZA;
  }
  
  public Zt1 Za() {
    return this.Zs;
  }
  
  public abstract Zjz Zo();
  
  public Zt1 ZP() {
    return this.Zq;
  }
  
  public void Za(Zj9 paramZj9) {
    try {
      if (paramZj9 == null)
        throw new NullPointerException(b); 
    } catch (NullPointerException nullPointerException) {
      throw c(null);
    } 
    this.ZA = paramZj9;
  }
  
  public final boolean equals(Object paramObject) {
    return super.equals(paramObject);
  }
  
  public Class<? extends Object> ZX() {
    return this.ZX;
  }
  
  public void Zs(Class<? extends Object> paramClass) {
    try {
      if (!paramClass.isAssignableFrom(this.ZX))
        this.ZX = paramClass; 
    } catch (NullPointerException nullPointerException) {
      throw c(null);
    } 
  }
  
  public void Zz(boolean paramBoolean) {
    this.Zr = paramBoolean;
  }
  
  public boolean Zf() {
    return this.Zr;
  }
  
  public final int hashCode() {
    return super.hashCode();
  }
  
  public boolean ZK() {
    try {
      if (this.ZM == null) {
        try {
          if (!this.ZA.Zs())
            try {
              if (this.Zp)
                try {
                  if (!Object.class.equals(this.ZX))
                    try {
                      if (!this.ZA.equals(Zj9.ZN))
                        return true; 
                    } catch (NullPointerException nullPointerException) {
                      throw c(null);
                    }  
                } catch (NullPointerException nullPointerException) {
                  throw c(null);
                }  
            } catch (NullPointerException nullPointerException) {
              throw c(null);
            }  
        } catch (NullPointerException nullPointerException) {
          throw c(null);
        } 
        return this.ZA.Zr(ZX());
      } 
    } catch (NullPointerException nullPointerException) {
      throw c(null);
    } 
    return this.ZM.booleanValue();
  }
  
  public void ZR(Boolean paramBoolean) {
    this.ZM = paramBoolean;
  }
  
  public void ZD(String paramString) {
    this.ZZ = paramString;
  }
  
  public void Zm(List<Zl2> paramList) {
    this.Zl = paramList;
  }
  
  public void ZC(List<Zl2> paramList) {
    this.ZC = paramList;
  }
  
  public void ZV(List<Zl2> paramList) {
    this.Zk = paramList;
  }
  
  public static void ZM(String paramString) {
    ZJ = paramString;
  }
  
  public static String ZG() {
    return ZJ;
  }
  
  private static NullPointerException c(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: ifnonnull -> 11
    //   6: ldc 'fVCXd'
    //   8: invokestatic ZM : (Ljava/lang/String;)V
    //   11: bipush #53
    //   13: ldc '2~JI'W'1GB/I,FVQ/\\f:\\r'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic org/yaml/Zi.b : Ljava/lang/String;
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
    //   92: bipush #115
    //   94: goto -> 124
    //   97: bipush #66
    //   99: goto -> 124
    //   102: bipush #92
    //   104: goto -> 124
    //   107: bipush #107
    //   109: goto -> 124
    //   112: bipush #22
    //   114: goto -> 124
    //   117: bipush #18
    //   119: goto -> 124
    //   122: bipush #17
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zi.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */