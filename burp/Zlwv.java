package burp;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import javafx.collections.ObservableList;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.Zo;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zlwv implements Zr2 {
  private final Zr_4 Zs;
  
  private final Zl47 Zb;
  
  private final Ze2b Zu;
  
  private final ObservableList<Zeeg> Zm;
  
  private final Zzzt ZT;
  
  private final AtomicReference<Ztwn> ZM;
  
  private final Zlgo ZU;
  
  private final Zzn0 ZD;
  
  private final boolean ZO;
  
  public Zlwv(Zr_4 paramZr_4, Zl47 paramZl47, ObservableList<Zeeg> paramObservableList, Zxym paramZxym, Ze2b paramZe2b, Zzzt paramZzzt, boolean paramBoolean) {
    this.Zs = paramZr_4;
    this.Zb = paramZl47;
    this.Zu = paramZe2b;
    this.ZT = paramZzzt;
    this.ZO = paramBoolean;
    this.Zm = paramObservableList;
    this.ZM = new AtomicReference<>();
    this.ZU = new Zry(this);
    this.ZD = new Zzn0(this);
    paramZxym.Zv(new Zbs0(this));
    ZC(paramZxym);
  }
  
  public Ze3o ZC() {
    return this.Zb.ZwU();
  }
  
  public void Zp(Ze3o paramZe3o) {
    this.Zb.ZD(paramZe3o);
  }
  
  Zlit Zv() {
    return ZK().Zk();
  }
  
  int ZA() {
    return this.Zb.Zwy();
  }
  
  public void Zh(byte[] paramArrayOfbyte) {
    Zm2.Zo(this.ZO ? Zze0.REPEATER_UI_WEBSOCKET_MANUALLY_CONFIGURED_MESSAGE_SENT : Zze0.REPEATER_UI_WEBSOCKET_MESSAGE_SENT);
    Ze3o ze3o = this.Zb.ZwU();
    Zsg3 zsg3 = Zsg3.ZY(this.Zb.ZwP());
    Zl36 zl36 = this.Zu.Zl(ze3o, zsg3, this.Zb.ZwJ(), paramArrayOfbyte);
    Zd().Zr(zl36, ze3o, Zeew.REPEATER);
  }
  
  boolean ZM() {
    return Zd().ZA();
  }
  
  void ZH() {
    Zd().Zv();
  }
  
  public void ZI(Ztwn paramZtwn) {
    this.ZM.set(paramZtwn);
  }
  
  void Zb() {
    Zxym zxym = Zd();
    zxym.Zv(new Zxah(this));
    if (zxym.ZA() && zxym.Zy())
      zxym.Zv(); 
  }
  
  boolean Zd(Ze3o paramZe3o) {
    return Zd().Zb(paramZe3o);
  }
  
  private Zxym Zd() {
    return ZL() ? ZK().Zr() : Zxym.Ze;
  }
  
  private Zmo7 ZK() {
    return this.ZT.Zy(this.Zb.Zwy());
  }
  
  Ze3o[] Zu() {
    return (Ze3o[])Zd().Zn().toArray((Object[])new Ze3o[0]);
  }
  
  public void ZR(Zlit paramZlit, byte[] paramArrayOfbyte, Zxym paramZxym) {
    Zo(this.ZT.Zd(paramZlit, paramArrayOfbyte, paramZxym, Zeew.REPEATER), paramZxym);
  }
  
  public void ZM(int paramInt) {
    Zo(paramInt, this.ZT.Zy(paramInt).Zr());
  }
  
  private void Zo(int paramInt, Zxym paramZxym) {
    Zd().ZL(this.ZU);
    this.Zb.Zhk(paramInt);
    paramZxym.Zm(this.ZU);
    ZC(paramZxym);
    Ze3o ze3o = this.Zb.ZwU();
    if (!paramZxym.Zb(ze3o))
      this.Zb.ZD(ze3o.ZX()); 
    ((Ztwn)this.ZM.get()).ZX();
  }
  
  int Zp() {
    return this.Zb.ZGS();
  }
  
  void ZG(int paramInt) {
    this.Zb.ZXs(paramInt);
  }
  
  boolean ZL() {
    return (this.Zb.Zwy() != 0);
  }
  
  Zk75 ZW() {
    return new Zk75(ZK().Zk(), ZK().ZL());
  }
  
  void ZP(Zo paramZo, byte paramByte, Ze3o paramZe3o) {
    this.Zb.Zx(paramZo);
    this.Zb.ZE(paramByte);
    this.Zb.ZD(paramZe3o);
  }
  
  private static void ZC(Zxym paramZxym) {
    try {
      paramZxym.Zt();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zk(Zl36 paramZl36, Zrwo paramZrwo, Ze3o paramZe3o) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZE : ()Z
    //   4: ifeq -> 8
    //   7: return
    //   8: aload_0
    //   9: aload_1
    //   10: aload_3
    //   11: aload_2
    //   12: <illegal opcode> run : (Lburp/Zlwv;Lburp/Zl36;Lburp/Ze3o;Lburp/Zrwo;)Ljava/lang/Runnable;
    //   17: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   20: return
  }
  
  private void lambda$updateHistory$0(Zl36 paramZl36, Ze3o paramZe3o, Zrwo paramZrwo) {
    Ztwn ztwn = this.ZM.get();
    if (ztwn == null) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    int i = this.Zm.size();
    byte[] arrayOfByte = (paramZl36.ZH() == null) ? new byte[0] : paramZl36.ZH();
    Zstu zstu = this.Zs.ZZ(arrayOfByte);
    this.Zm.add(this.Zs.<Zeeg>ZH(new Zvoq(this.Zb.ZwS(), this.Zb.Zwy(), paramZe3o, this.Zb.ZwP(), this.Zb.ZwJ(), paramZrwo, zstu, System.currentTimeMillis())));
    ztwn.ZR(i, paramZe3o);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlwv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */