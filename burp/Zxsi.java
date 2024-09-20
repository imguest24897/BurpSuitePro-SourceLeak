package burp;

import javax.swing.SizeRequirements;
import javax.swing.text.Element;
import javax.swing.text.html.ParagraphView;

class Zxsi extends ParagraphView {
  Zxsi(Zz90 paramZz90, Element paramElement) {
    super(paramElement);
  }
  
  protected SizeRequirements calculateMinorAxisRequirements(int paramInt, SizeRequirements paramSizeRequirements) {
    if (paramSizeRequirements == null)
      paramSizeRequirements = new SizeRequirements(); 
    float f1 = this.layoutPool.getPreferredSpan(paramInt);
    float f2 = this.layoutPool.getMinimumSpan(paramInt);
    paramSizeRequirements.minimum = (int)f2;
    paramSizeRequirements.preferred = Math.max(paramSizeRequirements.minimum, (int)f1);
    paramSizeRequirements.maximum = Integer.MAX_VALUE;
    paramSizeRequirements.alignment = 0.5F;
    return paramSizeRequirements;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxsi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */