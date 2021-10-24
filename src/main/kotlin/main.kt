fun main() {

    //testaComportamentoConta()

    val alex = Funcionario(
        name = "Alex",
        cpf = "123.123.123-33",
        salary = 3900.00,
    )

    println("nome ${alex.name}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salary}")

    println("bonificação ${alex.bonificacao}")

    val fran = Gerente(
        name = "Fran",
        cpf = "323.323.323-32",
        salary = 10800.00,
        password = 3232
    )

    println("nome ${fran.name}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salary}")

    println("bonificação ${fran.bonificacao}")

    if (fran.autencicacao(password = 3232)) {
        println("Acesso concedido")
    } else {
        println("Acesso negado")
    }

    val bia = Diretor(
        name = "Bianca",
        cpf = "111.222.333-44",
        salary = 12500.0,
        password = 3322,
        plr = 200.0
    )

    println("nome ${bia.name}")
    println("cpf ${bia.cpf}")
    println("salario ${bia.salary}")

    println("bonificação ${bia.bonificacao}")

    if (bia.autenticacao(password = 3232)) {
        println("Acesso concedido")
    } else {
        println("Acesso negado")
    }

}
