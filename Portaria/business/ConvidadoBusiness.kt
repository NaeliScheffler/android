package Portaria.business

import Portaria.entity.Convidado

class ConvidadoBusiness {
    fun tipoValido(tipoConvite: String) = (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo")

    fun maiorDeIdade(idade: Int) = idade >= 18

    fun convidadoValido(convite: Convidado) = when (convite.tipo) {
        "comum" -> convite.codigo.startsWith("xt")

        "premium", "luxo" -> convite.codigo.startsWith("xl")

        else -> false

    }
}

