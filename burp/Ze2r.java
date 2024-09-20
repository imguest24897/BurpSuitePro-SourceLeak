package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Ze2r implements IBurpCollaboratorClientContext {
  private final Zg13 Zx;
  
  private final Zzgk Zi;
  
  private final Zg1t ZR;
  
  private final Zxnl Zl;
  
  private static final String a;
  
  public static IBurpCollaboratorClientContext ZG(Zbu5 paramZbu5, Zxnl paramZxnl) {
    return new Zs42(new Ze2r(paramZbu5.ZH, paramZbu5.Zt, paramZbu5.Zj, paramZxnl));
  }
  
  private Ze2r(Zg13 paramZg13, Zzgk paramZzgk, Zg1t paramZg1t, Zxnl paramZxnl) {
    this.Zx = paramZg13;
    this.Zi = paramZzgk;
    this.ZR = paramZg1t;
    this.Zl = paramZxnl;
  }
  
  public String generatePayload(boolean paramBoolean) {
    Zh();
    try {
      return this.Zi.ZY(1, "", paramBoolean);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return null;
    } 
  }
  
  public List<IBurpCollaboratorInteraction> fetchAllCollaboratorInteractions() {
    Zh();
    try {
      return Zm(this.ZR.Zv());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return Collections.emptyList();
    } 
  }
  
  public List<IBurpCollaboratorInteraction> fetchCollaboratorInteractionsFor(String paramString) {
    Zh();
    try {
      return Zm(this.ZR.Zr(paramString));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return Collections.emptyList();
    } 
  }
  
  public List<IBurpCollaboratorInteraction> fetchAllInfiltratorInteractions() {
    Zh();
    try {
      return Zm(this.ZR.ZG());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return Collections.emptyList();
    } 
  }
  
  public List<IBurpCollaboratorInteraction> fetchInfiltratorInteractionsFor(String paramString) {
    Zh();
    return Zm(this.ZR.ZD(paramString));
  }
  
  public String getCollaboratorServerLocation() {
    Zh();
    try {
      return this.Zx.ZZ();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return null;
    } 
  }
  
  private void Zh() {
    try {
      if (!this.Zx.ZA())
        throw new IllegalStateException(a); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private List<IBurpCollaboratorInteraction> Zm(List<Zer0> paramList) {
    return this.Zl.Zw(paramList);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #109
    //   2: ldc '+z>Rt=Ec-@;\\fK`>=\\r\\n\\rf?C6O\\r/%Lt\\nB\\f/P;O\\n{lM$\\nCa?'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ze2r.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_4
    //   81: goto -> 111
    //   84: bipush #98
    //   86: goto -> 111
    //   89: bipush #33
    //   91: goto -> 111
    //   94: bipush #79
    //   96: goto -> 111
    //   99: bipush #57
    //   101: goto -> 111
    //   104: bipush #19
    //   106: goto -> 111
    //   109: bipush #71
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze2r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */