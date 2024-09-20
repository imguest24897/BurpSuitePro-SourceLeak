package com.fasterxml.Ze;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zo.Zv;
import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zyb;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zoz.Ziz;
import java.io.IOException;

public final class Zk extends Zv {
  private static final long serialVersionUID = 1L;
  
  protected final Zz Zb;
  
  private static final String c;
  
  public Zk(Zz paramZz, Zyb paramZyb) {
    super(paramZz.ZV, paramZz.ZS(), paramZyb, paramZz.ZP());
    this.Zb = paramZz;
  }
  
  protected Zk(Zk paramZk, Zyo<?> paramZyo, Zzb paramZzb) {
    super(paramZk, paramZyo, paramZzb);
    this.Zb = paramZk.Zb;
  }
  
  protected Zk(Zk paramZk, Zr paramZr) {
    super(paramZk, paramZr);
    this.Zb = paramZk.Zb;
  }
  
  public Zv ZU(Zr paramZr) {
    return new Zk(this, paramZr);
  }
  
  public Zv Zt(Zyo<?> paramZyo) {
    try {
      if (this.Zz == paramZyo)
        return this; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw b(null);
    } 
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw b(null);
    } 
    Zzb zzb = (Zzb)((this.Zz == this.Z_) ? paramZyo : this.Z_);
    return new Zk(this, paramZyo, zzb);
  }
  
  public Zv ZC(Zzb paramZzb) {
    return new Zk(this, this.Zz, paramZzb);
  }
  
  public Ziz ZQ() {
    return null;
  }
  
  public void ZP(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    ZR(paramZg, paramZyg, paramObject);
  }
  
  public Object ZR(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    try {
      if (paramZg.ZL(Zl.VALUE_NULL))
        return null; 
    } catch (IOException iOException) {
      throw b(null);
    } 
    Object object = this.Zz.deserialize(paramZg, paramZyg);
    Zw zw = paramZyg.Zi(object, this.Zb.Zj, this.Zb.ZL);
    zw.ZE(paramObject);
    Zv zv = this.Zb.Zm;
    try {
      if (zv != null)
        return zv.ZN(paramObject, object); 
    } catch (IOException iOException) {
      throw b(null);
    } 
    return paramObject;
  }
  
  public void Zj(Object paramObject1, Object paramObject2) throws IOException {
    ZN(paramObject1, paramObject2);
  }
  
  public Object ZN(Object paramObject1, Object paramObject2) throws IOException {
    Zv zv = this.Zb.Zm;
    try {
      if (zv == null)
        throw new UnsupportedOperationException(c); 
    } catch (IOException iOException) {
      throw b(null);
    } 
    return zv.ZN(paramObject1, paramObject2);
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: ldc 'ag#.J\\b\`8{OD^/?>\\t`"{2LBWl8~Z]))\\tW\\bFg-/]FIA/"4]}MF{-9KjWn"AXW}8"'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Ze/Zk.c : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #32
    //   82: goto -> 112
    //   85: bipush #29
    //   87: goto -> 112
    //   90: bipush #94
    //   92: goto -> 112
    //   95: bipush #73
    //   97: goto -> 112
    //   100: bipush #111
    //   102: goto -> 112
    //   105: bipush #60
    //   107: goto -> 112
    //   110: bipush #58
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */