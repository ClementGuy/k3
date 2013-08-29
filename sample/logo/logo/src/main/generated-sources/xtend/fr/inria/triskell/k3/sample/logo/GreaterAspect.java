package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.BinaryExpAspect;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import fr.inria.triskell.k3.sample.logo.GreaterAspectGreaterAspectProperties;
import kmLogo.ASM.Expression;
import kmLogo.ASM.Greater;

@Aspect(className = Greater.class)
@SuppressWarnings("all")
public class GreaterAspect extends BinaryExpAspect {
  @OverrideAspectMethod
  public static int eval(final Greater _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.GreaterAspectGreaterAspectContext _instance = fr.inria.triskell.k3.sample.logo.GreaterAspectGreaterAspectContext.getInstance();
    						    java.util.Map<Greater,fr.inria.triskell.k3.sample.logo.GreaterAspectGreaterAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.GreaterAspectGreaterAspectProperties prop = new fr.inria.triskell.k3.sample.logo.GreaterAspectGreaterAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.Lower){
    					     									return fr.inria.triskell.k3.sample.logo.LowerAspect.priveval((kmLogo.ASM.Lower)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Greater){
    					     									return fr.inria.triskell.k3.sample.logo.GreaterAspect.priveval((kmLogo.ASM.Greater)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Equals){
    					     									return fr.inria.triskell.k3.sample.logo.EqualsAspect.priveval((kmLogo.ASM.Equals)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Div){
    					     									return fr.inria.triskell.k3.sample.logo.DivAspect.priveval((kmLogo.ASM.Div)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Mult){
    					     									return fr.inria.triskell.k3.sample.logo.MultAspect.priveval((kmLogo.ASM.Mult)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Minus){
    					     									return fr.inria.triskell.k3.sample.logo.MinusAspect.priveval((kmLogo.ASM.Minus)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Plus){
    					     									return fr.inria.triskell.k3.sample.logo.PlusAspect.priveval((kmLogo.ASM.Plus)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.BinaryExp){
    					     									return fr.inria.triskell.k3.sample.logo.BinaryExpAspect.priveval((kmLogo.ASM.BinaryExp)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.ParameterCall){
    					     									return fr.inria.triskell.k3.sample.logo.ParameterCallAspect.priveval((kmLogo.ASM.ParameterCall)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.While){
    					     									return fr.inria.triskell.k3.sample.logo.WhileAspect.priveval((kmLogo.ASM.While)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Repeat){
    					     									return fr.inria.triskell.k3.sample.logo.RepeatAspect.priveval((kmLogo.ASM.Repeat)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.If){
    					     									return fr.inria.triskell.k3.sample.logo.IfAspect.priveval((kmLogo.ASM.If)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.ControlStructure){
    					     									return fr.inria.triskell.k3.sample.logo.ControlStructureAspect.priveval((kmLogo.ASM.ControlStructure)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Block){
    					     									return fr.inria.triskell.k3.sample.logo.BlockAspect.priveval((kmLogo.ASM.Block)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.ProcCall){
    					     									return fr.inria.triskell.k3.sample.logo.ProcCallAspect.priveval((kmLogo.ASM.ProcCall)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Constant){
    					     									return fr.inria.triskell.k3.sample.logo.ConstantAspect.priveval((kmLogo.ASM.Constant)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Expression){
    					     									return fr.inria.triskell.k3.sample.logo.ExpressionAspect.priveval((kmLogo.ASM.Expression)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Clear){
    					     									return fr.inria.triskell.k3.sample.logo.ClearAspect.priveval((kmLogo.ASM.Clear)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.PenUp){
    					     									return fr.inria.triskell.k3.sample.logo.PenUpAspect.priveval((kmLogo.ASM.PenUp)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.PenDown){
    					     									return fr.inria.triskell.k3.sample.logo.PenDownAspect.priveval((kmLogo.ASM.PenDown)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Right){
    					     									return fr.inria.triskell.k3.sample.logo.RightAspect.priveval((kmLogo.ASM.Right)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Left){
    					     									return fr.inria.triskell.k3.sample.logo.LeftAspect.priveval((kmLogo.ASM.Left)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Forward){
    					     									return fr.inria.triskell.k3.sample.logo.ForwardAspect.priveval((kmLogo.ASM.Forward)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Back){
    					     									return fr.inria.triskell.k3.sample.logo.BackAspect.priveval((kmLogo.ASM.Back)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Primitive){
    					     									return fr.inria.triskell.k3.sample.logo.PrimitiveAspect.priveval((kmLogo.ASM.Primitive)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Instruction){
    					     									return fr.inria.triskell.k3.sample.logo.InstructionAspect.priveval((kmLogo.ASM.Instruction)_self,context);
    					     									} else 
    					      {
    					           										throw new IllegalArgumentException("Unhandled parameter types: " +
    					     									        java.util.Arrays.<Object>asList(_self).toString());
    					     							    } 
    
  }
  
  public static GreaterAspectGreaterAspectProperties _self_;
  
  private static int super_eval(final Greater _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.BinaryExpAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final Greater _self, final Context context) {
    Expression _lhs = _self.getLhs();
    int _eval = ExpressionAspect.eval(_lhs, context);
    Expression _rhs = _self.getRhs();
    int _eval_1 = ExpressionAspect.eval(_rhs, context);
    boolean _greaterThan = (_eval > _eval_1);
    if (_greaterThan) {
      return 1;
    } else {
      return 0;
    }
  }
}