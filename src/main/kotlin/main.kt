fun main(args: Array<String>) {

    //testaComportamentoConta()

    val alex = Funcionario(
        name = "Alex",
        cpf = "123.123.123-33",
        salary = 3900.00,
    )

    println("nome ${alex.name}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salary}")

    println("bonificação ${alex.bonificacao()}")

    val fran = Gerente(
        name = "Fran",
        cpf = "323.323.323-32",
        salary = 10800.00,
        password = 3232
    )

    println("nome ${fran.name}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salary}")

    println("bonificação ${fran.bonificacao()}")

    if (fran.autencicacao(password = 3232)) {
        println("Acesso concedido")
    } else {
        println("Acesso negado")
    }


}
