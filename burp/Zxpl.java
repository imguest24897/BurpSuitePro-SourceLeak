package burp;

import java.util.List;

public class Zxpl implements Zsw {
  private final Zbnt Zy;
  
  private final Zrgd ZJ;
  
  private final Zey9 ZW;
  
  private final Zxat ZO;
  
  public Zxpl(Zbnt paramZbnt, Zrgd paramZrgd, Zey9 paramZey9) {
    this.Zy = paramZbnt;
    this.ZJ = paramZrgd;
    this.ZW = paramZey9;
    this.ZO = new Zxat();
  }
  
  public List<Ztbr> ZM() {
    return this.ZO.Zi();
  }
  
  public void Zr() {
    this.ZO.ZH();
  }
  
  Zefx Zs(Zefx paramZefx) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface ZT : ()Lburp/Zmzk;
    //   6: aload_1
    //   7: invokeinterface ZD : ()[B
    //   12: iconst_1
    //   13: aload_0
    //   14: getfield Zy : Lburp/Zbnt;
    //   17: invokestatic Zu : (Lburp/Zmzk;[BBLburp/Zbnt;)Lburp/Zz1p;
    //   20: astore_3
    //   21: invokestatic Zw : ()[Lburp/Zbqc;
    //   24: aload_3
    //   25: getfield Zo : Lburp/Zlit;
    //   28: invokeinterface Zd4 : ()[B
    //   33: astore #4
    //   35: astore_2
    //   36: aload_0
    //   37: getfield ZO : Lburp/Zxat;
    //   40: aload_1
    //   41: invokeinterface ZT : ()Lburp/Zmzk;
    //   46: aload #4
    //   48: invokevirtual ZW : (Lburp/Zmzk;[B)Ljava/util/List;
    //   51: astore #5
    //   53: aload_1
    //   54: invokeinterface ZD : ()[B
    //   59: astore #6
    //   61: aload #5
    //   63: invokeinterface iterator : ()Ljava/util/Iterator;
    //   68: astore #7
    //   70: aload #7
    //   72: invokeinterface hasNext : ()Z
    //   77: ifeq -> 198
    //   80: aload #7
    //   82: invokeinterface next : ()Ljava/lang/Object;
    //   87: checkcast burp/Ztbr
    //   90: astore #8
    //   92: aload_1
    //   93: invokeinterface ZT : ()Lburp/Zmzk;
    //   98: aload #6
    //   100: iconst_3
    //   101: aload_0
    //   102: getfield Zy : Lburp/Zbnt;
    //   105: invokestatic Zu : (Lburp/Zmzk;[BBLburp/Zbnt;)Lburp/Zz1p;
    //   108: astore_3
    //   109: aload #8
    //   111: invokeinterface ZqU : ()Ljava/util/Date;
    //   116: ifnull -> 166
    //   119: aload #8
    //   121: invokeinterface ZqU : ()Ljava/util/Date;
    //   126: invokevirtual getTime : ()J
    //   129: aload_0
    //   130: getfield ZJ : Lburp/Zrgd;
    //   133: invokevirtual ZX : ()J
    //   136: getstatic burp/Zs1b.ZF : J
    //   139: lsub
    //   140: lcmp
    //   141: ifge -> 166
    //   144: aload #6
    //   146: aload_3
    //   147: aload #8
    //   149: invokeinterface Zqy : ()Ljava/lang/String;
    //   154: getstatic burp/Zrdu.COOKIE : Lburp/Zrdu;
    //   157: invokestatic ZQ : ([BLburp/Zz1p;Ljava/lang/String;Lburp/Zrdu;)[B
    //   160: astore #6
    //   162: aload_2
    //   163: ifnonnull -> 194
    //   166: aload #6
    //   168: aload_3
    //   169: aload #8
    //   171: invokeinterface Zqy : ()Ljava/lang/String;
    //   176: aload #8
    //   178: invokeinterface Zq0 : ()Ljava/lang/String;
    //   183: iconst_1
    //   184: iconst_1
    //   185: getstatic burp/Zrdu.COOKIE : Lburp/Zrdu;
    //   188: aconst_null
    //   189: invokestatic Zn : ([BLburp/Zz1p;Ljava/lang/String;Ljava/lang/String;ZZLburp/Zrdu;[I)[B
    //   192: astore #6
    //   194: aload_2
    //   195: ifnonnull -> 70
    //   198: aload_0
    //   199: getfield ZW : Lburp/Zey9;
    //   202: aload_1
    //   203: invokeinterface ZT : ()Lburp/Zmzk;
    //   208: aload #6
    //   210: invokevirtual ZY : (Lburp/Zmzk;[B)Lburp/Zefx;
    //   213: areturn
  }
  
  public void ZO(Zeew paramZeew, Zefx paramZefx) {
    List<Ztbr> list = Zth6.Zl(paramZefx.ZT(), paramZefx.ZG());
    Zh(paramZefx.ZT(), list, true);
  }
  
  public void Zv(Zeew paramZeew, Zmzk paramZmzk, List<String> paramList) {
    List<Ztbr> list = Zth6.Z_(paramZmzk, paramList, null);
    Zh(paramZmzk, list, false);
  }
  
  void Zc(List<Ztbr> paramList) {
    Zh(null, paramList, false);
  }
  
  private void Zh(Zmzk paramZmzk, List<Ztbr> paramList, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      this.ZO.Zf(paramList, paramZmzk, paramBoolean); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxpl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */