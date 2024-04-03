package main.ast.node.statement;

import main.ast.node.expression.Identifier;
import main.visitor.IVisitor;
import main.visitor.Visitor;
import main.ast.node.expression.Expression;

// Line -> '='
public class AssignStmt extends Statement {
    private Identifier lValue;
    private Expression rValue;

    public AssignStmt(Identifier lValue, Expression rValue) {
        this.lValue = lValue;
        this.rValue = rValue;
    }
    public AssignStmt() {
    }

    public Expression getLValue() {
        return lValue;
    }

    public void setLValue(Identifier lValue) {
        this.lValue = lValue;
    }

    public Expression getRValue() {
        return rValue;
    }

    public void setRValue(Expression rValue) {
        this.rValue = rValue;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
