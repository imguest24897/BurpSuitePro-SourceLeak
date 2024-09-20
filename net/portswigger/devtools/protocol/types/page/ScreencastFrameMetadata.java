package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.ScreencastFrameMetadata")
public class ScreencastFrameMetadata {
  @Zvd(Zp = "offsetTop")
  public final Double offsetTop;
  
  @Zvd(Zp = "pageScaleFactor")
  public final Double pageScaleFactor;
  
  @Zvd(Zp = "deviceWidth")
  public final Double deviceWidth;
  
  @Zvd(Zp = "deviceHeight")
  public final Double deviceHeight;
  
  @Zvd(Zp = "scrollOffsetX")
  public final Double scrollOffsetX;
  
  @Zvd(Zp = "scrollOffsetY")
  public final Double scrollOffsetY;
  
  @Zvd(Zp = "timestamp")
  @Zj
  public final Double timestamp;
  
  @Zox
  public ScreencastFrameMetadata(@Zc5(Ze = "offsetTop") Double paramDouble1, @Zc5(Ze = "pageScaleFactor") Double paramDouble2, @Zc5(Ze = "deviceWidth") Double paramDouble3, @Zc5(Ze = "deviceHeight") Double paramDouble4, @Zc5(Ze = "scrollOffsetX") Double paramDouble5, @Zc5(Ze = "scrollOffsetY") Double paramDouble6, @Zc5(Ze = "timestamp", ZS = "null") Double paramDouble7) {
    this.offsetTop = paramDouble1;
    this.pageScaleFactor = paramDouble2;
    this.deviceWidth = paramDouble3;
    this.deviceHeight = paramDouble4;
    this.scrollOffsetX = paramDouble5;
    this.scrollOffsetY = paramDouble6;
    this.timestamp = paramDouble7;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\ScreencastFrameMetadata.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */