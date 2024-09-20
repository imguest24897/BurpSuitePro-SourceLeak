package burp;

import net.portswigger.Zm2;

public class Ztcg {
  public final Zsh8 ZN;
  
  private static final String a;
  
  public Ztcg(Zsh8 paramZsh8) {
    this.ZN = paramZsh8;
  }
  
  public void ZE() {
    Zd();
    Zi();
    Zl();
    Zr();
    ZX();
    ZN();
    Zz();
    ZI();
    Za();
    Zb();
    ZB();
    ZK();
  }
  
  private void ZK() {
    Zrp zrp = this.ZN.ZPH();
    if (!zrp.ZJG())
      Zm2.ZC(Zrrh.INTRUDER_OVERRIDE_PROJECT_HTTP_1_CONFIG_SETTING_DISABLED); 
  }
  
  private void ZB() {
    Zsh0 zsh0 = this.ZN.ZPY();
    if (zsh0.Zjo()) {
      Zm2.ZC(Zrrh.INTRUDER_OVERRIDE_PROJECT_HTTP_VERSION_SETTING);
      if (zsh0.Zj7())
        Zm2.ZC(Zrrh.INTRUDER_DEFAULT_HTTP2_IF_SERVER_SUPPORTS); 
    } 
  }
  
  private void Zl() {
    int i = Zxw4.Ze();
    if (this.ZN.ZPQ()) {
      Zm2.ZC(Zrrh.INTRUDER_OPTIONS_SAVE_ATTACK_TO_PROJECT_FILE_ENABLED);
      if (i == 0) {
        Zm2.ZC(Zrrh.INTRUDER_OPTIONS_SAVE_ATTACK_TO_PROJECT_FILE_DISABLED);
        return;
      } 
      return;
    } 
    Zm2.ZC(Zrrh.INTRUDER_OPTIONS_SAVE_ATTACK_TO_PROJECT_FILE_DISABLED);
  }
  
  private void ZN() {
    if (!this.ZN.ZPu())
      Zm2.ZC(Zrrh.INTRUDER_RESULTS_STORE_REQUESTS_DISABLED); 
    if (!this.ZN.ZP8())
      Zm2.ZC(Zrrh.INTRUDER_RESULTS_STORE_RESPONSES_DISABLED); 
    if (!this.ZN.ZPs())
      Zm2.ZC(Zrrh.INTRUDER_RESULTS_MAKE_BASELINE_REQUEST_DISABLED); 
    if (this.ZN.ZPn())
      Zm2.ZC(Zrrh.INTRUDER_RESULTS_DOS_MODE_ENABLED); 
    if (this.ZN.ZPh())
      Zm2.ZC(Zrrh.INTRUDER_RESULTS_STORE_FULL_PAYLOADS_ENABLED); 
  }
  
  private void ZX() {
    if (this.ZN.ZPD() != 3)
      Zm2.ZC(Zrrh.INTRUDER_OPTIONS_ENGINE_RETRIES_MODIFIED); 
    if (this.ZN.ZPP() != 2000)
      Zm2.ZC(Zrrh.INTRUDER_OPTIONS_ENGINE_PAUSE_BEFORE_RETRY_MODIFIED); 
  }
  
  private void Zr() {
    if (!this.ZN.ZPx())
      Zm2.ZC(Zrrh.INTRUDER_OPTIONS_HEADERS_UPDATE_CONTENT_LENGTH_DISABLED); 
    if (!this.ZN.ZP5())
      Zm2.ZC(Zrrh.INTRUDER_OPTIONS_HEADERS_SET_CONNECTION_HEADER_DISABLED); 
  }
  
  private void Zb() {
    // Byte code:
    //   0: invokestatic Zt : ()I
    //   3: istore_1
    //   4: getstatic burp/Zts.Zg : [I
    //   7: aload_0
    //   8: getfield ZN : Lburp/Zsh8;
    //   11: invokeinterface ZPM : ()Lburp/Zmae;
    //   16: invokevirtual ordinal : ()I
    //   19: iaload
    //   20: tableswitch default -> 86, 1 -> 52, 2 -> 56, 3 -> 66, 4 -> 76
    //   52: iload_1
    //   53: ifeq -> 105
    //   56: getstatic burp/Zrrh.INTRUDER_REDIRECTIONS_ON_SITE_ONLY : Lburp/Zrrh;
    //   59: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   62: iload_1
    //   63: ifeq -> 105
    //   66: getstatic burp/Zrrh.INTRUDER_REDIRECTIONS_IN_SCOPE_ONLY : Lburp/Zrrh;
    //   69: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   72: iload_1
    //   73: ifeq -> 105
    //   76: getstatic burp/Zrrh.INTRUDER_REDIRECTIONS_ALWAYS : Lburp/Zrrh;
    //   79: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   82: iload_1
    //   83: ifeq -> 105
    //   86: iconst_0
    //   87: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   90: aload_0
    //   91: getfield ZN : Lburp/Zsh8;
    //   94: invokeinterface ZPM : ()Lburp/Zmae;
    //   99: getfield displayName : Ljava/lang/String;
    //   102: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   105: aload_0
    //   106: getfield ZN : Lburp/Zsh8;
    //   109: invokeinterface ZPj : ()Z
    //   114: ifeq -> 123
    //   117: getstatic burp/Zrrh.INTRUDER_REDIRECTIONS_PROCESS_COOKIES_IN_REDIRECTIONS : Lburp/Zrrh;
    //   120: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   123: return
  }
  
