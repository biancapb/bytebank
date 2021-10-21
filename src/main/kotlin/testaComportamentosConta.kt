
fun testaComportamentoConta() {
    val contaFran = Conta("Fran", 1)
    val contaJoao = Conta("Joao", 2)

    contaFran.deposita(300.0)
    contaJoao.deposita(500.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

//    println("depositando na conta da Fran")
//    contaFran.deposita(50.0)
//    println(contaFran.saldo)
//
//    println("depositando na conta do Joao")
//    contaJoao.deposita(90.0)
//    println(contaJoao.saldo)
//
//    println("sacando na conta da Fran")
//    contaFran.saca(150.0)
//    println(contaFran.saldo)

    println("transferindo da conta do Joao para a conta da Fran")

    if (contaJoao.transfere(50.0, contaFran)) {
        println("Conta Joao:  ${contaJoao.saldo}")
        println("Conta Fran: ${contaFran.saldo}")
    } else {
        println("Falha na transferencia")
    }
}
