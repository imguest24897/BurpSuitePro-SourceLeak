package burp;

import java.util.List;

class Zxjd {
  private static final Zef3 ZY = new Zef3(true, 0, 0, 0);
  
  private final Zgf2 ZQ;
  
  private final Zxj8 Zl;
  
  private final Zeld Zn;
  
  private Zgn4 ZT;
  
  private Zgrn ZJ;
  
  private Zgrn Zi;
  
  private Zef3 Zo;
  
  Zxjd(Zgf2 paramZgf2, Zxj8 paramZxj8, Zeld paramZeld) {
    this.ZQ = paramZgf2;
    this.Zl = paramZxj8;
    this.Zn = paramZeld;
    this.Zo = null;
  }
  
  void Zi(Zmo3 paramZmo3, List<Zsgq> paramList) {
    this.Zo = ZY;
    this.Zn.ZX(ZY);
    this.ZT = this.ZQ.ZP(paramZmo3, paramList.stream().map(Zxjd::lambda$startTest$0).toList(), this.Zl);
    Zlli<Zt1n> zlli = this.ZT.Zb();
    this.ZJ = zlli.ZE(Zt1n.ZY, this::lambda$startTest$1);
    this.Zi = zlli.ZE(Zt1n.ZR, this::lambda$startTest$3);
    this.ZT.ZL();
  }
  
  boolean ZS() {
    return (this.ZT != null);
  }
  
  void Zd() {
    if (this.ZT != null) {
      this.ZT.Zq();
      Zj();
    } 
  }
  
  private void Zj() {
    this.ZT = null;
    this.ZJ.ZZ();
    this.ZJ = null;
    this.Zi.ZZ();
    this.Zi = null;
    this.Zo = null;
  }
  
  private void lambda$startTest$3(Zxr8 paramZxr8) {
    paramZxr8.ZF().ifPresent(this::lambda$startTest$2);
  }
  
  private void lambda$startTest$2(Zgg8 paramZgg8) {
    this.Zo = new Zef3(true, paramZgg8.ZB9(), paramZgg8.ZBG(), paramZgg8.ZBa());
    this.Zn.ZX(this.Zo);
  }
  
  private void lambda$startTest$1(Zxr8 paramZxr8) {
    this.Zn.ZX(this.Zo.ZRj());
    Zj();
  }
  
  private static Zrm2 lambda$startTest$0(Zsgq paramZsgq) {
    return new Zbpb(paramZsgq);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxjd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */