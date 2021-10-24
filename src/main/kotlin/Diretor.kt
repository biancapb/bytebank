class Diretor(
    name: String,
    cpf: String,
    salary: Double,
    val password: Int,
    val plr: Double
) : Funcionario(
    name = name,
    cpf = cpf,
    salary = salary
) {

    override val bonificacao: Double
        get() {
            return salary * 0.3
        }

    fun autenticacao(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}