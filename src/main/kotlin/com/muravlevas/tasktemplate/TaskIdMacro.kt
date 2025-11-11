package com.muravlevas.tasktemplate

import com.intellij.codeInsight.template.*
import com.intellij.tasks.TaskManager
import org.jetbrains.annotations.NonNls

class TaskIdMacro : Macro() {
    @NonNls
    override fun getName(): String {
        return "taskManagementTaskId"
    }

    override fun calculateResult(expressions: Array<Expression?>, expressionContext: ExpressionContext): Result {
        val activeTask = TaskManager.getManager(expressionContext.project).activeTask
        return TextResult(activeTask.id)
    }
}