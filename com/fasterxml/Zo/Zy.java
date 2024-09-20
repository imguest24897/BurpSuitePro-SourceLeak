package com.fasterxml.Zo;

import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zf;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zoz.Zi6;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zp.Zt;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

public class Zy extends Zl implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final Zzp Zz;
  
  private static final String c;
  
  public Zy(Zo paramZo, Ziz paramZiz, Zk paramZk, Zf paramZf, Zyo<Object> paramZyo, Zt paramZt, Zzp paramZzp) {
    super(paramZo, paramZiz, paramZk, paramZf, paramZyo, paramZt);
    this.Zz = paramZzp;
  }
  
  public Zl ZO(Zyo<Object> paramZyo) {
    return new Zy(this.ZP, this.ZZ, this.Zq, this.Zt, paramZyo, this.ZS, this.Zz);
  }
  
  protected void ZO(Object paramObject1, Object paramObject2, Object paramObject3) throws Exception {
    Zi6 zi6 = (Zi6)this.ZZ;
    Map<Object, Object> map = (Map)zi6.ZA(paramObject1);
    if (map == null)
      map = Z_((Zyg)null, zi6, paramObject1, paramObject2); 
    map.put(paramObject2, paramObject3);
  }
  
  protected Map<Object, Object> Z_(Zyg paramZyg, Zi6 paramZi6, Object paramObject1, Object paramObject2) throws IOException {
    try {
      if (this.Zz == null)
        throw Zy_.Z_(paramZyg, String.format(c, new Object[] { Zx.Za(this.Zq.Zf()), this.ZP.ZT() })); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Map<Object, Object> map = (Map)this.Zz.Zy(paramZyg);
    paramZi6.ZL(paramObject1, map);
    return map;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #121
    //   2: ldc '-_e\\n;\\rT~;\\fd\\ro\\fR*}NGBPliNB*hN@PsShEx\;IGBW'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zo/Zy.c : Ljava/lang/String;
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
    //   80: bipush #23
    //   82: goto -> 112
    //   85: bipush #27
    //   87: goto -> 112
    //   90: bipush #72
    //   92: goto -> 112
    //   95: bipush #9
    //   97: goto -> 112
    //   100: bipush #115
    //   102: goto -> 112
    //   105: bipush #7
    //   107: goto -> 112
    //   110: bipush #98
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo\Zy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */