package net.portswigger;

@Zsi("Heartbeat")
public class Zzu {
  @Zvd(Zp = "burpStatus")
  public final Zrx3 Zb;
  
  @Zvd(Zp = "burpUri")
  public final String ZI;
  
  @Zox
  public Zzu(@Zc5(Ze = "burpStatus") Zrx3 paramZrx3, @Zc5(Ze = "burpUri") String paramString) {
    this.Zb = paramZrx3;
    this.ZI = paramString;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zzu zzu = (Zzu)paramObject;
    return (this.Zb != zzu.Zb) ? false : ((this.ZI != null) ? this.ZI.equals(zzu.ZI) : ((zzu.ZI == null)));
  }
  
  public int hashCode() {
    null = (this.Zb != null) ? this.Zb.hashCode() : 0;
    return 31 * null + ((this.ZI != null) ? this.ZI.hashCode() : 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zzu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */