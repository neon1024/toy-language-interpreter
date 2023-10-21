package model.programstate;

import datastructures.MyIDictionary;
import datastructures.MyIList;
import datastructures.MyIStack;
import model.statement.IStatement;
import model.value.Value;

public class ProgramState {
    private MyIStack<IStatement> executionStack;
    private MyIDictionary<String, Value> symbolTable;
    private MyIList<Value> output;
    IStatement originalProgram;

    public ProgramState(MyIStack<IStatement> executionStack, MyIDictionary<String, Value> symbolTable,
                        MyIList<Value> output, IStatement originalProgram) {
        this.executionStack = executionStack;
        this.symbolTable = symbolTable;
        this.output = output;
//        this.originalProgram = originalProgram.deepCopy();
        executionStack.push(originalProgram);
    }

    public String toString() {
        return "Execution Stack:\n" + this.executionStack.toString() +
                "\nSymbol Table:\n" + this.symbolTable.toString() +
                "\nOutput:\n" + this.output.toString() + "\n";
    }

    public MyIStack<IStatement> getExecutionStack() {
        return this.executionStack;
    }

    public MyIDictionary<String, Value> getSymbolTable() {
        return this.symbolTable;
    }

    public MyIList<Value> getOutput() {
        return this.output;
    }

    public IStatement getOriginalProgram() {
        return this.originalProgram;
    }

    public void setExecutionStack(MyIStack<IStatement> executionStack) {
        this.executionStack = executionStack;
    }

    public void setSymbolTable(MyIDictionary<String, Value> symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void setOutput(MyIList<Value> output) {
        this.output = output;
    }

    public void setOriginalProgram(IStatement originalProgram) {
        this.originalProgram = originalProgram;
    }
}