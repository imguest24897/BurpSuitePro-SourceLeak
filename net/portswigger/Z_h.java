package net.portswigger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Z_h extends Z_j {
  private final List<List<Zzp>> ZM = new ArrayList<>();
  
  List<String> Zz() {
    return this.ZM.stream().filter(this::lambda$getHostPermutations$0).map(Z_h::Zb).toList();
  }
  
  private boolean Zd(List<Zzp> paramList) {
    return paramList.stream().anyMatch(Zzp::Zp);
  }
  
  private static String Zb(List<Zzp> paramList) {
    return paramList.stream().map(Zzp::ZS).collect(Collectors.joining());
  }
  
  public void Zc(Zrm7 paramZrm7) {
    ZG(paramZrm7);
  }
  
  public void ZE(Zzx paramZzx) {
    ZG(paramZzx);
  }
  
  public void ZT(Zkv paramZkv) {
    ZG(paramZkv);
  }
  
  private void ZG(Zu7<?> paramZu7) {
    Zz(Collections.singletonList(Zzp.ZT(paramZu7.Zw())));
  }
  
  private void Zz(List<Zzp> paramList) {
    ArrayList<List<Zzp>> arrayList = new ArrayList<>(this.ZM);
    boolean bool = Z_j.Zt();
    this.ZM.clear();
    if (arrayList.isEmpty()) {
      Objects.requireNonNull(this.ZM);
      paramList.stream().map(Z_h::lambda$visitPermutations$1).forEach(this.ZM::add);
      if (!bool) {
        Objects.requireNonNull(this.ZM);
        arrayList.stream().flatMap(paramList::lambda$visitPermutations$3).forEachOrdered(this.ZM::add);
        return;
      } 
      return;
    } 
    Objects.requireNonNull(this.ZM);
    arrayList.stream().flatMap(paramList::lambda$visitPermutations$3).forEachOrdered(this.ZM::add);
  }
  
  public void ZY(Zs7 paramZs7) {
    Ze(paramZs7);
  }
  
  public void ZC(Zrmr paramZrmr) {
    Zz(Zv(paramZrmr.Zmk(), paramZrmr.Zm9()));
  }
  
  public void Zz(Zzz paramZzz) {
    Ze(paramZzz);
  }
  
  private <T extends Number> void Ze(Zv2<T> paramZv2) {
    ArrayList<Number> arrayList = new ArrayList();
    if (paramZv2.min() != null)
      arrayList.add(paramZv2.min()); 
    if (paramZv2.max() != null)
      arrayList.add(paramZv2.max()); 
    if (paramZv2.examples().isEmpty() && arrayList.isEmpty()) {
      Zz(List.of(Zzp.ZT(Integer.valueOf(0)), Zzp.ZT(Integer.valueOf(1))));
      return;
    } 
    Zz(Zv(paramZv2.examples(), arrayList));
  }
  
  public void Zr(Zt0 paramZt0) {
    Zz(Zv(paramZt0.Zgl(), Arrays.asList((Object[])new Boolean[] { Boolean.valueOf(false), Boolean.valueOf(true) })));
  }
  
  protected void Zq(String paramString) {
    this.ZM.forEach(Z_h::lambda$visitUnsupportedType$4);
  }
  
  private List<Zzp> Zv(List<?> paramList1, List<?> paramList2) {
    List<Zzp> list = Stream.concat(paramList1.stream(), paramList2.stream()).distinct().map(Zzp::ZT).toList();
    return list.isEmpty() ? List.of(Zzp.Zc()) : list;
  }
  
  private static void lambda$visitUnsupportedType$4(List<Zzp> paramList) {
    paramList.add(Zzp.Zc());
  }
  
  private static Stream lambda$visitPermutations$3(List paramList1, List paramList2) {
    return paramList1.stream().map(paramList2::lambda$visitPermutations$2);
  }
  
  private static LinkedList lambda$visitPermutations$2(List<?> paramList, Zzp paramZzp) {
    LinkedList<Zzp> linkedList = new LinkedList(paramList);
    linkedList.add(paramZzp);
    return linkedList;
  }
  
  private static LinkedList lambda$visitPermutations$1(Zzp paramZzp) {
    return new LinkedList(Collections.singletonList(paramZzp));
  }
  
  private boolean lambda$getHostPermutations$0(List<Zzp> paramList) {
    return !Zd(paramList);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Z_h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */