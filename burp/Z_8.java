package burp;

import net.portswigger.Zkb;

public class Z_8 extends Zni implements Zlee {
  @Zzvo(1)
  private boolean Z_;
  
  @Zzvo(2)
  private boolean Zt;
  
  @Zzvo(3)
  private boolean Zb;
  
  @Zzvo(4)
  private boolean ZH;
  
  @Zzvo(5)
  private byte[] Zm;
  
  @Zzvo(6)
  private boolean Zh;
  
  @Zzvo(7)
  private String Za;
  
  @Zzvo(8)
  private boolean ZT;
  
  @Zzvo(9)
  private boolean Zg;
  
  @Zzvo(10)
  private boolean ZL;
  
  private static String ZG;
  
  public Z_8(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, byte[] paramArrayOfbyte, boolean paramBoolean5, String paramString, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8) {
    this.Z_ = paramBoolean1;
    this.Zt = paramBoolean2;
    this.Zb = paramBoolean3;
    this.ZH = paramBoolean4;
    this.Zm = paramArrayOfbyte;
    this.Zh = paramBoolean5;
    this.Za = paramString;
    this.ZT = paramBoolean6;
    this.Zg = paramBoolean7;
    this.ZL = paramBoolean8;
  }
  
  public Z_8(Zlee paramZlee) {
    this.Z_ = paramZlee.ZdS();
    this.Zt = paramZlee.Zd9();
    this.Zb = paramZlee.Zdc();
    this.ZH = paramZlee.ZdX();
    this.Zm = paramZlee.Zd3();
    this.Zh = paramZlee.ZdK();
    this.Za = paramZlee.Zdl();
    this.ZT = paramZlee.ZdB();
    this.Zg = paramZlee.ZdW();
    this.ZL = paramZlee.ZdU();
  }
  
  public boolean ZdS() {
    return this.Z_;
  }
  
  public void Z_F(boolean paramBoolean) {
    this.Z_ = paramBoolean;
  }
  
  public boolean Zd9() {
    return this.Zt;
  }
  
  public void Z_w(boolean paramBoolean) {
    this.Zt = paramBoolean;
  }
  
  public boolean Zdc() {
    return this.Zb;
  }
  
  public void Z_A(boolean paramBoolean) {
    this.Zb = paramBoolean;
  }
  
  public boolean ZdX() {
    return this.ZH;
  }
  
  public void Z_x(boolean paramBoolean) {
    this.ZH = paramBoolean;
  }
  
  public byte[] Zd3() {
    return this.Zm;
  }
  
  public String ZdN() {
    return Zkb.ZG(this.Zm);
  }
  
  public void ZM(byte[] paramArrayOfbyte) {
    this.Zm = paramArrayOfbyte;
  }
  
  public boolean ZdK() {
    return this.Zh;
  }
  
  public void Z_o(boolean paramBoolean) {
    this.Zh = paramBoolean;
  }
  
  public String Zdl() {
    return this.Za;
  }
  
  public void ZaU(String paramString) {
    this.Za = paramString;
  }
  
  public boolean ZdB() {
    return this.ZT;
  }
  
  public void Z_a(boolean paramBoolean) {
    this.ZT = paramBoolean;
  }
  
  public boolean ZdW() {
    return this.Zg;
  }
  
  public void Z_5(boolean paramBoolean) {
    this.Zg = paramBoolean;
  }
  
  public boolean ZdU() {
    return this.ZL;
  }
  
  public void Z_s(boolean paramBoolean) {
    this.ZL = paramBoolean;
  }
  
  public String toString() {
    return Zljj.ZF(this);
  }
  
  public boolean equals(Object paramObject) {
    Zlee zlee = (Zlee)paramObject;
    return Zewd.ZI(this, zlee) ? true : ((paramObject == null || getClass() != paramObject.getClass()) ? false : Zljj.ZD(this, zlee));
  }
  
  public int hashCode() {
    return Zljj.ZE(this);
  }
  
  public static void Zp8(String paramString) {
    ZG = paramString;
  }
  
  public static String ZIj() {
    return ZG;
  }
  
  static {
    if (ZIj() != null)
      Zp8("yQpJi"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Z_8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */