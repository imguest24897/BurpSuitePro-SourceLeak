package net.portswigger;

import java.util.function.Predicate;

class Z_c {
  private Zfz ZJ = Zkc.ZL;
  
  private Zfz Zk = Zkc.ZL;
  
  private boolean ZW;
  
  static Z_c Zs() {
    return new Z_c();
  }
  
  Z_c ZF(String paramString) {
    this.ZJ = paramString::lambda$withPrefix$0;
    return this;
  }
  
  Z_c Z_(Zfz paramZfz) {
    this.ZJ = paramZfz;
    return this;
  }
  
  Z_c Zn(String paramString) {
    this.Zk = paramString::lambda$withSuffix$1;
    return this;
  }
  
  Z_c Zy(Zfz paramZfz) {
    this.Zk = paramZfz;
    return this;
  }
  
  Z_c ZK() {
    this.ZW = true;
    return this;
  }
  
  Zux ZJ(Predicate<Zot> paramPredicate) {
    return new Zux(this.ZJ, this.Zk, this.ZW, paramPredicate);
  }
  
  private static String lambda$withSuffix$1(String paramString1, String paramString2) {
    return paramString1;
  }
  
  private static String lambda$withPrefix$0(String paramString1, String paramString2) {
    return paramString1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Z_c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */