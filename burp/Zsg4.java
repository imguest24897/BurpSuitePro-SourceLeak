package burp;

class Zsg4 {
  private final Ztdi Zu;
  
  private final Zr_4 Zk;
  
  private final Zbnt ZZ;
  
  private final Zz1m<Zt18> ZC;
  
  private static final String a;
  
  Zsg4(Ztdi paramZtdi, Zr_4 paramZr_4, Zbnt paramZbnt, Zz1m<Zt18> paramZz1m) {
    this.Zu = paramZtdi;
    this.Zk = paramZr_4;
    this.ZZ = paramZbnt;
    this.ZC = paramZz1m;
  }
  
  Zez3 Zd(Zlit paramZlit) {
    return this.Zu.Zs(paramZlit, (short)0, this::lambda$buildPendingItem$0);
  }
  
  Zez3 Zk(Zgnc paramZgnc) {
    Zlit zlit = paramZgnc.ZzX().ZyR();
    Zstu zstu1 = paramZgnc.Zzk();
    Zbqc[] arrayOfZbqc = Zsd6.ZR();
    Zstu zstu2 = paramZgnc.Zza();
    Zez3 zez3 = a.equalsIgnoreCase(paramZgnc.Zzj()) ? this.Zu.Zb(zlit, zstu1, Zgyj.Zg(zstu1), (short)0, this::lambda$buildPendingItem$0) : this.Zu.Zs(zlit, (short)0, this::lambda$buildPendingItem$0);
    Zs68 zs68 = Zbwc.Zt(zlit, zstu2, Zt0k.HTML_HEAD_ANALYSIS, this.ZZ);
    (new Zsir()).Zp(zstu1.Zp(this.Zk), paramZgnc.Zzj()).ZV(zstu2.Zp(this.Zk), zs68.Zs, zs68.Zb, zs68.ZH.Zj, Zsir.ZO(zs68), paramZgnc.Zz5()).ZZ((byte)2, (byte)0).Zd(zez3);
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[3]); 
    return zez3;
  }
  
  private void lambda$buildPendingItem$0(Zez3 paramZez3) {
    this.ZC.ZD(new Zxr8(Zt18.Zu, paramZez3));
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: ldc 's\\t]'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsg4.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #40
    //   82: goto -> 111
    //   85: bipush #77
    //   87: goto -> 111
    //   90: iconst_5
    //   91: goto -> 111
    //   94: bipush #69
    //   96: goto -> 111
    //   99: bipush #49
    //   101: goto -> 111
    //   104: bipush #88
    //   106: goto -> 111
    //   109: bipush #113
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsg4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */