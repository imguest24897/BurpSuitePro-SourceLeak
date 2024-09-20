package burp;

public class Ze74<T, U> {
  private final String Zo;
  
  private final T Ze;
  
  private final Zz48<T, String> Zl;
  
  private final Zz48<String, U> ZS;
  
  private final Zsss Zd;
  
  public Ze74(String paramString, T paramT, Zz48<T, String> paramZz48, Zz48<String, U> paramZz481) {
    this(paramString, paramT, paramZz48, paramZz481, Zsss.POST);
  }
  
  public Ze74(String paramString, T paramT, Zz48<T, String> paramZz48, Zz48<String, U> paramZz481, Zsss paramZsss) {
    this.Zo = paramString;
    this.Ze = paramT;
    this.Zl = paramZz48;
    this.ZS = paramZz481;
    this.Zd = paramZsss;
  }
  
  public String Zg() {
    return this.Zo;
  }
  
  public String ZG() {
    return this.Zl.Ze(this.Ze);
  }
  
  public Zz48<String, U> Zu() {
    return this.ZS;
  }
  
  public Zsss ZO() {
    return this.Zd;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze74.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */