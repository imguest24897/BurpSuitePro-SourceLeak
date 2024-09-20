package burp;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.swing.Icon;
import net.portswigger.javatooling.api.CompletionProposal;
import net.portswigger.javatooling.api.Flag;
import net.portswigger.javatooling.api.Parameter;
import net.portswigger.javatooling.api.Range;
import org.jetbrains.annotations.NotNull;

public class Zte9 {
  static final Icon ZX = Ze3m.ZC(Zeuf.EMPTY, Zlkk.FOREGROUND).ZU(Zmcx.LINE_SIZE).Z_();
  
  static final Icon Zg = Ze3m.ZC(Zeuf.ABSTRACT_METHOD, Zlkk.JAVA_EDITOR_METHOD).ZU(Zmcx.LINE_SIZE).Z_();
  
  static final Icon Zq = Ze3m.ZC(Zeuf.METHOD, Zlkk.JAVA_EDITOR_METHOD).ZU(Zmcx.LINE_SIZE).Z_();
  
  static final Icon ZF = Ze3m.ZC(Zeuf.VARIABLE, Zlkk.JAVA_EDITOR_VARIABLE).ZU(Zmcx.LINE_SIZE).Z_();
  
  static final Icon Zd = Ze3m.ZC(Zeuf.CLASS, Zlkk.JAVA_EDITOR_CLASS).ZU(Zmcx.LINE_SIZE).Z_();
  
  static final Icon ZA = Ze3m.ZC(Zeuf.ABSTRACT_CLASS, Zlkk.JAVA_EDITOR_CLASS).ZU(Zmcx.LINE_SIZE).Z_();
  
  static final Icon ZW = Ze3m.ZC(Zeuf.EXCEPTION, Zlkk.JAVA_EDITOR_CLASS).ZU(Zmcx.LINE_SIZE).Z_();
  
  static final Icon ZM = Ze3m.ZC(Zeuf.INTERFACE, Zlkk.JAVA_EDITOR_INTERFACE).ZU(Zmcx.LINE_SIZE).Z_();
  
  static final Icon ZU = Ze3m.ZC(Zeuf.RECORD, Zlkk.JAVA_EDITOR_CLASS).ZU(Zmcx.LINE_SIZE).Z_();
  
  static final Icon Zm = Ze3m.ZC(Zeuf.ENUM, Zlkk.JAVA_EDITOR_CLASS).ZU(Zmcx.LINE_SIZE).Z_();
  
  static final Icon Za = Ze3m.ZC(Zeuf.ANNOTATION, Zlkk.JAVA_EDITOR_INTERFACE).ZU(Zmcx.LINE_SIZE).Z_();
  
  static final Icon ZE = Ze3m.ZC(Zeuf.FIELD, Zlkk.JAVA_EDITOR_VARIABLE).ZU(Zmcx.LINE_SIZE).Z_();
  
  static final Icon Zt = Ze3m.ZC(Zeuf.PACKAGE, Zlkk.JAVA_EDITOR_PACKAGE).ZU(Zmcx.LINE_SIZE).Z_();
  
  static final Icon ZI = Ze3m.ZC(Zeuf.LAMBDA, Zlkk.JAVA_EDITOR_METHOD).ZU(Zmcx.LINE_SIZE).Z_();
  
  static Zmy1 ZP(Zlqb paramZlqb, CompletionProposal paramCompletionProposal, Zgk paramZgk) {
    Zghd zghd = Zw(paramZlqb, paramCompletionProposal, paramZgk);
    zghd.Zx(paramCompletionProposal.relevance());
    zghd.Zn(ZF(paramCompletionProposal));
    boolean bool = Zew6.ZS();
    Range range = paramCompletionProposal.replacementRange();
    zghd.Zo(new Zmh_(range.startIndex(), range.endIndex()));
    if (Zbqc.Zwu() == null)
      Zew6.Zb(!bool); 
    return zghd;
  }
  
  private static Zghd Zw(Zlqb paramZlqb, CompletionProposal paramCompletionProposal, Zgk paramZgk) {
    Supplier<String> supplier = paramZgk.Zo(paramCompletionProposal);
    switch (Zbfe.Zh[paramCompletionProposal.kind().ordinal()]) {
      case 1:
      
      case 2:
      
      case 3:
      
      case 4:
      case 5:
      case 6:
      
      case 7:
      case 8:
      
    } 
    return new Zghg(paramZlqb, paramCompletionProposal.completion(), null, supplier, Zu(paramCompletionProposal));
  }
  
  private static Zgh5 Zf(Zlqb paramZlqb, CompletionProposal paramCompletionProposal, Supplier<String> paramSupplier) {
    Zgh5 zgh5 = new Zgh5(paramZlqb, paramCompletionProposal.name(), paramCompletionProposal.signature().type(), paramSupplier, Zu(paramCompletionProposal));
    zgh5.ZA((List<Zzat>)paramCompletionProposal.signature().parameters().stream().map(Zte9::Zd).collect(Collectors.toList()));
    return zgh5;
  }
  
  @NotNull
  private static List<Zecn> Zu(CompletionProposal paramCompletionProposal) {
    return paramCompletionProposal.flags().stream().filter(Zte9::lambda$getCompletionAttributes$0).map(Zte9::lambda$getCompletionAttributes$1).toList();
  }
  
  private static Zg7o Zx(Zlqb paramZlqb, CompletionProposal paramCompletionProposal, Supplier<String> paramSupplier) {
    Zg7o zg7o = new Zg7o(paramZlqb, " " + paramCompletionProposal.completion().trim() + " ", paramCompletionProposal.signature().type(), paramSupplier, Zu(paramCompletionProposal));
    zg7o.ZA((List<Zzat>)paramCompletionProposal.signature().parameters().stream().map(Zte9::Zd).collect(Collectors.toList()));
    return zg7o;
  }
  
  private static Icon ZF(CompletionProposal paramCompletionProposal) {
    switch (Zbfe.Zh[paramCompletionProposal.kind().ordinal()]) {
      case 7:
      case 9:
      case 10:
      case 11:
      
      case 8:
      
      case 4:
      case 5:
      case 6:
      case 12:
      
      case 2:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      
      case 18:
      case 19:
      
      case 20:
      
      case 1:
      
      case 3:
      
    } 
    return ZX;
  }
  
  private static Icon Z_(CompletionProposal paramCompletionProposal) {
    return paramCompletionProposal.flags().contains(Flag.ENUM) ? Zm : (paramCompletionProposal.flags().contains(Flag.RECORD) ? ZU : (paramCompletionProposal.flags().contains(Flag.ANNOTATION) ? Za : (paramCompletionProposal.flags().contains(Flag.INTERFACE) ? ZM : (paramCompletionProposal.flags().contains(Flag.ABSTRACT) ? ZA : Zd))));
  }
  
  private static Zzat Zd(Parameter paramParameter) {
    return new Zzat(paramParameter.type(), paramParameter.name(), paramParameter.varargs());
  }
  
  private static Zecn lambda$getCompletionAttributes$1(Flag paramFlag) {
    return Zecn.DEPRECATED;
  }
  
  private static boolean lambda$getCompletionAttributes$0(Flag paramFlag) {
    return (paramFlag == Flag.DEPRECATED);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zte9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */