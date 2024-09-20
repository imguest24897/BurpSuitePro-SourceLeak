package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zzx0 extends Zzx_ {
  Zzx0(Zkit paramZkit, Ze24 paramZe24, Zkqo paramZkqo) {
    super(null, paramZkit, paramZe24, Zl2m.ZO, paramZkqo);
  }
  
  public void ZG(Throwable paramThrowable) {
    String[] arrayOfString = Ztgq.ZZ();
    try {
      if (Zepz.Zm(paramThrowable))
        try {
          Zah.Zl(paramThrowable, Zk_.COMMON_RUNTIME_FAILURE);
          if (arrayOfString != null)
            return; 
          try {
            if (paramThrowable instanceof Zb_f)
              throw (Zb_f)paramThrowable; 
          } catch (Zb_f zb_f) {
            throw a(null);
          } 
        } catch (Zb_f zb_f) {
          throw a(null);
        }  
    } catch (Zb_f zb_f) {
      throw a(null);
    } 
    try {
      if (paramThrowable instanceof Zb_f)
        throw (Zb_f)paramThrowable; 
    } catch (Zb_f zb_f) {
      throw a(null);
    } 
  }
  
  Zxfv ZR(Ztew paramZtew) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> Zh : (Lburp/Zzx0;Lburp/Ztew;)Lburp/Zxfv;
    //   7: areturn
  }
  
  private Zs7v lambda$buildFieldCopierFactory$0(Ztew paramZtew, Zgpi paramZgpi1, Zgpi paramZgpi2) {
    try {
    
    } catch (Zb_f zb_f) {
      throw a(null);
    } 
    return (paramZgpi1 instanceof Zxsr) ? new Zk71(paramZtew, this, ((Zxsr)paramZgpi1).ZPz().Zl(), this.ZQ, paramZgpi1, paramZgpi2, Zl2m.ZO, this.Zu) : new Zk73(paramZtew, this, this.ZQ, paramZgpi1, paramZgpi2, this.Zu);
  }
  
  private static Zb_f a(Zb_f paramZb_f) {
    return paramZb_f;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzx0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */