package burp;

import java.awt.Component;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zemq implements Zgvn {
  private final Zl9 ZG;
  
  private final Zl1y Zu;
  
  private final Zln3 ZA;
  
  private Zkrl Ze;
  
  private Zzjc Zx;
  
  private Runnable Zf;
  
  private Zedy Za;
  
  public Zemq(Zkrl paramZkrl, Zl9 paramZl9, Zzjc paramZzjc, Zedy paramZedy, Zl1y paramZl1y, Runnable paramRunnable, Zln3 paramZln3) {
    this.Ze = paramZkrl;
    this.ZG = paramZl9;
    this.Zx = paramZzjc;
    this.Zu = paramZl1y;
    this.Zf = paramRunnable;
    this.Za = paramZedy;
    this.ZA = paramZln3;
  }
  
  protected Zemq() {
    this.ZG = null;
    this.Zu = null;
    this.ZA = null;
  }
  
  public void Zr() {
    this.ZG.Zl();
  }
  
  public void Zs(Zrdb paramZrdb) {
    this.ZG.ZT(paramZrdb);
  }
  
  public List<Zesk> ZY() {
    return this.ZG.ZS();
  }
  
  public List<Component> Z_(List<Zesk> paramList, Zezw paramZezw) {
    ArrayList<Component> arrayList = new ArrayList();
    Iterator<Zesk> iterator = paramList.iterator();
    boolean bool = Zkrl.Zml();
    while (iterator.hasNext()) {
      Zesk zesk = iterator.next();
      zesk.Zv(arrayList, paramZezw);
      if (!bool)
        break; 
    } 
    return arrayList;
  }
  
  public void ZI(Ztj3 paramZtj3) {
    this.ZG.ZM(paramZtj3);
  }
  
  public void ZC(Ztj3 paramZtj3) {
    this.ZG.Zs(paramZtj3);
  }
  
  public List<Zg_8> Zo() {
    return this.ZG.Za();
  }
  
  public Zgq<Zrdb> ZI(Zz1i paramZz1i, Ze3n paramZe3n, Zmfj paramZmfj) {
    return this.ZG.Zm(paramZz1i, paramZe3n, paramZmfj);
  }
  
  public Zgq<Zrdb> Zz(Zz1i paramZz1i, Ze3n paramZe3n, Zmfj paramZmfj, Zxs7 paramZxs7, Ztpx paramZtpx, int paramInt) {
    return this.ZG.Zf(paramZe3n, paramZz1i, paramZmfj, paramZxs7, paramZtpx, paramInt);
  }
  
  public Zlzj Zi(String paramString, int paramInt) {
    return this.ZG.Zx(paramString, paramInt);
  }
  
  public int ZT() {
    return this.ZG.ZN();
  }
  
  public List<String> Zu() {
    return this.ZG.Zy();
  }
  
  public Zg0h ZO(String paramString) {
    return this.ZG.ZU(paramString);
  }
  
  public List<String> Ze() {
    return this.ZG.Zc();
  }
  
  public Zrun ZT(String paramString) {
    return this.ZG.Zw(paramString);
  }
  
  public List<String> ZL() {
    return this.ZG.Zz();
  }
  
  public Zkaj ZL(String paramString) {
    return this.ZG.ZO(paramString);
  }
  
  public List<Zryx> Zd() {
    return this.Zu.Zn();
  }
  
  public Zryx ZD(String paramString, boolean paramBoolean) {
    return this.ZA.ZZ(paramString, paramBoolean);
  }
  
  public boolean ZR() {
    return this.Ze.ZQ();
  }
  
  public void ZB(Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2, Zzvh paramZzvh) {
    if (paramZmzk == null)
      return; 
    Ztei.Zj(paramZzvh, Zeew.EXTENDER);
    Zsgq zsgq = this.Za.Zp(paramZmzk, paramZstu1, paramZstu2);
    this.Zx.Zb(zsgq);
    this.Zf.run();
  }
  
  public void Za(Zmzk paramZmzk, Zbr paramZbr, Zstu paramZstu, Zzvh paramZzvh) {
    if (paramZmzk == null)
      return; 
    Ztei.Zj(paramZzvh, Zeew.EXTENDER);
    Zsgq zsgq = this.Za.Zx(paramZmzk, paramZbr, paramZstu);
    this.Zx.Zb(zsgq);
    this.Zf.run();
  }
  
  public int Zh(Zxj1 paramZxj1, int paramInt, String paramString, InetAddress paramInetAddress) {
    return this.ZG.Zc(paramZxj1, paramInt, paramString, paramInetAddress);
  }
  
  public int ZN(Zxj1 paramZxj1, int paramInt, String paramString, InetAddress paramInetAddress) {
    return this.ZG.ZV(paramZxj1, paramInt, paramString, paramInetAddress);
  }
  
  public int Zd(Zxj1 paramZxj1, int paramInt, String paramString, InetAddress paramInetAddress) {
    return this.ZG.ZT(paramZxj1, paramInt, paramString, paramInetAddress);
  }
  
  public int Za(Zxj1 paramZxj1, int paramInt, String paramString, InetAddress paramInetAddress) {
    return this.ZG.ZM(paramZxj1, paramInt, paramString, paramInetAddress);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zemq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */