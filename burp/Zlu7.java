package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import net.portswigger.Zm2;

public class Zlu7 implements Zzyl {
  private final List<Zmzr> Zw;
  
  private final Zerg Za;
  
  private final Zlba Zt;
  
  private final Zbjf Zv;
  
  private final Zbws ZO;
  
  private final Consumer<Zbza> Zi;
  
  private final Runnable ZD;
  
  Zlu7(List<Zmzr> paramList, Zerg paramZerg, Zlba paramZlba, Zbjf paramZbjf, Zbws paramZbws, Consumer<Zbza> paramConsumer, Runnable paramRunnable) {
    this.Zw = paramList;
    this.Za = paramZerg;
    this.Zt = paramZlba;
    this.Zv = paramZbjf;
    this.ZO = paramZbws;
    this.Zi = paramConsumer;
    this.ZD = paramRunnable;
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    String str;
    switch (paramInt) {
      case 135680:
        str = Zz5n.ZS(this.Zw.stream().map(Zmzr::ZwX).toList(), this.ZO);
        if (str == null)
          return true; 
        Zm2.ZC(Zrrh.SCANNER_SCAN_QUEUE_ADD_COMMENT);
        Z_(str);
        return true;
      case 524544:
      case 524545:
      case 524546:
      case 524547:
      case 524548:
      case 524549:
      case 524550:
      case 524551:
      case 524552:
      case 524553:
        Zz5n.ZY(paramInt);
        ZQ();
        Zm2.Zi(Zv8r.SCANNER_SCAN_QUEUE_HIGHLIGHT, Zlxk.ZS);
        return true;
      case 135936:
        ZQ();
        Zm2.Zi(Zv8r.SCANNER_SCAN_QUEUE_HIGHLIGHT, Zlxk.ZS);
        return true;
      case 527872:
        if (!this.Zw.isEmpty())
          this.Zi.accept(((Zmzr)this.Zw.get(0)).ZwX()); 
        return true;
      case 527888:
        if (this.Zw.size() == 1) {
          int i = ((Zmzr)this.Zw.get(0)).ZwD();
          this.Zv.ZV().setRowSelectionInterval(i, i);
          this.ZD.run();
        } 
        return true;
      case 528640:
        Zm2.ZC(Zrrh.SCANNER_SCAN_QUEUE_CANCEL);
        this.Zt.ZA(this.Zw.stream().map(Zmzr::ZwX).toList());
        return true;
      case 528896:
        Zm2.ZC(Zrrh.SCANNER_SCAN_QUEUE_SCAN_AGAIN);
        this.Zt.Zz(this.Zw.stream().map(Zmzr::ZwX).toList());
        return true;
      case 131328:
        if (!this.Zw.isEmpty()) {
          Zbza zbza = ((Zmzr)this.Zw.get(0)).ZwX();
          this.Za.Zm().Ze(zbza.Zg0(), zbza.Zgy(), null, null);
        } 
        return true;
      case 131584:
        if (!this.Zw.isEmpty()) {
          Zbza zbza = ((Zmzr)this.Zw.get(0)).ZwX();
          this.Za.Zg().Zp(zbza.Zg0(), zbza.Zgy(), Zm(zbza.Zgf()), zbza.Zgz());
        } 
        return true;
      case 132992:
        if (!this.Zw.isEmpty()) {
          Ztei.Zj(Zeew.SCANNER, Zeew.ORGANISER);
          Zbza zbza = ((Zmzr)this.Zw.get(0)).ZwX();
          this.Za.Ze().ZN(Zeew.SCANNER, zbza.Zg0(), zbza.Zgy(), zbza.Zgz(), System.currentTimeMillis(), null);
        } 
        return true;
    } 
    return false;
  }
  
  private void Z_(String paramString) {
    String[] arrayOfString = Zxcf.Zq();
    for (Zmzr zmzr : this.Zw) {
      zmzr.ZwX().Zxg(paramString);
      int i = zmzr.ZwD();
      this.Zv.Zn(i, i);
      if (arrayOfString != null)
        break; 
    } 
  }
  
  private void ZQ() {
    String[] arrayOfString = Zxcf.Zq();
    for (Zmzr zmzr : this.Zw) {
      zmzr.ZwX().ZB((byte)Zlxk.ZS);
      int i = zmzr.ZwD();
      this.Zv.Zn(i, i);
      if (arrayOfString != null)
        break; 
    } 
  }
  
  private List<int[]> Zm(Zefg<Zrrc> paramZefg) {
    String[] arrayOfString = Zxcf.Zq();
    if (paramZefg == null)
      return null; 
    ArrayList<int[]> arrayList = new ArrayList(paramZefg.size());
    for (Zrrc zrrc : paramZefg) {
      arrayList.add(new int[] { zrrc.startOffset(), zrrc.endOffset() });
      if (arrayOfString != null)
        break; 
    } 
    return (List<int[]>)arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlu7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */