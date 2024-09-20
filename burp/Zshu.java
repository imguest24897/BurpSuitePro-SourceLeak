package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.SwingUtilities;

public class Zshu implements Ztl_, Ztrn {
  private final Ztwv ZV;
  
  private final Zrow Zh;
  
  private final Zr9 Zu;
  
  private final List<Zsdt> Zd;
  
  private final Zsui Zj;
  
  private final AtomicBoolean ZK = new AtomicBoolean(false);
  
  private final AtomicBoolean ZX = new AtomicBoolean(false);
  
  private Zglo ZP;
  
  private Zrv_ ZS;
  
  public Zshu(Ztwv paramZtwv, Zrow paramZrow, Zr9 paramZr9, Zsui paramZsui) {
    this.ZV = paramZtwv;
    this.Zh = paramZrow;
    this.Zu = paramZr9;
    this.Zj = paramZsui;
    int[] arrayOfInt = Zzml.ZkX();
    this.Zd = new LinkedList<>();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public void Zc() {
    this.ZK.set(true);
    Zr();
  }
  
  public void ZN(Zglo paramZglo) {
    if (!this.ZX.get() && this.Zj.Za(paramZglo)) {
      this.ZX.set(true);
      this.ZP = paramZglo;
      Zr();
    } 
  }
  
  private void Zr() {
    if (this.ZK.get() && this.ZX.get())
      Zp(); 
  }
  
  private void ZA() {
    this.Zu.Zy(List.copyOf(this.Zd));
    this.Zd.clear();
  }
  
  private void Zp() {
    Zzml zzml = this.ZP.ZD().orElseThrow();
    this.ZS = this.Zh.Zp(zzml, this);
    int[] arrayOfInt = Zzml.ZkX();
    if (this.ZP.Zp()) {
      this.ZV.Zx(this::lambda$showDialog$1);
      if (arrayOfInt == null) {
        SwingUtilities.invokeLater(this::lambda$showDialog$0);
        return;
      } 
      return;
    } 
    SwingUtilities.invokeLater(this::lambda$showDialog$0);
  }
  
  public void Zk(Zzml paramZzml, String paramString) {
    int[] arrayOfInt = Zzml.ZkX();
    if (Zsw8.ZS(paramString))
      this.Zd.add(Zsdt.Zk(paramZzml, paramString)); 
    Optional<Zzml> optional = this.ZP.ZD();
    if (optional.isPresent()) {
      this.ZS.ZP(optional.get());
      if (arrayOfInt == null) {
        this.ZS.ZF();
        ZA();
        return;
      } 
      return;
    } 
    this.ZS.ZF();
    ZA();
  }
  
  public void Zu() {
    this.ZS.ZF();
    if (!this.Zd.isEmpty())
      ZA(); 
  }
  
  public void ZP(Zzml paramZzml) {
    this.Zd.add(Zsdt.ZJ(paramZzml));
    this.ZS.ZF();
    ZA();
  }
  
  private static boolean lambda$setDebugQuestion$3(Zzml paramZzml) {
    return (paramZzml.ZkR().length() == 300);
  }
  
  private void lambda$showDialog$1() {
    Zsk5.ZJ(this.ZP.ZK() * 1000L);
    SwingUtilities.invokeLater(this::lambda$showDialog$0);
  }
  
  private void lambda$showDialog$0() {
    this.ZS.setVisible(true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zshu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */