package net.portswigger.devtools.protocol.types.domsnapshot;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.domsnapshot.LayoutTreeSnapshot")
public class LayoutTreeSnapshot {
  @Zvd(Zp = "nodeIndex")
  public final List<Integer> nodeIndex;
  
  @Zvd(Zp = "styles")
  public final List<List<Integer>> styles;
  
  @Zvd(Zp = "bounds")
  public final List<List<Double>> bounds;
  
  @Zvd(Zp = "text")
  public final List<Integer> text;
  
  @Zvd(Zp = "stackingContexts")
  public final RareBooleanData stackingContexts;
  
  @Zvd(Zp = "paintOrders")
  @Zj
  public final List<Integer> paintOrders;
  
  @Zvd(Zp = "offsetRects")
  @Zj
  public final List<List<Double>> offsetRects;
  
  @Zvd(Zp = "scrollRects")
  @Zj
  public final List<List<Double>> scrollRects;
  
  @Zvd(Zp = "clientRects")
  @Zj
  public final List<List<Double>> clientRects;
  
  @Zvd(Zp = "blendedBackgroundColors")
  @Zy
  @Zj
  public final List<Integer> blendedBackgroundColors;
  
  @Zvd(Zp = "textColorOpacities")
  @Zy
  @Zj
  public final List<Double> textColorOpacities;
  
  @Zox
  public LayoutTreeSnapshot(@Zc5(Ze = "nodeIndex") List<Integer> paramList1, @Zc5(Ze = "styles") List<List<Integer>> paramList, @Zc5(Ze = "bounds") List<List<Double>> paramList2, @Zc5(Ze = "text") List<Integer> paramList3, @Zc5(Ze = "stackingContexts") RareBooleanData paramRareBooleanData, @Zc5(Ze = "paintOrders", ZS = "null") List<Integer> paramList4, @Zc5(Ze = "offsetRects", ZS = "null") List<List<Double>> paramList5, @Zc5(Ze = "scrollRects", ZS = "null") List<List<Double>> paramList6, @Zc5(Ze = "clientRects", ZS = "null") List<List<Double>> paramList7, @Zc5(Ze = "blendedBackgroundColors", ZS = "null") List<Integer> paramList8, @Zc5(Ze = "textColorOpacities", ZS = "null") List<Double> paramList9) {
    this.nodeIndex = paramList1;
    this.styles = paramList;
    this.bounds = paramList2;
    this.text = paramList3;
    this.stackingContexts = paramRareBooleanData;
    this.paintOrders = paramList4;
    this.offsetRects = paramList5;
    this.scrollRects = paramList6;
    this.clientRects = paramList7;
    this.blendedBackgroundColors = paramList8;
    this.textColorOpacities = paramList9;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\domsnapshot\LayoutTreeSnapshot.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */