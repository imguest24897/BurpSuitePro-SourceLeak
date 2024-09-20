package net.portswigger;

@Zsi(value = "EventLog", ZD = true)
public class Ztx {
  @Zvd(Zp = "eventLogType")
  public final Zuf Zc;
  
  @Zvd(Zp = "eventClassification")
  public final Zie Zg;
  
  @Zvd(Zp = "messageId")
  public final Integer ZR;
  
  @Zvd(Zp = "message")
  public final String ZP;
  
  @Zvd(Zp = "messageDetail")
  public final String ZV;
  
  @Zvd(Zp = "timestamp")
  public final String Z_;
  
  @Zvd(Zp = "duplicateCount")
  public final int Zu;
  
  @Zox
  public Ztx(@Zc5(Ze = "eventLogType") Zuf paramZuf, @Zc5(Ze = "eventClassification", ZS = "\"UNSPECIFIED\"") Zie paramZie, @Zc5(Ze = "messageId", ZS = "null") Integer paramInteger, @Zc5(Ze = "message") String paramString1, @Zc5(Ze = "messageDetail", ZS = "null") String paramString2, @Zc5(Ze = "timestamp") String paramString3, @Zc5(Ze = "duplicateCount") int paramInt) {
    this.Zc = paramZuf;
    this.Zg = paramZie;
    this.ZR = paramInteger;
    this.ZP = paramString1;
    this.ZV = paramString2;
    this.Z_ = paramString3;
    this.Zu = paramInt;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Ztx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */