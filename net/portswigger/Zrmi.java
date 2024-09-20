package net.portswigger;

import java.util.stream.Stream;

public class Zrmi {
  static String Zt(Zid paramZid, Zav paramZav, String paramString) {
    String str = paramZid.ZU(paramString).Zk();
    return Zlz.Zr(str) ? str : (Zw(paramZav) ? Zu1.PLAIN.ZF() : (Zf(paramZav) ? Zu1.JSON.ZF() : (ZP(paramZav) ? Zu1.OCTET_STREAM.ZF() : Zu1.UNKNOWN.ZF())));
  }
  
  static boolean Zf(Zav paramZav) {
    return (paramZav.Zg() == Ziq.OBJECT || (paramZav.Zg() == Ziq.ARRAY && ((Boolean)paramZav.Zi().values().stream().map(Zrmi::lambda$isComplexValueOrArrayOfComplexValues$0).reduce(Zrmi::lambda$isComplexValueOrArrayOfComplexValues$1).orElse(Boolean.valueOf(false))).booleanValue()));
  }
  
  static boolean ZP(Zav paramZav) {
    return (paramZav.Zg() == Ziq.STRING && Zo(paramZav.ZD(), new Zrms[] { Zrms.BINARY, Zrms.BINARY }));
  }
  
  static boolean Zw(Zav paramZav) {
    Ziq[] arrayOfZiq = { Ziq.BOOLEAN, Ziq.INTEGER, Ziq.NUMBER };
    return (Zo(paramZav.Zg(), arrayOfZiq) || (paramZav.Zg() == Ziq.STRING && !Zo(paramZav.ZD(), new Zrms[] { Zrms.BINARY, Zrms.BINARY })) || (paramZav.Zg() == Ziq.ARRAY && ((Boolean)paramZav.Zi().values().stream().map(arrayOfZiq::lambda$isPrimitiveOrArrayOfPrimitives$2).reduce(Zrmi::lambda$isPrimitiveOrArrayOfPrimitives$3).orElse(Boolean.valueOf(false))).booleanValue()));
  }
  
  static <T> boolean Zo(T paramT, T... paramVarArgs) {
    return ((Boolean)Stream.<T>of(paramVarArgs).map(paramT::lambda$inList$4).reduce(Zrmi::lambda$inList$5).orElse(Boolean.valueOf(false))).booleanValue();
  }
  
  private static Boolean lambda$inList$5(Boolean paramBoolean1, Boolean paramBoolean2) {
    return Boolean.valueOf((paramBoolean1.booleanValue() || paramBoolean2.booleanValue()));
  }
  
  private static Boolean lambda$inList$4(Object paramObject1, Object paramObject2) {
    return Boolean.valueOf((paramObject2 == paramObject1));
  }
  
  private static Boolean lambda$isPrimitiveOrArrayOfPrimitives$3(Boolean paramBoolean1, Boolean paramBoolean2) {
    return Boolean.valueOf((paramBoolean1.booleanValue() && paramBoolean2.booleanValue()));
  }
  
  private static Boolean lambda$isPrimitiveOrArrayOfPrimitives$2(Ziq[] paramArrayOfZiq, Zoc paramZoc) {
    return Boolean.valueOf(Zo(paramZoc.ZF().Zg(), paramArrayOfZiq));
  }
  
  private static Boolean lambda$isComplexValueOrArrayOfComplexValues$1(Boolean paramBoolean1, Boolean paramBoolean2) {
    return Boolean.valueOf((paramBoolean1.booleanValue() && paramBoolean2.booleanValue()));
  }
  
  private static Boolean lambda$isComplexValueOrArrayOfComplexValues$0(Zoc paramZoc) {
    return Boolean.valueOf(Zo(paramZoc.ZF().Zg(), new Ziq[] { Ziq.OBJECT, Ziq.ARRAY }));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrmi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */