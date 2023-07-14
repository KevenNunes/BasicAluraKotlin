package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autendicado: () -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
            autendicado()
        } else {
            println("Falha na autenticação")
        }
    }

    fun entraReceiver(admin: Autenticavel, senha: Int, autendicado: SistemaInterno.() -> Unit = {}){
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
            autendicado(this)
        } else {
            println("Falha na autenticação")
        }
    }

    fun pagamento(){
        println("realizando pagamento")
    }

}