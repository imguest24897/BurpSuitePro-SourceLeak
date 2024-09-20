package burp;

import burp.api.montoya.collaborator.Collaborator;
import burp.api.montoya.collaborator.CollaboratorClient;
import burp.api.montoya.collaborator.CollaboratorPayload;
import burp.api.montoya.collaborator.CollaboratorPayloadGenerator;
import burp.api.montoya.collaborator.PayloadOption;
import burp.api.montoya.collaborator.SecretKey;
import java.util.Arrays;
import java.util.Optional;

class Zdc implements Collaborator {
  private final Zlxz ZE;
  
  private final Zkam Zu;
  
  private final Zgb6 Zy;
  
  private final Zbnt Zo;
  
  private final Zr_4 Zn;
  
  private final Zskl ZL;
  
  private static final String a;
  
  Zdc(Zlxz paramZlxz, Zkam paramZkam, Zgb6 paramZgb6, Zbnt paramZbnt, Zr_4 paramZr_4, Zskl paramZskl) {
    this.ZE = paramZlxz;
    this.Zu = paramZkam;
    this.Zy = paramZgb6;
    this.Zo = paramZbnt;
    this.Zn = paramZr_4;
    this.ZL = paramZskl;
  }
  
  public CollaboratorClient createClient() {
    Zbu5 zbu5 = this.ZE.ZU();
    return ZT(zbu5);
  }
  
  public CollaboratorClient restoreClient(SecretKey paramSecretKey) {
    Optional<Zmtq> optional = Zblx.Zm(paramSecretKey, this.Zn);
    Zmtq zmtq = optional.<Throwable>orElseThrow(Zdc::lambda$restoreClient$0);
    Zbu5 zbu5 = this.ZE.Zn(zmtq);
    return ZT(zbu5);
  }
  
  public CollaboratorPayloadGenerator defaultPayloadGenerator() {
    return this::lambda$defaultPayloadGenerator$2;
  }
  
  private Zegb ZT(Zbu5 paramZbu5) {
    Zzuu zzuu = new Zzuu(paramZbu5.Zt, paramZbu5.Zj, paramZbu5.ZG.ZI(), paramZbu5.ZH, this.Zo, this.ZL);
    return new Zegb(paramZbu5.ZH, zzuu);
  }
  
  private CollaboratorPayload lambda$defaultPayloadGenerator$2(PayloadOption[] paramArrayOfPayloadOption) {
    String str1 = this.Zu.Zd(false);
    boolean bool = Arrays.<PayloadOption>stream(paramArrayOfPayloadOption).noneMatch(Zdc::lambda$defaultPayloadGenerator$1);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    String str2 = bool ? (new Zg13(this.Zy)).ZZ() : "";
    return new Ze4t(str2, str1);
  }
  
  private static boolean lambda$defaultPayloadGenerator$1(PayloadOption paramPayloadOption) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramPayloadOption == PayloadOption.WITHOUT_SERVER_LOCATION);
  }
  
  private static IllegalArgumentException lambda$restoreClient$0() {
    return new IllegalArgumentException(a);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #32
    //   2: ldc '=2t\\nF1tF)LxF,Lg\\n+Y'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zdc.a : Ljava/lang/String;
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
    //   80: bipush #78
    //   82: goto -> 112
    //   85: bipush #70
    //   87: goto -> 112
    //   90: bipush #98
    //   92: goto -> 112
    //   95: bipush #65
    //   97: goto -> 112
    //   100: bipush #87
    //   102: goto -> 112
    //   105: bipush #76
    //   107: goto -> 112
    //   110: bipush #49
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zdc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */