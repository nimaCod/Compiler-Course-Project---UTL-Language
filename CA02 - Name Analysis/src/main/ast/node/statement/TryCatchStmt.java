package main.ast.node.statement;

import main.ast.node.expression.Identifier;
import main.visitor.IVisitor;
//import main.ast.type.complexType.ExceptionType;

import java.util.ArrayList;

public class TryCatchStmt extends Statement {
    private Identifier exception;
    private ArrayList<Statement> tryBody = new ArrayList<>();
    private ArrayList<Statement> catchBody = new ArrayList<>();

    public TryCatchStmt(Identifier exception) {
        this.exception = exception;
    }
    public TryCatchStmt() {
        this.exception = exception;
    }

    public Identifier getException() {
        return exception;
    }
    public void setException(Identifier exception) {
        this.exception = exception;
    }

    public ArrayList<Statement> getTryBody() {
        return tryBody;
    }
    public void setTryBody(ArrayList<Statement> tryBody) {
        this.tryBody = tryBody;
    }

    public ArrayList<Statement> getCatchBody() {
        return catchBody;
    }
    public void setCatchBody(ArrayList<Statement> catchBody) {
        this.catchBody = catchBody;
    }

    public void addTryStatement(Statement statement) {
        this.tryBody.add(statement);
    }

    public void addCatchStatement(Statement statement) {
        this.catchBody.add(statement);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
