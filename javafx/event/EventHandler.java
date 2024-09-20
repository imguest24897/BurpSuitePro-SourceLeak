package javafx.event;

import java.util.EventListener;

@FunctionalInterface
public interface EventHandler<T extends Event> extends EventListener {
  void handle(T paramT);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\event\EventHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */