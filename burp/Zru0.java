package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import net.portswigger.Zm2;

public class Zru0 implements Zmz6 {
  private final Zr_4 ZJ = new Zruo();
  
  private final Zz1h Z_;
  
  private final Zr5h ZB;
  
  private final Zkq4 Zy;
  
  private final Zrny ZD;
  
  private final Ztos<Zt1o> ZN;
  
  private final AtomicInteger Zw;
  
  private final AtomicInteger ZX;
  
  private final AtomicInteger Zc;
  
  private final AtomicInteger Zt;
  
  Zru0(Zz1h paramZz1h, Zr5h paramZr5h, Zkq4 paramZkq4, Zrny paramZrny, Ztos<Zt1o> paramZtos) {
    this.Z_ = paramZz1h;
    this.ZB = paramZr5h;
    this.Zy = paramZkq4;
    this.ZD = paramZrny;
    this.ZN = paramZtos;
    Zz1i zz1i = paramZr5h.Zdm();
    String[] arrayOfString = Zmhb.Zz();
    this.Zw = new AtomicInteger(zz1i.ZHf());
    this.ZX = new AtomicInteger(zz1i.ZHz());
    this.Zc = new AtomicInteger(zz1i.ZHt());
    this.Zt = new AtomicInteger(zz1i.ZHO());
    if (Zbqc.Zwu() == null)
      Zmhb.Za(new String[1]); 
  }
  
  private Zru0(Zru0 paramZru0) {
    this.Z_ = paramZru0.Z_;
    this.ZB = paramZru0.ZB;
    this.Zy = paramZru0.Zy;
    this.ZD = paramZru0.ZD;
    this.ZN = paramZru0.ZN;
    this.Zw = paramZru0.Zw;
    this.ZX = paramZru0.ZX;
    this.Zc = paramZru0.Zc;
    this.Zt = paramZru0.Zt;
  }
  
  public Zmz6 ZV() {
    return new Zru4(this);
  }
  
  public List<Zrdb> ZQ(Zgq<Zrdb> paramZgq, Zbza paramZbza) {
    List<Zrdb> list = Zmhb.ZE(paramZgq, this.ZJ);
    Zf(list, paramZbza);
    return list;
  }
  
  public void Zs(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Zw.set(paramInt1);
    this.ZX.set(paramInt2);
    this.Zc.set(paramInt3);
    this.Zt.set(paramInt4);
  }
  
  public List<Zrdb> Zk(Zx_5 paramZx_5, Zbza paramZbza) {
    Zgq<Zgpi> zgq = new Zgq<>();
    zgq.Zu(paramZx_5);
    return ZQ((Zgq)zgq, paramZbza);
  }
  
  public void Zf(List<Zrdb> paramList, Zbza paramZbza) {
    String[] arrayOfString = Zmhb.Zz();
    if (paramList != null && !paramList.isEmpty()) {
      for (Zrdb zrdb : paramList) {
        if (this.ZB.ZNs() == Zkcl.LIVE_AUDIT || zrdb.Za6().ZD().contains(Zzua.PASSIVE))
          continue; 
        Zm2.Zi(Zv8r.SCANNER_ISSUE_FOUND_AFTER_DURATION, this.ZB.ZPB().toMillis());
        if (arrayOfString != null)
          break; 
      } 
      Ze1 ze1 = this.ZD.Zm(this.ZB.ZPo(), paramList);
      this.ZN.ZD(Zt1o.Za(this.Zw.addAndGet(ze1.Zm.ZJ), this.ZX.addAndGet(ze1.Zm.Zv), this.Zc.addAndGet(ze1.Zm.ZB), this.Zt.addAndGet(ze1.Zm.Zk)));
      if (paramZbza != null) {
        List<Zrdb> list = paramList;
        Collection<Ztbg> collection = ze1.Zw.values();
        ArrayList<Zrdb> arrayList1 = new ArrayList();
        ArrayList<Zrdb> arrayList2 = new ArrayList();
        ArrayList<Zrdb> arrayList3 = new ArrayList();
        for (Ztbg ztbg : collection) {
          arrayList1.addAll(ztbg.Zq());
          arrayList2.addAll(ztbg.Zz());
          arrayList2.addAll(ztbg.ZB());
          arrayList2.addAll(ztbg.Z_());
          arrayList2.addAll(ztbg.ZE());
          arrayList3.addAll(ztbg.Zw());
          if (arrayOfString != null)
            break; 
        } 
        if (this.Zy.Zs6()) {
          ArrayList<Zrdb> arrayList = new ArrayList(arrayList1.size() + arrayList2.size());
          arrayList.addAll(arrayList1);
          arrayList.addAll(arrayList2);
          List<Zrdb> list1 = paramZbza.Zgr();
          if (!list1.isEmpty())
            for (Zrdb zrdb : new ArrayList(arrayList)) {
              for (Zrdb zrdb1 : list1) {
                if (zrdb.ZF(zrdb1))
                  arrayList.remove(zrdb); 
                if (arrayOfString != null)
                  break; 
              } 
              if (arrayOfString != null)
                break; 
            }  
          list = this.Z_.Zq(arrayList);
        } 
        if (!list.isEmpty())
          paramZbza.Ze(list); 
        if (!arrayList1.isEmpty())
          this.ZN.ZD(new Zxr8(Zt1o.ZZ, new Zeaa(paramZbza, arrayList1, ZU()))); 
        if (!arrayList2.isEmpty())
          this.ZN.ZD(new Zxr8(Zt1o.Zk, new Zeaa(paramZbza, arrayList2, ZU()))); 
        if (!arrayList3.isEmpty())
          this.ZN.ZD(new Zxr8(Zt1o.ZT, new Zeaa(paramZbza, arrayList3, ZU()))); 
      } 
    } 
  }
  
  protected boolean ZU() {
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zru0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */