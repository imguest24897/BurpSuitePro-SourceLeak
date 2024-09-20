package burp;

import java.awt.Color;

public class Ze66 {
  public static Color ZB(Color paramColor, float paramFloat) {
    float f1 = paramColor.getRed() / 255.0F;
    float f2 = paramColor.getGreen() / 255.0F;
    float f3 = paramColor.getBlue() / 255.0F;
    f1 = ZS(f1);
    f2 = ZS(f2);
    f3 = ZS(f3);
    float f4 = 0.2126F * f1 + 0.7152F * f2 + 0.0722F * f3;
    float f5 = -0.09991F * f1 - 0.33609F * f2 + 0.436F * f3;
    float f6 = 0.615F * f1 - 0.55861F * f2 - 0.05639F * f3;
    f4 *= paramFloat;
    f1 = f4 + 1.28033F * f6;
    f2 = f4 - 0.21482F * f5 - 0.38059F * f6;
    f3 = f4 + 2.12798F * f5;
    f1 = Zm(f1);
    f2 = Zm(f2);
    f3 = Zm(f3);
    f1 = ZM(f1);
    f2 = ZM(f2);
    f3 = ZM(f3);
    return new Color(f1, f2, f3);
  }
  
  private static float ZS(float paramFloat) {
    return (paramFloat <= 0.03928F) ? (paramFloat / 12.92F) : (float)Math.pow((paramFloat + 0.055D) / 1.055D, 2.4D);
  }
  
  private static float Zm(float paramFloat) {
    return (paramFloat <= 0.0031308F) ? (12.92F * paramFloat) : (float)(1.055D * Math.pow(paramFloat, 0.4166666666666667D) - 0.055D);
  }
  
  private static float ZM(float paramFloat) {
    return Math.max(0.0F, Math.min(1.0F, paramFloat));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze66.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */