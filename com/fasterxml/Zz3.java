package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zk.Z_;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zm.Zv;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zt.Z_;
import java.io.IOException;

public class Zz3 extends Zz0<Object> implements Zi, Z_, Z_ {
  protected final Zv<Object, ?> ZC;
  
  protected final Zk ZV;
  
  protected final Zyd<Object> Zo;
  
  private static final String d;
  
  public Zz3(Zv<Object, ?> paramZv, Zk paramZk, Zyd<?> paramZyd) {
    super(paramZk);
    this.ZC = paramZv;
    this.ZV = paramZk;
    this.Zo = (Zyd)paramZyd;
  }
  
  protected Zz3 Zo(Zv<Object, ?> paramZv, Zk paramZk, Zyd<?> paramZyd) {
    Zx.ZW(Zz3.class, this, d);
    return new Zz3(paramZv, paramZk, paramZyd);
  }
  
  public void resolve(Zyi paramZyi) throws Zy_ {
    try {
      if (this.Zo != null)
        try {
          if (this.Zo instanceof Z_)
            ((Z_)this.Zo).resolve(paramZyi); 
        } catch (Zy_ zy_) {
          throw a(null);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
  }
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zyd<Object> zyd = this.Zo;
    Zk zk = this.ZV;
    try {
      if (zyd == null) {
        if (zk == null)
          zk = this.ZC.Zw(paramZyi.ZL()); 
        if (!zk.Zr())
          zyd = paramZyi.Zf(zk); 
      } 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    if (zyd instanceof Zi)
      zyd = paramZyi.ZR(zyd, paramZo); 
    try {
      if (zyd == this.Zo)
        try {
          if (zk == this.ZV)
            return this; 
        } catch (Zy_ zy_) {
          throw a(null);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return Zo(this.ZC, zk, zyd);
  }
  
  public void serialize(Object paramObject, Zf paramZf, Zyi paramZyi) throws IOException {
    Object object = ZO(paramObject);
    try {
      if (object == null) {
        paramZyi.ZT(paramZf);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zyd<Object> zyd = this.Zo;
    if (zyd == null)
      zyd = Zi(object, paramZyi); 
    zyd.serialize(object, paramZf, paramZyi);
  }
  
  public void Zo(Object paramObject, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Object object = ZO(paramObject);
    Zyd<Object> zyd = this.Zo;
    if (zyd == null)
      zyd = Zi(paramObject, paramZyi); 
    zyd.Zo(object, paramZf, paramZyi, paramZa);
  }
  
  public boolean Zt(Zyi paramZyi, Object paramObject) {
    Object object = ZO(paramObject);
    return (object == null) ? true : ((this.Zo == null) ? ((paramObject == null)) : this.Zo.Zt(paramZyi, object));
  }
  
  protected Object ZO(Object paramObject) {
    return this.ZC.Zx(paramObject);
  }
  
  protected Zyd<Object> Zi(Object paramObject, Zyi paramZyi) throws Zy_ {
    return paramZyi.ZG(paramObject.getClass());
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #70
    //   2: ldc 'L{4W~D^u(v'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zz3.d : Ljava/lang/String;
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
    //   80: bipush #125
    //   82: goto -> 112
    //   85: bipush #84
    //   87: goto -> 112
    //   90: bipush #38
    //   92: goto -> 112
    //   95: bipush #26
    //   97: goto -> 112
    //   100: bipush #85
    //   102: goto -> 112
    //   105: bipush #93
    //   107: goto -> 112
    //   110: bipush #110
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */