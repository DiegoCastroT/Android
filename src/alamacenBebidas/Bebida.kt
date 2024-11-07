package alamacenBebidas


open class Bebida(
     val id: Int,
     val litros: Double,
    val precio: Double,
     val marca: String
) {

    open fun calcularPrecio(): Double {
        return precio
    }

    open fun mostrarInformacion() {
        println("ID: $id, Litros: $litros, Precio: $precio, Marca: $marca")
    }
}