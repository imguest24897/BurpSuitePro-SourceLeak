package burp;

public class Zxy0 implements Zr9e {
  private Zska Ze;
  
  private Zska ZT;
  
  public void Zh(Zska paramZska) {
    if (this.ZT != null && !this.ZT.ZE())
      this.Ze = this.ZT; 
    this.ZT = paramZska;
  }
  
  public boolean ZQ(Zska paramZska, Ze7g paramZe7g) {
    return paramZska.Zm(23, '{');
  }
  
  public boolean Za(Zska paramZska, Ze7g paramZe7g) {
    return paramZska.Zm(23, '}');
  }
  
  public boolean Zu(Zska paramZska, Ze7g paramZe7g) {
    return paramZska.Zm(21, ';') ? true : (paramZska.Zm(21, ',') ? ((this.Ze != null && this.Ze.Zp('}'))) : (paramZska.Zm(23, '}') ? ((Boolean)paramZe7g.Zs(paramZska).<Boolean>map(Zxy0::lambda$isLineBreakAfterToken$0).orElse(Boolean.valueOf(false))).booleanValue() : false));
  }
  
  public boolean ZO(Zska paramZska, Ze7g paramZe7g) {
    return (paramZe7g.Zs() == paramZska && paramZska.ZE());
  }
  
  private static Boolean lambda$isLineBreakAfterToken$0(Zska paramZska) {
    return Boolean.valueOf((!paramZska.Zm(21, ';') && !paramZska.Zm(21, ',')));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxy0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */