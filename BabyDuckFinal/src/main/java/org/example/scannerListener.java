package org.example;// Generated from C:/Users/angel/IdeaProjects/BabyDuckFinal/src/main/antlr4/scanner.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link scannerParser}.
 */
public interface scannerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link scannerParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(scannerParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(scannerParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#funcs}.
	 * @param ctx the parse tree
	 */
	void enterFuncs(scannerParser.FuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#funcs}.
	 * @param ctx the parse tree
	 */
	void exitFuncs(scannerParser.FuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(scannerParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(scannerParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(scannerParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(scannerParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(scannerParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(scannerParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(scannerParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(scannerParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(scannerParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(scannerParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(scannerParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(scannerParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(scannerParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(scannerParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(scannerParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(scannerParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(scannerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(scannerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(scannerParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(scannerParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(scannerParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(scannerParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#cycle}.
	 * @param ctx the parse tree
	 */
	void enterCycle(scannerParser.CycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#cycle}.
	 * @param ctx the parse tree
	 */
	void exitCycle(scannerParser.CycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(scannerParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(scannerParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(scannerParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(scannerParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(scannerParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(scannerParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(scannerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(scannerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(scannerParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(scannerParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(scannerParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(scannerParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(scannerParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(scannerParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(scannerParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(scannerParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(scannerParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(scannerParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(scannerParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(scannerParser.MulOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(scannerParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(scannerParser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(scannerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(scannerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#printArgs}.
	 * @param ctx the parse tree
	 */
	void enterPrintArgs(scannerParser.PrintArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#printArgs}.
	 * @param ctx the parse tree
	 */
	void exitPrintArgs(scannerParser.PrintArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#printArg}.
	 * @param ctx the parse tree
	 */
	void enterPrintArg(scannerParser.PrintArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#printArg}.
	 * @param ctx the parse tree
	 */
	void exitPrintArg(scannerParser.PrintArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(scannerParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(scannerParser.ArgListContext ctx);
}