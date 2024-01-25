package br.senai.sp.jandira.aulakotlin

fun main() {
    println("Olá mundo!!")

    print("Qual o seu nome?? ")
    var nome = readln()

    print("Qual a sua idade?? ")
    var idade = readln().toInt()

    var classificacao = if (idade >= 18) "Você é maior de idade!!" else "Você é menor de idade!!"

    //print("Meu nome é $nome e tenho $idade anos!! Já vivi ${idade * 365} dias. $classificacao")

    var frase = 0

    //while (frase < 10) {
    //    println("Meu nome é $nome e tenho $idade anos!! Já vivi ${idade * 365} dias. $classificacao")

    //    frase++
    //}

    for (frase in 1 .. 10){
        println(" $frase Meu nome é $nome e tenho $idade anos!! Já vivi ${idade * 365} dias. $classificacao")
    }



}