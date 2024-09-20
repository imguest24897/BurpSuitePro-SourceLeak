package burp;

public class Zzat {
  private final String ZL;
  
  private final Object Z_;
  
  private String Zj;
  
  private final boolean ZP;
  
  private final boolean ZO;
  
  public Zzat(Object paramObject, String paramString) {
    this(paramObject, paramString, false, false);
  }
  
  public Zzat(Object paramObject, String paramString, boolean paramBoolean) {
    this(paramObject, paramString, paramBoolean, false);
  }
  
  public Zzat(Object paramObject, String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    this.ZL = paramString;
    this.Z_ = paramObject;
    this.ZP = paramBoolean1;
    this.ZO = paramBoolean2;
  }
  
  public String Ze() {
    return this.Zj;
  }
  
  public String ZG() {
    return this.ZL;
  }
  
  public String ZT() {
    return (this.Z_ == null) ? null : this.Z_.toString();
  }
  
  public boolean Zu() {
    return this.ZP;
  }
  
  public boolean Zh() {
    return this.ZO;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    if (ZT() != null)
      stringBuilder.append(ZT()); 
    if (ZG() != null) {
      if (ZT() != null)
        stringBuilder.append(' '); 
      stringBuilder.append(ZG());
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzat.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */