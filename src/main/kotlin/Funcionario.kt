class Funcionario(
    val name: String,
    val cpf: String,
    val salary: Double
) {

    fun bonificacao(): Double {
        return salary * 0.1
    }

}
