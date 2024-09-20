package burp;

public class Ztwx {
  private final Zez3 Zn;
  
  private final Zbnt ZJ;
  
  private final Zey9 ZC;
  
  private static final String a;
  
  Ztwx(Zez3 paramZez3, Zbnt paramZbnt, Zey9 paramZey9) {
    this.Zn = paramZez3;
    this.ZJ = paramZbnt;
    this.ZC = paramZey9;
  }
  
  public boolean ZN(Zrdb paramZrdb) {
    Zs73 zs73 = (new Ztgc(this.Zn)).ZE();
    Zrf_ zrf_ = (new Zb4h(this.Zn)).ZU();
    int[] arrayOfInt = Zl9l.ZF();
    if (zs73.ZTU() == 2)
      return false; 
    if (zrf_.Z_B() != null)
      return false; 
    Zrg_ zrg_ = new Zrg_();
    paramZrdb.Za7().Zj(zrg_::lambda$populateFromIssue$0);
    if (zrg_.ZR == null)
      return false; 
    Zzi8 zzi8 = zrg_.ZR;
    Zefx zefx = zzi8.Zo3().ZP(this.Zn.Zod(), this.ZC);
    if (!a.equalsIgnoreCase(zefx.Zr()))
      return false; 
    for (Zlou zlou : zefx.Zc()) {
      if (zlou.Zx.Z_() || zlou.Zx.ZO())
        return false; 
      if (arrayOfInt != null)
        break; 
    } 
    ZD(zzi8, zefx, zs73);
    return true;
  }
  
  private void ZD(Zzi8 paramZzi8, Zefx paramZefx, Zs73 paramZs73) {
    Zstu zstu1 = paramZzi8.ZoO();
    Zstu zstu2 = paramZzi8.ZL(paramZefx.ZT(), this.ZC);
    Zsir zsir = (new Zsir()).ZG(zstu2, paramZefx.Zr(), paramZzi8.ZoB()).ZG((byte)2, (byte)1, paramZs73.ZTF(), paramZs73.ZTR());
    if (zstu1 != null) {
      Zs68 zs68 = Zbwc.Zt(paramZefx.ZF(), zstu1, Zt0k.HTML_HEAD_ANALYSIS, this.ZJ);
      zsir.ZV(zstu1, zstu1.Zpu(), zs68.Zb, zs68.ZH.Zj, Zsir.ZO(zs68), paramZzi8.ZoB());
    } 
    zsir.Zd(this.Zn);
  }
  
  private static void lambda$populateFromIssue$0(Zrg_ paramZrg_, Zgkc paramZgkc) {
    paramZgkc.Zu2().Zf(paramZrg_);
  }
  
  static {
    // Byte code:
    //   0: bipush #106
    //   2: ldc '5I\\b'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztwx.a : Ljava/lang/String;
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
    //   80: bipush #24
    //   82: goto -> 112
    //   85: bipush #102
    //   87: goto -> 112
    //   90: bipush #54
    //   92: goto -> 112
    //   95: bipush #7
    //   97: goto -> 112
    //   100: bipush #11
    //   102: goto -> 112
    //   105: bipush #53
    //   107: goto -> 112
    //   110: bipush #102
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztwx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */