package com.fasterxml.Ze;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zo.Zv;
import com.fasterxml.Zo.Zz7;
import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zoz.Zv;
import java.io.IOException;

public class Zf extends Zv {
  private static final long serialVersionUID = 1L;
  
  private final Zv ZM;
  
  private static final String c;
  
  public Zf(Zv paramZv, Zv paramZv1) {
    super(paramZv);
    this.ZM = paramZv;
    this.ZZ = paramZv1;
  }
  
  public Zf(Zf paramZf, Zyo<?> paramZyo, Zzb paramZzb) {
    super(paramZf, paramZyo, paramZzb);
    this.ZM = paramZf.ZM;
    this.ZZ = paramZf.ZZ;
  }
  
  public Zf(Zf paramZf, Zr paramZr) {
    super(paramZf, paramZr);
    this.ZM = paramZf.ZM;
    this.ZZ = paramZf.ZZ;
  }
  
  public Zv ZU(Zr paramZr) {
    return new Zf(this, paramZr);
  }
  
  public Zv Zt(Zyo<?> paramZyo) {
    if (this.Zz == paramZyo)
      return this; 
    Zzb zzb = (Zzb)((this.Zz == this.Z_) ? paramZyo : this.Z_);
    return new Zf(this, paramZyo, zzb);
  }
  
  public Zv ZC(Zzb paramZzb) {
    return new Zf(this, this.Zz, paramZzb);
  }
  
  public void ZL(Zyc paramZyc) {
    if (this.ZM != null)
      this.ZM.ZL(paramZyc); 
  }
  
  public Ziz ZQ() {
    return this.ZM.ZQ();
  }
  
  public int Zt() {
    return this.ZM.Zt();
  }
  
  public void ZP(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    ZR(paramZg, paramZyg, paramObject);
  }
  
  public Object ZR(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: aload_3
    //   2: aload_0
    //   3: aload_1
    //   4: aload_2
    //   5: invokevirtual Zt : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   8: invokevirtual ZN : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   11: areturn
    //   12: astore #4
    //   14: aload_0
    //   15: getfield ZZ : Lcom/fasterxml/Zoz/Zv;
    //   18: ifnonnull -> 38
    //   21: aload_0
    //   22: getfield Zz : Lcom/fasterxml/Zor/Zyo;
    //   25: invokevirtual Zd : ()Lcom/fasterxml/Ze/Zz;
    //   28: ifnull -> 46
    //   31: goto -> 38
    //   34: invokestatic a : (Lcom/fasterxml/Zo/Zz7;)Lcom/fasterxml/Zo/Zz7;
    //   37: athrow
    //   38: iconst_1
    //   39: goto -> 47
    //   42: invokestatic a : (Lcom/fasterxml/Zo/Zz7;)Lcom/fasterxml/Zo/Zz7;
    //   45: athrow
    //   46: iconst_0
    //   47: istore #5
    //   49: iload #5
    //   51: ifne -> 68
    //   54: aload_1
    //   55: getstatic com/fasterxml/Ze/Zf.c : Ljava/lang/String;
    //   58: aload #4
    //   60: invokestatic ZT : (Lcom/fasterxml/Zb/Zg;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/fasterxml/Zor/Zy_;
    //   63: athrow
    //   64: invokestatic a : (Lcom/fasterxml/Zo/Zz7;)Lcom/fasterxml/Zo/Zz7;
    //   67: athrow
    //   68: aload #4
    //   70: invokevirtual ZM : ()Lcom/fasterxml/Ze/Zw;
    //   73: new com/fasterxml/Ze/Zb
    //   76: dup
    //   77: aload_0
    //   78: aload #4
    //   80: aload_0
    //   81: getfield ZE : Lcom/fasterxml/Zor/Zk;
    //   84: invokevirtual Zf : ()Ljava/lang/Class;
    //   87: aload_3
    //   88: invokespecial <init> : (Lcom/fasterxml/Ze/Zf;Lcom/fasterxml/Zo/Zz7;Ljava/lang/Class;Ljava/lang/Object;)V
    //   91: invokevirtual Zk : (Lcom/fasterxml/Ze/Z_;)V
    //   94: aconst_null
    //   95: areturn
    // Exception table:
    //   from	to	target	type
    //   0	11	12	com/fasterxml/Zo/Zz7
    //   14	31	34	com/fasterxml/Zo/Zz7
    //   21	42	42	com/fasterxml/Zo/Zz7
    //   49	64	64	com/fasterxml/Zo/Zz7
  }
  
  public void Zj(Object paramObject1, Object paramObject2) throws IOException {
    this.ZM.Zj(paramObject1, paramObject2);
  }
  
  public Object ZN(Object paramObject1, Object paramObject2) throws IOException {
    return this.ZM.ZN(paramObject1, paramObject2);
  }
  
  private static Zz7 a(Zz7 paramZz7) {
    return paramZz7;
  }
  
  static {
    // Byte code:
    //   0: bipush #42
    //   2: ldc '06s\\r~8!=eHk8?9s\\f-%(=s\\rc4(E:t-9"E1e\\rc#$!!c1"'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Ze/Zf.c : Ljava/lang/String;
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
    //   80: bipush #79
    //   82: goto -> 112
    //   85: bipush #114
    //   87: goto -> 112
    //   90: bipush #43
    //   92: goto -> 112
    //   95: bipush #66
    //   97: goto -> 112
    //   100: bipush #39
    //   102: goto -> 112
    //   105: bipush #125
    //   107: goto -> 112
    //   110: bipush #103
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */