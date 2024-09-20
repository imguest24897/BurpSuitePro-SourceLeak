package burp;

import java.util.List;
import net.portswigger.Zen;

public abstract class Zg2n implements Ze2o {
  private final String ZQ;
  
  private final String ZG;
  
  private final Zen Zk;
  
  private final Zbjl Zb;
  
  private static Zbqc[] Zl;
  
  protected Zg2n(String paramString1, String paramString2, Zen paramZen, Zbjl paramZbjl) {
    this.ZQ = paramString1;
    this.ZG = paramString2;
    this.Zk = paramZen;
    this.Zb = paramZbjl;
  }
  
  protected abstract String ZP(String paramString);
  
  protected boolean ZL() {
    return false;
  }
  
  public String ZJ() {
    String str = Zb(this.Zk);
    return ZP(str);
  }
  
  public String Zv() {
    return this.ZG;
  }
  
  public String ZX() {
    return this.ZQ;
  }
  
  protected String Zb(Zen paramZen) {
    Zbqc[] arrayOfZbqc = ZT();
    if (this.Zb.ZG()) {
      Zzi5 zzi5 = this.Zb.ZB();
      String str = ZL() ? zzi5.Zk(paramZen) : zzi5.Zq(paramZen);
      return (arrayOfZbqc != null) ? paramZen.toString() : str;
    } 
    return paramZen.toString();
  }
  
  protected void ZX(byte[] paramArrayOfbyte1, Zlvf paramZlvf, Zxs7 paramZxs7, Zz4_ paramZz4_, Ze3n paramZe3n, byte[] paramArrayOfbyte2, List<Zl1r> paramList, Ztai paramZtai) {
    if (paramZtai.Zr(Zzu2.INPUT_RETRIEVAL_REFLECTED))
      Zf(paramArrayOfbyte1, paramZlvf, paramZxs7, paramZz4_, paramZe3n, paramArrayOfbyte2, paramList, paramZtai); 
  }
  
  protected void Zf(byte[] paramArrayOfbyte1, Zlvf paramZlvf, Zxs7 paramZxs7, Zz4_ paramZz4_, Ze3n paramZe3n, byte[] paramArrayOfbyte2, List<Zl1r> paramList, Ztai paramZtai) {
    // Byte code:
    //   0: aload #8
    //   2: getstatic burp/Zzu2.INPUT_RETRIEVAL_REFLECTED : Lburp/Zzu2;
    //   5: invokeinterface Zr : (Lburp/Zvs;)Z
    //   10: ifeq -> 106
    //   13: aload #5
    //   15: invokevirtual ZM : ()Lburp/Zbza;
    //   18: aload_3
    //   19: invokeinterface Zl : ()Lburp/Zro0;
    //   24: invokeinterface ZM : (Lburp/Zro0;)Z
    //   29: ifne -> 106
    //   32: aload_2
    //   33: aload #6
    //   35: invokestatic ZK : ([B)Lburp/Zxar;
    //   38: invokestatic ZW : (Lburp/Zlvf;Lburp/Zt9b;)Lburp/Ze9u;
    //   41: astore #9
    //   43: aload #9
    //   45: ifnull -> 106
    //   48: aload #5
    //   50: invokevirtual ZM : ()Lburp/Zbza;
    //   53: aload_3
    //   54: invokeinterface Zl : ()Lburp/Zro0;
    //   59: iconst_0
    //   60: invokeinterface Zo : (Lburp/Zro0;Z)V
    //   65: aload #4
    //   67: aload #5
    //   69: aload_3
    //   70: <illegal opcode> run : (Lburp/Ze3n;Lburp/Zxs7;)Ljava/lang/Runnable;
    //   75: invokeinterface Zy : (Ljava/lang/Runnable;)V
    //   80: aload #4
    //   82: aload #9
    //   84: aload_3
    //   85: aload #5
    //   87: aload #6
    //   89: aload_0
    //   90: aload #6
    //   92: aload_1
    //   93: aload #7
    //   95: invokevirtual ZO : ([B[BLjava/util/List;)Ljava/util/List;
    //   98: invokestatic ZI : (Lburp/Ze9u;Lburp/Zxs7;Lburp/Ze3n;[BLjava/util/List;)Lburp/Zx_5;
    //   101: invokeinterface Zz : (Lburp/Zsqx;)V
    //   106: return
  }
  
  protected List<Zl1r> ZO(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, List<Zl1r> paramList) {
    return paramList;
  }
  
  private static void lambda$findFileUploadInputRetrievalReflected$0(Ze3n paramZe3n, Zxs7 paramZxs7) {
    paramZe3n.ZM().Zq(paramZxs7.Zl(), false);
  }
  
  public static void Zl(Zbqc[] paramArrayOfZbqc) {
    Zl = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZT() {
    return Zl;
  }
  
  static {
    if (ZT() != null)
      Zl(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg2n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */