package burp;

import java.util.List;
import java.util.Map;

public class Ztmm {
  private final List<List<Zgc7>> ZY;
  
  private final Ztyn ZC;
  
  private final Zgbo Zk;
  
  private final int Zr;
  
  private final Zxpd ZK;
  
  private static Zbqc[] ZP;
  
  public Ztmm(List<List<Zgc7>> paramList, Ztyn paramZtyn, Zgbo paramZgbo, int paramInt, Zxpd paramZxpd) {
    this.ZY = paramList;
    this.ZC = paramZtyn;
    this.Zk = paramZgbo;
    this.Zr = paramInt;
    this.ZK = paramZxpd;
  }
  
  public boolean ZL() {
    // Byte code:
    //   0: invokestatic Zx : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZY : Ljava/util/List;
    //   8: invokeinterface iterator : ()Ljava/util/Iterator;
    //   13: astore_2
    //   14: aload_2
    //   15: invokeinterface hasNext : ()Z
    //   20: ifeq -> 163
    //   23: aload_2
    //   24: invokeinterface next : ()Ljava/lang/Object;
    //   29: checkcast java/util/List
    //   32: astore_3
    //   33: iconst_0
    //   34: istore #4
    //   36: aload_3
    //   37: invokeinterface iterator : ()Ljava/util/Iterator;
    //   42: astore #5
    //   44: aload #5
    //   46: invokeinterface hasNext : ()Z
    //   51: ifeq -> 152
    //   54: aload #5
    //   56: invokeinterface next : ()Ljava/lang/Object;
    //   61: checkcast burp/Zgc7
    //   64: astore #6
    //   66: aload_0
    //   67: getfield ZK : Lburp/Zxpd;
    //   70: invokevirtual ZZ : ()V
    //   73: aload_0
    //   74: aload #6
    //   76: invokevirtual ZR : (Lburp/Zgc7;)Z
    //   79: ifeq -> 85
    //   82: goto -> 44
    //   85: aload_0
    //   86: aload #6
    //   88: invokevirtual Zw : (Lburp/Zgc7;)Ljava/lang/Boolean;
    //   91: astore #7
    //   93: aload #7
    //   95: ifnull -> 113
    //   98: aload #7
    //   100: invokevirtual booleanValue : ()Z
    //   103: ifne -> 44
    //   106: iconst_1
    //   107: istore #4
    //   109: aload_1
    //   110: ifnull -> 152
    //   113: aload_0
    //   114: getfield Zr : I
    //   117: iconst_3
    //   118: if_icmpge -> 141
    //   121: aload_0
    //   122: aload_0
    //   123: getfield ZC : Lburp/Ztyn;
    //   126: aload #6
    //   128: invokevirtual ZE : (Lburp/Ztyn;Lburp/Zgc7;)Z
    //   131: ifeq -> 148
    //   134: iconst_1
    //   135: istore #4
    //   137: aload_1
    //   138: ifnull -> 152
    //   141: iconst_1
    //   142: istore #4
    //   144: aload_1
    //   145: ifnull -> 152
    //   148: aload_1
    //   149: ifnull -> 44
    //   152: iload #4
    //   154: ifne -> 159
    //   157: iconst_0
    //   158: ireturn
    //   159: aload_1
    //   160: ifnull -> 14
    //   163: iconst_1
    //   164: ireturn
  }
  
  private boolean ZR(Zgc7 paramZgc7) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: invokestatic Zx : ()[Lburp/Zbqc;
    //   5: aload_0
    //   6: getfield Zk : Lburp/Zgbo;
    //   9: astore #4
    //   11: astore_2
    //   12: aload #4
    //   14: ifnull -> 43
    //   17: aload_1
    //   18: aload #4
    //   20: invokevirtual Zf : ()Lburp/Zgc7;
    //   23: if_acmpne -> 32
    //   26: iconst_1
    //   27: istore_3
    //   28: aload_2
    //   29: ifnull -> 43
    //   32: aload #4
    //   34: invokevirtual Zp : ()Lburp/Zgbo;
    //   37: astore #4
    //   39: aload_2
    //   40: ifnull -> 12
    //   43: iload_3
    //   44: ireturn
  }
  
  private boolean ZE(Ztyn paramZtyn, Zgc7 paramZgc7) {
    Zgbo zgbo = new Zgbo(paramZgc7, paramZtyn, this.Zk, this.Zr, this.ZK);
    return zgbo.Zk();
  }
  
  private Boolean Zw(Zgc7 paramZgc7) {
    Map map = paramZgc7.<Map>ZO(Zxc6.ModifiesSymbols);
    return (map != null) ? (Boolean)map.get(this.ZC) : null;
  }
  
  public static void ZS(Zbqc[] paramArrayOfZbqc) {
    ZP = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zx() {
    return ZP;
  }
  
  static {
    if (Zx() != null)
      ZS(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztmm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */