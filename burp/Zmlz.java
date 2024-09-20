package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import net.portswigger.Zsy;

class Zmlz implements Zg0g {
  private final Zssh Zd;
  
  private final Zz1i ZP;
  
  private final Zerg ZY;
  
  private final Zkq4 Zv;
  
  private final Zkl6 ZH;
  
  private final Ztwv ZC;
  
  private final Zrgd ZU;
  
  private final Zskh ZX;
  
  private final Zsy ZW;
  
  private final Zsv0 Zi;
  
  private final boolean ZG;
  
  private final boolean ZN;
  
  private final Supplier<String> ZQ;
  
  private final Zm6x Zq;
  
  protected Zmlz(Zssh paramZssh, Zz1i paramZz1i, Zerg paramZerg, Zkq4 paramZkq4, Zkl6 paramZkl6, Ztwv paramZtwv, Zrgd paramZrgd, Zskh paramZskh, Zsy paramZsy, Zsv0 paramZsv0, boolean paramBoolean1, boolean paramBoolean2, Supplier<String> paramSupplier, Zm6x paramZm6x) {
    this.Zd = paramZssh;
    this.ZP = paramZz1i;
    this.ZY = paramZerg;
    this.Zv = paramZkq4;
    this.ZH = paramZkl6;
    this.ZC = paramZtwv;
    this.ZU = paramZrgd;
    this.ZX = paramZskh;
    this.ZW = paramZsy;
    this.Zi = paramZsv0;
    this.ZG = paramBoolean1;
    this.ZN = paramBoolean2;
    this.ZQ = paramSupplier;
    this.Zq = paramZm6x;
  }
  
  public List<Zehc> ZJ(Ze3n paramZe3n) {
    return Collections.singletonList(this.Zv.Zr(Zzu2.UNENCRYPTED_COMMUNICATIONS) ? new Zvo(paramZe3n) : null);
  }
  
