package alamacenBebidas


open class Bebida(
    private val id: Int,
    private val litros: Double,
    val precio: Double,
    private val marca: String
) {

    open fun calcularPrecio(): Double {
        return precio
    }

    open fun mostrarInformacion() {
        println("ID: $id, Litros: $litros, Precio: $precio, Marca: $marca")
    }
}