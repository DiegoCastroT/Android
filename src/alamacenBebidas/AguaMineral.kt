package alamacenBebidas

/**
 * AguaMineral is a subclass of Bebida that needs to have a manantial attribute.
 * @param id is the identifier of the drink.
 * @param litros is the number of liters of the drink.
 * @param precio is the price of the drink.
 * @param marca is the brand of the drink.
 */
class AguaMineral(
    id: Int,
    litros: Double,
    precio: Double,
    marca: String,
    private val manantial: String
) : Bebida(id, litros, precio, marca) {

    // Calls bebida's mostrarInformacion and adds manantial.
    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Manantial: $manantial")
    }

}
