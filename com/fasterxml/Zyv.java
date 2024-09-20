package com.fasterxml;

import burp.Zbqc;
import com.fasterxml.Zb.Ze;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zb.Zmt;

public class Zyv extends Ze {
  protected final Zyv ZJ;
  
  protected Zyv Ze;
  
  protected String ZW;
  
  protected Zyg ZG;
  
  protected boolean Za;
  
  protected boolean Zh;
  
  protected Zyv(int paramInt, Zyv paramZyv, Zyg paramZyg, boolean paramBoolean) {
    int[] arrayOfInt = Zyg.Zf();
    this.Zz = paramInt;
    this.ZJ = paramZyv;
    this.Zv = (paramZyv == null) ? 0 : (paramZyv.Zv + 1);
    this.ZG = paramZyg;
    this.Zb = -1;
    this.Za = paramBoolean;
    this.Zh = false;
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  protected Zyv Ze(int paramInt, Zyg paramZyg, boolean paramBoolean) {
    this.Zz = paramInt;
    this.ZG = paramZyg;
    this.Zb = -1;
    this.ZW = null;
    this.Za = paramBoolean;
    this.Zh = false;
    return this;
  }
  
  public static Zyv Zy(Zyg paramZyg) {
    return new Zyv(0, null, paramZyg, true);
  }
  
  public Zyv Zc(Zyg paramZyg, boolean paramBoolean) {
    Zyv zyv = this.Ze;
    if (zyv == null) {
      this.Ze = zyv = new Zyv(1, this, paramZyg, paramBoolean);
      return zyv;
    } 
    return zyv.Ze(1, paramZyg, paramBoolean);
  }
  
  public Zyv Zv(Zyg paramZyg, boolean paramBoolean) {
    Zyv zyv = this.Ze;
    if (zyv == null) {
      this.Ze = zyv = new Zyv(2, this, paramZyg, paramBoolean);
      return zyv;
    } 
    return zyv.Ze(2, paramZyg, paramBoolean);
  }
  
  public Zyg Zl(String paramString) throws Zmt {
    this.ZW = paramString;
    this.Zh = true;
    return this.ZG;
  }
  
  public Zyg ZV(Zyg paramZyg) {
    if (this.Zz == 2)
      return paramZyg; 
    int i = ++this.Zb;
    return (this.Zz == 1) ? paramZyg.ZD(i) : paramZyg.Zg(i);
  }
  
  public Object Zb() {
    return null;
  }
  
  public void Z_(Object paramObject) {}
  
  public final Zyv ZU() {
    return this.ZJ;
  }
  
  public final String Z_() {
    return this.ZW;
  }
  
  public boolean ZV() {
    return (this.ZW != null);
  }
  
  public Zyg ZJ() {
    return this.ZG;
  }
  
  public boolean Zd() {
    return this.Za;
  }
  
  public Zl Ze() {
    if (!this.Za) {
      this.Za = true;
      return (this.Zz == 2) ? Zl.START_OBJECT : Zl.START_ARRAY;
    } 
    if (this.Zh && this.Zz == 2) {
      this.Zh = false;
      return Zl.FIELD_NAME;
    } 
    return null;
  }
  
  public Zyv Zp(Zyv paramZyv) {
    int[] arrayOfInt = Zyg.Zf();
    if (this.ZJ == paramZyv)
      return this; 
    Zyv zyv = this.ZJ;
    while (zyv != null) {
      Zyv zyv1 = zyv.ZJ;
      if (zyv1 == paramZyv)
        return zyv; 
      zyv = zyv1;
      if (arrayOfInt != null)
        break; 
    } 
    return null;
  }
  
  protected void Zu(StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: invokestatic Zf : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZJ : Lcom/fasterxml/Zyv;
    //   8: ifnull -> 19
    //   11: aload_0
    //   12: getfield ZJ : Lcom/fasterxml/Zyv;
    //   15: aload_1
    //   16: invokevirtual Zu : (Ljava/lang/StringBuilder;)V
    //   19: aload_0
    //   20: getfield Zz : I
    //   23: iconst_2
    //   24: if_icmpne -> 86
    //   27: aload_1
    //   28: bipush #123
    //   30: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   33: pop
    //   34: aload_0
    //   35: getfield ZW : Ljava/lang/String;
    //   38: ifnull -> 68
    //   41: aload_1
    //   42: bipush #34
    //   44: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: aload_1
    //   49: aload_0
    //   50: getfield ZW : Ljava/lang/String;
    //   53: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: pop
    //   57: aload_1
    //   58: bipush #34
    //   60: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: aload_2
    //   65: ifnull -> 75
    //   68: aload_1
    //   69: bipush #63
    //   71: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: aload_1
    //   76: bipush #125
    //   78: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload_2
    //   83: ifnull -> 128
    //   86: aload_0
    //   87: getfield Zz : I
    //   90: iconst_1
    //   91: if_icmpne -> 121
    //   94: aload_1
    //   95: bipush #91
    //   97: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: aload_1
    //   102: aload_0
    //   103: invokevirtual Zl : ()I
    //   106: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   109: pop
    //   110: aload_1
    //   111: bipush #93
    //   113: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: aload_2
    //   118: ifnull -> 128
    //   121: aload_1
    //   122: ldc '/'
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: pop
    //   128: return
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(64);
    Zu(stringBuilder);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zyv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */