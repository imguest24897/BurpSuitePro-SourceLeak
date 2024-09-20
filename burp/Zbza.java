package burp;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public interface Zbza extends Zt53<Zbza>, Zek3, Zgzj<Zbza> {
  public static final Zeu4<Zbza> Zp = new Zks_();
  
  Ze3n Zv(Zbnt paramZbnt, Zlg4 paramZlg4, Zxdk paramZxdk, Zlox paramZlox, Zz1m<Zt1o> paramZz1m);
  
  Zbza ZP(Zr_4 paramZr_4, boolean paramBoolean);
  
  String Zgu();
  
  boolean ZgL();
  
  long Zgd();
  
  void ZF(long paramLong);
  
  void ZR(Zstu paramZstu, long paramLong);
  
  byte[] ZgC();
  
  byte[] ZgV();
  
  Zstu Zgy();
  
  Zstu Zgz();
  
  Zz1p ZU(Zbnt paramZbnt);
  
  Zmzk Zg0();
  
  String ZgY();
  
  int Zgv();
  
  void ZgZ(int paramInt);
  
  byte Zg6();
  
  void ZN(byte paramByte);
  
  int ZgR();
  
  void ZgM();
  
  int Zgx();
  
  void Zgq();
  
  default short ZgP() {
    return (short)ZgT().Zl3();
  }
  
  default int Zgi() {
    Objects.requireNonNull(Zecx.COMPLETED_AUDIT_STATUSES);
    return (int)ZgT().ZlZ().stream().map(Zga::ZrZ).filter(Zecx.COMPLETED_AUDIT_STATUSES::contains).count();
  }
  
  void Zg9(int paramInt);
  
  Zrdb ZgI();
  
  void ZU(Zrdb paramZrdb);
  
  void Ze(List<Zrdb> paramList);
  
  List<Zrdb> Zgr();
  
  int ZgS();
  
  int Zg9();
  
  int ZgH();
  
  int ZgJ();
  
  long Zgw();
  
  void Zl(long paramLong);
  
  long ZgK();
  
  void Zt(long paramLong);
  
  long Zg5();
  
  void Zp(long paramLong);
  
  Zefg<Zrrc> Zgf();
  
  Zmfj ZgW();
  
  Zlby ZW(Zl5x paramZl5x);
  
  void Zu(Zl5x paramZl5x, Zlby paramZlby);
  
  boolean ZO(Zl5x paramZl5x);
  
  void ZR(Zl5x paramZl5x);
  
  void Zy(Zl5x paramZl5x);
  
  Collection<Zb09> ZgA();
  
  void Zq(Zb09 paramZb09);
  
  boolean Zge();
  
  Zzg0 Zg3();
  
  List<Zrdb> Zgc();
  
  void Zi(Zrdb paramZrdb);
  
  void Zo(Zro0 paramZro0, boolean paramBoolean);
  
  void Zq(Zro0 paramZro0, boolean paramBoolean);
  
  boolean ZM(Zro0 paramZro0);
  
  boolean Zm(Zro0 paramZro0);
  
  Zkv9 Zgh();
  
  boolean ZgD();
  
  int Zgo();
  
  void Zi(int paramInt, Zro0 paramZro0);
  
  void ZgX();
  
  boolean Zgt();
  
  void Zg2();
  
  boolean Zga();
  
  Zzwo<Zro0, Zga> ZgT();
  
  default boolean Zg1() {
    switch (Zg6()) {
      case 2:
      case 4:
      
    } 
    return false;
  }
  
  default boolean Zd(Zmjx<Zbza> paramZmjx, String paramString) {
    return paramZmjx.Z_(this, paramString);
  }
  
  default void ZJ(Zz1m<Zt1o> paramZz1m) {
    ZN((byte)4);
    ZL(paramZz1m);
  }
  
  default void ZL(Zz1m<Zt1o> paramZz1m) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface ZgT : ()Lburp/Zzwo;
    //   6: astore_2
    //   7: aload_2
    //   8: invokeinterface ZlW : ()Ljava/util/Set;
    //   13: aload_2
    //   14: aload_1
    //   15: <illegal opcode> accept : (Lburp/Zzwo;Lburp/Zz1m;)Ljava/util/function/Consumer;
    //   20: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   25: return
  }
  
  private static void lambda$markInsertionPointsAsCancelled$0(Zzwo paramZzwo, Zz1m<Zt1o> paramZz1m, Zro0 paramZro0) {
    Zga zga = (Zga)paramZzwo.Zd(paramZro0);
    if (zga != null && Zecx.NON_TERMINAL_STATUSES.contains(zga.ZrZ()))
      zga.Zd(Zecx.CANCELLED, paramZz1m); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbza.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */