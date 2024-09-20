package burp;

import net.portswigger.Zo;

public class Zu4 extends Zu_ implements Zl47 {
  @Zzvo(19)
  private Zstu ZQ;
  
  @Zzvo(20)
  private final Zefg<Zeeg> ZE;
  
  @Zzvo(21)
  private int Zo;
  
  @Zzvo(23)
  private int Zv;
  
  private Ze3o Zy;
  
  private byte Zg;
  
  private Zo Zw;
  
  Zu4(String paramString, int paramInt, Zefg<Zeeg> paramZefg) {
    super(paramString, -1);
    this.Zv = paramInt;
    this.ZE = paramZefg;
    int[] arrayOfInt = Zzas.ZM();
    this.Zy = Ze3o.CLIENT_TO_SERVER;
    this.Zg = 1;
    this.Zw = new Zo();
    this.Zo = 1;
    if (Zbqc.Zwu() == null)
      Zzas.Zg(new int[5]); 
  }
  
  public int Zwy() {
    return this.Zv;
  }
  
  public void Zhk(int paramInt) {
    this.Zv = paramInt;
  }
  
  public byte ZwP() {
    return this.Zg;
  }
  
  public void ZE(byte paramByte) {
    this.Zg = paramByte;
  }
  
  public Zo ZwJ() {
    return this.Zw;
  }
  
  public void Zx(Zo paramZo) {
    this.Zw = paramZo;
  }
  
  public Ze3o ZwU() {
    return this.Zy;
  }
  
  public void ZD(Ze3o paramZe3o) {
    this.Zy = paramZe3o;
  }
  
  public Zstu ZwN() {
    return this.ZQ;
  }
  
  public void ZH(Zstu paramZstu) {
    this.ZQ = paramZstu;
  }
  
  public Zefg<Zeeg> Zw7() {
    return this.ZE;
  }
  
  public int ZwS() {
    return this.Zo++;
  }
  
  @Zzvo(17)
  private int ZVi() {
    return this.Zg;
  }
  
  @Zzvo(22)
  private byte ZVe() {
    return this.Zw.Ze();
  }
  
  @Zzvo(18)
  private byte ZVR() {
    return this.Zy.id;
  }
  
  public void ZHG() {}
  
  protected boolean ZP(Zm31 paramZm31, Zs7v paramZs7v) {
    return Zlua.Zd(paramZm31, paramZs7v, Zkpi.Z_, 1158996318);
  }
  
  public Zeu4<Zl47> ZF() {
    return Zl47.Zj;
  }
  
  public boolean ZG(Zgi4 paramZgi4) {
    return paramZgi4.ZH(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zu4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */