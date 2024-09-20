package burp;

public class Zai extends Zni implements Zmhu {
  @Zzvo(0)
  private byte Zf;
  
  @Zzvo(1)
  private boolean Zc = true;
  
  @Zzvo(32)
  private String Zm = "";
  
  @Zzvo(33)
  private String ZT = "";
  
  @Zzvo(34)
  private boolean Zo = false;
  
  private Zrdu Zk;
  
  private static String Zl;
  
  public Zai() {
    String str = ZlA();
    this.Zk = Zrdu.URL_PARAM;
    if (Zbqc.Zwu() == null)
      Zyn("SspPAc"); 
  }
  
  public String ZJm() {
    return this.Zm;
  }
  
  public void ZI4(String paramString) {
    this.Zm = paramString;
  }
  
  public String ZJr() {
    return this.ZT;
  }
  
  public void ZIP(String paramString) {
    this.ZT = paramString;
  }
  
  public boolean ZJf() {
    return this.Zo;
  }
  
  public void ZHw(boolean paramBoolean) {
    this.Zo = paramBoolean;
  }
  
  public Zrdu ZJy() {
    return this.Zk;
  }
  
  @Zzvo(35)
  private int ZlO() {
    return this.Zk.Zi();
  }
  
  public void Zk(Zrdu paramZrdu) {
    this.Zk = paramZrdu;
  }
  
  public boolean ZGq() {
    return this.Zc;
  }
  
  public void ZNm(boolean paramBoolean) {
    this.Zc = paramBoolean;
  }
  
  public Zeu4<Zmhu> ZF() {
    return ZZ;
  }
  
  public static void Zyn(String paramString) {
    Zl = paramString;
  }
  
  public static String ZlA() {
    return Zl;
  }
  
  static {
    if (ZlA() != null)
      Zyn("xwGic"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zai.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */