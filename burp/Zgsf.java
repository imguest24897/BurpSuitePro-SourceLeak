package burp;

import java.util.Iterator;
import net.portswigger.Zsy;

public class Zgsf implements Zm9n {
  private final Zkq4 ZD;
  
  private final Zmhe Zy;
  
  private final Ze3n Zj;
  
  private final Zxs7 Zk;
  
  private final Zbnt ZT;
  
  private final Zsy ZM;
  
  private final Zmg6 Zh;
  
  private final Zbjl Zx;
  
  public Zgsf(Zkq4 paramZkq4, Zmhe paramZmhe, Ze3n paramZe3n, Zxs7 paramZxs7, Zbnt paramZbnt, Zsy paramZsy, Zmg6 paramZmg6, Zbjl paramZbjl) {
    this.Zy = paramZmhe;
    this.Zj = paramZe3n;
    this.Zk = paramZxs7;
    this.ZT = paramZbnt;
    this.ZM = paramZsy;
    this.ZD = paramZkq4;
    this.Zh = paramZmg6;
    this.Zx = paramZbjl;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    // Byte code:
    //   0: invokestatic ZA : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield Zy : Lburp/Zmhe;
    //   9: iconst_0
    //   10: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   13: iconst_1
    //   14: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   17: invokeinterface Zq : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   22: checkcast java/lang/Boolean
    //   25: invokevirtual booleanValue : ()Z
    //   28: ifeq -> 41
    //   31: aload_0
    //   32: aload_3
    //   33: invokevirtual ZJ : (Lburp/Zz4_;)V
    //   36: aload #4
    //   38: ifnonnull -> 46
    //   41: aload_0
    //   42: aload_3
    //   43: invokevirtual Zw : (Lburp/Zz4_;)V
    //   46: aload_0
    //   47: getfield ZD : Lburp/Zkq4;
    //   50: getstatic burp/Zzu2.SERVER_SIDE_TEMPLATE_ENGINE_INJECTION : Lburp/Zzu2;
    //   53: getstatic burp/Zr3z.COLLABORATOR_BASED : Lburp/Zr3z;
    //   56: invokeinterface ZS : (Lburp/Zvs;Lburp/Zr3z;)Z
    //   61: ifeq -> 102
    //   64: aload_0
    //   65: getfield ZD : Lburp/Zkq4;
    //   68: invokeinterface ZqT : ()Lburp/Zlk4;
    //   73: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   76: invokevirtual ZH : (Lburp/Zlk4;)Z
    //   79: ifne -> 97
    //   82: aload_0
    //   83: getfield ZD : Lburp/Zkq4;
    //   86: invokeinterface ZqM : ()Lburp/Zeko;
    //   91: getstatic burp/Zeko.MINIMIZE_FALSE_NEGATIVES : Lburp/Zeko;
    //   94: if_acmpne -> 102
    //   97: aload_0
    //   98: aload_1
    //   99: invokevirtual ZV : (Lburp/Zrj;)V
    //   102: return
  }
  
  private void ZV(Zrj paramZrj) {
    Ztqu ztqu = new Ztqu(this.Zk, paramZrj.Zg(), this.Zj.ZM().Zgv(), this.Zx);
    Iterator<Zewx> iterator = ztqu.ZK().iterator();
    String[] arrayOfString = Ztqu.ZA();
    while (iterator.hasNext()) {
      Zewx zewx = iterator.next();
      if (zewx.ZA(this.Zx))
        this.Zy.ZK(Zri7.ZJ(new Zrrb(zewx.Zh(), zewx.ZY())), Zlp5.Zc().Zd(true)); 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private void Zw(Zz4_ paramZz4_) {
    String[] arrayOfString = Ztqu.ZA();
    Zmxc zmxc = this.Zh.Zn();
    if (this.ZD.Zr(Zzu2.EXPRESSION_LANGUAGE_ENGINE_INJECTION) || this.ZD.ZS(Zzu2.SERVER_SIDE_TEMPLATE_ENGINE_INJECTION, Zr3z.SSTI_ECHO_BASED) || this.ZD.ZS(Zzu2.XSS_REFLECTED, Zr3z.SERVER_SIDE_BREAKOUT) || this.ZD.ZS(Zzu2.XSS_REFLECTED, Zr3z.CLIENT_SIDE_BREAKOUT))
      zmxc = this.Zh.Zh(); 
    if (this.ZD.ZS(Zzu2.XSS_REFLECTED, Zr3z.CLIENT_SIDE_BREAKOUT))
      zmxc.Zf(paramZz4_); 
    if ((this.ZD.Zr(Zzu2.EXPRESSION_LANGUAGE_ENGINE_INJECTION) || this.ZD.ZS(Zzu2.SERVER_SIDE_TEMPLATE_ENGINE_INJECTION, Zr3z.SSTI_ECHO_BASED)) && this.Zh.ZE()) {
      Zl24 zl24 = (new Zka(this.ZD, this.Zj, this.Zk, this.Zy, this.ZM, !zmxc.Zx().isEmpty())).Zn();
      if (zl24.ZV != null) {
        if (zl24.Za)
          paramZz4_.Zz(zl24.ZV); 
        return;
      } 
    } 
    if (this.ZD.ZS(Zzu2.SERVER_SIDE_TEMPLATE_ENGINE_INJECTION, Zr3z.SSTI_ECHO_BASED) || this.ZD.ZS(Zzu2.XSS_REFLECTED, Zr3z.SERVER_SIDE_BREAKOUT)) {
      Zmxc zmxc1 = new Zmxc();
      for (Zxpw zxpw : new Zgyh(this.ZD.ZqT(), this.ZM)) {
        Zlb3 zlb3 = new Zlb3(this.Zj, this.Zk, this.Zy);
        (new Zsfo(zmxc1, zxpw, zmxc.Zx(), this.Zk, this.Zy, this.ZT, this.ZM, zlb3)).Zs();
        if (zlb3.Zv != null) {
          if (this.ZD.ZS(Zzu2.SERVER_SIDE_TEMPLATE_ENGINE_INJECTION, Zr3z.SSTI_ECHO_BASED))
            paramZz4_.Zz(zlb3.Zv); 
          if (this.ZD.ZS(Zzu2.XSS_REFLECTED, Zr3z.SERVER_SIDE_BREAKOUT))
            zmxc1.Zf(paramZz4_); 
          return;
        } 
        if (arrayOfString == null)
          break; 
      } 
      if (this.ZD.ZS(Zzu2.XSS_REFLECTED, Zr3z.SERVER_SIDE_BREAKOUT))
        zmxc1.Zf(paramZz4_); 
    } 
  }
  
  private void ZJ(Zz4_ paramZz4_) {
    if (this.ZD.ZS(Zzu2.XSS_STORED, Zr3z.IN_BAND))
      this.Zh.Zh().Zf(paramZz4_); 
  }
  
  public boolean Zf() {
    return this.Zk.ZZ(this.ZD);
  }
  
  public Zbsl Zp() {
    return Zbsl.APIP_XssAndTemplateInjection;
  }
  
  public String toString() {
    return Zp().name();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgsf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */