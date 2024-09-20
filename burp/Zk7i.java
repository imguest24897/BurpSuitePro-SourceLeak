package burp;

import java.util.function.Consumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zk7i extends Zk7s {
  private final Zgpi ZK;
  
  <T extends Zgpi> Zk7i(Ztew paramZtew, T paramT) {
    super(paramZtew);
    this.ZK = (Zgpi)paramT;
  }
  
  public boolean ZQ() {
    return false;
  }
  
  public boolean Zs(Zm31 paramZm31) {
    return true;
  }
  
  protected Consumer<Ztew> Zd(Zeki paramZeki) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> accept : (Lburp/Zk7i;Lburp/Zeki;)Ljava/util/function/Consumer;
    //   7: areturn
  }
  
  public void Zb(Zek9 paramZek9) {}
  
  public void Za(Zek2 paramZek2) {}
  
  public void ZZ(Zekq paramZekq) {}
  
  public void Zt(Zekh paramZekh) {}
  
  public void Zv(Zek7 paramZek7) {}
  
  public void ZZ(Zekv paramZekv) {}
  
  public void Zb(Zekm paramZekm) {}
  
  protected Consumer<Ztew> ZA(Zeke<? extends Zgpi> paramZeke) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> accept : (Lburp/Zk7i;Lburp/Zeke;)Ljava/util/function/Consumer;
    //   7: areturn
  }
  
  public void ZV(Zeka paramZeka) {}
  
  public void Zr(Zekd paramZekd) {}
  
  protected Consumer<Ztew> ZS(Zekb paramZekb) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> accept : (Lburp/Zk7i;Lburp/Zekb;)Ljava/util/function/Consumer;
    //   7: areturn
  }
  
  public void Zp(Zekg paramZekg) {}
  
  protected Consumer<Ztew> Zm(Zekk<? extends Zgpi> paramZekk) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> accept : (Lburp/Zk7i;Lburp/Zekk;)Ljava/util/function/Consumer;
    //   7: areturn
  }
  
  public void Zs(Zekc paramZekc) {}
  
  private void lambda$deferredVisitSingleArrayListField$3(Zekk paramZekk, Ztew paramZtew) {
    paramZtew.Zc((Zgpi)paramZekk.ZS(this.ZK));
  }
  
  private void lambda$deferredVisitPersistableObjectField$2(Zekb paramZekb, Ztew paramZtew) {
    Object object = paramZekb.ZS(this.ZK);
    if (!(object instanceof Zgpi))
      return; 
    paramZtew.Zc((Zgpi)object);
  }
  
  private void lambda$deferredVisitMultipleArrayListField$1(Zeke paramZeke, Ztew paramZtew) {
    paramZtew.Zc((Zgpi)paramZeke.ZS(this.ZK));
  }
  
  private void lambda$deferredVisitArrayField$0(Zeki<Object> paramZeki, Ztew paramZtew) {
    Object object = paramZeki.ZD(this.ZK);
    try {
      if (!(object instanceof Zgpi))
        return; 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Ze34 ze341 = (Ze34)paramZeki.Zr(this.ZK);
    Ze34 ze342 = paramZtew.<Ze34>Zc(ze341);
    if (!ze342.ZF(ze341))
      try {
        paramZeki.ZD(this.ZK, ze342);
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.IGNORED);
      }  
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk7i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */