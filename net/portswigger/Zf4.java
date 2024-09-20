package net.portswigger;

import java.util.function.Predicate;

class Zf4 {
  private Zg3 ZM = Ztw.Zg;
  
  private Zg3 Zy = Ztw.Zg;
  
  private boolean ZY;
  
  static Zf4 ZW() {
    return new Zf4();
  }
  
  Zf4 Zs(String paramString) {
    this.ZM = paramString::lambda$withPrefix$0;
    return this;
  }
  
  Zf4 ZX(Zg3 paramZg3) {
    this.ZM = paramZg3;
    return this;
  }
  
  Zf4 ZN(String paramString) {
    this.Zy = paramString::lambda$withSuffix$1;
    return this;
  }
  
  Zf4 ZJ(Zg3 paramZg3) {
    this.Zy = paramZg3;
    return this;
  }
  
  Zf4 Ze() {
    this.ZY = true;
    return this;
  }
  
  Zir Zj(Predicate<Zld> paramPredicate) {
    return new Zir(this.ZM, this.Zy, this.ZY, paramPredicate);
  }
  
  private static String lambda$withSuffix$1(String paramString1, String paramString2) {
    return paramString1;
  }
  
  private static String lambda$withPrefix$0(String paramString1, String paramString2) {
    return paramString1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zf4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */