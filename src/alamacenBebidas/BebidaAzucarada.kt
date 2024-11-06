package alamacenBebidas

class BebidaAzucarada(
    id: Int,
    litros: Double,
    precio: Double,
    marca: String,
    private val porcentajeAzucar: Double,
    private val tienePromocion: Boolean

) : Bebida(id, litros, precio, marca) {

    override fun calcularPrecio(): Double {

        return if (tienePromocion) {
            precio - (precio * 0.10)
        } else {
            precio
        }

    }

    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Porcentaje de azúcar: $porcentajeAzucar, Promoción: $tienePromocion")
    }
}