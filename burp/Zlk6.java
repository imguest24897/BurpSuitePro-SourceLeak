package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.Zlz;

public class Zlk6 {
  private String Za;
  
  private boolean ZE;
  
  private int ZO;
  
  private boolean Ze;
  
  private int ZA;
  
  private boolean Zo;
  
  private int ZC;
  
  private boolean Zc;
  
  private boolean Zh;
  
  private boolean ZU;
  
  private boolean ZL;
  
  private List<Integer> ZV = Collections.emptyList();
  
  private boolean ZG;
  
  public Zlk6() {}
  
  public Zlk6(Ztwh paramZtwh) {
    this.Za = paramZtwh.Zz();
    this.ZE = paramZtwh.Zw();
    this.ZO = paramZtwh.ZY();
    this.Ze = paramZtwh.ZK();
    this.ZA = paramZtwh.Zf();
    this.Zo = paramZtwh.Zm();
    this.ZC = paramZtwh.ZB();
    this.Zc = paramZtwh.Zy();
    this.Zh = paramZtwh.Zc();
    this.ZU = paramZtwh.ZW();
    this.ZL = paramZtwh.ZQ();
    this.ZG = paramZtwh.Zo();
    this.ZV = paramZtwh.ZO();
  }
  
  public Zlk6(Zlk6 paramZlk6) {
    this.Za = paramZlk6.Zv();
    this.ZE = paramZlk6.Z_();
    this.ZO = paramZlk6.Zq();
    this.Ze = paramZlk6.Zt();
    this.ZA = paramZlk6.Za();
    this.Zo = paramZlk6.Zm();
    this.ZC = paramZlk6.ZW();
    this.Zc = paramZlk6.Zb();
    this.Zh = paramZlk6.ZK();
    this.ZU = paramZlk6.ZQ();
    this.ZL = paramZlk6.ZI();
    this.ZG = paramZlk6.ZF();
    this.ZV = paramZlk6.Zo();
  }
  
  public String Zv() {
    return this.Za;
  }
  
  public Zlk6 Zs(String paramString) {
    this.Za = paramString;
    return this;
  }
  
  public boolean Z_() {
    return this.ZE;
  }
  
  public Zlk6 Zq(boolean paramBoolean) {
    this.ZE = paramBoolean;
    return this;
  }
  
  public int Zq() {
    return this.ZO;
  }
  
  public Zlk6 ZA(int paramInt) {
    this.ZO = paramInt;
    return this;
  }
  
  public boolean Zt() {
    return this.Ze;
  }
  
  public Zlk6 ZI(boolean paramBoolean) {
    this.Ze = paramBoolean;
    return this;
  }
  
  public int Za() {
    return this.ZA;
  }
  
  public Zlk6 Zj(int paramInt) {
    this.ZA = paramInt;
    return this;
  }
  
  public boolean Zm() {
    return this.Zo;
  }
  
  public Zlk6 ZM(boolean paramBoolean) {
    this.Zo = paramBoolean;
    return this;
  }
  
  public int ZW() {
    return this.ZC;
  }
  
  public Zlk6 Zr(int paramInt) {
    this.ZC = paramInt;
    return this;
  }
  
  public boolean Zb() {
    return this.Zc;
  }
  
  public Zlk6 ZU(boolean paramBoolean) {
    this.Zc = paramBoolean;
    return this;
  }
  
  public boolean ZK() {
    return this.Zh;
  }
  
  public Zlk6 Zw(boolean paramBoolean) {
    this.Zh = paramBoolean;
    return this;
  }
  
  public boolean ZQ() {
    return this.ZU;
  }
  
  public Zlk6 ZA(boolean paramBoolean) {
    this.ZU = paramBoolean;
    return this;
  }
  
  public boolean ZI() {
    return this.ZL;
  }
  
  public Zlk6 Zt(boolean paramBoolean) {
    this.ZL = paramBoolean;
    return this;
  }
  
  public List<Integer> Zo() {
    return this.ZV;
  }
  
  public Zlk6 ZN(List<Integer> paramList) {
    this.ZV = (paramList == null) ? Collections.<Integer>emptyList() : paramList;
    return this;
  }
  
  public boolean ZF() {
    return this.ZG;
  }
  
  public Zlk6 Zs(boolean paramBoolean) {
    this.ZG = paramBoolean;
    return this;
  }
  
  public Zm_3 ZP() {
    if (Zlz.ZX(this.Za))
      return Zm_3.Zx(Zkyg.NO_NAME_SPECIFIED); 
    if (this.ZE && (this.ZO > 999 || this.ZO < 1))
      return Zm_3.Zx(Zkyg.CONCURRENT_REQUEST_LIMIT_OUTSIDE_RANGE); 
    int i = Zj();
    Zkyg zkyg = ZH();
    if (this.Ze) {
      if (this.ZA > Ztwh.Zg)
        return Zm_3.Zx(zkyg); 
      if (this.ZA < i)
        return Zm_3.Zx(zkyg); 
      if (this.Zo) {
        if (this.Zc)
          return Zm_3.Zx(Zkyg.ONLY_ONE_OF_THROTTLE_INCREMENT_OR_RANDOM_VARIATIONS_ALLOWED); 
        if (this.ZC == 0)
          return Zm_3.Zx(Zkyg.THROTTLE_INCREMENT_MUST_NOT_BE_ZERO); 
      } 
    } 
    return (!this.ZE && !this.Ze) ? Zm_3.Zx(Zkyg.NEITHER_THROTTLING_NOR_CONCURRENCY_LIMIT_SELECTED) : Zm_3.ZG();
  }
  
  private int Zj() {
    return this.Zo ? 0 : (this.ZE ? 1 : 100);
  }
  
  private Zkyg ZH() {
    return this.Zo ? Zkyg.THROTTLE_DURATION_OUTSIDE_RANGE_GIVEN_INCREMENTING_DELAY : (this.ZE ? Zkyg.THROTTLE_DURATION_OUTSIDE_RANGE_GIVEN_FIXED_DELAY_AND_CONCURRENT_REQUEST_LIMIT_ENABLED : Zkyg.THROTTLE_DURATION_OUTSIDE_RANGE_GIVEN_FIXED_DELAY_AND_CONCURRENT_REQUEST_LIMIT_NOT_ENABLED);
  }
  
  public Ztwh Zi() {
    return new Ztwh(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlk6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */