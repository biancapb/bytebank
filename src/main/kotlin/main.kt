fun main(args: Array<String>) {

    //testaComportamentoConta()

    val alex = Funcionario(
        name = "Alex",
        cpf = "123.123.123-33",
        salary = 3900.00
    )

    println("nome ${alex.name}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salary}")

    println("bonificação ${alex.bonificacao()}")

}
