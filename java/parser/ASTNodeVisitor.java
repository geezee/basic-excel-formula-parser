package parser;

import parser.ast.*;
import parser.ast.Boolean;
import parser.ast.Number;

public interface ASTNodeVisitor<T> {

  public <N extends java.lang.Number> T visitNumber(Number<N> n);
  public T visitCell(Cell n);
  public T visitCellRange(CellRange n);
  public T visitString(ExcelString n);
  public T visitFunctionCall(FunctionCall n);
  public T visitBoolean(Boolean n);
  public T visitBinary(Binary n);
  public T visitNegate(Negate n);

}
