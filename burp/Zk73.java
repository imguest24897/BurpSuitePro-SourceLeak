package burp;

import java.util.function.Consumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zk73 extends Zk7s {
  private final Zlof ZO;
  
  private final Zkit Zi;
  
  private final Zgpi ZQ;
  
  private final Zgpi ZK;
  
  private final Ze24 ZX;
  
  Zk73(Ztew paramZtew, Zlof paramZlof, Zkit paramZkit, Zgpi paramZgpi1, Zgpi paramZgpi2, Ze24 paramZe24) {
    super(paramZtew);
    this.ZO = paramZlof;
    this.Zi = paramZkit;
    this.ZQ = paramZgpi1;
    this.ZK = paramZgpi2;
    this.ZX = paramZe24;
  }
  
  public boolean ZQ() {
    return this.ZX.Zg();
  }
  
  public boolean Zs(Zm31 paramZm31) {
    return this.ZX.ZA(paramZm31);
  }
  
  protected Consumer<Ztew> Zd(Zeki paramZeki) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> accept : (Lburp/Zk73;Lburp/Zeki;)Ljava/util/function/Consumer;
    //   7: areturn
  }
  
  public void Zb(Zek9 paramZek9) {
    Boolean bool = (Boolean)paramZek9.ZS(this.ZQ);
    try {
      this.Zi.ZH(this.ZK, paramZek9, bool.booleanValue());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
    } 
  }
  
  public void Za(Zek2 paramZek2) {
    Byte byte_ = (Byte)paramZek2.ZS(this.ZQ);
    try {
      this.Zi.Zc(this.ZK, paramZek2, byte_.byteValue());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
    } 
  }
  
  public void ZZ(Zekq paramZekq) {
    Character character = (Character)paramZekq.ZS(this.ZQ);
    try {
      this.Zi.Zi(this.ZK, paramZekq, character.charValue());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
    } 
  }
  
  public void Zt(Zekh paramZekh) {
    Double double_ = (Double)paramZekh.ZS(this.ZQ);
    try {
      this.Zi.Zn(this.ZK, paramZekh, double_.doubleValue());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
    } 
  }
  
  public void Zv(Zek7 paramZek7) {
    Float float_ = (Float)paramZek7.ZS(this.ZQ);
    try {
      this.Zi.Zj(this.ZK, paramZek7, float_.floatValue());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
    } 
  }
  
  public void ZZ(Zekv paramZekv) {
    Integer integer = (Integer)paramZekv.ZS(this.ZQ);
    try {
      this.Zi.ZM(this.ZK, paramZekv, integer.intValue());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
    } 
  }
  
  public void Zb(Zekm paramZekm) {
    Long long_ = (Long)paramZekm.ZS(this.ZQ);
    try {
      this.Zi.ZV(this.ZK, paramZekm, long_.longValue());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
    } 
  }
  
  protected Consumer<Ztew> ZA(Zeke<? extends Zgpi> paramZeke) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> accept : (Lburp/Zk73;Lburp/Zeke;)Ljava/util/function/Consumer;
    //   7: areturn
  }
  
  public void ZV(Zeka paramZeka) {
    String str = (String)paramZeka.ZS(this.ZQ);
    try {
      this.Zi.Zn(this.ZK, paramZeka, str);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
    } 
  }
  
  public void Zr(Zekd paramZekd) {
    String str = (String)paramZekd.ZS(this.ZQ);
    try {
      this.Zi.ZR(this.ZK, paramZekd, str);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
    } 
  }
  
  protected Consumer<Ztew> ZS(Zekb paramZekb) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> accept : (Lburp/Zk73;Lburp/Zekb;)Ljava/util/function/Consumer;
    //   7: areturn
  }
  
  public void Zp(Zekg paramZekg) {
    Short short_ = (Short)paramZekg.ZS(this.ZQ);
    try {
      this.Zi.ZE(this.ZK, paramZekg, short_.shortValue());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
    } 
  }
  
  protected Consumer<Ztew> Zm(Zekk<? extends Zgpi> paramZekk) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> accept : (Lburp/Zk73;Lburp/Zekk;)Ljava/util/function/Consumer;
    //   7: areturn
  }
  
  public void Zs(Zekc paramZekc) {
    String str = (String)paramZekc.ZS(this.ZQ);
    try {
      this.Zi.Zi(this.ZK, paramZekc, str);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
    } 
  }
  
  public void Zb(Zekv paramZekv, int paramInt) {
    try {
      this.Zi.ZM(this.ZK, paramZekv, paramInt);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
    } 
  }
  
  private void lambda$deferredVisitSingleArrayListField$3(Zekk<Zefg> paramZekk, Ztew paramZtew) {
    Zefg zefg1 = (Zefg)paramZekk.ZS(this.ZQ);
    Zefg zefg2 = paramZtew.<Zefg>Zc(zefg1);
    try {
      this.Zi.Zq(this.ZK, (Zekb<Zefg>)paramZekk, zefg2);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
    } 
  }
  
  private void lambda$deferredVisitPersistableObjectField$2(Zekb<Zgpi> paramZekb, Ztew paramZtew) {
    Zgpi zgpi1 = (Zgpi)paramZekb.ZS(this.ZQ);
    Zgpi zgpi2 = (Zgpi)paramZtew.Zc(zgpi1);
    try {
      this.Zi.Zq(this.ZK, paramZekb, zgpi2);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
    } 
  }
  
  private void lambda$deferredVisitMultipleArrayListField$1(Zeke<Zefg> paramZeke, Ztew paramZtew) {
    Zefg zefg1 = (Zefg)paramZeke.ZS(this.ZQ);
    Zefg zefg2 = paramZtew.<Zefg>Zc(zefg1);
    try {
      this.Zi.Zq(this.ZK, (Zekb<Zefg>)paramZeke, zefg2);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
    } 
  }
  
  private void lambda$deferredVisitArrayField$0(Zeki<Object> paramZeki, Ztew paramZtew) {
    Ze34 ze34 = (Ze34)paramZeki.Zr(this.ZQ);
    Ze34<Object> ze341 = paramZtew.<Ze34>Zc(ze34);
    try {
      this.Zi.ZQ(this.ZK, paramZeki, ze341);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZO.ZK(throwable);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk73.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */