package burp;

import burp.api.montoya.http.message.responses.HttpResponse;
import java.util.List;

public class Zmc7 implements IResponseInfo {
  private final HttpResponse ZS;
  
  private final List<String> ZU;
  
  private final List<ICookie> ZR;
  
  private static final String a;
  
  public static IResponseInfo ZM(HttpResponse paramHttpResponse) {
    return new Zkdm(new Zmc7(paramHttpResponse));
  }
  
  private Zmc7(HttpResponse paramHttpResponse) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZB : ()[Ljava/lang/String;
    //   7: aload_0
    //   8: aload_1
    //   9: putfield ZS : Lburp/api/montoya/http/message/responses/HttpResponse;
    //   12: astore_2
    //   13: aload_1
    //   14: invokeinterface headers : ()Ljava/util/List;
    //   19: ifnonnull -> 31
    //   22: aload_0
    //   23: aconst_null
    //   24: putfield ZU : Ljava/util/List;
    //   27: aload_2
    //   28: ifnull -> 134
    //   31: aload_0
    //   32: new java/util/ArrayList
    //   35: dup
    //   36: invokespecial <init> : ()V
    //   39: putfield ZU : Ljava/util/List;
    //   42: getstatic burp/Zmc7.a : Ljava/lang/String;
    //   45: iconst_3
    //   46: anewarray java/lang/Object
    //   49: dup
    //   50: iconst_0
    //   51: aload_1
    //   52: invokeinterface httpVersion : ()Ljava/lang/String;
    //   57: aastore
    //   58: dup
    //   59: iconst_1
    //   60: aload_1
    //   61: invokeinterface statusCode : ()S
    //   66: invokestatic valueOf : (S)Ljava/lang/Short;
    //   69: aastore
    //   70: dup
    //   71: iconst_2
    //   72: aload_1
    //   73: invokeinterface reasonPhrase : ()Ljava/lang/String;
    //   78: aastore
    //   79: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   82: astore_3
    //   83: aload_0
    //   84: getfield ZU : Ljava/util/List;
    //   87: aload_3
    //   88: invokeinterface add : (Ljava/lang/Object;)Z
    //   93: pop
    //   94: aload_1
    //   95: invokeinterface headers : ()Ljava/util/List;
    //   100: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   105: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   110: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   115: aload_0
    //   116: getfield ZU : Ljava/util/List;
    //   119: dup
    //   120: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   123: pop
    //   124: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   129: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   134: aload_1
    //   135: invokeinterface cookies : ()Ljava/util/List;
    //   140: ifnonnull -> 152
    //   143: aload_0
    //   144: aconst_null
    //   145: putfield ZR : Ljava/util/List;
    //   148: aload_2
    //   149: ifnull -> 188
    //   152: aload_0
    //   153: aload_1
    //   154: invokeinterface cookies : ()Ljava/util/List;
    //   159: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   164: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   169: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   174: invokestatic toList : ()Ljava/util/stream/Collector;
    //   177: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   182: checkcast java/util/List
    //   185: putfield ZR : Ljava/util/List;
    //   188: return
  }
  
  public List<String> getHeaders() {
    return this.ZU;
  }
  
  public int getBodyOffset() {
    return this.ZS.bodyOffset();
  }
  
  public short getStatusCode() {
    return this.ZS.statusCode();
  }
  
  public List<ICookie> getCookies() {
    return this.ZR;
  }
  
  public String getStatedMimeType() {
    return Zk8m.Zz(Ztc3.Zv(this.ZS.statedMimeType()));
  }
  
  public String getInferredMimeType() {
    return Zk8m.Zz(Ztc3.Zv(this.ZS.inferredMimeType()));
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: ldc 'W"#_B'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zmc7.a : Ljava/lang/String;
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
    //   80: bipush #39
    //   82: goto -> 112
    //   85: bipush #112
    //   87: goto -> 112
    //   90: bipush #46
    //   92: goto -> 112
    //   95: bipush #100
    //   97: goto -> 112
    //   100: bipush #71
    //   102: goto -> 112
    //   105: bipush #21
    //   107: goto -> 112
    //   110: bipush #108
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmc7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */