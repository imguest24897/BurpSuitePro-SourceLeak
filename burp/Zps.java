package burp;

public class Zps extends Zni implements Zlg_ {
  @Zzvo(32)
  private final Zrde Zn;
  
  @Zzvo(35)
  private final String ZX;
  
  @Zzvo(33)
  private final String Z_;
  
  @Zzvo(34)
  private final String Zu;
  
  Zps(Zrde paramZrde, String paramString1, String paramString2, String paramString3) {
    this.Zn = paramZrde;
    this.ZX = paramString3;
    this.Z_ = paramString1;
    this.Zu = paramString2;
  }
  
  public Zeu4<? extends Zgkc> ZF() {
    return (Zeu4)Zd;
  }
  
  public String ZmO() {
    return null;
  }
  
  public String Zmz() {
    return null;
  }
  
  public Zrde ZmQ() {
    return this.Zn;
  }
  
  public Zefg<Zzi8> Zmq() {
    return new Zea0<>();
  }
  
  public String Zje() {
    return this.Z_;
  }
  
  public String ZjN() {
    return this.Zu;
  }
  
  public String Zj8() {
    return this.ZX;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof Zlg_))
      return false; 
    Zlg_ zlg_ = (Zlg_)paramObject;
    return (Zmz().equals(zlg_.Zmz()) && ZmO().equals(((Zlg_)paramObject).ZmO()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zps.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */