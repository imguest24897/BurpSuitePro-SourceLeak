package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

public class Zg4b implements Zgah {
  private final List<Consumer<String>> ZJ = new CopyOnWriteArrayList<>();
  
  protected String Zl;
  
  public Zg4b(String paramString) {
    this.Zl = paramString;
  }
  
  public void ZE(String paramString) {
    if (paramString.equals(this.Zl))
      return; 
    this.Zl = paramString;
    this.ZJ.forEach(paramString::lambda$setTitle$0);
  }
  
  public String Zo() {
    return this.Zl;
  }
  
  public void Zo(Consumer<String> paramConsumer) {
    this.ZJ.add(paramConsumer);
  }
  
  private static void lambda$setTitle$0(String paramString, Consumer<String> paramConsumer) {
    paramConsumer.accept(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg4b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */