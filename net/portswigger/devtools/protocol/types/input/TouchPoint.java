package net.portswigger.devtools.protocol.types.input;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.input.TouchPoint")
public class TouchPoint {
  @Zvd(Zp = "x")
  public final Double x;
  
  @Zvd(Zp = "y")
  public final Double y;
  
  @Zvd(Zp = "radiusX")
  @Zj
  public final Double radiusX;
  
  @Zvd(Zp = "radiusY")
  @Zj
  public final Double radiusY;
  
  @Zvd(Zp = "rotationAngle")
  @Zj
  public final Double rotationAngle;
  
  @Zvd(Zp = "force")
  @Zj
  public final Double force;
  
  @Zvd(Zp = "tangentialPressure")
  @Zy
  @Zj
  public final Double tangentialPressure;
  
  @Zvd(Zp = "tiltX")
  @Zj
  public final Double tiltX;
  
  @Zvd(Zp = "tiltY")
  @Zj
  public final Double tiltY;
  
  @Zvd(Zp = "twist")
  @Zy
  @Zj
  public final Integer twist;
  
  @Zvd(Zp = "id")
  @Zj
  public final Double id;
  
  @Zox
  public TouchPoint(@Zc5(Ze = "x") Double paramDouble1, @Zc5(Ze = "y") Double paramDouble2, @Zc5(Ze = "radiusX", ZS = "null") Double paramDouble3, @Zc5(Ze = "radiusY", ZS = "null") Double paramDouble4, @Zc5(Ze = "rotationAngle", ZS = "null") Double paramDouble5, @Zc5(Ze = "force", ZS = "null") Double paramDouble6, @Zc5(Ze = "tangentialPressure", ZS = "null") Double paramDouble7, @Zc5(Ze = "tiltX", ZS = "null") Double paramDouble8, @Zc5(Ze = "tiltY", ZS = "null") Double paramDouble9, @Zc5(Ze = "twist", ZS = "null") Integer paramInteger, @Zc5(Ze = "id", ZS = "null") Double paramDouble10) {
    this.x = paramDouble1;
    this.y = paramDouble2;
    this.radiusX = paramDouble3;
    this.radiusY = paramDouble4;
    this.rotationAngle = paramDouble5;
    this.force = paramDouble6;
    this.tangentialPressure = paramDouble7;
    int i = MouseButton.ZE();
    this.tiltX = paramDouble8;
    this.tiltY = paramDouble9;
    this.twist = paramInteger;
    this.id = paramDouble10;
    if (i == 0)
      Zbqc.Zr(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\input\TouchPoint.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */