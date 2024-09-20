package burp;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zip implements Zk5_ {
  public final Zb2y ZU;
  
  public final String Zu;
  
  private static int ZI;
  
  public Zip(Zb2y paramZb2y, String paramString) {
    this.ZU = paramZb2y;
    this.Zu = paramString;
  }
  
  public void ZC() {
    int i = ZG();
    try {
      if (this.ZU.ZC().isPresent()) {
        try {
          Zm2.ZC(Zrrh.INTRUDER_RESOURCE_POOLS_CONFIG_USE_EXISTING_SELECTED);
          if (i == 0) {
            Zm2.ZC(Zrrh.INTRUDER_RESOURCE_POOLS_CONFIG_CREATE_NEW_SELECTED);
            this.ZU.ZA().ifPresent(this::lambda$reportTelemetry$0);
            return;
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    Zm2.ZC(Zrrh.INTRUDER_RESOURCE_POOLS_CONFIG_CREATE_NEW_SELECTED);
    this.ZU.ZA().ifPresent(this::lambda$reportTelemetry$0);
  }
  
  private void ZW(Ztwh paramZtwh) {
    int i = ZG();
    try {
      if (paramZtwh.Zw()) {
        try {
          Zm2.ZC(Zrrh.INTRUDER_RESOURCE_POOLS_CONFIG_MAX_CONCURRENT_REQUESTS_ENABLED);
          Zm2.Zi(Zv8r.INTRUDER_RESOURCE_POOLS_CONFIG_NUMBER_OF_MAXIMUM_CONCURRENT_REQUESTS, paramZtwh.ZY());
          if (i == 0) {
            Zm2.ZC(Zrrh.INTRUDER_RESOURCE_POOLS_CONFIG_MAX_CONCURRENT_REQUESTS_DISABLED);
            return;
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    Zm2.ZC(Zrrh.INTRUDER_RESOURCE_POOLS_CONFIG_MAX_CONCURRENT_REQUESTS_DISABLED);
  }
  
  private void ZH(Ztwh paramZtwh) {
    // Byte code:
    //   0: invokestatic ZK : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: invokevirtual ZK : ()Z
    //   8: ifeq -> 76
    //   11: getstatic burp/Zrrh.INTRUDER_RESOURCE_POOLS_CONFIG_DELAY_BETWEEN_REQUESTS_ENABLED : Lburp/Zrrh;
    //   14: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   17: getstatic burp/Zv8r.INTRUDER_RESOURCE_POOLS_CONFIG_DELAY_BETWEEN_REQUESTS_DURATION_MS : Lburp/Zv8r;
    //   20: aload_1
    //   21: invokevirtual Zf : ()I
    //   24: i2l
    //   25: invokestatic Zi : (Lnet/portswigger/Zzr;J)V
    //   28: aload_1
    //   29: invokevirtual Zy : ()Z
    //   32: ifeq -> 59
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   41: athrow
    //   42: getstatic burp/Zrrh.INTRUDER_RESOURCE_POOLS_CONFIG_ADD_RANDOM_VARIATIONS_ENABLED : Lburp/Zrrh;
    //   45: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   48: iload_2
    //   49: ifeq -> 89
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   58: athrow
    //   59: getstatic burp/Zrrh.INTRUDER_RESOURCE_POOLS_CONFIG_ADD_RANDOM_VARIATIONS_DISABLED : Lburp/Zrrh;
    //   62: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   65: iload_2
    //   66: ifeq -> 89
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   75: athrow
    //   76: getstatic burp/Zrrh.INTRUDER_RESOURCE_POOLS_CONFIG_DELAY_BETWEEN_REQUESTS_DISABLED : Lburp/Zrrh;
    //   79: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: return
    // Exception table:
    //   from	to	target	type
    //   4	35	38	java/lang/NumberFormatException
    //   11	52	55	java/lang/NumberFormatException
    //   42	69	72	java/lang/NumberFormatException
    //   59	82	85	java/lang/NumberFormatException
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    // Byte code:
    //   0: invokestatic ZG : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZU : Lburp/Zb2y;
    //   8: invokevirtual ZC : ()Ljava/util/Optional;
    //   11: astore_3
    //   12: aload_3
    //   13: invokevirtual isPresent : ()Z
    //   16: ifeq -> 44
    //   19: aload_1
    //   20: aload_3
    //   21: invokevirtual get : ()Ljava/lang/Object;
    //   24: checkcast java/lang/Integer
    //   27: invokevirtual intValue : ()I
    //   30: invokestatic ZR : (Lburp/Zs4f;I)V
    //   33: iload_2
    //   34: ifne -> 80
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   43: athrow
    //   44: aload_0
    //   45: getfield ZU : Lburp/Zb2y;
    //   48: invokevirtual ZA : ()Ljava/util/Optional;
    //   51: astore #4
    //   53: aload #4
    //   55: invokevirtual isPresent : ()Z
    //   58: ifeq -> 80
    //   61: aload_1
    //   62: aload #4
    //   64: invokevirtual get : ()Ljava/lang/Object;
    //   67: checkcast burp/Ztwh
    //   70: invokestatic Zc : (Lburp/Zs4f;Lburp/Ztwh;)V
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: return
    // Exception table:
    //   from	to	target	type
    //   12	37	40	java/io/IOException
    //   53	73	76	java/io/IOException
  }
  
  public static Zip Zl(Map<String, String> paramMap) {
    // Byte code:
    //   0: aload_0
    //   1: getstatic burp/Zxga.USE_EXISTING_RESOURCE_POOL_ENABLED : Lburp/Zxga;
    //   4: getfield key : Ljava/lang/String;
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast java/lang/String
    //   15: astore_2
    //   16: invokestatic ZK : ()I
    //   19: invokestatic ZX : ()Lburp/Zb2y;
    //   22: astore_3
    //   23: istore_1
    //   24: aload_2
    //   25: ifnull -> 37
    //   28: aload_0
    //   29: invokestatic Zo : (Ljava/util/Map;)Lburp/Zb2y;
    //   32: astore_3
    //   33: iload_1
    //   34: ifeq -> 64
    //   37: aload_0
    //   38: getstatic burp/Zxga.CREATE_NEW_RESOURCE_POOL_ENABLED : Lburp/Zxga;
    //   41: getfield key : Ljava/lang/String;
    //   44: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   49: checkcast java/lang/String
    //   52: astore #4
    //   54: aload #4
    //   56: ifnull -> 64
    //   59: aload_0
    //   60: invokestatic Zv : (Ljava/util/Map;)Lburp/Zb2y;
    //   63: astore_3
    //   64: new burp/Zip
    //   67: dup
    //   68: aload_3
    //   69: aconst_null
    //   70: invokespecial <init> : (Lburp/Zb2y;Ljava/lang/String;)V
    //   73: areturn
  }
  
  private static Zb2y Zo(Map<String, String> paramMap) {
    boolean bool;
    String str = paramMap.get(Zxga.EXISTING_SELECTED_RESOURCE_POOL_ID.key);
    try {
      bool = Integer.parseInt(str);
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.UNEXPECTED);
      bool = false;
    } 
    return Zb2y.Zs(bool);
  }
  
  private static Zb2y Zv(Map<String, String> paramMap) {
    return Zb2y.ZP(paramMap.get(Zxga.NEW_RESOURCE_POOL_NAME.key), Boolean.parseBoolean(paramMap.get(Zxga.NEW_RESOURCE_POOL_MAX_CONCURRENT_REQUESTS_ENABLED.key)), ZG(paramMap.get(Zxga.NEW_RESOURCE_POOL_MAX_CONCURRENT_REQUESTS.key)), Boolean.parseBoolean(paramMap.get(Zxga.NEW_RESOURCE_POOL_DELAY_BETWEEN_REQUESTS_ENABLED.key)), ZG(paramMap.get(Zxga.NEW_RESOURCE_POOL_DELAY_BETWEEN_REQUESTS.key)), Boolean.parseBoolean(paramMap.get(Zxga.NEW_RESOURCE_POOL_DELAY_ADD_RANDOM_VARIATIONS.key)), Boolean.parseBoolean(paramMap.get(Zxga.NEW_RESOURCE_POOL_DELAY_INCREMENT_ENABLED.key)), ZG(paramMap.get(Zxga.NEW_RESOURCE_POOL_DELAY_INCREMENT.key)), Boolean.parseBoolean(paramMap.get(Zxga.NEW_RESOURCE_POOL_AUTO_BACKOFF.key)), Boolean.parseBoolean(paramMap.get(Zxga.NEW_RESOURCE_POOL_AUTO_BACKOFF_AFTER_429_STATUS_RETURNED.key)), Boolean.parseBoolean(paramMap.get(Zxga.NEW_RESOURCE_POOL_AUTO_BACKOFF_AFTER_503_STATUS_RETURNED.key)), Boolean.parseBoolean(paramMap.get(Zxga.NEW_RESOURCE_POOL_CUSTOM_AUTO_BACKOFF_STATUS_CODES_ENABLED.key)), Zc(paramMap.get(Zxga.NEW_RESOURCE_POOL_CUSTOM_AUTO_BACKOFF_STATUS_CODES.key)));
  }
  
  private static int ZG(String paramString) {
    try {
      return Integer.parseInt(paramString);
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.UNEXPECTED);
      return 0;
    } 
  }
  
  private static List<Integer> Zc(String paramString) {
    paramString = paramString.replace("[", "").replace("]", "").replace(" ", "");
    return Arrays.<String>stream(paramString.split(",")).toList().stream().map(Integer::parseInt).toList();
  }
  
  private static void ZR(Zs4f paramZs4f, int paramInt) throws IOException {
    ZF(paramZs4f, Zxga.USE_EXISTING_RESOURCE_POOL_ENABLED.key, String.valueOf(true));
    ZF(paramZs4f, Zxga.EXISTING_SELECTED_RESOURCE_POOL_ID.key, String.valueOf(paramInt));
  }
  
  private static void Zc(Zs4f paramZs4f, Ztwh paramZtwh) throws IOException {
    ZF(paramZs4f, Zxga.CREATE_NEW_RESOURCE_POOL_ENABLED.key, String.valueOf(true));
    ZF(paramZs4f, Zxga.NEW_RESOURCE_POOL_NAME.key, paramZtwh.Zz());
    ZF(paramZs4f, Zxga.NEW_RESOURCE_POOL_MAX_CONCURRENT_REQUESTS_ENABLED.key, String.valueOf(paramZtwh.Zw()));
    ZF(paramZs4f, Zxga.NEW_RESOURCE_POOL_MAX_CONCURRENT_REQUESTS.key, String.valueOf(paramZtwh.ZY()));
    ZF(paramZs4f, Zxga.NEW_RESOURCE_POOL_DELAY_BETWEEN_REQUESTS_ENABLED.key, String.valueOf(paramZtwh.ZK()));
    ZF(paramZs4f, Zxga.NEW_RESOURCE_POOL_DELAY_BETWEEN_REQUESTS.key, String.valueOf(paramZtwh.Zf()));
    ZF(paramZs4f, Zxga.NEW_RESOURCE_POOL_DELAY_ADD_RANDOM_VARIATIONS.key, String.valueOf(paramZtwh.Zy()));
    ZF(paramZs4f, Zxga.NEW_RESOURCE_POOL_DELAY_INCREMENT_ENABLED.key, String.valueOf(paramZtwh.Zm()));
    ZF(paramZs4f, Zxga.NEW_RESOURCE_POOL_DELAY_INCREMENT.key, String.valueOf(paramZtwh.ZB()));
    ZF(paramZs4f, Zxga.NEW_RESOURCE_POOL_AUTO_BACKOFF.key, String.valueOf(paramZtwh.Zc()));
    ZF(paramZs4f, Zxga.NEW_RESOURCE_POOL_AUTO_BACKOFF_AFTER_429_STATUS_RETURNED.key, String.valueOf(paramZtwh.ZW()));
    ZF(paramZs4f, Zxga.NEW_RESOURCE_POOL_AUTO_BACKOFF_AFTER_503_STATUS_RETURNED.key, String.valueOf(paramZtwh.ZQ()));
    ZF(paramZs4f, Zxga.NEW_RESOURCE_POOL_CUSTOM_AUTO_BACKOFF_STATUS_CODES_ENABLED.key, String.valueOf(paramZtwh.Zo()));
    ZF(paramZs4f, Zxga.NEW_RESOURCE_POOL_CUSTOM_AUTO_BACKOFF_STATUS_CODES.key, String.valueOf(paramZtwh.ZO()));
  }
  
  private static void ZF(Zs4f paramZs4f, String paramString1, String paramString2) throws IOException {
    paramZs4f.ZL(Zou.USER_INTERFACE_DETAIL_KEY.key, paramString1);
    paramZs4f.ZL(Zou.USER_INTERFACE_DETAIL_VALUE.key, paramString2);
  }
  
  private void lambda$reportTelemetry$0(Ztwh paramZtwh) {
    ZW(paramZtwh);
    ZH(paramZtwh);
  }
  
  public static void ZR(int paramInt) {
    ZI = paramInt;
  }
  
  public static int ZK() {
    return ZI;
  }
  
  public static int ZG() {
    int i = ZK();
    try {
      if (i == 0)
        return 24; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    if (ZG() == 0)
      ZR(73); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zip.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */