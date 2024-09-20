/*    */ package com.install4j.runtime.beans.groups;
/*    */ 
/*    */ import com.install4j.api.beans.ScriptProperty;
/*    */ 
/*    */ public class ControlFlowGroup
/*    */   extends Group {
/*    */   private ScriptProperty conditionExpression;
/*    */   private boolean loop = false;
/*    */   private ScriptProperty loopExpression;
/* 10 */   private int loopIndexStart = 0;
/* 11 */   private int loopIndexStep = 1;
/* 12 */   private String loopIndexVariableName = "";
/*    */   
/*    */   public ScriptProperty getConditionExpression() {
/* 15 */     return (ScriptProperty)replaceWithTextOverride("conditionExpression", this.conditionExpression, ScriptProperty.class);
/*    */   }
/*    */   
/*    */   public void setConditionExpression(ScriptProperty conditionExpression) {
/* 19 */     this.conditionExpression = conditionExpression;
/*    */   }
/*    */   
/*    */   public boolean isLoop() {
/* 23 */     return replaceWithTextOverride("loop", this.loop);
/*    */   }
/*    */   
/*    */   public void setLoop(boolean loop) {
/* 27 */     this.loop = loop;
/*    */   }
/*    */   
/*    */   public ScriptProperty getLoopExpression() {
/* 31 */     return (ScriptProperty)replaceWithTextOverride("loopExpression", this.loopExpression, ScriptProperty.class);
/*    */   }
/*    */   
/*    */   public void setLoopExpression(ScriptProperty loopExpression) {
/* 35 */     this.loopExpression = loopExpression;
/*    */   }
/*    */   
/*    */   public int getLoopIndexStart() {
/* 39 */     return replaceWithTextOverride("loopIndexStart", this.loopIndexStart);
/*    */   }
/*    */   
/*    */   public void setLoopIndexStart(int loopIndexStart) {
/* 43 */     this.loopIndexStart = loopIndexStart;
/*    */   }
/*    */   
/*    */   public int getLoopIndexStep() {
/* 47 */     return replaceWithTextOverride("loopIndexStep", this.loopIndexStep);
/*    */   }
/*    */   
/*    */   public void setLoopIndexStep(int loopIndexStep) {
/* 51 */     this.loopIndexStep = loopIndexStep;
/*    */   }
/*    */   
/*    */   public String getLoopIndexVariableName() {
/* 55 */     return replaceVariables(this.loopIndexVariableName);
/*    */   }
/*    */   
/*    */   public void setLoopIndexVariableName(String loopIndexVariableName) {
/* 59 */     this.loopIndexVariableName = loopIndexVariableName;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\groups\ControlFlowGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */