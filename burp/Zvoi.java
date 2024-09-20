package burp;

import java.util.ArrayList;
import java.util.List;

class Zvoi implements Zm4 {
  private final Ze0c Zs;
  
  private final Ze0c Z_;
  
  private final Ze0c Zg;
  
  private final Ze0c ZB;
  
  private final Ze0c Zy;
  
  private final Ze0c ZH;
  
  private final List<Zsq8> Za = new ArrayList<>();
  
  private final Zes1 Zp;
  
  Zvoi(Zlws paramZlws, Zes1 paramZes1) {
    this.ZB = paramZlws.ZF();
    this.Z_ = paramZlws.ZJ();
    this.Zs = paramZlws.ZM();
    this.Zg = paramZlws.ZS();
    this.Zy = paramZlws.ZY();
    this.ZH = paramZlws.ZC();
    this.Zp = paramZes1;
  }
  
  List<Zsq8> Zc(Zlit paramZlit, Zs68 paramZs68, Zstu paramZstu, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = (paramArrayOfbyte != null) ? paramArrayOfbyte : paramZstu.ZiD();
    return ZG(paramZlit, paramZs68, arrayOfByte);
  }
  
  private List<Zsq8> ZG(Zlit paramZlit, Zs68 paramZs68, byte[] paramArrayOfbyte) {
    ArrayList<Zsq8> arrayList = new ArrayList();
    this.Zs.ZE(paramZlit, paramZs68, paramArrayOfbyte, this);
    if (paramZs68.Zs - paramZs68.Zk < 10) {
      arrayList.addAll(this.Za);
      return arrayList;
    } 
    Zs68 zs68 = ZC(paramZs68, paramArrayOfbyte);
    this.ZB.ZE(paramZlit, zs68, paramArrayOfbyte, this);
    if (Z_(zs68)) {
      this.Z_.ZE(paramZlit, zs68, paramArrayOfbyte, this);
      this.Zg.ZE(paramZlit, zs68, paramArrayOfbyte, this);
    } 
    this.Zy.ZE(paramZlit, zs68, paramArrayOfbyte, this);
    this.ZH.ZE(paramZlit, zs68, paramArrayOfbyte, this);
    arrayList.addAll(this.Za);
    return arrayList;
  }
  
  private static Zs68 ZC(Zs68 paramZs68, byte[] paramArrayOfbyte) {
    if (paramZs68.Zd == null && paramZs68.ZH.Zj == 262 && paramArrayOfbyte.length > 0) {
      List<Ztu8> list = Zeam.Zv(paramArrayOfbyte, paramZs68.Zk, paramZs68.Zs, (byte)1);
      return Zgv9.ZW(paramZs68).Zp(list).Zl();
    } 
    return paramZs68;
  }
  
  private static boolean Z_(Zs68 paramZs68) {
    return (paramZs68.Zd != null && paramZs68.Zd.size() > 0);
  }
  
  public void Zt(Zsq8 paramZsq8) {
    if (this.Zp.ZM(paramZsq8.ZZ.Zd1()))
      return; 
    this.Za.add(paramZsq8);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvoi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */