class Isogram {
    companion object {
        fun isIsogram(input: String) : Boolean = input.toLowerCase()
            .filter { it.isLetter() }
            .groupBy { it }
            .values
            .any { it.size > 1 }
            .not()
    }
}


//text.toLowerCase()
//.filter{it.isLetter()}
//.groupBy{it}
//.values
//.any{it.size > 1}
//.not()