  private void Za() {
    if (this.ZN.ZP_() != null && this.ZN.ZP_().ZvO()) {
      Zm2.ZC(Zrrh.INTRUDER_GREP_PAYLOADS_USED);
      if (this.ZN.ZP_().Zvp())
        Zm2.ZC(Zrrh.INTRUDER_GREP_PAYLOADS_CASE_SENSITIVE); 
      if (this.ZN.ZP_().Zva())
        Zm2.ZC(Zrrh.INTRUDER_GREP_PAYLOADS_EXCLUDE_HEADERS); 
      if (!this.ZN.ZP_().ZvF())
        Zm2.ZC(Zrrh.INTRUDER_GREP_PAYLOADS_MATCH_AGAINST_PRE_ENCODED_PAYLOADS_DISABLED); 
    } 
  }
  
  private void ZI() {
    if (this.ZN.ZP_() != null && this.ZN.ZP_().Zv_()) {
      Zm2.ZC(Zrrh.INTRUDER_GREP_EXTRACT_USED);
      if (this.ZN.ZP_().Zvf() != 100)
        Zm2.ZC(Zrrh.INTRUDER_GREP_EXTRACT_MAX_CAPTURE_LENGTH_MODIFIED); 
    } 
  }
  
  private void Zz() {
    if (this.ZN.ZP_() != null && this.ZN.ZP_().Zvz()) {
      Zm2.ZC(Zrrh.INTRUDER_GREP_MATCH_USED);
      if (this.ZN.ZP_().Zvc())
        Zm2.ZC(Zrrh.INTRUDER_GREP_MATCH_REGEX); 
      if (this.ZN.ZP_().Zvd())
        Zm2.ZC(Zrrh.INTRUDER_GREP_MATCH_CASE_SENSITIVE); 
      if (!this.ZN.ZP_().Zvg())
        Zm2.ZC(Zrrh.INTRUDER_GREP_MATCH_INCLUDE_HEADERS); 
    } 
  }
  
  private void Zd() {
    Zm2.Zo((this.ZN.ZPa()).counterType);
  }
  
  private void Zi() {
    // Byte code:
    //   0: invokestatic Zt : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield ZN : Lburp/Zsh8;
    //   8: invokeinterface ZPq : ()Lburp/Zrte;
    //   13: ifnull -> 144
    //   16: aload_0
    //   17: getfield ZN : Lburp/Zsh8;
    //   20: invokeinterface ZPq : ()Lburp/Zrte;
    //   25: invokeinterface iterator : ()Ljava/util/Iterator;
    //   30: astore_2
    //   31: aload_2
    //   32: invokeinterface hasNext : ()Z
    //   37: ifeq -> 144
    //   40: aload_2
    //   41: invokeinterface next : ()Ljava/lang/Object;
    //   46: checkcast burp/Ze9k
    //   49: astore_3
    //   50: aload_3
    //   51: ifnonnull -> 57
    //   54: goto -> 31
    //   57: aload_3
    //   58: invokeinterface Zyi : ()Lburp/Zzvm;
    //   63: aload_3
    //   64: invokevirtual ZM : (Lburp/Ze9k;)V
    //   67: aload_3
    //   68: invokeinterface Zyn : ()Lburp/Zm41;
    //   73: astore #4
    //   75: aload #4
    //   77: ifnull -> 140
    //   80: aload #4
    //   82: invokeinterface ZN : ()I
    //   87: ifle -> 96
    //   90: getstatic burp/Zrrh.INTRUDER_PAYLOAD_PROCSSING_RULES_USED : Lburp/Zrrh;
    //   93: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   96: aload #4
    //   98: invokeinterface Zc : ()[B
    //   103: astore #5
    //   105: aload #5
    //   107: ifnonnull -> 120
    //   110: getstatic burp/Zrrh.INTRUDER_PAYLOAD_ENCODING_URL_ENCODE_DISABLED : Lburp/Zrrh;
    //   113: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   116: iload_1
    //   117: ifeq -> 140
    //   120: getstatic burp/Ztcg.a : Ljava/lang/String;
    //   123: aload #5
    //   125: invokestatic ZG : ([B)Ljava/lang/String;
    //   128: invokevirtual equals : (Ljava/lang/Object;)Z
    //   131: ifne -> 140
    //   134: getstatic burp/Zrrh.INTRUDER_PAYLOAD_ENCODING_URL_ENCODE_CHARACTERS_MODIFIED : Lburp/Zrrh;
    //   137: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   140: iload_1
    //   141: ifeq -> 31
    //   144: return
  }
  
  static {
    // Byte code:
    //   0: bipush #107
    //   2: ldc '3yN}=%",|G;#>h*`:'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztcg.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #120
    //   82: goto -> 112
    //   85: bipush #60
    //   87: goto -> 112
    //   90: bipush #10
    //   92: goto -> 112
    //   95: bipush #74
    //   97: goto -> 112
    //   100: bipush #107
    //   102: goto -> 112
    //   105: bipush #114
    //   107: goto -> 112
    //   110: bipush #119
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztcg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */