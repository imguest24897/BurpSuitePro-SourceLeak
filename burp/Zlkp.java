package burp;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zlkp {
  public static Zgq<Zrdb> Zr(List<Zsje> paramList, Ze3n paramZe3n) {
    // Byte code:
    //   0: new burp/Zgq
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: invokeinterface isEmpty : ()Z
    //   14: ifne -> 35
    //   17: aload_0
    //   18: invokestatic ZI : (Ljava/util/List;)Ljava/util/Set;
    //   21: astore_3
    //   22: aload_3
    //   23: aload_2
    //   24: aload_1
    //   25: <illegal opcode> accept : (Lburp/Zgq;Lburp/Ze3n;)Ljava/util/function/Consumer;
    //   30: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   35: aload_2
    //   36: areturn
  }
  
  public static Zgq<Zrdb> ZG(List<Ztba> paramList, Ze3n paramZe3n) {
    // Byte code:
    //   0: new burp/Zgq
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: aload_1
    //   10: aload_2
    //   11: <illegal opcode> accept : (Lburp/Ze3n;Lburp/Zgq;)Ljava/util/function/Consumer;
    //   16: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   21: aload_2
    //   22: areturn
  }
  
  private static Zx_5 Zi(Ze3n paramZe3n, String paramString, Zvow paramZvow) {
    return new Zx_5(Zzu2.VULNERABLE_JAVASCRIPT_DEPENDENCY, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.PERVASIVE_ISSUE_IDENTIFIER, paramString) }), Collections.singletonList(new Zrn_(paramZvow, Set.of(paramString))), (byte)1, (byte)2, paramZe3n.Za(), paramZe3n.ZA().ZF().Zd4(), null);
  }
  
  private static List<Ztu8> Zo(Ztu8 paramZtu8, List<Ztu8> paramList) {
    return (List<Ztu8>)paramList.stream().filter(paramZtu8::lambda$findDuplicatedScriptTags$2).collect(Collectors.toList());
  }
  
  private static Set<Zsje> ZI(List<Zsje> paramList) {
    return new HashSet<>(paramList);
  }
  
  private static boolean Zd(List<Zsje> paramList) {
    return (ZI(paramList).size() == 1);
  }
  
  public static Zgq<Zrdb> ZR(List<Zxf> paramList, Ze3n paramZe3n, List<Ztu8> paramList1) {
    // Byte code:
    //   0: new burp/Zgq
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: aload_0
    //   9: aload_2
    //   10: aload_1
    //   11: aload_3
    //   12: <illegal opcode> accept : (Ljava/util/List;Lburp/Ze3n;Lburp/Zgq;)Ljava/util/function/Consumer;
    //   17: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   22: aload_3
    //   23: areturn
  }
  
  private static void lambda$getIssues$4(List<Ztu8> paramList, Ze3n paramZe3n, Zgq paramZgq, Zxf paramZxf) {
    List<Zsje> list = paramZxf.Zn();
    Zuh.Zb(Zd(list), Zqf.Zr);
    String str = ((Zsje)list.get(0)).ZI();
    List<Zl1r> list1 = (List)Zo(paramZxf.Zm(), paramList).stream().map(Zlkp::lambda$getIssues$3).collect(Collectors.toList());
    Zvow zvow = paramZe3n.Zt().Z_(list1);
    paramZgq.Zu(Zi(paramZe3n, str, zvow));
  }
  
  private static Zl1r lambda$getIssues$3(Ztu8 paramZtu8) {
    return new Zl1r(paramZtu8.ZlK(), paramZtu8.Zli());
  }
  
  private static boolean lambda$findDuplicatedScriptTags$2(Ztu8 paramZtu81, Ztu8 paramZtu82) {
    return paramZtu81.Zlr().equals(paramZtu82.Zlr());
  }
  
  private static void lambda$createIssuesFromJavaScriptAuditItemFoundByContent$1(Ze3n paramZe3n, Zgq paramZgq, Ztba paramZtba) {
    List<Zsje> list = paramZtba.ZO();
    Zuh.Zb(Zd(list), Zqf.Zr);
    String str = ((Zsje)list.get(0)).ZI();
    List<Zl1r> list1 = Collections.singletonList(new Zl1r(paramZtba.ZT(), paramZtba.ZI()));
    Zvow zvow = paramZe3n.Zt().Z_(list1);
    paramZgq.Zu(Zi(paramZe3n, str, zvow));
  }
  
  private static void lambda$createIssuesFromJavaScriptAuditItem$0(Zgq paramZgq, Ze3n paramZe3n, Zsje paramZsje) {
    paramZgq.Zu(Zi(paramZe3n, paramZsje.ZI(), paramZe3n.Zt()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlkp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */