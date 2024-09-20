package burp;

public class Zz3z implements Zsvl {
  private final Ze3n Zk;
  
  private final Zr_4 Zi;
  
  private final Zssh ZH;
  
  private final Zz1h ZT;
  
  Zz3z(Ze3n paramZe3n, Zr_4 paramZr_4, Zssh paramZssh, Zz1h paramZz1h) {
    this.Zk = paramZe3n;
    this.Zi = paramZr_4;
    this.ZH = paramZssh;
    Zbqc[] arrayOfZbqc = Ztgb.Z_();
    this.ZT = paramZz1h;
    if (Zbqc.Zwu() == null)
      Ztgb.ZI(new Zbqc[5]); 
  }
  
  public void ZZ(Ztk8 paramZtk8) {
    // Byte code:
    //   0: invokestatic Z_ : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual ZN : ()Lburp/Zgq;
    //   8: invokevirtual iterator : ()Ljava/util/Iterator;
    //   11: astore_3
    //   12: aload_3
    //   13: invokeinterface hasNext : ()Z
    //   18: ifeq -> 247
    //   21: aload_3
    //   22: invokeinterface next : ()Ljava/lang/Object;
    //   27: checkcast burp/Zsqx
    //   30: astore #4
    //   32: aload_0
    //   33: getfield Zi : Lburp/Zr_4;
    //   36: aload #4
    //   38: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   43: checkcast burp/Zrdb
    //   46: astore #5
    //   48: aload #5
    //   50: invokeinterface Za6 : ()Lburp/Zvs;
    //   55: astore #6
    //   57: aload #5
    //   59: invokestatic ZA : (Lburp/Zrdb;)Ljava/lang/String;
    //   62: astore #7
    //   64: aload #6
    //   66: invokeinterface Zb : ()Lburp/Zmvg;
    //   71: invokevirtual Zv : ()Z
    //   74: ifne -> 121
    //   77: aload #6
    //   79: invokeinterface Zb : ()Lburp/Zmvg;
    //   84: invokevirtual ZG : ()Z
    //   87: ifne -> 121
    //   90: aload_0
    //   91: getfield ZH : Lburp/Zssh;
    //   94: aload_0
    //   95: getfield Zk : Lburp/Ze3n;
    //   98: invokevirtual Za : ()Lburp/Zmzk;
    //   101: aload_0
    //   102: getfield Zk : Lburp/Ze3n;
    //   105: invokevirtual ZN : ()Ljava/lang/String;
    //   108: aload #6
    //   110: aload #7
    //   112: invokevirtual Zz : (Lburp/Zmzk;Ljava/lang/String;Lburp/Zvs;Ljava/lang/String;)Z
    //   115: istore #8
    //   117: aload_2
    //   118: ifnull -> 212
    //   121: aload #6
    //   123: invokeinterface Zb : ()Lburp/Zmvg;
    //   128: invokevirtual Zv : ()Z
    //   131: ifeq -> 175
    //   134: aload_0
    //   135: getfield ZH : Lburp/Zssh;
    //   138: aload_0
    //   139: getfield Zk : Lburp/Ze3n;
    //   142: invokevirtual Za : ()Lburp/Zmzk;
    //   145: aload_0
    //   146: getfield Zk : Lburp/Ze3n;
    //   149: invokevirtual ZN : ()Ljava/lang/String;
    //   152: aload #6
    //   154: aload #7
    //   156: aload #5
    //   158: invokeinterface Za8 : ()B
    //   163: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   166: invokevirtual Zg : (Lburp/Zmzk;Ljava/lang/String;Lburp/Zvs;Ljava/lang/String;Ljava/lang/Integer;)Z
    //   169: istore #8
    //   171: aload_2
    //   172: ifnull -> 212
    //   175: aload_0
    //   176: getfield ZH : Lburp/Zssh;
    //   179: aload_0
    //   180: getfield Zk : Lburp/Ze3n;
    //   183: invokevirtual Za : ()Lburp/Zmzk;
    //   186: aload_0
    //   187: getfield Zk : Lburp/Ze3n;
    //   190: invokevirtual ZN : ()Ljava/lang/String;
    //   193: aload #6
    //   195: aload #7
    //   197: aload #5
    //   199: invokeinterface Zam : ()I
    //   204: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   207: invokevirtual Zg : (Lburp/Zmzk;Ljava/lang/String;Lburp/Zvs;Ljava/lang/String;Ljava/lang/Integer;)Z
    //   210: istore #8
    //   212: iload #8
    //   214: ifeq -> 243
    //   217: aload_0
    //   218: getfield Zk : Lburp/Ze3n;
    //   221: invokevirtual ZM : ()Lburp/Zbza;
    //   224: aload_0
    //   225: getfield ZT : Lburp/Zz1h;
    //   228: aload #5
    //   230: invokeinterface Zz : (Lburp/Zgpi;)Lburp/Zgpi;
    //   235: checkcast burp/Zrdb
    //   238: invokeinterface Zi : (Lburp/Zrdb;)V
    //   243: aload_2
    //   244: ifnull -> 12
    //   247: return
  }
  
  public static String ZA(Zrdb paramZrdb) {
    return paramZrdb.ZaT().ZK();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz3z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */