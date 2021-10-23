class Gerente(
    val name: String,
    val cpf: String,
    val salary: Double,
    val password: Int
) {

    fun bonificacao(): Double {
        return salary * 0.2
    }

    fun autencicacao(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}