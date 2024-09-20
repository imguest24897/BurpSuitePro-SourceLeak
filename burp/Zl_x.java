package burp;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.UUID;
import net.portswigger.Zgl;
import net.portswigger.Zm2;

class Zl_x {
  private final Zgl Zk = new Zgl(UUID.randomUUID().toString());
  
  private final Zsb4 ZN = (new Zsb4()).ZV();
  
  private final MemoryMXBean ZH = ManagementFactory.getMemoryMXBean();
  
  private final Zb_x ZF;
  
  Zl_x(Zb_x paramZb_x) {
    this.ZF = paramZb_x;
  }
  
  void ZZ() {
    long l = this.ZN.ZO().ZU();
    Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_FINISHED_RESULTS_COUNT, this.ZF.Zv());
    Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_FINISHED_REQUESTS_COUNT, this.ZF.ZO());
    Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_FINISHED_FAILED_REQUESTS_COUNT, this.ZF.Zc());
    Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_FINISHED_DURATION, l);
    MemoryUsage memoryUsage = this.ZH.getHeapMemoryUsage();
    Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_FINISHED_MAX_MEMORY, memoryUsage.getMax());
    Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_FINISHED_USED_MEMORY, memoryUsage.getUsed());
  }
  
  void Zb() {
    boolean bool = Zs7w.ZX();
    if (this.ZF.Zl())
      return; 
    MemoryUsage memoryUsage = this.ZH.getHeapMemoryUsage();
    if (this.ZF.ZO() > 0) {
      long l = this.ZN.ZO().ZU();
      Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_PAUSED_RESULTS_COUNT, this.ZF.Zv());
      Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_PAUSED_REQUESTS_COUNT, this.ZF.ZO());
      Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_PAUSED_FAILED_REQUESTS_COUNT, this.ZF.Zc());
      Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_PAUSED_DURATION, l);
      Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_PAUSED_MAX_MEMORY, memoryUsage.getMax());
      Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_PAUSED_USED_MEMORY, memoryUsage.getUsed());
      if (!bool) {
        Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_STARTED_MAX_MEMORY, memoryUsage.getMax());
        Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_STARTED_USED_MEMORY, memoryUsage.getUsed());
        return;
      } 
      return;
    } 
    Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_STARTED_MAX_MEMORY, memoryUsage.getMax());
    Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_STARTED_USED_MEMORY, memoryUsage.getUsed());
  }
  
  void ZG() {
    if (this.ZF.Zl())
      return; 
    if (this.ZF.ZO() > 0) {
      long l = this.ZN.ZV().ZU();
      Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_RESUMED_RESULTS_COUNT, this.ZF.Zv());
      Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_RESUMED_REQUESTS_COUNT, this.ZF.ZO());
      Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_RESUMED_FAILED_REQUESTS_COUNT, this.ZF.Zc());
      Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_RESUMED_DURATION, l);
      MemoryUsage memoryUsage = this.ZH.getHeapMemoryUsage();
      Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_RESUMED_MAX_MEMORY, memoryUsage.getMax());
      Zm2.Ze(this.Zk, Zv8r.INTRUDER_ATTACK_RESUMED_USED_MEMORY, memoryUsage.getUsed());
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl_x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */