package burp;

import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zgxi implements Zzyl {
  private final Zerg Zj;
  
  private final Zrag Z_;
  
  private Zxgc Zr;
  
  private Zbiv Zv;
  
  private Zlgj Zb;
  
  private Zl4w ZC;
  
  public Zgxi(Zerg paramZerg, Zrag paramZrag) {
    Zuh.Zb((paramZerg != null), Zqf.Zv);
    this.Z_ = paramZrag;
    this.Zj = paramZerg;
  }
  
  public void Za(Zxgc paramZxgc, Zbiv paramZbiv, Zlgj paramZlgj) {
    this.Zr = paramZxgc;
    this.Zv = paramZbiv;
    this.Zb = paramZlgj;
  }
  
  public void Zi(Zl4w paramZl4w) {
    this.ZC = paramZl4w;
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    switch (paramInt) {
      case 136448:
        this.Zv.Zn(this.Zr.ZK1());
        return true;
      case 262400:
        this.Zj.ZJ().Zf();
        return true;
      case 262464:
        this.Zj.ZJ().ZW();
        return true;
      case 262656:
        this.Zj.ZJ().Zv();
        return true;
      case 262528:
        this.Zj.ZJ().Zz();
        this.Zj.ZJ().Zf();
        return true;
      case 262912:
        this.Zj.ZJ().Zc(!this.Zj.ZJ().ZA());
        return true;
      case 263168:
        this.Zj.Zm().ZB();
        return true;
      case 263296:
        this.Zj.Zg().Za();
        return true;
      case 263328:
        this.Zr.ZH(Zeew.DASHBOARD);
        Zm2.Zo(Zze0.SUITE_UI_SWITCH_TO_DASHBOARD);
        return true;
      case 263424:
        this.Zr.ZH(Zeew.TARGET);
        Zm2.Zo(Zze0.SUITE_UI_SWITCH_TO_TARGET);
        return true;
      case 263680:
        this.Zr.ZH(Zeew.PROXY);
        Zm2.Zo(Zze0.SUITE_UI_SWITCH_TO_PROXY);
        return true;
      case 264448:
        this.Zr.ZH(Zeew.INTRUDER);
        Zm2.Zo(Zze0.SUITE_UI_SWITCH_TO_INTRUDER);
        return true;
      case 264704:
        this.Zr.ZH(Zeew.REPEATER);
        Zm2.Zo(Zze0.SUITE_UI_SWITCH_TO_REPEATER);
        return true;
      case 264960:
        this.Zr.ZH(Zeew.SEQUENCER);
        Zm2.Zo(Zze0.SUITE_UI_SWITCH_TO_SEQUENCER);
        return true;
      case 264768:
        this.Zr.ZH(Zeew.COLLABORATOR);
        Zm2.Zo(Zze0.SUITE_UI_SWITCH_TO_COLLABORATOR);
        return true;
      case 265216:
        this.Zr.ZH(Zeew.XCODER);
        Zm2.Zo(Zze0.SUITE_UI_SWITCH_TO_DECODER);
        return true;
      case 265472:
        this.Zr.ZH(Zeew.COMPARER);
        Zm2.Zo(Zze0.SUITE_UI_SWITCH_TO_COMPARER);
        return true;
      case 265600:
        this.Zr.ZH(Zeew.EXTENDER);
        Zm2.Zo(Zze0.SUITE_UI_SWITCH_TO_EXTENSIONS);
        return true;
      case 265536:
        this.Zr.ZH(Zeew.LOGGER);
        Zm2.Zo(Zze0.SUITE_UI_SWITCH_TO_LOGGER);
        return true;
      case 265568:
        this.Zr.ZH(Zeew.ORGANISER);
        Zm2.Zo(Zze0.SUITE_UI_SWITCH_TO_ORGANIZER);
        return true;
      case 265728:
        Zm2.ZC(Zrrh.SUITE_SEARCH_OPEN_VIA_HOTKEY);
        this.Zb.ZK();
        return true;
      case 265984:
        this.ZC.setVisible(true);
        return true;
      case 262928:
        this.Zj.ZJ().Zk();
        return true;
      case 266800:
        this.Z_.Zw();
        return true;
      case 266817:
        this.Zr.ZK(Zgxi::lambda$handleAction$0);
        return true;
      case 266818:
        this.Zr.ZK(Zgxi::lambda$handleAction$1);
        return true;
    } 
    return false;
  }
  
  private static boolean lambda$handleAction$1(Zrm5 paramZrm5) {
    return paramZrm5 instanceof Zbhu;
  }
  
  private static boolean lambda$handleAction$0(Zrm5 paramZrm5) {
    return paramZrm5 instanceof Zbh3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgxi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */