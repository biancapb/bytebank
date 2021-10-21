class Funcionario(
    val name: String,
    val cpf: String,
    val salary: Double,
    val type: Int //0 funcionario, 1 gerente, 2 diretor
) {
    fun bonificacao(): Double {
        return salary * 0.1
    }
}