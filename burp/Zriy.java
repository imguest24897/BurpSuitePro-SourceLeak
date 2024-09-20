package burp;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zgl;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zriy implements Zegh {
  private final Zb9a ZT;
  
  private final Zkq4 Zb;
  
  private final Zr5h ZM;
  
  private final Zk7r<Zmgg, Zz86> Zx;
  
  private final Zk7r<Zsih, Zt0r> Zs;
  
  private final Zgev Zl;
  
  private final Zxsk ZK;
  
  private final Zmz6 Zw;
  
  private final Ztos<Zt1o> ZL;
  
  private final Zzle Zk;
  
  private final Zsus Zm;
  
  private final AtomicBoolean ZN;
  
  private Zbqf Za;
  
  private Zbuz ZO;
  
  private static int Zv;
  
  public Zriy(Zb9a paramZb9a, Zkq4 paramZkq4, Zr5h paramZr5h, Zk7r<Zmgg, Zz86> paramZk7r, Zk7r<Zsih, Zt0r> paramZk7r1, Zgev paramZgev, Zxsk paramZxsk, Zmz6 paramZmz6, Ztos<Zt1o> paramZtos, Zzle paramZzle, Zsus paramZsus, Zlli<Zt13> paramZlli) {
    this.ZT = paramZb9a;
    this.Zb = paramZkq4;
    this.ZM = paramZr5h;
    this.Zx = paramZk7r;
    this.Zs = paramZk7r1;
    this.Zl = paramZgev;
    this.ZK = paramZxsk;
    this.Zw = paramZmz6;
    this.ZL = paramZtos;
    this.Zk = paramZzle;
    this.Zm = paramZsus;
    this.ZN = new AtomicBoolean(false);
    paramZb9a.Zv(this);
    Zts2.Zr().Zz(paramZlli, Zt13.Zl, this::lambda$new$0);
  }
  
  public boolean ZB() {
    return this.ZO.Ze() ? false : this.Zl.Zc();
  }
  
  public Zzc4 Zs() {
    if (this.ZO.Ze())
      return null; 
    Zbza zbza = this.Zl.ZT();
    if (zbza == null)
      return null; 
    ZF();
    return this.Zx.Zb(zbza, this.Zk.ZP(zbza, this.Za), this.Za, this.ZK.ZF(zbza));
  }
  
  private void ZF() {
    if (this.ZN.compareAndSet(false, true))
      this.ZL.ZD(Zt1o.Zb); 
  }
  
  public Zxa2 Zt() {
    if (this.ZO.Ze())
      return null; 
    Zbza zbza = this.Zl.ZB();
    if (zbza == null)
      return null; 
    ZF();
    return this.Zs.Zb(zbza, this.Zk.ZP(zbza, this.Za), this.Za, this.ZK.ZF(zbza));
  }
  
  public void ZU(Zbza paramZbza) {
    List<Zt0r> list = this.Zs.ZL();
    List<Zz86> list1 = this.Zx.ZL();
    synchronized (paramZbza.Zz6()) {
      ZX((Collection)Zl5x.ZI, (Collection)list, paramZbza);
      ZX((Collection)Zl5x.ZX, (Collection)list1, paramZbza);
    } 
    if (list.isEmpty() && list1.isEmpty())
      this.ZL.ZD(Zt1o.Zg); 
  }
  
  private void ZX(Collection<? extends Zl5x> paramCollection1, Collection<? extends Zl5x> paramCollection2, Zbza paramZbza) {
    int i = Zy();
    for (Zl5x zl5x : paramCollection1) {
      if (!paramCollection2.contains(zl5x))
        zl5x.Zd(paramZbza, this.ZL); 
      if (i != 0)
        break; 
    } 
  }
  
  public boolean Zn() {
    return (Zk() && this.Zl.Zx() && this.Zl.Zv());
  }
  
  public boolean Zk() {
    return !this.ZM.Zdm().ZHU().isEmpty();
  }
  
  public Zbuz ZH(Zra1 paramZra1, Zskh paramZskh, int paramInt) {
    this.ZO = (new Zruw(paramZra1, paramZskh)).Zx(this::lambda$createTerminalEventConsumer$1).Zv(this::lambda$createTerminalEventConsumer$2).ZJ(this::lambda$createTerminalEventConsumer$3).ZR();
    this.Za = new Zbqf(this.ZO, this.ZM.Zdm(), this.Zb);
    return this.ZO;
  }
  
  public void Zy(Zll9 paramZll9) {
    Zy(paramZll9, null);
  }
  
  public void Zy(Zll9 paramZll9, List<int[]> paramList) {
    if (this.Zm == null) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    this.ZT.Zi(this.Zm.ZL(this.Zb, paramZll9, paramList));
  }
  
  public void ZW() {
    Zl();
    if (Zn())
      this.ZL.ZD(Zt1o.Zg); 
  }
  
  private void Zl() {
    Zefk zefk = this.ZM.Zdm().ZHD();
    int i = zefk.ZQ_();
    int j = zefk.ZQZ();
    int k = zefk.ZQX();
    int m = zefk.ZQ2();
    this.ZL.ZD(Zt1o.Za(i, j, k, m));
    this.Zw.Zs(i, j, k, m);
  }
  
  public Ztos<Zt1o> ZO() {
    return this.ZL;
  }
  
  public Zt5o Zj() {
    return this.Zl.Zd();
  }
  
  public Zt5o ZG() {
    return this.Zl.ZM();
  }
  
  private void Zp() {
    if (this.ZN.get())
      this.Zl.Zd().ZQ().ifPresent(this::lambda$sendAuditReachedMaxTimeTelemetry$4); 
  }
  
  private void lambda$sendAuditReachedMaxTimeTelemetry$4(Zsb3 paramZsb3) {
    Zm2.Ze(new Zgl(this.ZM.ZPy()), Zv8r.AUDIT_INDEX_OF_FIRST_UNINITIALISED_ITEM_AFTER_MAX_TIME, paramZsb3.ZMe());
    Zm2.Ze(new Zgl(this.ZM.ZPy()), Zv8r.AUDIT_PHASE_OF_FIRST_UNINITIALISED_ITEM_AFTER_MAX_TIME, paramZsb3.ZMi().Zn());
  }
  
  private void lambda$createTerminalEventConsumer$3(Zb6l paramZb6l) {
    this.ZL.ZD(new Zxr8(Zt1o.Zx));
  }
  
  private void lambda$createTerminalEventConsumer$2(Zb6l paramZb6l) {
    this.ZL.ZD(new Zxr8(Zt1o.ZH, paramZb6l));
  }
  
  private void lambda$createTerminalEventConsumer$1(String paramString) {
    this.ZL.ZD(new Zxr8(Zt1o.Zu, Zlj9.ZP(paramString)));
  }
  
  private void lambda$new$0(Zxr8 paramZxr8) {
    Zp();
  }
  
  public static void ZU(int paramInt) {
    Zv = paramInt;
  }
  
  public static int Zq() {
    return Zv;
  }
  
  public static int Zy() {
    int i = Zq();
    return (i == 0) ? 45 : 0;
  }
  
  static {
    if (Zy() != 0)
      ZU(26); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zriy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */