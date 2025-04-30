package org.example;// Generated from C:/Users/angel/IdeaProjects/BabyDuckFinal/src/main/antlr4/scanner.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link scannerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface scannerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link scannerParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(scannerParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#funcs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncs(scannerParser.FuncsContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(scannerParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(scannerParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(scannerParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(scannerParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(scannerParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(scannerParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(scannerParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(scannerParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(scannerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(scannerParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(scannerParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#cycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle(scannerParser.CycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(scannerParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(scannerParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(scannerParser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(scannerParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(scannerParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(scannerParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(scannerParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(scannerParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(scannerParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(scannerParser.MulOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(scannerParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(scannerParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#printArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintArgs(scannerParser.PrintArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#printArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintArg(scannerParser.PrintArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(scannerParser.ArgListContext ctx);
}