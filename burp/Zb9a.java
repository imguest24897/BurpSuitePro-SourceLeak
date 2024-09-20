package burp;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import javax.swing.SwingUtilities;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zb9a implements Zlba {
  private static final List<Zrdb> Zu = Collections.emptyList();
  
  private final Zr_4 ZP;
  
  private final Zz1i Zk;
  
  private final Zkq4 ZE;
  
  private final Ztwv Zm;
  
  private final Zbjl Zx;
  
  private final Zg09 ZK;
  
  private final Zz1m<Zt13> ZM;
  
  private final boolean ZJ;
  
  private final Zrgd ZC;
  
  private final Object ZF;
  
  private final AtomicBoolean ZI;
  
  private Consumer<Zbza> ZY;
  
  private Zz1m<Zt1o> Ze;
  
  private Zsy7 Zg;
  
  private Zgev ZZ;
  
  private static int ZT;
  
  Zb9a(Zz0n paramZz0n, Zz1i paramZz1i, Zkq4 paramZkq4, Ztwv paramZtwv, Zr_4 paramZr_4, Zbjl paramZbjl, Zg09 paramZg09, Ztos<Zt13> paramZtos, boolean paramBoolean) {
    this.Zk = paramZz1i;
    this.ZE = paramZkq4;
    this.Zm = paramZtwv;
    this.ZP = paramZr_4;
    this.Zx = paramZbjl;
    this.ZK = paramZg09;
    this.ZM = paramZtos;
    this.ZJ = paramBoolean;
    this.ZC = paramZz0n.ZP();
    this.ZF = paramZz1i.ZH0();
    this.ZI = new AtomicBoolean();
    paramZtos.ZE(Zt13.ZC, this::lambda$new$1);
    paramZtos.ZE(Zt13.ZV, this::lambda$new$3);
    int i = Zv();
    if (!paramZg09.isEmpty())
      paramZbjl.Zs(); 
    if (i == 0)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public void Zi(Zbza paramZbza) {
    // Byte code:
    //   0: invokestatic Zd : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zm : Lburp/Ztwv;
    //   8: invokeinterface Zu : ()Z
    //   13: ifeq -> 37
    //   16: aload_0
    //   17: getfield Zm : Lburp/Ztwv;
    //   20: aload_0
    //   21: aload_1
    //   22: <illegal opcode> run : (Lburp/Zb9a;Lburp/Zbza;)Ljava/lang/Runnable;
    //   27: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   32: pop
    //   33: iload_2
    //   34: ifeq -> 42
    //   37: aload_0
    //   38: aload_1
    //   39: invokevirtual Zv : (Lburp/Zbza;)V
    //   42: return
  }
  
  private void Zv(Zbza paramZbza) {
    if (!this.ZJ)
      Zm2.Zo(Zze0.SCANNER_SCAN_QUEUE_ITEM_ADDED); 
    this.Zx.Zs();
    Zuh.Zb((paramZbza.Zg6() == 0), Zqf.Zr);
    if (this.ZZ != null)
      this.ZZ.ZW(); 
    this.ZK.ZX(paramZbza);
    if (this.Zg != null)
      this.Zg.Ze(); 
    if (this.ZY != null)
      this.ZY.accept(paramZbza); 
    this.Ze.ZD(Zt1o.Zf);
    if (!this.ZI.get())
      Zh(); 
  }
  
  public void Zv(Zriy paramZriy) {
    Objects.requireNonNull(paramZriy);
    this.ZY = paramZriy::ZU;
    this.Ze = paramZriy.ZO();
  }
  
  public void ZA(List<Zbza> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zm : Lburp/Ztwv;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> run : (Lburp/Zb9a;Ljava/util/List;)Ljava/lang/Runnable;
    //   11: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   16: pop
    //   17: return
  }
  
  public void Zz(List<Zbza> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zm : Lburp/Ztwv;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> run : (Lburp/Zb9a;Ljava/util/List;)Ljava/lang/Runnable;
    //   11: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   16: pop
    //   17: return
  }
  
  public Zbza ZW(int paramInt) {
    int i = Zd();
    synchronized (this.ZF) {
      Zefg<Zbza> zefg = this.Zk.ZHU();
      if (paramInt < zefg.size()) {
        Zbza zbza = zefg.get(paramInt);
        if (zbza.Zgv() == paramInt)
          return zbza; 
      } 
      for (Zbza zbza : zefg) {
        if (zbza.Zgv() == paramInt)
          return zbza; 
        if (i != 0)
          break; 
      } 
      return null;
    } 
  }
  
  public boolean Zw(Zbza paramZbza) {
    Zuh.Zb(!SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    return (paramZbza.Zg6() != 4);
  }
  
  public boolean ZP(Zbza paramZbza, List<Zrdb> paramList, byte paramByte) {
    Zuh.Zb(!SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    switch (paramZbza.Zg6()) {
      case 1:
        synchronized (this.ZF) {
          if (paramByte == 2)
            paramZbza.Zp(this.ZC.ZX()); 
          paramZbza.ZN(paramByte);
        } 
      case 4:
      
    } 
    Zuh.Zv(false, Zqf.Zr, paramZbza.Zg6());
    return false;
  }
  
  public void Zx(Zbza paramZbza) {
    ZP(paramZbza, Zu, (byte)2);
  }
  
  public void ZD(Zbza paramZbza, List<Zrdb> paramList) {
    ZP(paramZbza, paramList, paramZbza.Zg6());
  }
  
  private void Zh() {
    this.ZM.ZD(Zt13.Z_);
    this.ZM.ZD(Zt13.Zf);
  }
  
  public void ZM(Zsy7 paramZsy7) {
    this.Zg = paramZsy7;
    if (!this.ZK.isEmpty())
      paramZsy7.Ze(); 
  }
  
  public void Zx(Zgev paramZgev) {
    this.ZZ = paramZgev;
  }
  
  private void lambda$auditAgain$6(List paramList) {
    int i = Zd();
    for (Zbza zbza1 : paramList) {
      Zbza zbza2;
      switch (zbza1.Zg6()) {
        case 1:
        case 2:
        case 4:
          zbza2 = zbza1.ZP(this.ZP, this.ZE.Zs6());
          Zi(zbza2);
          break;
      } 
      if (i != 0)
        break; 
    } 
  }
  
  private void lambda$cancel$5(List paramList) {
    int i = Zv();
    Zuh.Zb((this.Ze != null), Zqf.Zr);
    for (Zbza zbza : paramList) {
      switch (zbza.Zg6()) {
        case 1:
          zbza.Zp(this.ZC.ZX());
          zbza.ZJ(this.Ze);
        case 0:
          zbza.ZJ(this.Ze);
          break;
      } 
      if (this.Zg != null)
        this.Zg.Zh(zbza); 
      if (this.ZZ != null)
        this.ZZ.Zr(zbza); 
      continue;
      if (i == 0)
        break; 
    } 
  }
  
  private void lambda$addItem$4(Zbza paramZbza) {
    Zv(paramZbza);
  }
  
  private void lambda$new$3(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$new$2);
  }
  
  private void lambda$new$2(Ztak paramZtak) {
    this.ZI.set(false);
  }
  
  private void lambda$new$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$new$0);
  }
  
  private void lambda$new$0(Zst9 paramZst9) {
    this.ZI.set(true);
  }
  
  public static void ZF(int paramInt) {
    ZT = paramInt;
  }
  
  public static int Zd() {
    return ZT;
  }
  
  public static int Zv() {
    int i = Zd();
    return (i == 0) ? 28 : 0;
  }
  
  static {
    if (Zv() == 0)
      ZF(14); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb9a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */