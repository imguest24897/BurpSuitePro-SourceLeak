package burp;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Stream;

public interface Ztai {
  public static final Set<? extends Zvs> Zg = Zb99.Zn((Zvs[])new Zzu2[] { 
        Zzu2.DOM_DATA_MANIPULATION_DOM_BASED, Zzu2.XSS_DOM_BASED, Zzu2.JAVASCRIPT_INJECTION_DOM_BASED, Zzu2.CLIENT_SIDE_SQL_INJECTION_DOM_BASED, Zzu2.WEBSOCKET_URL_POISONING_DOM_BASED, Zzu2.DOCUMENT_DOMAIN_MANIPULATION_DOM_BASED, Zzu2.LOCAL_FILE_PATH_MANIPULATION_DOM_BASED, Zzu2.CLIENT_SIDE_XPATH_INJECTION_DOM_BASED, Zzu2.CLIENT_SIDE_JSON_INJECTION_DOM_BASED, Zzu2.CLIENT_SIDE_PROTOTYPE_POLLUTION, 
        Zzu2.OPEN_REDIRECTION_DOM_BASED, Zzu2.COOKIE_MANIPULATION_DOM_BASED, Zzu2.AJAX_REQUEST_HEADER_MANIPULATION_DOM_BASED, Zzu2.DENIAL_OF_SERVICE_DOM_BASED, Zzu2.HTML5_WEB_MESSAGE_MANIPULATION_DOM_BASED, Zzu2.HTML5_STORAGE_MANIPULATION_DOM_BASED, Zzu2.LINK_MANIPULATION_DOM_BASED });
  
  public static final Set<? extends Zvs> Zl = Zb99.Zn((Zvs[])new Zzu2[] { 
        Zzu2.DOM_DATA_MANIPULATION_REFLECTED_DOM_BASED, Zzu2.XSS_REFLECTED_DOM_BASED, Zzu2.JAVASCRIPT_INJECTION_REFLECTED_DOM_BASED, Zzu2.WEBSOCKET_URL_POISONING_REFLECTED_DOM_BASED, Zzu2.LOCAL_FILE_PATH_MANIPULATION_REFLECTED_DOM_BASED, Zzu2.CLIENT_SIDE_XPATH_INJECTION_REFLECTED_DOM_BASED, Zzu2.CLIENT_SIDE_JSON_INJECTION_REFLECTED_DOM_BASED, Zzu2.OPEN_REDIRECTION_REFLECTED_DOM_BASED, Zzu2.COOKIE_MANIPULATION_REFLECTED_DOM_BASED, Zzu2.AJAX_REQUEST_HEADER_REFLECTED_MANIPULATION_DOM_BASED, 
        Zzu2.DENIAL_OF_SERVICE_REFLECTED_DOM_BASED, Zzu2.HTML5_WEB_MESSAGE_MANIPULATION_REFLECTED_DOM_BASED, Zzu2.HTML5_STORAGE_MANIPULATION_REFLECTED_DOM_BASED, Zzu2.DOCUMENT_DOMAIN_MANIPULATION_REFLECTED_DOM_BASED, Zzu2.LINK_MANIPULATION_REFLECTED_DOM_BASED });
  
  public static final Set<? extends Zvs> ZD = Zb99.Zn((Zvs[])new Zzu2[] { 
        Zzu2.DOM_DATA_MANIPULATION_STORED_DOM_BASED, Zzu2.XSS_STORED_DOM_BASED, Zzu2.JAVASCRIPT_INJECTION_STORED_DOM_BASED, Zzu2.WEBSOCKET_URL_POISONING_STORED_DOM_BASED, Zzu2.LOCAL_FILE_PATH_MANIPULATION_STORED_DOM_BASED, Zzu2.CLIENT_SIDE_XPATH_INJECTION_STORED_DOM_BASED, Zzu2.CLIENT_SIDE_JSON_INJECTION_STORED_DOM_BASED, Zzu2.OPEN_REDIRECTION_STORED_DOM_BASED, Zzu2.COOKIE_MANIPULATION_STORED_DOM_BASED, Zzu2.AJAX_REQUEST_HEADER_STORED_MANIPULATION_DOM_BASED, 
        Zzu2.DENIAL_OF_SERVICE_STORED_DOM_BASED, Zzu2.HTML5_WEB_MESSAGE_MANIPULATION_STORED_DOM_BASED, Zzu2.HTML5_STORAGE_MANIPULATION_STORED_DOM_BASED, Zzu2.DOCUMENT_DOMAIN_MANIPULATION_STORED_DOM_BASED, Zzu2.LINK_MANIPULATION_STORED_DOM_BASED });
  
  public static final Zvs[] Zn = new Zvs[] { 
      Zzu2.DOM_DATA_MANIPULATION_STORED_DOM_BASED, Zzu2.XSS_STORED_DOM_BASED, Zzu2.JAVASCRIPT_INJECTION_STORED_DOM_BASED, Zzu2.WEBSOCKET_URL_POISONING_STORED_DOM_BASED, Zzu2.LOCAL_FILE_PATH_MANIPULATION_STORED_DOM_BASED, Zzu2.CLIENT_SIDE_XPATH_INJECTION_STORED_DOM_BASED, Zzu2.CLIENT_SIDE_JSON_INJECTION_STORED_DOM_BASED, Zzu2.OPEN_REDIRECTION_STORED_DOM_BASED, Zzu2.COOKIE_MANIPULATION_STORED_DOM_BASED, Zzu2.AJAX_REQUEST_HEADER_STORED_MANIPULATION_DOM_BASED, 
      Zzu2.DENIAL_OF_SERVICE_STORED_DOM_BASED, Zzu2.HTML5_WEB_MESSAGE_MANIPULATION_STORED_DOM_BASED, Zzu2.HTML5_STORAGE_MANIPULATION_STORED_DOM_BASED, Zzu2.DOCUMENT_DOMAIN_MANIPULATION_STORED_DOM_BASED, Zzu2.LINK_MANIPULATION_STORED_DOM_BASED, Zzu2.SUSPICIOUS_INPUT_TRANSFORMATION_STORED, Zzu2.OPEN_REDIRECTION_STORED, Zzu2.PERL_CODE_INJECTION, Zzu2.PYTHON_CODE_INJECTION, Zzu2.RUBY_CODE_INJECTION, 
      Zzu2.UNIDENTIFIED_CODE_INJECTION, Zzu2.INPUT_RETRIEVAL_STORED, Zzu2.LINK_MANIPULATION_STORED, Zzu2.CSS_INJECTION_STORED, Zzu2.CLIENT_SIDE_HTTP_PARAMETER_POLLUTION_STORED, Zzu2.FORM_ACTION_HIJACKING_STORED };
  
  boolean Zr(Zvs paramZvs);
  
  boolean ZS(Zvs paramZvs, Zr3z paramZr3z);
  
  boolean ZN(Zvs... paramVarArgs) {
    Zvs[] arrayOfZvs = paramVarArgs;
    int i = arrayOfZvs.length;
    int[] arrayOfInt = Zlk4.Zm();
    byte b = 0;
    while (b < i) {
      Zvs zvs = arrayOfZvs[b];
      if (Zr(zvs))
        return true; 
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    return false;
  }
  
  boolean ZsY();
  
  boolean Zs6();
  
  default boolean ZsZ() {
    return ZN(ZD.<Zvs>toArray(new Zvs[0]));
  }
  
  default boolean Zsb() {
    return (Zs7() || ZsQ());
  }
  
  default boolean ZsQ() {
    return Zl(Zl, Zr3z.JAVASCRIPT_STATIC_ANALYSIS);
  }
  
  default boolean Zs7() {
    return Zl(Zl, Zr3z.JAVASCRIPT_DYNAMIC_ANALYSIS);
  }
  
  default boolean ZsM() {
    return Zl(ZD, Zr3z.JAVASCRIPT_STATIC_ANALYSIS);
  }
  
  default boolean Zsa() {
    return Zl(ZD, Zr3z.JAVASCRIPT_DYNAMIC_ANALYSIS);
  }
  
  default boolean Zsi() {
    return (Zc(Zr3z.JAVASCRIPT_STATIC_ANALYSIS) || Zc(Zr3z.JAVASCRIPT_DYNAMIC_ANALYSIS));
  }
  
  default boolean Zc(Zr3z paramZr3z) {
    return Zl(Zg, paramZr3z);
  }
  
  default boolean Zl(Set<? extends Zvs> paramSet, Zr3z paramZr3z) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   6: aload_0
    //   7: aload_2
    //   8: <illegal opcode> test : (Lburp/Ztai;Lburp/Zr3z;)Ljava/util/function/Predicate;
    //   13: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   18: ireturn
  }
  
  default boolean ZsP() {
    return (ZN(new Zvs[] { Zzu2.OUT_OF_BAND_RESOURCE_LOAD_HTTP, Zzu2.EXTERNAL_SERVICE_INTERACTION_SMTP, Zzu2.SMTP_HEADER_INJECTION }) || ZS(Zzu2.PHP_CODE_INJECTION, Zr3z.COLLABORATOR_BASED) || ZS(Zzu2.SPOOFABLE_CLIENT_IP, Zr3z.COLLABORATOR_BASED) || ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_DNS, Zr3z.COLLABORATOR_BASED) || ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_HTTP, Zr3z.COLLABORATOR_BASED) || ZS(Zzu2.SSI_INJECTION, Zr3z.COLLABORATOR_BASED) || (ZS(Zzu2.SQL_INJECTION, Zr3z.COLLABORATOR_BASED) && (ZS(Zzu2.SQL_INJECTION, Zr3z.MSSQL_SPECIFIC) || ZS(Zzu2.SQL_INJECTION, Zr3z.MYSQL_SPECIFIC) || ZS(Zzu2.SQL_INJECTION, Zr3z.ORACLE_SPECIFIC))) || (ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.COLLABORATOR_BASED) && (ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.MSSQL_SPECIFIC) || ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.MYSQL_SPECIFIC) || ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.ORACLE_SPECIFIC))) || ZS(Zzu2.XSS_STORED, Zr3z.COLLABORATOR_BASED) || ZS(Zzu2.OS_COMMAND_INJECTION, Zr3z.COLLABORATOR_BASED) || ZS(Zzu2.XML_INJECTION, Zr3z.COLLABORATOR_BASED) || ZS(Zzu2.XML_EXTERNAL_ENTITY_INJECTION, Zr3z.COLLABORATOR_BASED) || ZS(Zzu2.REQUEST_SMUGGLING, Zr3z.REQUEST_SMUGGLING_INTRUSIVE) || ZS(Zzu2.SERVER_SIDE_TEMPLATE_ENGINE_INJECTION, Zr3z.COLLABORATOR_BASED) || Zr(Zzu2.JWT_JKU_HEADER_SUPPORTED) || Zr(Zzu2.JWT_X5U_HEADER_SUPPORTED));
  }
  
  default boolean Zs4() {
    return Zzu2.ZA().anyMatch(this::lambda$hasInfiltratorDependentScanChecksEnabled$1);
  }
  
  default boolean Zs3() {
    return (Zzu2.ZA().filter(Ztai::lambda$hasAnyPassiveScanChecksEnabled$2).anyMatch(this::Zr) || ZS(Zzu2.EXTENSION_GENERATED, Zr3z.PASSIVE) || ZS(Zzu2.BCHECK_GENERATED, Zr3z.PASSIVE));
  }
  
  default boolean Zsn() {
    return Zzu2.ZA().filter(Ztai::lambda$hasAnyNonJavaScriptActiveScanChecksEnabled$4).flatMap(Ztai::lambda$hasAnyNonJavaScriptActiveScanChecksEnabled$7).anyMatch(this::lambda$hasAnyNonJavaScriptActiveScanChecksEnabled$8);
  }
  
  default boolean ZsB() {
    return (ZN(Zn) || Zr(Zzu2.INPUT_RETRIEVAL_STORED) || ZS(Zzu2.XSS_STORED, Zr3z.IN_BAND) || ZS(Zzu2.PHP_CODE_INJECTION, Zr3z.TIME_BASED) || ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.ERROR_BASED) || ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.BOOLEAN_BASED) || ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.TIME_BASED) || ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.COLLABORATOR_BASED) || ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.MSSQL_SPECIFIC) || ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.MYSQL_SPECIFIC) || ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.ORACLE_SPECIFIC));
  }
  
  default boolean Zse() {
    return (ZsP() || Zs4());
  }
  
  private boolean lambda$hasAnyNonJavaScriptActiveScanChecksEnabled$8(Ze46 paramZe46) {
    return ZS(paramZe46.ZU, paramZe46.ZN);
  }
  
  private static Stream lambda$hasAnyNonJavaScriptActiveScanChecksEnabled$7(Zzu2 paramZzu2) {
    return paramZzu2.Zg().isEmpty() ? Stream.<Ze46>of(Ze46.ZT(paramZzu2)) : paramZzu2.Zg().stream().filter(Ztai::lambda$hasAnyNonJavaScriptActiveScanChecksEnabled$5).map(paramZzu2::lambda$hasAnyNonJavaScriptActiveScanChecksEnabled$6);
  }
  
  private static Ze46 lambda$hasAnyNonJavaScriptActiveScanChecksEnabled$6(Zzu2 paramZzu2, Zr3z paramZr3z) {
    return Ze46.Zo(paramZzu2, paramZr3z);
  }
  
  private static boolean lambda$hasAnyNonJavaScriptActiveScanChecksEnabled$5(Zr3z paramZr3z) {
    return (paramZr3z != Zr3z.PASSIVE);
  }
  
  private static boolean lambda$hasAnyNonJavaScriptActiveScanChecksEnabled$4(Zzu2 paramZzu2) {
    return (paramZzu2.ZD().stream().anyMatch(Ztai::lambda$hasAnyNonJavaScriptActiveScanChecksEnabled$3) && !paramZzu2.ZD().contains(Zzua.JAVASCRIPT));
  }
  
  private static boolean lambda$hasAnyNonJavaScriptActiveScanChecksEnabled$3(Zzua paramZzua) {
    return Arrays.<Zzua>asList(Zzua.ALL_ACTIVE_TYPES).contains(paramZzua);
  }
  
  private static boolean lambda$hasAnyPassiveScanChecksEnabled$2(Zzu2 paramZzu2) {
    return paramZzu2.ZD().contains(Zzua.PASSIVE);
  }
  
  private boolean lambda$hasInfiltratorDependentScanChecksEnabled$1(Zzu2 paramZzu2) {
    return (paramZzu2.Zg().contains(Zr3z.INFILTRATOR_BASED) && ZS(paramZzu2, Zr3z.INFILTRATOR_BASED));
  }
  
  private boolean lambda$shouldCheckForIssuesAndDetectionMethod$0(Zr3z paramZr3z, Zvs paramZvs) {
    return ZS(paramZvs, paramZr3z);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztai.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */