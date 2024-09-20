package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zzx4 extends Zzx_ {
  Zzx4(Zkit paramZkit1, Zkit paramZkit2, Ze24 paramZe24, Zl2m paramZl2m, Zkqo paramZkqo) {
    super(paramZkit1, paramZkit2, paramZe24, paramZl2m, paramZkqo);
  }
  
  public void ZG(Throwable paramThrowable) {
    String[] arrayOfString = Ztgq.ZZ();
    try {
      if (Zepz.Zm(paramThrowable)) {
        try {
          Zah.Zl(paramThrowable, Zk_.COMMON_RUNTIME_FAILURE);
          if (arrayOfString == null) {
            Zah.Zl(paramThrowable, Zk_.IGNORED);
            this.Zu.Zr();
            return;
          } 
        } catch (Ztgq ztgq) {
          throw b(null);
        } 
        return;
      } 
    } catch (Ztgq ztgq) {
      throw b(null);
    } 
    Zah.Zl(paramThrowable, Zk_.IGNORED);
    this.Zu.Zr();
  }
  
  public <T extends Zgpi> boolean ZG(T paramT) {
    try {
      if (!Zo((Zgpi)paramT, paramT.ZF())) {
        this.Zu.Zb((Zgpi)paramT, Zx2v.Zq);
        this.Zu.Zr();
        return true;
      } 
    } catch (Ztgq ztgq) {
      throw b(null);
    } 
    return false;
  }
  
  Zxfv ZR(Ztew paramZtew) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> Zh : (Lburp/Zzx4;Lburp/Ztew;)Lburp/Zxfv;
    //   7: areturn
  }
  
  private boolean Zo(Zgpi paramZgpi, Zeu4 paramZeu4) {
    Zzvp zzvp = new Zzvp(this.ZG, paramZgpi, this.Zu);
    String[] arrayOfString = Ztgq.ZZ();
    Zm31[] arrayOfZm31 = paramZeu4.Zc();
    int i = arrayOfZm31.length;
    byte b = 0;
    while (b < i) {
      Zm31 zm31 = arrayOfZm31[b];
      try {
        zm31.ZK(zzvp);
        if (zzvp.Zx())
          return false; 
      } catch (Ztgq ztgq) {
        throw b(null);
      } 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    return true;
  }
  
  private Zs7v lambda$buildFieldCopierFactory$0(Ztew paramZtew, Zgpi paramZgpi1, Zgpi paramZgpi2) {
    return new Zk71(paramZtew, this, this.ZG, this.ZQ, paramZgpi1, paramZgpi2, this.Zh, this.Zu);
  }
  
  private static Ztgq b(Ztgq paramZtgq) {
    return paramZtgq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzx4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */