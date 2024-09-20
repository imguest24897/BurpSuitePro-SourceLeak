package com.fasterxml.Zor;

import com.fasterxml.Zb.Zj;
import com.fasterxml.Zc.Zx9;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zm.Zx;
import java.io.Serializable;
import java.util.Objects;

public class Zr implements Serializable {
  private static final long serialVersionUID = 1L;
  
  public static final Zr Zc = new Zr("", null);
  
  public static final Zr ZJ = new Zr(new String(""), null);
  
  protected final String ZD;
  
  protected final String Zj;
  
  protected Zj ZZ;
  
  public Zr(String paramString) {
    this(paramString, null);
  }
  
  public Zr(String paramString1, String paramString2) {
    this.ZD = Zx.ZH(paramString1);
    this.Zj = paramString2;
  }
  
  protected Object readResolve() {
    return (this.Zj == null && (this.ZD == null || "".equals(this.ZD))) ? Zc : this;
  }
  
  public static Zr Zf(String paramString) {
    return (paramString == null || paramString.isEmpty()) ? Zc : new Zr(Zx9.Ze.Zk(paramString), null);
  }
  
  public static Zr ZE(String paramString1, String paramString2) {
    if (paramString1 == null)
      paramString1 = ""; 
    return (paramString2 == null && paramString1.isEmpty()) ? Zc : new Zr(Zx9.Ze.Zk(paramString1), paramString2);
  }
  
  public Zr Zk() {
    if (this.ZD.isEmpty())
      return this; 
    String str = Zx9.Ze.Zk(this.ZD);
    return (str == this.ZD) ? this : new Zr(str, this.Zj);
  }
  
  public Zr ZJ(String paramString) {
    if (paramString == null)
      paramString = ""; 
    return paramString.equals(this.ZD) ? this : new Zr(paramString, this.Zj);
  }
  
  public String Zb() {
    return this.ZD;
  }
  
  public Zj Zx(Zf<?> paramZf) {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: aload_0
    //   4: getfield ZZ : Lcom/fasterxml/Zb/Zj;
    //   7: astore_3
    //   8: istore_2
    //   9: aload_3
    //   10: ifnonnull -> 47
    //   13: aload_1
    //   14: ifnonnull -> 33
    //   17: new com/fasterxml/Zgk
    //   20: dup
    //   21: aload_0
    //   22: getfield ZD : Ljava/lang/String;
    //   25: invokespecial <init> : (Ljava/lang/String;)V
    //   28: astore_3
    //   29: iload_2
    //   30: ifne -> 42
    //   33: aload_1
    //   34: aload_0
    //   35: getfield ZD : Ljava/lang/String;
    //   38: invokevirtual ZT : (Ljava/lang/String;)Lcom/fasterxml/Zb/Zj;
    //   41: astore_3
    //   42: aload_0
    //   43: aload_3
    //   44: putfield ZZ : Lcom/fasterxml/Zb/Zj;
    //   47: aload_3
    //   48: areturn
  }
  
  public boolean ZA() {
    return !this.ZD.isEmpty();
  }
  
  public boolean ZF(String paramString) {
    return this.ZD.equals(paramString);
  }
  
  public boolean ZW() {
    return (this.Zj != null);
  }
  
  public boolean Zf() {
    return (this.Zj == null && this.ZD.isEmpty());
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject.getClass() != getClass())
      return false; 
    Zr zr = (Zr)paramObject;
    if (this.ZD == null) {
      if (zr.ZD != null)
        return false; 
    } else if (!this.ZD.equals(zr.ZD)) {
      return false;
    } 
    return (this.Zj == null) ? ((null == zr.Zj)) : this.Zj.equals(zr.Zj);
  }
  
  public int hashCode() {
    return Objects.hashCode(this.ZD) * 31 + Objects.hashCode(this.Zj);
  }
  
  public String toString() {
    return (this.Zj == null) ? this.ZD : ("{" + this.Zj + "}" + this.ZD);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */