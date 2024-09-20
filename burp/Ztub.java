package burp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Ztub {
  private final Zefg<Zgkc> ZN;
  
  private final Comparator<Zgkc> Zw;
  
  private final Object Zk;
  
  private static String[] Zb;
  
  private Ztub(Zefg<Zgkc> paramZefg, Comparator<Zgkc> paramComparator, Object paramObject) {
    this.ZN = paramZefg;
    this.Zw = paramComparator;
    this.Zk = paramObject;
  }
  
  public static Ztub ZE(Zefg<Zgkc> paramZefg, Comparator<Zgkc> paramComparator) {
    return new Ztub(paramZefg, paramComparator.reversed(), paramZefg.Zz6());
  }
  
  public static Ztub ZT() {
    return new Ztub(new Zea0<>(), Zmvg.ZS, new Object());
  }
  
  public int Zb(int paramInt) {
    synchronized (this.Zk) {
      return ((Integer)this.ZN.stream().filter(Ztub::lambda$getFlags$0).map(Ztub::lambda$getFlags$1).reduce(Integer.valueOf(paramInt), Ztub::lambda$getFlags$2)).intValue();
    } 
  }
  
  public List<Ztkk> ZY() {
    ArrayList<Ztkk> arrayList = new ArrayList();
    ZT(new Zr9c(this, arrayList));
    return arrayList;
  }
  
  public List<Zzi8> Zy() {
    ArrayList<Zzi8> arrayList = new ArrayList();
    ZT(new Zr9d(this, arrayList));
    return arrayList;
  }
  
  public Zkcp Zd() {
    Zr9y zr9y = new Zr9y();
    ZT(zr9y);
    return zr9y.Ze;
  }
  
  public Zze_ ZJ() {
    Zr2f zr2f = new Zr2f();
    ZT(zr2f);
    return zr2f.ZG;
  }
  
  public Zzq1 Zr() {
    Zr9r zr9r = new Zr9r();
    ZT(zr9r);
    return zr9r.Zb;
  }
  
  public Zrp9 Zx() {
    Zr28 zr28 = new Zr28();
    ZT(zr28);
    return zr28.Zz;
  }
  
  public Zreg Zc() {
    Zr2l zr2l = new Zr2l();
    ZT(zr2l);
    return zr2l.Zt;
  }
  
  public Zeqn ZD() {
    Zr9g zr9g = new Zr9g();
    ZT(zr9g);
    return zr9g.ZJ;
  }
  
  public Zlg_ Zz() {
    Zr2j zr2j = new Zr2j();
    ZT(zr2j);
    return zr2j.Zl;
  }
  
  public Zt38 Zt() {
    Zr2o zr2o = new Zr2o();
    ZT(zr2o);
    return zr2o.Zh;
  }
  
  public Zg3y ZO() {
    Zr9t zr9t = new Zr9t();
    ZT(zr9t);
    return zr9t.ZY;
  }
  
  public Zrkg ZH() {
    Zr95 zr95 = new Zr95();
    ZT(zr95);
    return zr95.Zq;
  }
  
  public void Zj(Consumer<Zgkc> paramConsumer) {
    Zd(paramConsumer, this.Zw);
  }
  
  public void Zd(Consumer<Zgkc> paramConsumer, Comparator<Zgkc> paramComparator) {
    synchronized (this.Zk) {
      this.ZN.stream().sorted(paramComparator).forEach(paramConsumer);
    } 
  }
  
  public int Za() {
    synchronized (this.Zk) {
      return ((Integer)this.ZN.stream().map(Zgkc::Zuj).reduce(Integer.valueOf(0), Ztub::lambda$getFlags$2)).intValue();
    } 
  }
  
  public int ZQ() {
    synchronized (this.Zk) {
      return this.ZN.size();
    } 
  }
  
  public void ZT(Zr9a paramZr9a) {
    ArrayList<Zgkc> arrayList;
    String[] arrayOfString = Zo();
    synchronized (this.Zk) {
      arrayList = new ArrayList<>(this.ZN);
    } 
    arrayList.sort(this.Zw);
    for (Zgkc zgkc : arrayList) {
      switch (Zxxj.ZQ[zgkc.ZC(paramZr9a).ordinal()]) {
        case 1:
          if (arrayOfString == null)
            return; 
          break;
        case 2:
          return;
      } 
      if (arrayOfString == null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      ZV(new String[3]); 
  }
  
  public void Zt(Zr9a paramZr9a) {
    ArrayList<Zgkc> arrayList;
    String[] arrayOfString = Zo();
    synchronized (this.Zk) {
      arrayList = new ArrayList<>(this.ZN);
    } 
    arrayList.sort(this.Zw);
    for (Zgkc zgkc : arrayList) {
      switch (Zxxj.ZQ[zgkc.Zq(paramZr9a).ordinal()]) {
        case 1:
          if (arrayOfString == null)
            Zbqc.Zr(new Zbqc[4]); 
          break;
        case 2:
          return;
      } 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  public Zl4m Zd(Zgkc paramZgkc, Zz1h paramZz1h) {
    String[] arrayOfString = Zo();
    synchronized (this.Zk) {
      for (Zgkc zgkc : this.ZN) {
        Zzk5 zzk5 = zgkc.Zu(paramZgkc, paramZz1h);
        if (zzk5 == Zzk5.REPLACE_EVIDENCE) {
          this.ZN.remove(zgkc);
          this.ZN.add(paramZz1h.<Zgkc>Zz(paramZgkc));
          return Zl4m.ZY;
        } 
        if (zzk5 == Zzk5.OUT_OF_BAND_EVIDENCE_MUTATED)
          return Zl4m.Zu; 
        if (zzk5 == Zzk5.ADD_INFILTRATOR_EVIDENCE)
          return Zl4m.ZY; 
        if (zzk5 == Zzk5.EVIDENCE_EXISTS)
          return null; 
        if (arrayOfString == null)
          break; 
      } 
      return ZT(paramZgkc, paramZz1h);
    } 
  }
  
  private Zl4m ZT(Zgkc paramZgkc, Zz1h paramZz1h) {
    this.ZN.add(paramZz1h.<Zgkc>Zz(paramZgkc));
    return (paramZgkc.Zuj() == 2) ? Zl4m.Zu : ((paramZgkc.Zuj() == 4) ? Zl4m.ZY : Zl4m.Zw);
  }
  
  public boolean Zg() {
    return !Zd().ZF(Zsq7.Zo);
  }
  
  public boolean Zh() {
    return !ZJ().ZF(Zsqk.ZF);
  }
  
  public boolean Zm() {
    return !Zr().ZF(Zsq2.ZU);
  }
  
  public boolean Zk() {
    return !ZH().ZF(Zsqv.ZA);
  }
  
  public boolean ZK() {
    return !ZO().ZF(Zsqq.ZH);
  }
  
  public boolean ZN() {
    return !Zc().ZF(Zsqe.Zb);
  }
  
  public boolean Zn() {
    return !ZD().ZF(Zsqh.Zj);
  }
  
  public boolean Zs() {
    return !Zt().ZF(Zsqm.Zs);
  }
  
  public boolean ZU() {
    return !Zx().ZF(Zsqa.Ze);
  }
  
  public void ZX(int paramInt) {
    synchronized (this.Zk) {
      this.ZN.removeIf(paramInt::lambda$removeEvidenceWithFlag$6);
    } 
  }
  
  public void Zp(Ztub paramZtub) {
    synchronized (this.Zk) {
      this.ZN.addAll(paramZtub.ZN);
    } 
  }
  
  private static boolean lambda$removeEvidenceWithFlag$6(int paramInt, Zgkc paramZgkc) {
    return (paramZgkc.Zub().Zsy() == paramInt);
  }
  
  private static void lambda$addCustomReadableSummaryFields$5(Zb_h paramZb_h, Zgkc paramZgkc) {
    paramZgkc.ZY(paramZb_h);
  }
  
  private static boolean lambda$doSearch$3(Zbx0 paramZbx0, Zgkc paramZgkc) {
    return paramZgkc.ZR(paramZbx0);
  }
  
  private static Integer lambda$getFlags$2(Integer paramInteger1, Integer paramInteger2) {
    return Integer.valueOf(paramInteger1.intValue() | paramInteger2.intValue());
  }
  
  private static Integer lambda$getFlags$1(Zgkc paramZgkc) {
    return Integer.valueOf(paramZgkc.Zub().Zsy());
  }
  
  private static boolean lambda$getFlags$0(Zgkc paramZgkc) {
    return (paramZgkc.Zub() != null);
  }
  
  public static void ZV(String[] paramArrayOfString) {
    Zb = paramArrayOfString;
  }
  
  public static String[] Zo() {
    return Zb;
  }
  
  static {
    if (Zo() == null)
      ZV(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztub.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */