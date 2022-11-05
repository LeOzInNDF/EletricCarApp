package br.com.eletriccarapp.data

import br.com.eletriccarapp.domain.Carro

object CarFactory {

    val list = listOf<Carro>(
        Carro(
            id = 1,
            preco = "R$ 100,000,00",
            bateria = "100 kwh",
            potencia = "100cv",
            recarga = "10 min",
            urlPhoto = "www.google.com.br"
        ),
                Carro(
                id = 2,
        preco = "R$ 200,000,00",
        bateria = "200 kwh",
        potencia = "200cv",
        recarga = "20 min",
        urlPhoto = "www.google.com.br"
    )


    )

}