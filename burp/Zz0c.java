package burp;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public interface Zz0c extends Ze9k {
  public static final Zk0_ ZN = new Zk0_();
  
  default Zzvm Zyi() {
    return Zzvm.DATES;
  }
  
  default Zeu4<? extends Ze9k> ZF() {
    return ZN;
  }
  
  default void ZD(Zsh8 paramZsh8, Zerg paramZerg, Zgb6 paramZgb6, int paramInt) throws Zs7w, Ztgu {
    Zs06.ZK(this);
  }
  
  default void Zy4() {
    Zs06.ZJ(this);
  }
  
  default DateTimeFormatter ZXs() {
    int i = ZXe();
    String str = ZXt();
    return Zka3.ZI(i, str);
  }
  
  default void ZS(int paramInt, String paramString) {
    ZwA(paramInt);
    Zqb(paramString);
  }
  
  String ZXt();
  
  void Zqb(String paramString);
  
  int ZXe();
  
  void ZwA(int paramInt);
  
  ZonedDateTime ZXn();
  
  void Zq(ZonedDateTime paramZonedDateTime);
  
  int ZXz();
  
  void Zwq(int paramInt);
  
  ZonedDateTime ZX6();
  
  void ZR(ZonedDateTime paramZonedDateTime);
  
  ChronoField ZXL();
  
  void ZE(ChronoField paramChronoField);
  
  ZonedDateTime ZXf();
  
  void ZD(ZonedDateTime paramZonedDateTime);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz0c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */