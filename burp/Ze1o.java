package burp;

public class Ze1o extends Ze3y {
  private static final String a;
  
  public void Zv(Zgc7 paramZgc7) {
    Zkrq zkrq = new Zkrq(paramZgc7);
    zkrq.ZT(paramZgc7);
  }
  
  public void Zz(Zgcd paramZgcd) {
    // Byte code:
    //   0: invokestatic ZE : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: aload_1
    //   6: invokevirtual ZS : (Lburp/Zgcd;)Lburp/Zb6r;
    //   9: astore_3
    //   10: aload_3
    //   11: ifnonnull -> 28
    //   14: iconst_0
    //   15: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   18: getstatic burp/Ze1o.a : Ljava/lang/String;
    //   21: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   24: iload_2
    //   25: ifeq -> 35
    //   28: aload_3
    //   29: aload_1
    //   30: invokeinterface ZT : (Lburp/Zb3t;)V
    //   35: invokestatic Zwu : ()[Lburp/Zbqc;
    //   38: ifnonnull -> 53
    //   41: iload_2
    //   42: ifeq -> 49
    //   45: iconst_0
    //   46: goto -> 50
    //   49: iconst_1
    //   50: invokestatic ZE : (Z)V
    //   53: return
  }
  
  private Zb6r ZS(Zgcd paramZgcd) {
    Zb6r zb6r = Zp(paramZgcd);
    if (zb6r == null) {
      zb6r = Zx(paramZgcd);
      if (zb6r == null)
        zb6r = Zj(paramZgcd); 
    } 
    return zb6r;
  }
  
  private Zb6r Zp(Zgcd paramZgcd) {
    return Zl19.Zk(paramZgcd.ZI()) ? new Zkr7(paramZgcd.ZQ()) : null;
  }
  
  private Zb6r Zx(Zgcd paramZgcd) {
    boolean bool = Zrai.ZH();
    for (Zb3t zb3t : paramZgcd.ZI().ZC()) {
      if (zb3t == paramZgcd)
        break; 
      if (Zl19.ZC(zb3t)) {
        Zgho zgho = (((Zgcc)zb3t).ZK()).ZE;
        if (zgho == Zgho.KEYWORD_VAR || zgho == Zgho.KEYWORD_CONST)
          return new Zkrv(paramZgcd.ZQ()); 
        if (zgho == Zgho.KEYWORD_LET)
          return new Zkrh(paramZgcd.ZQ()); 
      } 
      if (!bool)
        break; 
    } 
    return null;
  }
  
  private Zb6r Zj(Zgcd paramZgcd) {
    boolean bool = Zrai.ZE();
    Zb3t zb3t = paramZgcd.ZI().ZI();
    if (zb3t == null)
      return null; 
    for (Zb3t zb3t1 : zb3t.ZC()) {
      if (Zl19.ZF(zb3t1))
        return new Zkrv(paramZgcd.ZQ()); 
      if (bool)
        break; 
    } 
    return null;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: ldc '{bPuFOP-\\feFSChIpFJ[iPy[\ib@Y\h'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ze1o.a : Ljava/lang/String;
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
    //   80: bipush #50
    //   82: goto -> 112
    //   85: bipush #10
    //   87: goto -> 112
    //   90: bipush #119
    //   92: goto -> 112
    //   95: bipush #110
    //   97: goto -> 112
    //   100: bipush #17
    //   102: goto -> 112
    //   105: bipush #46
    //   107: goto -> 112
    //   110: bipush #56
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze1o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */