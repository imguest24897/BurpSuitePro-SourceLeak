package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;
import net.portswigger.Zs6;
import net.portswigger.Zsy;

class Zb0c extends Zb0k {
  private final boolean ZJ;
  
  private final boolean ZV;
  
  private final Supplier<String> ZG;
  
  private final Zm6x Zf;
  
  private final Zmr3 Zj;
  
  protected Zb0c(Zkl6 paramZkl6, Zr_4 paramZr_41, Zsy paramZsy, Zerg paramZerg, Zr_4 paramZr_42, Zgb6 paramZgb6, Ztdi paramZtdi, Zkq4 paramZkq4, Zsoh paramZsoh, Zesv paramZesv, Zz1i paramZz1i, Zbjl paramZbjl, Zskh paramZskh, Zsv0 paramZsv0, boolean paramBoolean1, boolean paramBoolean2, Supplier<String> paramSupplier, Zm6x paramZm6x, Zmr3 paramZmr3) {
    super(paramZkl6, paramZr_41, paramZsy, paramZerg, paramZr_42, paramZgb6, paramZtdi, paramZkq4, paramZsoh, paramZesv, paramZz1i, paramZbjl, paramZskh, paramZsv0, paramZm6x);
    this.ZJ = paramBoolean1;
    this.ZV = paramBoolean2;
    this.ZG = paramSupplier;
    this.Zf = paramZm6x;
    this.Zj = paramZmr3;
  }
  
  private List<Zgxo<Zm9n>> Zn(Ze3n paramZe3n, Zxs7 paramZxs7, Zmg6 paramZmg6, Zmhe paramZmhe) {
    // Byte code:
    //   0: new burp/Zgic
    //   3: dup
    //   4: aload_3
    //   5: aload_0
    //   6: getfield ZX : Lburp/Zsoh;
    //   9: aload_0
    //   10: getfield ZW : Lburp/Zkl6;
    //   13: aload_1
    //   14: aload #4
    //   16: aload_2
    //   17: aload_0
    //   18: getfield Zd : Lburp/Zkq4;
    //   21: aload_0
    //   22: getfield ZK : Lnet/portswigger/Zsy;
    //   25: aload_0
    //   26: getfield ZP : Lburp/Zbjl;
    //   29: aload_0
    //   30: getfield ZH : Lburp/Zskh;
    //   33: aload_0
    //   34: getfield ZG : Ljava/util/function/Supplier;
    //   37: invokespecial <init> : (Lburp/Zmg6;Lburp/Zsoh;Lburp/Zkl6;Lburp/Ze3n;Lburp/Zmhe;Lburp/Zxs7;Lburp/Zkq4;Lnet/portswigger/Zsy;Lburp/Zbjl;Lburp/Zskh;Ljava/util/function/Supplier;)V
    //   40: astore #5
    //   42: aload_0
    //   43: getstatic burp/Ztst.APIP : Lburp/Ztst;
    //   46: invokevirtual ZY : (Lburp/Zbjr;)Ljava/util/stream/Stream;
    //   49: aload_0
    //   50: aload #5
    //   52: <illegal opcode> apply : (Lburp/Zb0c;Lburp/Zgic;)Ljava/util/function/Function;
    //   57: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   62: invokeinterface toList : ()Ljava/util/List;
    //   67: areturn
  }
  
  private List<Zgxo<Zkrr>> ZR(Ze3n paramZe3n) {
    // Byte code:
    //   0: aload_0
    //   1: getstatic burp/Ztst.APH : Lburp/Ztst;
    //   4: invokevirtual ZY : (Lburp/Zbjr;)Ljava/util/stream/Stream;
    //   7: aload_0
    //   8: aload_1
    //   9: <illegal opcode> apply : (Lburp/Zb0c;Lburp/Ze3n;)Ljava/util/function/Function;
    //   14: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   19: invokeinterface toList : ()Ljava/util/List;
    //   24: areturn
  }
  
  private List<Zgxo<Zkrr>> Zr(Ze3n paramZe3n) {
    // Byte code:
    //   0: aload_0
    //   1: getstatic burp/Ztst.APR : Lburp/Ztst;
    //   4: invokevirtual ZY : (Lburp/Zbjr;)Ljava/util/stream/Stream;
    //   7: aload_0
    //   8: aload_1
    //   9: <illegal opcode> apply : (Lburp/Zb0c;Lburp/Ze3n;)Ljava/util/function/Function;
    //   14: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   19: invokeinterface toList : ()Ljava/util/List;
    //   24: areturn
  }
  
  private Stream<Zsvm> ZY(Zbjr paramZbjr) {
    return this.ZC.ZU().stream().filter(paramZbjr::lambda$getBCheckActionDefinitionsOfType$3);
  }
  
  private Zgic ZB(Ze3n paramZe3n) {
    return new Zgic(this.ZX, this.ZW, paramZe3n, this.Zc, this.Zd, this.ZK, this.ZP, this.ZH, this.ZG);
  }
  
  protected List<Zgxo<Zkrr>> Za(Ze3n paramZe3n) {
    return Arrays.asList((Zgxo<Zkrr>[])new Zgxo[] { Zgxo.ZI(new Zg45(paramZe3n, this.ZW.ZB(), this.ZK, this.ZX), new Zvs[] { Zzu2.BACKUP_FILE }), Zgxo.ZI(new Zl87(paramZe3n, this.ZW.ZB(), this.ZK, this.ZX), new Zvs[] { Zzu2.BACKUP_FILE }), Zgxo.ZI(new Zrw2(paramZe3n, this.ZW.ZB(), this.ZK, this.ZX), new Zvs[] { Zzu2.BACKUP_FILE }), Zgxo.ZI(new Zdj(paramZe3n, this.ZW.ZB(), this.ZK, this.ZX), new Zvs[] { Zzu2.BACKUP_FILE }) });
  }
  
  protected List<Zgxo<Zkrr>> Zy(Ze3n paramZe3n) {
    // Byte code:
    //   0: aload_0
    //   1: getstatic burp/Ztst.APP : Lburp/Ztst;
    //   4: invokevirtual ZY : (Lburp/Zbjr;)Ljava/util/stream/Stream;
    //   7: aload_0
    //   8: aload_1
    //   9: <illegal opcode> apply : (Lburp/Zb0c;Lburp/Ze3n;)Ljava/util/function/Function;
    //   14: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   19: invokeinterface toList : ()Ljava/util/List;
    //   24: areturn
  }
  
  protected List<Zgxo<Zkrr>> ZJ(Ze3n paramZe3n) {
    List<Zgxo> list = Arrays.asList(new Zgxo[] { 
          Zgxo.ZI(new Zm0i(this.ZX, this.ZW, paramZe3n, this.ZK), new Zvs[] { Zzu2.HTTP_TRACE_METHOD_IS_ENABLED }), Zgxo.ZI(new Zmlt(this.ZX, this.Zd, this.ZW, paramZe3n), new Zvs[] { Zzu2.FLASH_CROSS_DOMAIN_POLICY }), Zgxo.ZI(new Zsxb(this.ZX, this.Zd, this.ZW, paramZe3n), new Zvs[] { Zzu2.SILVERLIGHT_CROSS_DOMAIN_POLICY }), Zgxo.ZI(new Zesz(this.ZX, this.ZW, paramZe3n, this.Zd), new Zvs[] { Zzu2.ROBOTS_TXT_FILE, Zzu2.TLS_CERTIFICATE }), Zgxo.ZI(new Zkya(this.ZX, this.ZW, paramZe3n), new Zvs[] { Zzu2.ASP_NET_TRACING_ENABLED }), Zgxo.ZI(new Zt54(this.ZX, this.ZW, paramZe3n), new Zvs[] { Zzu2.ASP_NET_DEBUGGING_ENABLED }), Zgxo.ZI(new Zru6(this.ZX, this.ZW, paramZe3n), new Zvs[] { Zzu2.HTTP_PUT_METHOD_IS_ENABLED }), Zgxo.ZB(new Zl7j(this.Zd, this.Zc, this.ZW, paramZe3n, this.ZP), new Ze46[] { Ze46.Zo(Zzu2.EXTERNAL_SERVICE_INTERACTION_DNS, Zr3z.COLLABORATOR_BASED), Ze46.Zo(Zzu2.EXTERNAL_SERVICE_INTERACTION_HTTP, Zr3z.COLLABORATOR_BASED), Ze46.ZT(Zzu2.OUT_OF_BAND_RESOURCE_LOAD_HTTP), Ze46.Zo(Zzu2.SPOOFABLE_CLIENT_IP, Zr3z.COLLABORATOR_BASED) }), Zgxo.ZI(new Zxys(paramZe3n, this.ZI, this.Zi, this.ZX, this.ZH, this.ZW.ZM()), new Zvs[] { Zzu2.HIDDEN_HTTP2 }), Zgxo.ZI(new Zz8y(this.ZX, this.ZW, paramZe3n, this.Zd), new Zvs[] { Zzu2.JWK_DISCLOSED }), 
          Zgxo.ZI(new Ztwe(paramZe3n), new Zvs[] { Zzu2.GRAPHQL_ENDPOINT_DISCOVERED }), Zgxo.ZI(new Zep2(this.ZX, this.ZW, paramZe3n, this.Zd), new Zvs[] { Zzu2.OPENAPI_DEFINITION_FOUND_ACTIVE }) });
    ArrayList<Zgxo> arrayList = new ArrayList<>(list);
    arrayList.addAll((Collection)ZR(paramZe3n));
    return (List)arrayList;
  }
  
  protected List<Zgxo<Zkrr>> Zg(Ze3n paramZe3n) {
    return Arrays.asList((Zgxo<Zkrr>[])new Zgxo[] { Zgxo.ZB(new Zt7m(this.ZW, this.ZX, paramZe3n, this.Zd, this.ZP, this.ZI), new Ze46[] { Ze46.Zo(Zzu2.REQUEST_SMUGGLING, Zr3z.REQUEST_SMUGGLING_NORMAL), Ze46.Zo(Zzu2.REQUEST_SMUGGLING, Zr3z.REQUEST_SMUGGLING_INTRUSIVE) }), Zgxo.ZI(new Zky9(this.ZW, (Zs6<?>)this.ZK, this.ZX, this.Zd, paramZe3n, this.ZI), new Zvs[] { Zzu2.CLIENT_SIDE_DESYNC }) });
  }
  
  protected List<Zgxo<Zkrr>> ZA(Ze3n paramZe3n) {
    List<Zgxo> list = Arrays.asList(new Zgxo[] { 
          Zgxo.ZI(new Zblg(this.Zd, paramZe3n, this.ZW.ZB()), new Zvs[] { Zzu2.REFERER_DEPENDENT_RESPONSE }), Zgxo.ZI(new Zblr(this.Zd, paramZe3n, this.ZW.ZB()), new Zvs[] { Zzu2.USER_AGENT_DEPENDENT_RESPONSE }), Zgxo.ZB(new Zblt(this.Zd, paramZe3n, this.ZW.ZB()), new Ze46[] { Ze46.Zo(Zzu2.SPOOFABLE_CLIENT_IP, Zr3z.RESPONSE_DIFFING) }), Zgxo.ZB(new Zkhc(this.Zd, this.ZK, this.Zc, paramZe3n, this.ZW.ZB(), this.ZP, this.ZR), new Ze46[] { Ze46.Zo(Zzu2.XML_EXTERNAL_ENTITY_INJECTION, Zr3z.XXE_FILE_RETRIEVAL) }), Zgxo.ZI(new Zs5e(this.ZK, this.Zc, paramZe3n, this.ZW.ZB()), new Zvs[] { Zzu2.XML_ENTITY_EXPANSION }), Zgxo.Zk(new Zrpr(paramZe3n, this.Zd, this.ZW.ZB())), Zgxo.ZI(new Zgy(this.ZX, this.ZI, this.ZW, paramZe3n), new Zvs[] { Zzu2.CROSS_SITE_REQUEST_FORGERY }), Zgxo.ZI(new Zsk3(paramZe3n, this.ZW.ZB()), new Zvs[] { Zzu2.PATH_RELATIVE_STYLESHEET_IMPORT }), Zgxo.ZI(new Zm3f(paramZe3n), new Zvs[] { Zzu2.ASP_NET_TRACING_ENABLED }), Zgxo.ZB(new Zm7e(this.ZI, this.Zd, paramZe3n, this.ZK, this.ZP), new Ze46[] { Ze46.Zo(Zzu2.EXTERNAL_SERVICE_INTERACTION_DNS, Zr3z.COLLABORATOR_BASED), Ze46.Zo(Zzu2.EXTERNAL_SERVICE_INTERACTION_HTTP, Zr3z.COLLABORATOR_BASED), Ze46.ZT(Zzu2.REQUEST_URL_OVERRIDE), Ze46.ZT(Zzu2.WEB_CACHE_POISONING) }), 
          Zgxo.ZI(new Zzu_(paramZe3n, this.Zd, this.ZW.ZB(), this.ZK, this.ZP), new Zvs[] { Zzu2.WEB_CACHE_POISONING }), Zgxo.ZI(new Zmfu(paramZe3n), new Zvs[] { Zzu2.GRAPHQL_INTROSPECTION_ENABLED }), Zgxo.ZI(new Zgvs(paramZe3n), new Zvs[] { Zzu2.GRAPHQL_SUGGESTIONS_ENABLED }), Zgxo.ZI(new Zsmy(paramZe3n), new Zvs[] { Zzu2.GRAPHQL_CONTENT_TYPE_NOT_VALIDATED }), Zgxo.ZI(new Zgh1(this.ZI, ZB(paramZe3n), paramZe3n, this.Zj.Zj(), this.ZK, this.ZW.ZB()), new Zvs[] { Zzu2.BROKEN_ACCESS_CONTROL }), Zgxo.ZI(new Zzp9(this.ZI, this.Zd, paramZe3n, this.ZK, this.ZW.ZB()), new Zvs[] { Zzu2.WEB_CACHE_DECEPTION }) });
    ArrayList<Zgxo> arrayList = new ArrayList();
    int i = Ztk8.Zz();
    arrayList.addAll(list);
    arrayList.addAll((Collection)Zr(paramZe3n));
    if (Zbqc.Zwu() == null)
      Ztk8.ZC(++i); 
    return (List)arrayList;
  }
  
  protected List<Zgxo<Zm9n>> ZS(Ze3n paramZe3n, Zxs7 paramZxs7, Zmg6 paramZmg6, Zmhe paramZmhe) {
    List<Zgxo> list = Arrays.asList(new Zgxo[] { 
          Zgxo.ZI(new Zg28(paramZmg6), new Zvs[] { Zzu2.SQL_INJECTION, Zzu2.XPATH_INJECTION }), Zgxo.ZI(new Zkhv(paramZe3n, paramZxs7, paramZmg6), new Zvs[] { Zzu2.INPUT_RETRIEVAL_REFLECTED }), Zgxo.Zk(new Zgsf(this.Zd, paramZmhe, paramZe3n, paramZxs7, this.ZW.ZB(), this.ZK, paramZmg6, this.ZP)), Zgxo.Zk(new Zeyy(paramZxs7, this.Zd, paramZe3n, this.ZP, this.ZW.ZB(), paramZmhe, paramZmg6)), Zgxo.ZI(new Zm0k(paramZe3n, this.Zd, paramZxs7, paramZmhe, this.ZK, paramZmg6), new Zvs[] { Zzu2.SUSPICIOUS_INPUT_TRANSFORMATION_REFLECTED }), Zgxo.Zk(new Zrns(paramZmhe, this.Zd, paramZe3n, paramZxs7, this.ZP, this.ZW.ZB(), this.ZR)), Zgxo.Zk(new Zb6s(this.Zd, paramZmhe, this.ZP, paramZe3n, paramZxs7, this.ZW.ZB(), paramZmg6)), Zgxo.ZI(new Zzal(paramZmhe, paramZe3n, paramZxs7, this.ZK, paramZmg6), new Zvs[] { Zzu2.HTTP_RESPONSE_HEADER_INJECTION_REFLECTED }), Zgxo.ZI(new Zrll(paramZmhe, this.ZP, paramZe3n, paramZxs7, this.Zd, this.ZK), new Zvs[] { Zzu2.OS_COMMAND_INJECTION }), Zgxo.ZI(new Zxze(paramZmhe, paramZe3n, paramZxs7, this.ZK, paramZmg6, this.Zd.ZqT()), new Zvs[] { Zzu2.OPEN_REDIRECTION_REFLECTED }), 
          Zgxo.ZB(new Zt40(paramZmhe, this.Zd, paramZe3n, paramZxs7, this.ZW.ZB()), new Ze46[] { Ze46.Zo(Zzu2.FILE_PATH_TRAVERSAL, Zr3z.PATH_TRAVERSAL_FILE_RETRIEVAL), Ze46.ZT(Zzu2.FILE_PATH_MANIPULATION) }), Zgxo.ZB(new Zr4c(paramZmhe, this.Zd, paramZe3n, paramZxs7, this.ZW.ZB(), this.ZK), new Ze46[] { Ze46.Zo(Zzu2.LDAP_INJECTION, Zr3z.BOOLEAN_BASED) }), Zgxo.Zk(new Zlry(this.Zd, paramZmhe, paramZe3n, paramZxs7, this.ZK, this.ZW.ZB(), this.ZP)), Zgxo.Zk(new Zg6o(this.Zd, paramZmhe, paramZe3n, paramZxs7, this.ZK, this.ZW.ZB(), this.ZP, this.ZR)), Zgxo.ZI(new Zlyx(this.ZK, paramZmhe, paramZe3n, paramZxs7, this.ZW.ZB(), this.Zd), new Zvs[] { Zzu2.XML_ENTITY_EXPANSION }), Zgxo.ZI(new Zs5f(paramZmhe, paramZe3n, paramZxs7, this.Zd), new Zvs[] { Zzu2.SERVER_SIDE_JAVASCRIPT_CODE_INJECTION }), Zgxo.Zk(new Zewf(this.Zd, paramZmhe, this.ZP, paramZe3n, paramZxs7, this.ZW.ZB())), Zgxo.ZI(new Ztmv(paramZmhe, this.ZP, paramZe3n, paramZxs7, this.Zd, this.ZK), new Zvs[] { Zzu2.SMTP_HEADER_INJECTION }), Zgxo.ZI(new Zlht(paramZmhe, paramZe3n, this.ZP, paramZxs7, this.Zd), new Zvs[] { Zzu2.EXTERNAL_SERVICE_INTERACTION_SMTP }), Zgxo.ZI(new Zvv(paramZmhe, this.ZX, paramZe3n, this.ZW.ZB(), paramZxs7, this.Zh, this.ZK, paramZmg6), new Zvs[] { Zzu2.CLIENT_SIDE_TEMPLATE_ENGINE_INJECTION }), 
          Zgxo.Zk(new Zboi(this.Zd, paramZmhe, paramZe3n, paramZxs7, this.ZK, paramZmg6)), Zgxo.ZB(new Zbnf(this.ZT, this.ZI, paramZe3n, paramZxs7, this.ZW, this.Zf), new Ze46[] { Ze46.Zo(Zzu2.EXTENSION_GENERATED, Zr3z.ACTIVE) }), Zgxo.ZI(new Zbou(paramZe3n, paramZxs7, this.Zd, this.ZW.ZB(), paramZmhe, this.ZK), new Zvs[] { Zzu2.WEB_CACHE_POISONING }), Zgxo.ZI(new Zb_t(paramZmhe, this.Zd, paramZe3n, paramZxs7, this.ZW.ZB(), this.ZI, this.ZP), new Zvs[] { Zzu2.JWT_SIGNATURE_NOT_VERIFIED, Zzu2.JWT_NONE_ALG_SUPPORTED, Zzu2.JWT_JWK_HEADER_SUPPORTED, Zzu2.JWT_JKU_HEADER_SUPPORTED, Zzu2.JWT_X5U_HEADER_SUPPORTED }) });
    ArrayList<Zgxo> arrayList = new ArrayList();
    int i = Ztk8.ZW();
    arrayList.addAll(list);
    arrayList.addAll((Collection)Zn(paramZe3n, paramZxs7, paramZmg6, paramZmhe));
    if (i == 0)
      Zbqc.Zr(new Zbqc[2]); 
    return (List)arrayList;
  }
  
  protected List<Zgxo<Zm9n>> Zl(Ze3n paramZe3n1, Ze3n paramZe3n2, Zxs7 paramZxs7, Zmg6 paramZmg6, Zmhe paramZmhe) {
    return Arrays.asList((Zgxo<Zm9n>[])new Zgxo[] { Zgxo.ZI(new Zg28(paramZmg6), new Zvs[] { Zzu2.SQL_INJECTION_2ND_ORDER }), Zgxo.Zk(new Zeyy(paramZxs7, this.Zd, paramZe3n1, this.ZP, this.ZW.ZB(), paramZmhe, paramZmg6)), Zgxo.ZI(new Zm0k(paramZe3n1, this.Zd, paramZxs7, paramZmhe, this.ZK, paramZmg6), new Zvs[] { Zzu2.SUSPICIOUS_INPUT_TRANSFORMATION_STORED }), Zgxo.Zk(new Zboi(this.Zd, paramZmhe, paramZe3n1, paramZxs7, this.ZK, paramZmg6)), Zgxo.ZB(new Zgsf(this.Zd, paramZmhe, paramZe3n1, paramZxs7, this.ZW.ZB(), this.ZK, paramZmg6, this.ZP), new Ze46[] { Ze46.Zo(Zzu2.XSS_STORED, Zr3z.IN_BAND) }), Zgxo.ZI(new Zxze(paramZmhe, paramZe3n1, paramZxs7, this.ZK, paramZmg6, this.Zd.ZqT()), new Zvs[] { Zzu2.OPEN_REDIRECTION_STORED }) });
  }
  
  private Zgxo lambda$getActivePerPathChecks$4(Ze3n paramZe3n, Zsvm paramZsvm) {
    return Zgxo.ZI(new Zr8i(ZB(paramZe3n), new Zt25(paramZsvm, this.ZJ, this.ZV)), new Zvs[] { Zzu2.BCHECK_GENERATED });
  }
  
  private static boolean lambda$getBCheckActionDefinitionsOfType$3(Zbjr paramZbjr, Zsvm paramZsvm) {
    return (paramZsvm.ZS() == paramZbjr);
  }
  
  private Zgxo lambda$getAPRBChecks$2(Ze3n paramZe3n, Zsvm paramZsvm) {
    return Zgxo.ZI(new Zs4e(ZB(paramZe3n), new Zt25(paramZsvm, this.ZJ, this.ZV)), new Zvs[] { Zzu2.BCHECK_GENERATED });
  }
  
  private Zgxo lambda$getAPHBChecks$1(Ze3n paramZe3n, Zsvm paramZsvm) {
    return Zgxo.ZI(new Zk9j(ZB(paramZe3n), new Zt25(paramZsvm, this.ZJ, this.ZV)), new Zvs[] { Zzu2.BCHECK_GENERATED });
  }
  
  private Zgxo lambda$getAPIPBChecks$0(Zgic paramZgic, Zsvm paramZsvm) {
    return Zgxo.ZI(new Zsf_(paramZgic, new Zt25(paramZsvm, this.ZJ, this.ZV)), new Zvs[] { Zzu2.BCHECK_GENERATED });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb0c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */