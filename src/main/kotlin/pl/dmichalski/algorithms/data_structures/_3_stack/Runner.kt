package pl.dmichalski.algorithms.data_structures._3_stack

object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        println("------------------ Initial stack ------------------ ")
        var stack = getStack()
        printStack(stack)

        println("------------------ After adding an element to the stack ------------------ ")
        stack = getStack()
        stack.push("before top")
        printStack(stack)

        println("------------------ After removing element from the stack ------------------ ")
        stack = getStack()
        stack.pop()
        printStack(stack)
    }

    private fun getStack(): Stack {
        val stack = Stack()

        stack.push("bottom")
        stack.push("top")

        return stack
    }

    private fun printStack(stack: Stack) {
        println(stack)
    }

}
