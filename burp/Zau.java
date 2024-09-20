package burp;

public class Zau extends Zni implements Zlmg {
  @Zzvo(0)
  private byte ZY;
  
  @Zzvo(1)
  private boolean Zh = true;
  
  @Zzvo(51)
  private String Zp;
  
  @Zzvo(52)
  private String Zv;
  
  @Zzvo(53)
  private boolean Zu;
  
  private static String[] Zd;
  
  public Zau() {
    String[] arrayOfString = Zfs();
    this.Zp = "";
    this.Zv = "";
    this.Zu = false;
    if (Zbqc.Zwu() == null)
      ZQ(new String[2]); 
  }
  
  public String ZDD() {
    return this.Zp;
  }
  
  public void ZAH(String paramString) {
    this.Zp = paramString;
  }
  
  public String ZDC() {
    return this.Zv;
  }
  
  public void ZAZ(String paramString) {
    this.Zv = paramString;
  }
  
  public boolean ZDo() {
    return this.Zu;
  }
  
  public void Zbi(boolean paramBoolean) {
    this.Zu = paramBoolean;
  }
  
  public boolean ZGq() {
    return this.Zh;
  }
  
  public void ZNm(boolean paramBoolean) {
    this.Zh = paramBoolean;
  }
  
  public Zeu4<Zlmg> ZF() {
    return Z_;
  }
  
  public static void ZQ(String[] paramArrayOfString) {
    Zd = paramArrayOfString;
  }
  
  public static String[] Zfs() {
    return Zd;
  }
  
  static {
    if (Zfs() != null)
      ZQ(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zau.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */