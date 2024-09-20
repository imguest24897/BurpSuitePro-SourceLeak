package burp;

import java.util.HashSet;

class Zl7r {
  private static final String a;
  
  static void Zx(Zt8i paramZt8i, Zzwo<Zrp0, Zm6i> paramZzwo, int paramInt1, int paramInt2, Zt1i paramZt1i, Ztk0 paramZtk0, Zgak paramZgak, Zr_4 paramZr_4, Zz1m<Zt35> paramZz1m, Zmv7 paramZmv7) {
    Zrp0 zrp0 = paramZt8i.Zsg();
    Zszw zszw = paramZt8i.ZsJ();
    int[] arrayOfInt = Zx14.Zp();
    Zlru zlru = paramZt8i.ZsD();
    Zeu9 zeu9 = paramZt8i.Zsu();
    if (zrp0.Znq().equals(zeu9) && zrp0 instanceof Zl_) {
      Zl_ zl_ = (Zl_)zrp0;
      paramZzwo.Zu(zrp0, paramZr_4.<Zm6i>Zo(zl_.Zfy()));
      Zx(paramZzwo, paramInt1, paramInt2, zrp0, zszw, zlru, paramZt1i, paramZtk0, paramZgak, paramZz1m, paramZmv7);
    } 
    if (Zbqc.Zwu() == null)
      Zx14.Zc(new int[3]); 
  }
  
  private static void Zx(Zzwo<Zrp0, Zm6i> paramZzwo, int paramInt1, int paramInt2, Zrp0 paramZrp0, Zszw paramZszw, Zlru paramZlru, Zt1i paramZt1i, Ztk0 paramZtk0, Zgak paramZgak, Zz1m<Zt35> paramZz1m, Zmv7 paramZmv7) {
    if (paramZzwo.Zl3() < Zl(paramInt1, paramInt2))
      return; 
    paramZmv7.Zy(Zrp6.DEBUG, Zlq7.LOOPBACK_FINGERPRINT_GENERATED, new Object[0]);
    paramZmv7.Zy(Zrp6.TRACE, Zlq7.NEW_SIGNPOST_FINGERPRINT, new Object[] { paramZzwo.ZlZ() });
    Zti9 zti9 = Ze2a.Zh(paramZzwo.ZlZ());
    paramZmv7.Zy(Zrp6.DEBUG, Zlq7.NOT_IN_DEBUG_LOG, new Object[] { a });
    int i = Zs2q.ZY(zti9, paramZt1i, new HashSet<>(paramZzwo.ZlZ()));
    paramZmv7.Zy(Zrp6.DEBUG, Zlq7.REACHABLE_ROOMS_VIA_NON_LOOPBACK, new Object[] { Integer.valueOf(i), zti9 });
    int j = paramInt1 * (1 + i);
    if (paramZzwo.Zl3() >= Zl(j, paramInt2))
      paramZtk0.Zm(paramZgak, zti9, paramZrp0, paramZszw, paramZlru, null, paramZz1m, paramZmv7); 
  }
  
  private static int Zl(int paramInt1, int paramInt2) {
    return paramInt1 + paramInt2;
  }
  
  static {
    // Byte code:
    //   0: bipush #84
    //   2: ldc 'A0}\\r;|6@~~4o6V.j4|sB,wzd<K.z9c'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zl7r.a : Ljava/lang/String;
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
    //   80: bipush #7
    //   82: goto -> 112
    //   85: bipush #112
    //   87: goto -> 112
    //   90: bipush #10
    //   92: goto -> 112
    //   95: bipush #76
    //   97: goto -> 112
    //   100: bipush #43
    //   102: goto -> 112
    //   105: bipush #14
    //   107: goto -> 112
    //   110: bipush #92
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl7r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */