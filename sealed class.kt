sealed class Result {
    object Success : Result()
    object Error : Result()
}

fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> println("Operation was successful")
        is Result.Error -> println("Operation failed")
    }
}

fun main() {
    val result = Result.Success
    handleResult(result)
}

