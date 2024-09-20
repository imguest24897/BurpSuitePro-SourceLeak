package burp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zr3e {
  private final List<Zbza> Zx;
  
  private final Zkq4 Zs;
  
  private final Zey9 ZP;
  
  private final Zbnt ZD;
  
  private int ZA = 0;
  
  private Zr3e(Zkq4 paramZkq4, Zey9 paramZey9, Zbnt paramZbnt) {
    this.Zs = paramZkq4;
    this.ZP = paramZey9;
    this.ZD = paramZbnt;
    this.Zx = new ArrayList<>();
  }
  
  double ZX(Zbza paramZbza) {
    Zuh.Zb(this.Zx.contains(paramZbza), Zqf.Zr);
    int i = this.Zx.indexOf(paramZbza);
    return (i < this.ZA) ? (4.0D * (this.Zx.size() - i) / this.Zx.size()) : 0.0D;
  }
  
  void ZY(List<Zbza> paramList) {
    Map<Zbza, List<Zgh_>> map = (Map)paramList.stream().collect(Collectors.toMap(Function.identity(), this::Zk));
    Set<String> set = (Set)paramList.stream().flatMap(map::lambda$calculateNoveltyScores$0).map(Zgh_::ZT).collect(Collectors.toCollection(java.util.HashSet::new));
    Zm(map, set);
  }
  
  private List<Zgh_> Zk(Zbza paramZbza) {
    return (new Zzp6(this.ZP.Zu(paramZbza.Zg0(), paramZbza.Zgy()), null, this.ZD)).Zd().ZA().stream().filter(this::lambda$calculateScannableInsertionPoints$1).filter(Zr3e::lambda$calculateScannableInsertionPoints$2).toList();
  }
  
  private void Zm(Map<Zbza, List<Zgh_>> paramMap, Set<String> paramSet) {
    Map map = (Map)paramMap.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.summingLong(paramSet::lambda$calculateNoveltyScoreInternal$4)));
    Optional<Zbza> optional = map.entrySet().stream().filter(Zr3e::lambda$calculateNoveltyScoreInternal$5).max(Comparator.comparingLong(Map.Entry::getValue)).map(Map.Entry::getKey);
    String str = Zxn8.Zr();
    if (optional.isPresent()) {
      this.Zx.add(optional.get());
      ((List)paramMap.get(optional.get())).forEach(paramSet::lambda$calculateNoveltyScoreInternal$6);
      paramMap.remove(optional.get());
      Zm(paramMap, paramSet);
      if (str != null) {
        this.ZA = this.Zx.size();
        this.Zx.addAll(paramMap.keySet());
        return;
      } 
      return;
    } 
    this.ZA = this.Zx.size();
    this.Zx.addAll(paramMap.keySet());
  }
  
  private static void lambda$calculateNoveltyScoreInternal$6(Set paramSet, Zgh_ paramZgh_) {
    paramSet.remove(paramZgh_.ZT());
  }
  
  private static boolean lambda$calculateNoveltyScoreInternal$5(Map.Entry paramEntry) {
    return (((Long)paramEntry.getValue()).longValue() > 0L);
  }
  
  private static long lambda$calculateNoveltyScoreInternal$4(Set paramSet, Map.Entry paramEntry) {
    return ((List)paramEntry.getValue()).stream().filter(paramSet::lambda$calculateNoveltyScoreInternal$3).count();
  }
  
  private static boolean lambda$calculateNoveltyScoreInternal$3(Set paramSet, Zgh_ paramZgh_) {
    return paramSet.contains(paramZgh_.ZT());
  }
  
  private static boolean lambda$calculateScannableInsertionPoints$2(Zgh_ paramZgh_) {
    return (paramZgh_.ZG() != Zs66.PATH_FILENAME_PARAM && paramZgh_.ZG() != Zs66.PATH_FOLDER_PARAM);
  }
  
  private boolean lambda$calculateScannableInsertionPoints$1(Zgh_ paramZgh_) {
    return (Zbh.ZE(paramZgh_, this.Zs, 0, false) == Zexx.ALLOWED);
  }
  
  private static Stream lambda$calculateNoveltyScores$0(Map paramMap, Zbza paramZbza) {
    return ((List)paramMap.get(paramZbza)).stream();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr3e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */