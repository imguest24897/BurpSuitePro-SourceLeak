package burp;

import burp.api.montoya.burpsuite.TaskExecutionEngine;

class Zgp9 implements TaskExecutionEngine {
  final Ztuy Z_;
  
  Zgp9(Ztuy paramZtuy) {}
  
  public TaskExecutionEngine.TaskExecutionEngineState getState() {
    return this.Z_.Zh.get() ? TaskExecutionEngine.TaskExecutionEngineState.RUNNING : TaskExecutionEngine.TaskExecutionEngineState.PAUSED;
  }
  
  public void setState(TaskExecutionEngine.TaskExecutionEngineState paramTaskExecutionEngineState) {
    // Byte code:
    //   0: invokestatic Zf : ()Ljava/lang/String;
    //   3: astore_2
    //   4: getstatic burp/Zgwn.Zj : [I
    //   7: aload_1
    //   8: invokevirtual ordinal : ()I
    //   11: iaload
    //   12: lookupswitch default -> 64, 1 -> 40, 2 -> 54
    //   40: aload_0
    //   41: getfield Z_ : Lburp/Ztuy;
    //   44: getfield Zi : Lburp/Zrag;
    //   47: invokevirtual ZR : ()V
    //   50: aload_2
    //   51: ifnonnull -> 64
    //   54: aload_0
    //   55: getfield Z_ : Lburp/Ztuy;
    //   58: getfield Zi : Lburp/Zrag;
    //   61: invokevirtual ZO : ()V
    //   64: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgp9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */