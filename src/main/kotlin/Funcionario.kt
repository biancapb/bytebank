open class Funcionario(
    val name: String,
    val cpf: String,
    val salary: Double
) {

    open val bonificacao: Double get() = salary * 0.1

}
