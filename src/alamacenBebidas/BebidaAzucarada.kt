package alamacenBebidas

/**
 * BebidaAzucarada is a subclass of Bebida that needs to have a porcentajeAzucar and tienePromocion attributes.
 * @param id is the identifier of the drink.
 * @param litros is the number of liters of the drink.
 * @param precio is the price of the drink.
 * @param marca is the brand of the drink.
 * @param porcentajeAzucar is the percentage of sugar in the drink.
 * @param tienePromocion is a boolean that indicates if the drink has a promotion.
 */
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