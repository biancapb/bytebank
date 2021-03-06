class Gerente(
    name: String,
    cpf: String,
    salary: Double,
    val password: Int
) : Funcionario(
    name = name,
    cpf = cpf,
    salary = salary
) {

    override val bonificacao: Double
        get() {
            return salary * 0.2
        }

    fun autencicacao(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}