  public List<Zehc> Zf(Ze3n paramZe3n) {
    Zz_9 zz_9 = new Zz_9(this.Zv, this.Zd, paramZe3n);
    Zmsh zmsh = new Zmsh(paramZe3n, this.Zv, this.Zd, zz_9, this.ZU, this.ZX, this.ZP, this.ZC, this.ZH, this.ZW, this.ZQ);
    String[] arrayOfString = Zmhb.Zz();
    List<Zehc> list = Arrays.asList(new Zehc[] { 
          this.Zv.Zr(Zzu2.STRICT_TRANSPORT_SECURITY_NOT_ENFORCED) ? new Zti8(paramZe3n) : null, new Zxna(paramZe3n, zz_9, this.ZH.ZB()), new Zr12(zz_9, this.ZP, paramZe3n), new Zl62(paramZe3n, zz_9), zz_9.Zr(Zzu2.DUPLICATE_COOKIES_SET) ? new Ze5_(paramZe3n) : null, new Ze12(zz_9, paramZe3n), zz_9.Zr(Zzu2.ASP_NET_VIEWSTATE_WITHOUT_MAC_ENABLED) ? new Zbs2(paramZe3n) : null, new Zxeg(zz_9, paramZe3n, this.ZH.ZB()), zz_9.Zr(Zzu2.CACHEABLE_HTTPS_RESPONSE) ? new Zlu4(paramZe3n) : null, new Zeez(this.ZH.ZB(), this.ZP, zz_9, paramZe3n), 
          new Ze4b(zz_9, paramZe3n), zz_9.Zr(Zzu2.LONG_REDIRECTION_RESPONSE) ? new Zzmt(paramZe3n) : null, zz_9.Zr(Zzu2.VULNERABLE_JAVASCRIPT_DEPENDENCY) ? new Zec(zz_9, paramZe3n, this.ZC, this.ZH.ZB()) : null, zz_9.Zr(Zzu2.JWT_WEAK_HMAC_SECRET) ? new Ztyp(this.ZU, this.ZX, this.ZP, paramZe3n, zz_9) : null, zz_9.Zr(Zzu2.JWT_PRIVATE_KEY_DISCLOSURE) ? new Zler(paramZe3n) : null, zz_9.ZS(Zzu2.EXTENSION_GENERATED, Zr3z.PASSIVE) ? new Zr35(this.ZY, this.ZP, paramZe3n, this.ZH, this.Zq) : null, zz_9.Zr(Zzu2.GRAPHQL_ENDPOINT_FOUND) ? new Zlb5(paramZe3n) : null, zz_9.Zr(Zzu2.OPENAPI_DEFINITION_FOUND_PASSIVE) ? new Zgjk(paramZe3n) : null, Zo(zz_9) ? new Zxzx(zmsh) : null });
    ArrayList<Zehc> arrayList = new ArrayList<>(list);
    if (zz_9.ZS(Zzu2.BCHECK_GENERATED, Zr3z.PASSIVE))
      arrayList.addAll(ZW(zz_9, paramZe3n)); 
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[3]); 
    return arrayList;
  }
  
  private boolean Zo(Zz_9 paramZz_9) {
    return (paramZz_9.Zr(Zzu2.CONTENT_SECURITY_POLICY_ALLOW_FORM_HIGHJACKING) || paramZz_9.Zr(Zzu2.CONTENT_SECURITY_POLICY_ALLOW_CLICKJACKING) || paramZz_9.Zr(Zzu2.CONTENT_SECURITY_POLICY_ALLOWLISTED_SCRIPTS) || paramZz_9.Zr(Zzu2.CONTENT_SECURITY_POLICY_MALFORMED_SYNTAX) || paramZz_9.Zr(Zzu2.CONTENT_SECURITY_POLICY_NOT_ENFORCED) || paramZz_9.Zr(Zzu2.CONTENT_SECURITY_POLICY_UNTRUSTED_SCRIPTS) || paramZz_9.Zr(Zzu2.CONTENT_SECURITY_POLICY_UNTRUSTED_STYLES));
  }
  
  private List<Zehc> ZW(Zz_9 paramZz_9, Ze3n paramZe3n) {
    // Byte code:
    //   0: new burp/Zmsh
    //   3: dup
    //   4: aload_2
    //   5: aload_0
    //   6: getfield Zv : Lburp/Zkq4;
    //   9: aload_0
    //   10: getfield Zd : Lburp/Zssh;
    //   13: aload_1
    //   14: aload_0
    //   15: getfield ZU : Lburp/Zrgd;
    //   18: aload_0
    //   19: getfield ZX : Lburp/Zskh;
    //   22: aload_0
    //   23: getfield ZP : Lburp/Zz1i;
    //   26: aload_0
    //   27: getfield ZC : Lburp/Ztwv;
    //   30: aload_0
    //   31: getfield ZH : Lburp/Zkl6;
    //   34: aload_0
    //   35: getfield ZW : Lnet/portswigger/Zsy;
    //   38: aload_0
    //   39: getfield ZQ : Ljava/util/function/Supplier;
    //   42: invokespecial <init> : (Lburp/Ze3n;Lburp/Zkq4;Lburp/Zssh;Lburp/Zz_9;Lburp/Zrgd;Lburp/Zskh;Lburp/Zz1i;Lburp/Ztwv;Lburp/Zkl6;Lnet/portswigger/Zsy;Ljava/util/function/Supplier;)V
    //   45: astore_3
    //   46: aload_0
    //   47: getfield Zi : Lburp/Zsv0;
    //   50: invokeinterface ZU : ()Ljava/util/List;
    //   55: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   60: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   65: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   70: aload_0
    //   71: aload_3
    //   72: <illegal opcode> apply : (Lburp/Zmlz;Lburp/Zmsh;)Ljava/util/function/Function;
    //   77: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   82: invokestatic toList : ()Ljava/util/stream/Collector;
    //   85: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   90: checkcast java/util/List
    //   93: areturn
  }
  
  private Zlbq lambda$getPPRBChecks$1(Zmsh paramZmsh, Zsvm paramZsvm) {
    return new Zlbq(new Ztqo(paramZsvm, this.ZG, this.ZN), paramZmsh);
  }
  
  private static boolean lambda$getPPRBChecks$0(Zsvm paramZsvm) {
    return (paramZsvm.ZS() == Zmc8.PPR);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmlz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */