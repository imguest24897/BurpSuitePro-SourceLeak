package burp;

import java.util.LinkedList;
import java.util.List;
import net.portswigger.Zdo;
import net.portswigger.Zkb;

public class Zz89 implements Zgd5 {
  private final Zzuy Zu;
  
  private final String Zp;
  
  Zz89(Zzur paramZzur) {
    this.Zp = paramZzur.ZT();
    int[] arrayOfInt = Zmgt.ZK();
    if (paramZzur instanceof Zzuy) {
      Zzuy zzuy = (Zzuy)paramZzur;
      this.Zu = zzuy;
      if (arrayOfInt == null) {
        this.Zu = null;
        return;
      } 
      return;
    } 
    this.Zu = null;
  }
  
  public Zzbn ZZ(Zzvx paramZzvx) {
    Zzvw zzvw = (Zzvw)paramZzvx;
    Ze3n ze3n = zzvw.ZX();
    int[] arrayOfInt = Zmgt.ZK();
    Zlit zlit = (zzvw.ZH() == Ztst.APR) ? ze3n.ZA().ZF() : new Zax(ze3n.Zod(), Zdo.ZQ);
    LinkedList<byte[]> linkedList = new LinkedList();
    Zxgd zxgd = ZW(Zxgd.ZZ(), zzvw, zlit, (List<byte[]>)linkedList);
    Zg3d zg3d = zzvw.ZK(zxgd);
    Zefx zefx = zg3d.ZL();
    Zb6q zb6q = zg3d.Ze();
    Zzbn zzbn = Zzbn.Zy(zzvw, zefx, zb6q, (List<byte[]>)linkedList);
    zzvw.ZT(this.Zp, zzbn);
    zzvw.Zw().ZZ(zefx, zb6q, this.Zp);
    if (Zbqc.Zwu() == null)
      Zmgt.Zm(new int[1]); 
    return zzbn;
  }
  
  protected Zxgd ZW(Zxgd paramZxgd, Zzvw paramZzvw, Zlit paramZlit, List<byte[]> paramList) {
    // Byte code:
    //   0: invokestatic ZK : ()[I
    //   3: astore #5
    //   5: new burp/Zlpr
    //   8: dup
    //   9: aload #4
    //   11: invokespecial <init> : (Ljava/util/List;)V
    //   14: astore #6
    //   16: aload_2
    //   17: invokevirtual ZH : ()Lburp/Zbjr;
    //   20: getstatic burp/Ztst.APH : Lburp/Ztst;
    //   23: if_acmpne -> 37
    //   26: aload_1
    //   27: aload_3
    //   28: <illegal opcode> Zv : (Lburp/Zlit;)Lburp/Zrec;
    //   33: invokevirtual ZY : (Lburp/Zrec;)Lburp/Zxgd;
    //   36: astore_1
    //   37: aload_0
    //   38: getfield Zu : Lburp/Zzuy;
    //   41: invokevirtual Z_ : ()Ljava/util/List;
    //   44: invokeinterface iterator : ()Ljava/util/Iterator;
    //   49: astore #7
    //   51: aload #7
    //   53: invokeinterface hasNext : ()Z
    //   58: ifeq -> 93
    //   61: aload #7
    //   63: invokeinterface next : ()Ljava/lang/Object;
    //   68: checkcast burp/Zxwz
    //   71: astore #8
    //   73: aload_1
    //   74: aload #8
    //   76: aload #6
    //   78: aload_2
    //   79: <illegal opcode> Zv : (Lburp/Zxwz;Lburp/Zlpr;Lburp/Zzvw;)Lburp/Zrec;
    //   84: invokevirtual ZY : (Lburp/Zrec;)Lburp/Zxgd;
    //   87: astore_1
    //   88: aload #5
    //   90: ifnonnull -> 51
    //   93: aload_1
    //   94: aload #6
    //   96: <illegal opcode> Zv : (Lburp/Zlpr;)Lburp/Zrec;
    //   101: invokevirtual ZY : (Lburp/Zrec;)Lburp/Zxgd;
    //   104: areturn
  }
  
  private static Zefx lambda$buildRequestModifier$2(Zlpr paramZlpr, Zefx paramZefx) {
    return paramZlpr.Zi() ? paramZefx : Zgyj.Zp(paramZefx);
  }
  
  private static Zefx lambda$buildRequestModifier$1(Zxwz paramZxwz, Zlpr paramZlpr, Zzvw paramZzvw, Zefx paramZefx) {
    return paramZxwz.ZB(paramZlpr, paramZefx, paramZzvw);
  }
  
  private static Zefx lambda$buildRequestModifier$0(Zlit paramZlit, Zefx paramZefx) {
    return paramZefx.Zo(Zkb.ZG(paramZlit.ZdH()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz89.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */