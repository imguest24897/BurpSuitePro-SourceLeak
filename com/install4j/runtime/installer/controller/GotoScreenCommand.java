/*    */ package com.install4j.runtime.installer.controller;
/*    */ 
/*    */ import com.install4j.api.screens.Screen;
/*    */ 
/*    */ public class GotoScreenCommand
/*    */   extends CheckingScreenChangeCommand {
/*    */   private Screen screen;
/*    */   
/*    */   public GotoScreenCommand(Screen screen, boolean checkCondition, boolean executeActions, ActionCallback actionCallback) {
/* 10 */     super("goto " + screen.toString(), checkCondition, executeActions, actionCallback);
/* 11 */     this.screen = screen;
/*    */   }
/*    */   
/*    */   public Screen getScreen() {
/* 15 */     return this.screen;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\controller\GotoScreenCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */