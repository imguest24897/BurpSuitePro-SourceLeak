package burp;

import java.util.List;

public class Zgv9 {
  private int Ze;
  
  private List<String> Zo;
  
  private List<Integer> ZJ;
  
  private int ZV;
  
  private short Zt;
  
  private String ZN;
  
  private List<Ztu8> Zu;
  
  private List<Zx8_> ZO;
  
  private List<Ztbr> Zr;
  
  private Zzjh ZX;
  
  private Zk8m ZM;
  
  private String ZL;
  
  private Zgv9() {}
  
  private Zgv9(Zs68 paramZs68) {
    this.Ze = paramZs68.Zs;
    this.Zo = paramZs68.ZP;
    this.ZJ = paramZs68.ZR;
    this.ZV = paramZs68.Zk;
    this.Zt = paramZs68.Zb;
    this.ZN = paramZs68.ZT;
    this.Zu = paramZs68.Zd;
    this.ZO = paramZs68.ZQ;
    this.Zr = paramZs68.ZN;
    this.ZX = paramZs68.ZM;
    this.ZM = paramZs68.ZH;
    this.ZL = paramZs68.Zf;
  }
  
  public Zgv9 Zw(int paramInt) {
    this.Ze = paramInt;
    return this;
  }
  
  public Zgv9 Zz(List<Integer> paramList) {
    this.ZJ = paramList;
    return this;
  }
  
  public Zgv9 Zl(List<String> paramList) {
    this.Zo = paramList;
    return this;
  }
  
  public Zgv9 Zp(List<Ztu8> paramList) {
    this.Zu = paramList;
    return this;
  }
  
  public Zgv9 ZL(int paramInt) {
    this.ZV = paramInt;
    return this;
  }
  
  public Zgv9 ZA(int paramInt) {
    return Zf((short)paramInt);
  }
  
  public Zgv9 Zf(short paramShort) {
    this.Zt = paramShort;
    return this;
  }
  
  public Zgv9 ZG(String paramString) {
    this.ZN = paramString;
    return this;
  }
  
  public Zgv9 Za(List<Ztbr> paramList) {
    this.Zr = paramList;
    return this;
  }
  
  public Zgv9 ZG(Zk8m paramZk8m) {
    this.ZM = paramZk8m;
    return this;
  }
  
  public Zgv9 ZP(List<Zx8_> paramList) {
    this.ZO = paramList;
    return this;
  }
  
  public Zgv9 Zx(Zzjh paramZzjh) {
    this.ZX = paramZzjh;
    return this;
  }
  
  public Zgv9 Zp(String paramString) {
    this.ZL = paramString;
    return this;
  }
  
  public Zs68 Zl() {
    return new Zs68(this.Ze, this.ZJ, this.Zo, this.ZV, this.Zt, this.ZN, this.ZM, this.Zu, this.ZO, this.Zr, this.ZX, this.ZL);
  }
  
  public static Zgv9 ZG() {
    return new Zgv9();
  }
  
  public static Zgv9 ZW(Zs68 paramZs68) {
    return new Zgv9(paramZs68);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgv9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */